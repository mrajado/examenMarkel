package hola;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PruebasParaExamen extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn1;	
	private JButton btn2;
	private JButton btn3;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PruebasParaExamen frame = new PruebasParaExamen();
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
	public PruebasParaExamen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btn1 = new JButton("New button");
		 btn1.addActionListener(this);
		btn1.setBounds(28, 69, 89, 23);
		contentPane.add(btn1);
		
		 btn2 = new JButton("New button");
		 btn2.addActionListener(this);
		btn2.setBounds(153, 69, 89, 23);
		contentPane.add(btn2);
		
		 btn3 = new JButton("New button");
		 btn3.addActionListener(this);
		btn3.setBounds(286, 69, 89, 23);
		contentPane.add(btn3);
		
		JLabel lblLabel = new JLabel("JjA");
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel.setBounds(137, 182, 105, 14);
		contentPane.add(lblLabel);
		
		JEditorPane editor = new JEditorPane();
		editor.setText("");
		// añado una barra de desplazamiento al editor
		JScrollPane scrollPaneEditor = new JScrollPane(editor);
		scrollPaneEditor.setBounds(0, 77, 82, -77);
		// Agrega el editor en el centro del contenedor
		contentPane.add(scrollPaneEditor, BorderLayout.CENTER);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o==btn1) {
			JOptionPane.showMessageDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo Mensaje",JOptionPane.INFORMATION_MESSAGE,null);
		} else if (o==btn2) {
			String respuesta = (String)JOptionPane.showInputDialog(this,(String)"Introduzca su Nombre: ","Cuadro de Diálogo de Introducción de Datos",JOptionPane.QUESTION_MESSAGE,null, null, "Sin Nombre");
		} else if (o==btn3) {
			int opcion = JOptionPane.showConfirmDialog(this,(String)"Prueba de Cuadros de Diálogo","Cuadro de Diálogo de Confirmación",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null);
		}
		
		
	}
}
