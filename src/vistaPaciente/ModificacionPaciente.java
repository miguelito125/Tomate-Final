package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;

public class ModificacionPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public ModificacionPaciente() {
		
		JLabel lblNewLabel = new JLabel("Modificacion Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlBusquedaPacienteModificacion = new JPanel();
		
		JPanel pnlCamposModificacionPaciente = new JPanel();
		
		JPanel pnlAplicarModificacionPaciente = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlAplicarModificacionPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
						.addComponent(pnlCamposModificacionPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(pnlBusquedaPacienteModificacion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
							.addComponent(lblNewLabel, Alignment.LEADING)))
					.addGap(40))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(pnlBusquedaPacienteModificacion, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlCamposModificacionPaciente, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
					.addComponent(pnlAplicarModificacionPaciente, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlAplicarModificacionPaciente.setLayout(new BorderLayout(0, 0));
		pnlCamposModificacionPaciente.setLayout(new BorderLayout(0, 0));
		pnlBusquedaPacienteModificacion.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
