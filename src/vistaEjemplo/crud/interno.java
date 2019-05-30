package vistaEjemplo.crud;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;

public class interno extends JPanel {

	/**
	 * Create the panel.
	 */
	public interno() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JComboBox comboBox = new JComboBox();
		add(comboBox);

	}

}
