package VistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Alta extends JPanel {

	private JPanel contentPane;
	private JTextField altaConsulta;
	private JTextField altaHorario;

	/**
	 * Create the frame.
	 */
	public Alta() {
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

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(126).addComponent(panel,
								GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(143)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblHorario)
										.addComponent(lblConsulta).addComponent(lblEspecialidad))
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(altaConsulta, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 220,
												Short.MAX_VALUE)
										.addComponent(altaEspecialidad, Alignment.TRAILING, 0, 220, Short.MAX_VALUE)
										.addComponent(altaHorario, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
				.addGap(67))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(64)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(47, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(31).addComponent(lblAltaMedico)
						.addContainerGap(353, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(19).addComponent(lblAltaMedico).addGap(60)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblEspecialidad, Alignment.TRAILING)
								.addComponent(altaEspecialidad, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(altaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsulta))
						.addGap(6)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblHorario))
								.addComponent(altaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(52).addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(32, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
