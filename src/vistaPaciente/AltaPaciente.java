package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AltaPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public AltaPaciente() {
		
		JLabel lblAltaPaciente = new JLabel("Alta Paciente");
		lblAltaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlCamposAltaPaciente = new JPanel();
		
		JPanel pnlaAplicarAltaPaciente = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblAltaPaciente, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(49)
							.addComponent(pnlCamposAltaPaciente, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
							.addGap(51))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(pnlaAplicarAltaPaciente, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAltaPaciente, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlCamposAltaPaciente, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(71)
					.addComponent(pnlaAplicarAltaPaciente, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(21, Short.MAX_VALUE))
		);
		pnlaAplicarAltaPaciente.setLayout(new BorderLayout(0, 0));
		pnlCamposAltaPaciente.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}
}
