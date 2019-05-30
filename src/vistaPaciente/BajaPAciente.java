package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class BajaPAciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public BajaPAciente() {
		
		JLabel lblBajaPaciente = new JLabel("Baja Paciente");
		lblBajaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlBusquedaPaciente = new JPanel();
		
		JPanel pnlCamposBajaPaciente = new JPanel();
		
		JPanel pnlAplicarBajaPaciente = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBajaPaciente, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(42, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlAplicarBajaPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
						.addComponent(pnlCamposBajaPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
						.addComponent(pnlBusquedaPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
					.addGap(30))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblBajaPaciente, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlBusquedaPaciente, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlCamposBajaPaciente, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
					.addComponent(pnlAplicarBajaPaciente, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlAplicarBajaPaciente.setLayout(new BorderLayout(0, 0));
		pnlCamposBajaPaciente.setLayout(new BorderLayout(0, 0));
		pnlBusquedaPaciente.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
