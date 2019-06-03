package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Identificacion;
import panelComunes.Mensaje;

public class AltaPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public AltaPaciente() {
		Identificacion identificacion = new Identificacion();
		Mensaje mensaje = new Mensaje();
		JLabel lblAltaPaciente = new JLabel("Alta Paciente");
		lblAltaPaciente.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(mensaje, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblAltaPaciente, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(295, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(identificacion, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
							.addGap(16))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblAltaPaciente, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(identificacion, GroupLayout.PREFERRED_SIZE, 166, Short.MAX_VALUE)
					.addGap(14)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		

	
		this.setLayout(groupLayout);
	}
}
