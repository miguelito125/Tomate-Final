package panelComunes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Tabla extends JPanel {
	JScrollPane scrollPane;
	private JTable table;
	/**
	 * Create the frame.
	 */
	public Tabla(String titulo, String[] titulosColumnas,String[][]data,String observaciones[]) {
		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTitulo, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
							.addGap(517))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTitulo, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
					.addContainerGap())
		);
		

		
		table = new JTable();
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		table.setFont(font);
		table.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,titulosColumnas);
		table.setModel(defaultTableModel);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JTable table=((JTable)e.getSource());
				int selectedRow = table.getSelectedRow();
				new Dialogo(observaciones[selectedRow]);
			}
		});
	
		
	}

	public Tabla getContentPane() {
		return this;
	}
}
