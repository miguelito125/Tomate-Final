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
import java.util.ArrayList;
import java.util.Stack;

public class VistaCitaIssam extends JPanel {

	private JPanel contentPane;
	private JPanel panel;
	private JButton boton;
//	ArrayList<JButton> botonera=new ArrayList<>();
	Stack<JButton> botonera=new Stack<>();

	/**
	 * Create the frame.
	 */
	public VistaCitaIssam() {
		setBounds(100, 100, 750, 485);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
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
		panel.setLayout(new GridLayout(4, 5, 0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTipo)
							.addGap(10)
							.addComponent(comboBox, 0, 207, Short.MAX_VALUE)
							.addGap(241))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(157)
							.addComponent(lblLunes, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
							.addGap(45)
							.addComponent(lblMartes, GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
							.addGap(35)
							.addComponent(lblMiercoles, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(lblJueves, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
							.addGap(50)
							.addComponent(lblViernes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(83)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(6)
										.addComponent(lblHoraDos))
									.addComponent(label_1)
									.addComponent(label))
								.addComponent(lblHoraUno))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)))
					.addGap(110))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblTipo))
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLunes)
						.addComponent(lblMartes)
						.addComponent(lblMiercoles)
						.addComponent(lblJueves)
						.addComponent(lblViernes))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addComponent(lblHoraUno, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
							.addGap(40)
							.addComponent(lblHoraDos, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
							.addGap(42)
							.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
							.addGap(38)
							.addComponent(label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(12))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)))
					.addGap(75))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private void crearBotonera() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				boton=new JButton();
				botonera.add(boton);
				panel.add(boton);
			}
			
		}
		}
	public JPanel getContentPane() {
		return contentPane;
	}
}
