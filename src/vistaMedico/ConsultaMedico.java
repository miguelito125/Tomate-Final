package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import panelComunes.Identificacion;
import panelComunes.Seleccion;

import javax.swing.LayoutStyle.ComponentPlacement;

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
		altaEspecialidad.setEditable(false);
		altaEspecialidad.setColumns(10);

		altaConsulta = new JTextField();
		altaConsulta.setEditable(false);
		altaConsulta.setColumns(10);

		altaHorario = new JTextField();
		altaHorario.setEditable(false);
		altaHorario.setColumns(10);
		Seleccion seleccion = new Seleccion();
		Identificacion identificacion = new Identificacion();
		int[] camposDeshabilitados=  {0,1,2,3,4};
		identificacion.deshabilitarCampo(camposDeshabilitados);
		
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblEspecialidad)
							.addGap(18)
							.addComponent(altaEspecialidad, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblHorario)
								.addComponent(lblConsulta))
							.addGap(34)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(altaConsulta, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
								.addComponent(altaHorario, GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))))
					.addGap(95))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsultaMedico)
					.addContainerGap(471, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(163)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
							.addGap(95))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblConsultaMedico)
					.addGap(24)
					.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 152, Short.MAX_VALUE)
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblEspecialidad)
						.addComponent(altaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblConsulta))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(altaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHorario))
					.addGap(87))
		);
		this.setLayout(gl_contentPane);
	}
}
