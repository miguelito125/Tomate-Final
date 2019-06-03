package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import panelComunes.Identificacion;

public class ConsultaMedico extends JPanel {

	private JTextField altaEspecialidad;
	private JTextField altaConsulta;
	private JTextField altaHorario;

	/**
	 * Create the frame.
	 */
	public ConsultaMedico() {
		setBounds(100, 100, 653, 450);

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

		Identificacion identificacion = new Identificacion();
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(10).addComponent(lblConsultaMedico))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(163)
						.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE).addGap(95))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(170).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblHorario).addGap(41)
								.addComponent(altaHorario, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblConsulta).addGap(34)
								.addComponent(altaConsulta, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblEspecialidad).addGap(18)
								.addComponent(altaEspecialidad, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
						.addGap(95)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(29).addComponent(lblConsultaMedico).addGap(41)
				.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblEspecialidad))
						.addComponent(altaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConsulta))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(altaHorario,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHorario))));
		this.setLayout(gl_contentPane);
	}
}
