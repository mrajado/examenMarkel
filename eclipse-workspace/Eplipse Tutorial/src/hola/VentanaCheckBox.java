package hola;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaCheckBox extends JFrame implements ChangeListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldIzena;
	private JTextField textFieldAbizena;
	private JCheckBox chckbxErdera;
	private JCheckBox chckbxEuskera;
	private JCheckBox chckbxIngelera;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCheckBox frame = new VentanaCheckBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaCheckBox() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInicio = new JLabel("CIFP ZORNOTZA LHII");
		lblInicio.setFont(new Font("Tw Cen MT", Font.BOLD, 16));
		lblInicio.setForeground(Color.BLUE);
		lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
		lblInicio.setBounds(94, 11, 197, 30);
		contentPane.add(lblInicio);
		
		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setBounds(10, 67, 100, 14);
		contentPane.add(lblIzena);
		
		JLabel lblAbizena = new JLabel("Abizena:");
		lblAbizena.setBounds(10, 117, 100, 14);
		contentPane.add(lblAbizena);
		
		textFieldIzena = new JTextField();
		textFieldIzena.setBounds(94, 64, 119, 20);
		contentPane.add(textFieldIzena);
		textFieldIzena.setColumns(10);
		
		textFieldAbizena = new JTextField();
		textFieldAbizena.setBounds(94, 114, 119, 20);
		contentPane.add(textFieldAbizena);
		textFieldAbizena.setColumns(10);
		
		JLabel lblInfo = new JLabel("Ezagutxen dituzun hezkuntzak: 2 Gutxienez");
		lblInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblInfo.setBounds(72, 160, 264, 14);
		contentPane.add(lblInfo);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 180, 414, 30);
		contentPane.add(panel);
		
		 chckbxErdera = new JCheckBox("Erdera");
		 chckbxErdera.addChangeListener(this);
		panel.add(chckbxErdera);
		
		 chckbxEuskera = new JCheckBox("Euskera");
		 chckbxEuskera.addChangeListener(this);
		panel.add(chckbxEuskera);
		
		 chckbxIngelera = new JCheckBox("Ingelera");
		 chckbxIngelera.addChangeListener(this);
		panel.add(chckbxIngelera);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(294, 55, 130, 76);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnIrakaslea = new JRadioButton("Irakaslea");
		rdbtnIrakaslea.setBounds(6, 7, 109, 23);
		panel_1.add(rdbtnIrakaslea);
		
		JRadioButton rdbtnIkaslea = new JRadioButton("Ikaslea");
		rdbtnIkaslea.setBounds(6, 46, 109, 23);
		panel_1.add(rdbtnIkaslea);
		
		JButton btnAceptar = new JButton("Bidali");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object o = e.getSource();
				
				if (o==btnAceptar) {
					String espanol = new String(chckbxIngelera.getText());
					String euskera = new String(chckbxIngelera.getText());
					String inglesh = new String(chckbxIngelera.getText());


				}
			}
		});
		btnAceptar.setBounds(161, 221, 130, 23);
		contentPane.add(btnAceptar);
	}


	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
		 // cojo la fuente actual
		 		 
		 int formato = 0;
		 // actualizo la fuente
		 
		 if (this.chckbxErdera.isSelected()){
			 
		 // si hay que ponerla en cursiva
		 formato = formato + Font.ITALIC;
		 
		 }
		 
		 if (this.chckbxEuskera.isSelected()){
			 
			 // si hay que ponerla en negrita
			 
		 }
		 // actualizo el formato de la fuente
		 
		 if (this.chckbxIngelera.isSelected()){
			 
			 // si hay que ponerla en negrita
			 
		 }
		


	}
}
