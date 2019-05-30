package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;

public class HistorialPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public HistorialPaciente() {
		
		JLabel lblNewLabel = new JLabel("Historial Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlCitasOperaciones = new JPanel();
		
		JPanel pnlTratamientos = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlCitasOperaciones, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(pnlTratamientos, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(36)
					.addComponent(pnlCitasOperaciones, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
					.addGap(68)
					.addComponent(pnlTratamientos, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		pnlTratamientos.setLayout(new BorderLayout(0, 0));
		pnlCitasOperaciones.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
