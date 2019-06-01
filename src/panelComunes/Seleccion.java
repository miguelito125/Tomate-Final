package panelComunes;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Seleccion extends JPanel {

	private JPanel panel;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Seleccion() {
		setBounds(100, 100, 562, 37);
		JLabel lblNombre = new JLabel("Nombre");

		JComboBox comboBox = new JComboBox();

		JLabel lblId = new JLabel("ID");

		JComboBox comboBox_1 = new JComboBox();

		GroupLayout gl_contentPane = new GroupLayout(this);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(
				Alignment.LEADING,
				gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNombre)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(comboBox, 0, 220, Short.MAX_VALUE)
						.addGap(75).addComponent(lblId, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(comboBox_1, 0, 171, Short.MAX_VALUE)
						.addGap(71)));
		gl_contentPane
				.setVerticalGroup(
						gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNombre)
												.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblId))
										.addContainerGap(7, Short.MAX_VALUE)));
		this.setLayout(gl_contentPane);
	}
}
