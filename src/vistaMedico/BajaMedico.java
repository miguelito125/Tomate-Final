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
import panelComunes.Seleccion;

public class BajaMedico extends JPanel {
	private JTextField bajaConsulta;
	private JTextField bajaHorario;

	/**
	 * Create the frame.
	 */
	public BajaMedico() {
		setBounds(100, 100, 657, 475);

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JComboBox bajaEspecialidad = new JComboBox();

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		bajaConsulta = new JTextField();
		bajaConsulta.setColumns(10);

		bajaHorario = new JTextField();
		bajaHorario.setColumns(10);

		JLabel lblAltaMedico = new JLabel("Baja Medico");
		lblAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		Seleccion seleccion = new Seleccion();

		Identificacion identificacion = new Identificacion();
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(48)
					.addComponent(lblAltaMedico, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addComponent(lblConsulta)
					.addContainerGap(472, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(143)
					.addComponent(lblHorario)
					.addContainerGap(479, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(143)
							.addComponent(lblEspecialidad)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(bajaConsulta)
								.addComponent(bajaEspecialidad, 0, 280, Short.MAX_VALUE)
								.addComponent(bajaHorario))
							.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(133)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(identificacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
								.addComponent(seleccion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))))
					.addGap(103))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(lblAltaMedico)
					.addGap(33)
					.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEspecialidad)
						.addComponent(bajaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConsulta)
						.addComponent(bajaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHorario)
						.addComponent(bajaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6))
		);
		this.setLayout(gl_contentPane);
	}
}
