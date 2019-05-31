package vistaPaciente;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Modelo.Cita;
import panelComunes.Mensaje;
import panelComunes.Seleccion;
import panelComunes.VistaCitaIssam;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.BorderLayout;

public class PedirCitaPrimaria extends JPanel {

	/**
	 * Create the panel.
	 */
	public PedirCitaPrimaria() {
		
		JLabel lblNewLabel = new JLabel("Cita Atencion Primaria");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JPanel pnlBuscarPaciente = new JPanel();
		
		JPanel pnlEspecialistaHorario = new JPanel();
		
		JPanel pnlAplicarCitaPrimaria = new JPanel();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlBuscarPaciente, GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlEspecialistaHorario, GroupLayout.PREFERRED_SIZE, 497, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(pnlAplicarCitaPrimaria, GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addContainerGap(290, Short.MAX_VALUE))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(pnlBuscarPaciente, GroupLayout.PREFERRED_SIZE, 63, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnlEspecialistaHorario, GroupLayout.PREFERRED_SIZE, 279, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(pnlAplicarCitaPrimaria, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		pnlAplicarCitaPrimaria.setLayout(new BorderLayout(0, 0));
		pnlEspecialistaHorario.setLayout(new BorderLayout(0, 0));
		pnlBuscarPaciente.setLayout(new BorderLayout(0, 0));
		VistaCitaIssam cita = new VistaCitaIssam();
		pnlEspecialistaHorario.add(cita.getContentPane());
		Mensaje mensaje = new Mensaje();
		pnlAplicarCitaPrimaria.add(mensaje.getContentPane());
		Seleccion seleccion = new Seleccion();
		pnlBuscarPaciente.add(seleccion.getContentPane());
		setLayout(groupLayout);

	}
}
