package appmenus;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Canvas;
import javax.swing.JTabbedPane;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPitagoras extends JInternalFrame {
	private JTextField txtLadoA;
	private JLabel lblNewLabel_1;
	private JTextField txtLadoB;
	private JTextField txtHipotenusa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPitagoras frame = new frmPitagoras();
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
	public frmPitagoras() {
		setTitle("Calcular Hipotenúsa");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lado A");
		lblNewLabel.setBounds(100, 53, 50, 15);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Hipotenúsa");
		lblNewLabel_2.setBounds(100, 153, 50, 15);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_1 = new JLabel("Lado B");
		lblNewLabel_1.setBounds(100, 103, 50, 15);
		getContentPane().add(lblNewLabel_1);
		
		txtLadoA = new JTextField();
		txtLadoA.setBounds(220, 50, 115, 20);
		getContentPane().add(txtLadoA);
		txtLadoA.setColumns(10);
		
		txtLadoB = new JTextField();
		txtLadoB.setColumns(10);
		txtLadoB.setBounds(220, 100, 115, 20);
		getContentPane().add(txtLadoB);
		
		txtHipotenusa = new JTextField();
		txtHipotenusa.setColumns(10);
		txtHipotenusa.setBounds(220, 150, 115, 20);
		getContentPane().add(txtHipotenusa);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hipotenusa, catetoa, catetob;
				catetoa = Double.parseDouble(txtLadoA.getText());
				catetob = Double.parseDouble(txtLadoB.getText());
				hipotenusa = Pitagoras.calcular_hipotenusa(catetoa, catetob);
				txtHipotenusa.setText(String.valueOf(hipotenusa));
			}
		});
		btnCalcular.setBounds(60, 200, 89, 23);
		getContentPane().add(btnCalcular);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double hipotenusa, catetoa, catetob;
				hipotenusa = 0;
				catetoa = 0;
				catetob = 0;
				txtLadoA.setText("");
				txtLadoB.setText("");
				txtHipotenusa.setText("");
			}
		});
		btnBorrar.setBounds(190, 200, 89, 23);
		getContentPane().add(btnBorrar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPitagoras.this.dispose();
			}
		});
		btnSalir.setBounds(310, 200, 89, 23);
		getContentPane().add(btnSalir);
		

	}
}
