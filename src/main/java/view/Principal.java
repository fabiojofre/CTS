package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Timer;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import dao.TrataProdutos;
import dominio.Config;
import dominio.ProdutoRetorno;
import servicos.Atualizador;
import servicos.ServicoConfig;



public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	Principal frame;
	private JTextField tf_barras;
	TrataProdutos tr = new TrataProdutos();
	ProdutoRetorno pr = new ProdutoRetorno(); 
	public static String ean;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();

					ServicoConfig s = new ServicoConfig();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					frame.requestFocus();
					s.trataConfig();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	JButton btAtualizar = new JButton("Atualizar");

	// variaveis para o timer
	Timer timer;
	boolean atividade = false;
	// variavel properties
	private JTextField txtNcm;
	private JTextField txtCest;
	private JTextField txtPiscofins;
	private JTextField txtBenefcio;
	private JPanel panel1_1;
	private JTextField ncm_old;
	private JTextField cest_old;
	private JTextField pis_old;
	private JTextField beneficio_old;
	private JPanel panel1_2;
	private JTextField ncm_novo;
	private JTextField cest_novo;
	private JTextField pis_novo;
	private JTextField beneficio_novo;
	private JTextField txtIcms;
	private JTextField icms_old;
	private JTextField icms_novo;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lbDesc;
	private JTextField tfStatus;
	

	/**
	 * Create the frame.
	 */
	public Principal() {

//		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/vrrecifeframework/img/icone.png")));
		setResizable(false);
		setAutoRequestFocus(false);
		setTitle("Atualizador CTS - Versão 2.0.00");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 565, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Consulta Produtos");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(114, 0, 178, 28);
		desktopPane.add(lblNewLabel);

		JLabel lblNewLabe2 = new JLabel("");
		lblNewLabe2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabe2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabe2.setBounds(25, 0, 600, 650);
		lblNewLabe2.setForeground(Color.red);
		desktopPane.add(lblNewLabe2);
		btAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Atualizador a = new Atualizador();
				
				Object[] options = {"Atualizar","Cancelar"};
		    	int valor = JOptionPane.showOptionDialog(null, 	"Todos os itens em vermelho serão atualizados. \n"+
		    										"Esse processo não poderá ser desfeito!! \n"+
		    										"Deseja continuar?", "Atenção!!",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE, null, options, options[0]);
		    	if(valor == 0) {
		    		
		    		if(!ncm_old.getText().equals(ncm_novo.getText())) {
						a.atualizaNCM(pr.getId(), pr.getAtualizacao_ncm1(), pr.getAtualizacao_ncm2(), pr.getAtualizacao_ncm3());
					}
					 if(!cest_old.getText().equals(cest_novo.getText())){
						a.atualizaCest(pr.getId(), pr.getNovo_id_cest());
					}
					 if(!icms_old.getText().equals(icms_novo.getText())) {
						a.atualizaAliquota(pr.getId_produtoaliquota(), pr.getNovo_id_aliquota());
					}
					if((!pis_old.getText().equals(pis_novo.getText()))&& Config.versao.equals("4.0")){
						a.atualizaPisCofina_4_0(pr.getId(), pr.getNovo_id_pis_credito(), pr.getNovo_id_pis_debito(), pr.getNovo_id_natureza_receita());
					}
					else if((!pis_old.getText().equals(pis_novo.getText()))&& Config.versao.equals("4.1")){
						a.atualizaPisCofins_4_1(pr.getId(), pr.getNovo_id_pis_credito(), pr.getNovo_id_pis_debito(), pr.getNovo_id_natureza_receita());
					}
					if((!beneficio_novo.getText().equals(beneficio_old.getText()))||(!beneficio_novo.getText().equals(""))) {
						a.atualizaBeneficio(pr.getId_produtoaliquota(), pr.getNovo_id_beneficio(), pr.getNovo_id_aliquota(), pr.getOld_id_produto_aliquota_beneficio());
						a.atualizaGia(pr.getId(), pr.getNovo_id_beneficio());
					}
					if((pr.getNovo_id_beneficio() != pr.getOld_codigogia())&& beneficio_novo.getText().equals("")){
						a.deletaGia(pr.getId());
						lblNewLabe2.setText("");
					}
				JOptionPane.showMessageDialog(null, "Atualização efetuada com sucesso!!");
				btAtualizar.setEnabled(false);
				voltaEstado();
		    	}
			}
		});
		
		btAtualizar.setEnabled(true);
		btAtualizar.setBounds(419, 336, 89, 23);
		desktopPane.add(btAtualizar);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Config con = new Config();
//				con.setLocationRelativeTo(null);
//				con.setVisible(true);
				//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setForeground(Color.LIGHT_GRAY);
//		btnNewButton.setIcon(new ImageIcon(Principal.class.getResource("/vrrecifeframework/img/config.png")));
		btnNewButton.setBounds(493, 0, 46, 54);
		desktopPane.add(btnNewButton);
		
		tf_barras = new JTextField();
		tf_barras.setFocusTraversalKeysEnabled(true);
		tf_barras.requestFocus();
		tf_barras.setFocusCycleRoot(true);
		
		tf_barras.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				 ean = tf_barras.getText();
				if (e.getKeyCode() ==KeyEvent.VK_ENTER) {
					if(tf_barras.getText().length() >= 7 && tf_barras.getText().length() <= 14) {
						pr = tr.complentaProdutoRetorno();
						DecimalFormat df = new DecimalFormat("00"); // retornar zeros a esquerda
						if(pr.getId()!= null) {
						lbDesc.setText(pr.getId()+" - "+ pr.getDescricaocompleta());
						}
						ncm_old.setText(pr.getOld_ncm());
						ncm_novo.setText(pr.getNovo_ncm());
						cest_old.setText(pr.getOld_cest());
						cest_novo.setText(pr.getNovo_cest());
						icms_old.setText(pr.getOld_desc_aliquota());
						icms_novo.setText(pr.getNovo_desc_aliquota());
						pis_old.setText("CST: "+ df.format(Integer.parseInt(pr.getOld_cst_pis_debito().toString()))+" / "+pr.getOld_cst_pis_credito());		
						pis_novo.setText("CST: "+ df.format(Integer.parseInt(pr.getNovo_cst_piscofinsdebito().toString()))+" / "+ pr.getNovo_cst_piscofinscredito());
						beneficio_old.setText(pr.getOld_beneficio());
						beneficio_novo.setText(pr.getNovo_beneficio());
						
						if(!ncm_old.getText().equals(ncm_novo.getText())) {
							ncm_novo.setForeground(Color.red);
							btAtualizar.setEnabled(true);
						}
						 if(!cest_old.getText().equals(cest_novo.getText())){
							cest_novo.setForeground(Color.red);
							btAtualizar.setEnabled(true);
						}
						 if(!icms_old.getText().equals(icms_novo.getText())) {
							icms_novo.setForeground(Color.red);
							btAtualizar.setEnabled(true);
						}
						if(!pis_old.getText().equals(pis_novo.getText())){
							pis_novo.setForeground(Color.red);
							btAtualizar.setEnabled(true);
						}
						if(!beneficio_novo.getText().equals(beneficio_old.getText())) {
							beneficio_novo.setForeground(Color.red);
							btAtualizar.setEnabled(true);
						}
						if(pr.getNovo_id_beneficio() != pr.getOld_codigogia()) {
							lblNewLabe2.setText("Observação: O Benefício está diferente do Código GIA, clique em Atualizar para resolver.");
							btAtualizar.setEnabled(true);
							JOptionPane.showMessageDialog(null, pr.getOld_codigogia()+" - "+pr.getNovo_id_beneficio());
							
						}
						if(TrataProdutos.limpador == 1) {
							voltaEstado();
						}
					}
					
				}
			}
		});
		
		
	
		tf_barras.setFont(new Font("Tahoma", Font.BOLD, 14));
		tf_barras.requestFocus();
		tf_barras.setDocument(new RecebeSoNumeros());
		tf_barras.setToolTipText("Digite o código de barras ao qual deseja consultar.");
		tf_barras.setBounds(21, 61, 152, 28);
		desktopPane.add(tf_barras);
		tf_barras.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ean.");
		lblNewLabel_1.setBounds(21, 40, 46, 14);
		desktopPane.add(lblNewLabel_1);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(27, 185, 77, 129);
		desktopPane.add(panel1);
		panel1.setLayout(new GridLayout(5, 1, 2, 0));
		
		btAtualizar.setEnabled(false); 
		
		txtNcm = new JTextField();
		txtNcm.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtNcm.setText("NCM:");
		txtNcm.setColumns(10);
		txtNcm.setEditable(false);
		panel1.add(txtNcm);
		
		txtCest = new JTextField();
		txtCest.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtCest.setText("Cest:");
		txtCest.setColumns(10);
		txtCest.setEditable(false);
		panel1.add(txtCest);
		
		txtPiscofins = new JTextField();
		txtPiscofins.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtPiscofins.setText("Pis/Cofins:");
		txtPiscofins.setColumns(10);
		txtPiscofins.setEditable(false);
		panel1.add(txtPiscofins);
		
		txtIcms = new JTextField();
		txtIcms.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtIcms.setText("ICMS:");
		txtIcms.setColumns(1);
		txtIcms.setEditable(false);
		panel1.add(txtIcms);
		
		txtBenefcio = new JTextField();
		txtBenefcio.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtBenefcio.setText("Beneficio:");
		txtBenefcio.setColumns(1);
		txtBenefcio.setEditable(false);
		panel1.add(txtBenefcio);
		
		panel1_1 = new JPanel();
		panel1_1.setBounds(114, 185, 206, 129);
		desktopPane.add(panel1_1);
		panel1_1.setLayout(new GridLayout(5, 1, 2, 0));
		
		ncm_old = new JTextField();
		ncm_old.setHorizontalAlignment(SwingConstants.LEFT);
		ncm_old.setColumns(10);
		ncm_old.setEditable(false);
		panel1_1.add(ncm_old);
		
		cest_old = new JTextField();
		cest_old.setHorizontalAlignment(SwingConstants.LEFT);
		cest_old.setColumns(10);
		cest_old.setEditable(false);
		panel1_1.add(cest_old);
		
		pis_old = new JTextField();
		pis_old.setHorizontalAlignment(SwingConstants.LEFT);
		pis_old.setColumns(10);
		pis_old.setEditable(false);
		panel1_1.add(pis_old);
		
		icms_old = new JTextField();
		icms_old.setHorizontalAlignment(SwingConstants.LEFT);
		icms_old.setColumns(1);
		icms_old.setEditable(false);
		panel1_1.add(icms_old);
		
		beneficio_old = new JTextField();
		beneficio_old.setHorizontalAlignment(SwingConstants.LEFT);
		beneficio_old.setColumns(1);
		beneficio_old.setEditable(false);
		panel1_1.add(beneficio_old);
		
		panel1_2 = new JPanel();
		panel1_2.setBounds(330, 185, 178, 129);
		panel1_2.setLayout(new GridLayout(5, 1, 2, 0));
		desktopPane.add(panel1_2);
		
		ncm_novo = new JTextField();
		ncm_novo.setHorizontalAlignment(SwingConstants.LEFT);
		ncm_novo.setColumns(10);
		ncm_novo.setEditable(false);
		panel1_2.add(ncm_novo);
		
		cest_novo = new JTextField();
		cest_novo.setHorizontalAlignment(SwingConstants.LEFT);
		cest_novo.setColumns(10);
		cest_novo.setEditable(false);
		panel1_2.add(cest_novo);
		
		pis_novo = new JTextField();
		pis_novo.setHorizontalAlignment(SwingConstants.LEFT);
		pis_novo.setColumns(10);
		pis_novo.setEditable(false);
		panel1_2.add(pis_novo);
		
		icms_novo = new JTextField();
		icms_novo.setHorizontalAlignment(SwingConstants.LEFT);
		icms_novo.setColumns(1);
		icms_novo.setEditable(false);
		panel1_2.add(icms_novo);
		
		beneficio_novo = new JTextField();
		beneficio_novo.setHorizontalAlignment(SwingConstants.LEFT);
		beneficio_novo.setColumns(1);
		beneficio_novo.setEditable(false);
		panel1_2.add(beneficio_novo);
		
		lblNewLabel_2 = new JLabel("Antigo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(125, 155, 77, 23);
		desktopPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Novo");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(342, 155, 77, 23);
		desktopPane.add(lblNewLabel_3);
		
		lbDesc = new JLabel("");
		lbDesc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbDesc.setBounds(27, 116, 481, 28);
		desktopPane.add(lbDesc);
		
		tfStatus = new JTextField();
		tfStatus.setHorizontalAlignment(SwingConstants.CENTER);
		tfStatus.setEditable(false);
		tfStatus.setBounds(0, 467, 549, 28);
		desktopPane.add(tfStatus);
		tfStatus.setColumns(10);
		
	}
	private void voltaEstado() {
		ncm_novo.setForeground(Color.BLACK);
		cest_novo.setForeground(Color.BLACK);
		icms_novo.setForeground(Color.BLACK);
		pis_novo.setForeground(Color.BLACK);
		beneficio_novo.setForeground(Color.BLACK);
		
		tf_barras.setText("");
		ncm_novo.setText("");
		ncm_old.setText("");
		cest_novo.setText("");
		cest_old.setText("");
		pis_novo.setText("");
		pis_old.setText("");
		icms_novo.setText("");
		icms_old.setText("");
		beneficio_novo.setText("");
		beneficio_old.setText("");
		lbDesc.setText("");
		lblNewLabel_2.setText("");
	}
	public class RecebeSoNumeros extends PlainDocument {

		@Override
		public void insertString(int offs, String str, AttributeSet a) throws BadLocationException { 
			super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
		}
	}
}
