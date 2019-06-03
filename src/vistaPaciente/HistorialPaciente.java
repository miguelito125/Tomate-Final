package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Tabla;

import java.awt.BorderLayout;

public class HistorialPaciente extends JPanel {

	/**
	 * Create the panel.
	 */
	public HistorialPaciente() {
		
		Tabla tabla = new Tabla();
		Tabla tabla2 = new Tabla();
		
		JLabel lblNewLabel = new JLabel("Historial Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tabla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(tabla2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(36)
					.addComponent(tabla, GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(tabla2, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(19))
		);
		
		setLayout(groupLayout);

	}

}
