package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;

public class frmFormes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCote;
	private JTextField txtRayon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmFormes frame = new frmFormes();
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
	public frmFormes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarre = new JLabel("");
		lblCarre.setIcon(new ImageIcon("C:\\Users\\Samir\\Documents\\BTS SIO_1ere_Annee\\Bloc2_SLAM_Conception et Dévellopement d'app\\B2.1_Concevoir et développer une solution applicative\\Emds\\pooTp\\media\\CarreVide.png"));
		lblCarre.setBounds(22, 11, 50, 50);
		contentPane.add(lblCarre);
		
		JLabel lblCercle = new JLabel("");
		lblCercle.setIcon(new ImageIcon("C:\\Users\\Samir\\Documents\\BTS SIO_1ere_Annee\\Bloc2_SLAM_Conception et Dévellopement d'app\\B2.1_Concevoir et développer une solution applicative\\Emds\\pooTp\\media\\CercleVide.png"));
		lblCercle.setBounds(22, 136, 50, 50);
		contentPane.add(lblCercle);
		
		JLabel lblCote = new JLabel("côté:");
		lblCote.setBounds(128, 11, 46, 14);
		contentPane.add(lblCote);
		
		txtCote = new JTextField();
		txtCote.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCote.setBounds(261, 11, 86, 20);
		contentPane.add(txtCote);
		txtCote.setColumns(10);
		
		JButton btnCarre = new JButton("calcul");
		btnCarre.setBounds(439, 10, 89, 23);
		contentPane.add(btnCarre);
		
		JLabel lbl1 = new JLabel("périmètre:");
		lbl1.setBounds(128, 50, 60, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("surface:");
		lbl2.setBounds(128, 83, 46, 14);
		contentPane.add(lbl2);
		
		JLabel lblPerimetreCarre = new JLabel("");
		lblPerimetreCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCarre.setBounds(301, 47, 46, 14);
		contentPane.add(lblPerimetreCarre);
		
		JLabel lblSurfaceCarre = new JLabel("");
		lblSurfaceCarre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCarre.setBounds(301, 83, 46, 14);
		contentPane.add(lblSurfaceCarre);
		
		JLabel lblRayon = new JLabel("rayon:");
		lblRayon.setBounds(128, 136, 46, 14);
		contentPane.add(lblRayon);
		
		JLabel lbl3 = new JLabel("périmètre:");
		lbl3.setBounds(128, 172, 60, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("surface: ");
		lbl4.setBounds(128, 207, 46, 14);
		contentPane.add(lbl4);
		
		txtRayon = new JTextField();
		txtRayon.setHorizontalAlignment(SwingConstants.RIGHT);
		txtRayon.setBounds(261, 136, 86, 20);
		contentPane.add(txtRayon);
		txtRayon.setColumns(10);
		
		JLabel lblPerimetreCercle = new JLabel("");
		lblPerimetreCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPerimetreCercle.setBounds(301, 172, 46, 14);
		contentPane.add(lblPerimetreCercle);
		
		JLabel lblSurfaceCercle = new JLabel("");
		lblSurfaceCercle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSurfaceCercle.setBounds(301, 207, 46, 14);
		contentPane.add(lblSurfaceCercle);
		
		JButton btnCercle = new JButton("calcul");
		btnCercle.setBounds(439, 136, 89, 23);
		contentPane.add(btnCercle);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 251, 506, 199);
		contentPane.add(scrollPane);
		
		JList lstFormes = new JList();
		scrollPane.setViewportView(lstFormes);
		
		JButton btnSuppr = new JButton("Supprimer");
		btnSuppr.setBounds(439, 471, 89, 23);
		contentPane.add(btnSuppr);

	}
}
