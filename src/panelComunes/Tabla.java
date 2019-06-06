package panelComunes;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
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
	String cadena[]=new String[1];
	String nombresColumnas[]=null;
	ArrayList<String[]> filas=new ArrayList<>();
	String data2[][];
	String data[][]= new String[1][1];
	/**
	 * Create the frame.
	 */
	public Tabla(String titulo, String[] titulosColumnas) {
		nombresColumnas= titulosColumnas;
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
		

//		data=filas.toArray(data);
		data2=filas.toArray(data.clone());
		data=data2;
		
//		for (int i = 0; i < data.length; i++) {
//			for (int j = 0; j < data[i].length; j++) {
//				System.out.println(data[i][j]);
//			}
//		}
		table = new JTable();
		Font font = new Font("Tahoma", Font.PLAIN, 16);
		table.setFont(font);
		table.getTableHeader().setFont(font);
		DefaultTableModel defaultTableModel = new DefaultTableModel(data,nombresColumnas);
		table.setModel(defaultTableModel);
		scrollPane.setViewportView(table);
		setLayout(groupLayout);
		
		
	}
	
	public void agregarFila(String[] datos) {
		filas.add(datos);
		data2=filas.toArray(data.clone());
		data=data2;
		
	}
	public Tabla getContentPane() {
		return this;
	}
}
