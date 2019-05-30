package VistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Consulta extends JPanel {

	private JPanel contentPane;
	private JTextField altaEspecialidad;
	private JTextField altaConsulta;
	private JTextField altaHorario;
	private JPanel panel;

	/**
	 * Create the frame.
	 */
	public Consulta() {
		setBounds(100, 100, 653, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblConsultaMedico = new JLabel("Consulta Medico");
		lblConsultaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		altaEspecialidad = new JTextField();
		altaEspecialidad.setColumns(10);

		altaConsulta = new JTextField();
		altaConsulta.setColumns(10);

		altaHorario = new JTextField();
		altaHorario.setColumns(10);

		panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(163).addComponent(panel,
								GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addGroup(gl_contentPane.createSequentialGroup().addGap(149)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblConsulta).addComponent(lblHorario)))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(lblConsultaMedico)))
										.addGap(34))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblEspecialidad)
										.addGap(18)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(altaHorario, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
										.addComponent(altaConsulta, GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
										.addComponent(altaEspecialidad, GroupLayout.DEFAULT_SIZE, 230,
												Short.MAX_VALUE))))
				.addGap(146)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(29).addComponent(lblConsultaMedico).addGap(41)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(altaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEspecialidad))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsulta))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(altaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHorario))
						.addContainerGap(125, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
