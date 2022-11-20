package appmenus;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class frmPrincipal extends JFrame {

	private JPanel dp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("Aplicación Actividad POO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_1 = new JMenu("Archivo");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPrincipal.this.dispose();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Pitagoras");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Calcular Pitagoras");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPitagoras pitagoras = new frmPitagoras();
				dp.add(pitagoras);
				pitagoras.setClosable(true);
				pitagoras.setVisible(true);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_2 = new JMenu("Ohm");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Calcular Voltaje");
		mnNewMenu_2.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Calcular Corriente");
		mnNewMenu_2.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("Acerca");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Acerca de");
		mnNewMenu_3.add(mntmNewMenuItem_4);
		dp = new JPanel();
		dp.setBackground(SystemColor.activeCaption);
		dp.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(dp);	
		dp.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(217, 10, 0, 0);
		desktopPane.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		desktopPane.setAlignmentX(Component.RIGHT_ALIGNMENT);
		dp.add(desktopPane);
		desktopPane.setLayout(new BorderLayout(0, 0));
	}
}
