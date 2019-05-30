package vistaOperacion;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class CierreOperacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public CierreOperacion() {
		
		JLabel lblNewLabel = new JLabel("Cierre Operaciones");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlCierreOperaciones = new JPanel();
		
		JPanel pnlAplicarCierreOperaciones = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(pnlCierreOperaciones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
						.addComponent(pnlAplicarCierreOperaciones, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
						.addComponent(lblNewLabel, Alignment.LEADING))
					.addGap(37))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(pnlCierreOperaciones, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
					.addComponent(pnlAplicarCierreOperaciones, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlAplicarCierreOperaciones.setLayout(new BorderLayout(0, 0));
		pnlCierreOperaciones.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}

}
