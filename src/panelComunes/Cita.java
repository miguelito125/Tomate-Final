package panelComunes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.GridLayout;

public class Cita extends JFrame {

	private JPanel contentPane;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cita frame = new Cita();
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
	public Cita() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTipo = new JLabel("Medico");
		
		JComboBox comboBox = new JComboBox();
		
		panel = new JPanel();
		crearBotonera();
		JLabel lblLunes = new JLabel("Lunes");
		
		JLabel lblMartes = new JLabel("Martes");
		
		JLabel lblMiercoles = new JLabel("Miercoles");
		
		JLabel lblJueves = new JLabel("Jueves");
		
		JLabel lblViernes = new JLabel("Viernes");
		
		JLabel lblHoraUno = new JLabel("8:00");
		
		JLabel lblHoraDos = new JLabel("9:00");
		
		JLabel label = new JLabel("11:00");
		
		JLabel label_1 = new JLabel("10:00");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTipo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(comboBox, 0, 232, Short.MAX_VALUE)
					.addGap(439))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addComponent(lblLunes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(45)
							.addComponent(lblMartes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(35)
							.addComponent(lblMiercoles, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(lblJueves, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(50)
							.addComponent(lblViernes, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(83)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblHoraUno)
								.addComponent(label)
								.addComponent(label_1)
								.addComponent(lblHoraDos))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)))
					.addGap(198))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblViernes)
								.addComponent(lblLunes)
								.addComponent(lblMartes)
								.addComponent(lblMiercoles)
								.addComponent(lblJueves))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
							.addGap(129))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(70)
							.addComponent(lblHoraUno, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
							.addGap(39)
							.addComponent(lblHoraDos, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
							.addGap(42)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
							.addGap(38)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
							.addGap(141))))
		);
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		contentPane.setLayout(gl_contentPane);
	}
	private void crearBotonera() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				panel.add(new JButton());
			}
			
		}
	}
}
