package vistaOperacion;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;

import panelComunes.Mensaje;
import panelComunes.Tabla;

public class CierreOperacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public CierreOperacion() {
		Mensaje mensaje = new Mensaje();
		Tabla tabla = new Tabla();
		
		
		JLabel lblNewLabel = new JLabel("Cierre Operaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(tabla, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(mensaje, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING))
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(tabla, GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(mensaje, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		setLayout(groupLayout);

	}

}
