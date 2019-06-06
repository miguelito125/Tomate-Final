package vistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Identificacion;
import panelComunes.Mensaje;
import panelComunes.Seleccion;

public class BajaMedico extends JPanel {
	private JTextField bajaConsulta;
	private JTextField bajaHorario;
	private JTextField txtEspecialidad;

	/**
	 * Create the frame.
	 */
	public BajaMedico() {
		setBounds(100, 100, 657, 475);

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		bajaConsulta = new JTextField();
		bajaConsulta.setEditable(false);
		bajaConsulta.setColumns(10);

		bajaHorario = new JTextField();
		bajaHorario.setEditable(false);
		bajaHorario.setColumns(10);

		JLabel lblAltaMedico = new JLabel("Baja Medico");
		lblAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		Seleccion seleccion = new Seleccion();
		Mensaje mensaje = new Mensaje();
		Identificacion identificacion = new Identificacion();
		
		int[] camposDeshabilitados=  {0,1,2,3,4};
		identificacion.deshabilitarCampo(camposDeshabilitados);
		
		txtEspecialidad = new JTextField();
		txtEspecialidad.setEditable(false);
		txtEspecialidad.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
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
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(bajaConsulta)
									.addComponent(bajaHorario))
								.addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(133)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(seleccion, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
								.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))))
					.addGap(103))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
					.addGap(32))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAltaMedico, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(460, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAltaMedico)
					.addGap(41)
					.addComponent(seleccion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblEspecialidad)
						.addComponent(txtEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConsulta)
						.addComponent(bajaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHorario)
						.addComponent(bajaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addContainerGap())
		);
		this.setLayout(gl_contentPane);
	}
}
