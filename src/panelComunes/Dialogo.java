package panelComunes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;

public class Dialogo extends JDialog {

	private String cadena;
	public Dialogo(String cadena) {
		super();
		this.cadena=cadena;
		JButton boton = new JButton("salir");
		boton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		getContentPane().add(boton, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel(cadena);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		pack();
		setVisible(true);
	}

}