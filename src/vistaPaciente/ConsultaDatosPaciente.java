package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;

public class ConsultaDatosPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public ConsultaDatosPaciente() {
		
		JLabel lblNewLabel = new JLabel("Consulta Datos Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlBusquedaPaciente = new JPanel();
		
		JPanel pnlCamposDatosPaciente = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 267, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(pnlCamposDatosPaciente, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(pnlBusquedaPaciente, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlBusquedaPaciente, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnlCamposDatosPaciente, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(97, Short.MAX_VALUE))
		);
		pnlCamposDatosPaciente.setLayout(new BorderLayout(0, 0));
		pnlBusquedaPaciente.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
