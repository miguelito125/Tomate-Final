package VistaMedico;

import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Baja extends JPanel {

	private JPanel contentPane;
	private JTextField bajaTelefono;
	private JTextField bajaConsulta;
	private JTextField bajaHorario;

	/**
	 * Create the frame.
	 */
	public Baja() {
		setBounds(100, 100, 657, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		JLabel lblEspecialidad = new JLabel("Especialidad");

		JComboBox bajaEspecialidad = new JComboBox();

		JLabel lblNewLabel = new JLabel("Telefono");

		JLabel lblConsulta = new JLabel("Consulta");

		JLabel lblHorario = new JLabel("Horario");

		bajaTelefono = new JTextField();
		bajaTelefono.setColumns(10);

		bajaConsulta = new JTextField();
		bajaConsulta.setColumns(10);

		bajaHorario = new JTextField();
		bajaHorario.setColumns(10);

		JLabel lblAltaMedico = new JLabel("Baja Medico");
		lblAltaMedico.setFont(new Font("Tahoma", Font.PLAIN, 24));

		JPanel panel = new JPanel();

		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(48).addComponent(lblAltaMedico,
						GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(143).addComponent(lblNewLabel).addGap(34)
						.addComponent(bajaTelefono).addGap(294))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(143).addComponent(lblConsulta).addGap(34)
						.addComponent(bajaConsulta, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addGap(152))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(143).addComponent(lblHorario).addGap(41)
						.addComponent(bajaHorario, GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE).addGap(152))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(83)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE).addGap(93))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(143).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE).addGap(153))
						.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblEspecialidad).addGap(18)
								.addComponent(bajaEspecialidad, 0, 228, Short.MAX_VALUE).addGap(152)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(19).addComponent(lblAltaMedico).addGap(33)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE).addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblEspecialidad))
						.addComponent(bajaEspecialidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblNewLabel))
						.addComponent(bajaTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(6)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(3).addComponent(lblConsulta))
						.addComponent(bajaConsulta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(11)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblHorario).addComponent(
						bajaHorario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE))));
		contentPane.setLayout(gl_contentPane);
	}
}
