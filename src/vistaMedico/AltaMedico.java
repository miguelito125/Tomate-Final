package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import panelComunes.Identificacion;
import panelComunes.Mensaje;

public class AltaMedico extends JPanel {

	private JPanel contentPane;
	private JTextField altaConsulta;
	private JTextField altaHorario;

	/**
	 * Create the frame.
	 */
	public AltaMedico() {
		setBounds(100, 100, 657, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JComboBox altaEspecialidad = new JComboBox();

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		altaConsulta = new JTextField();
		altaConsulta.setColumns(10);

		altaHorario = new JTextField();
		altaHorario.setColumns(10);

		JLabel lblAltaMedico = new JLabel("Alta Medico");
		lblAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		Identificacion identificacion = new Identificacion();

		Mensaje mensaje = new Mensaje();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(31).addComponent(lblAltaMedico)
						.addContainerGap(427, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(101)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(9)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblConsulta).addComponent(lblEspecialidad)
												.addComponent(lblHorario))
										.addGap(18)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(altaHorario).addComponent(altaConsulta)
												.addComponent(altaEspecialidad, 0, 291, Short.MAX_VALUE))
										.addGap(11))
								.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
										.addGap(3)))
						.addGap(92)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(19).addComponent(lblAltaMedico).addGap(52)
				.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEspecialidad))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConsulta))
				.addGap(9)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblHorario).addComponent(
						altaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(55).addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(26, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}