package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;

public class ConsultaCitasPendientes extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultaCitasPendientes() {
		
		JLabel lblNewLabel = new JLabel("Citas Pendiente Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlCitasPendientePaciente = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblNewLabel)
						.addComponent(pnlCitasPendientePaciente, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE))
					.addGap(46))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(pnlCitasPendientePaciente, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(68, Short.MAX_VALUE))
		);
		pnlCitasPendientePaciente.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
