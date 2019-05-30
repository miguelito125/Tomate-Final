package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PedirOperacion extends JPanel {

	/**
	 * Create the panel.
	 */
	public PedirOperacion() {
		
		JLabel lblCitaOperacion = new JLabel("Cita Operacion");
		lblCitaOperacion.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlBusquedaPAcienteOperacion = new JPanel();
		
		JPanel pnlAplicarCitaOperacion = new JPanel();
		
		JLabel lblNewLabel = new JLabel("Tipo");
		
		JComboBox cmbTipoOperacion = new JComboBox();
		
		JLabel lblNewLabel_1 = new JLabel("Cirujano");
		
		JComboBox cmbCirujanoOperacion = new JComboBox();
		
		JLabel lblFechasDisponibles = new JLabel("Fechas Disponibles");
		
		JComboBox cmbBusquedaFecha = new JComboBox();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(pnlAplicarCitaOperacion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(pnlBusquedaPAcienteOperacion, GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
							.addComponent(lblCitaOperacion))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cmbTipoOperacion, 0, 130, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblFechasDisponibles, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGap(44)))
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(cmbCirujanoOperacion, 0, 162, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(cmbBusquedaFecha, 0, 160, Short.MAX_VALUE)
									.addGap(56)))))
					.addGap(48))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblCitaOperacion)
					.addGap(18)
					.addComponent(pnlBusquedaPAcienteOperacion, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cmbTipoOperacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cmbCirujanoOperacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(49)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFechasDisponibles)
						.addComponent(cmbBusquedaFecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(pnlAplicarCitaOperacion, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlAplicarCitaOperacion.setLayout(new BorderLayout(0, 0));
		pnlBusquedaPAcienteOperacion.setLayout(new BorderLayout(0, 0));
		setLayout(groupLayout);

	}
}
