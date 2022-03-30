import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

public class Main extends Frame {

	public Main() {

		// create 9 button and set grid back layout
		Button b1 = new Button("BTN" + 1);
		Button b2 = new Button("BTN" + 2);
		Button b3 = new Button("BTN" + 3);
		Button b4 = new Button("BTN" + 4);
		Button b5 = new Button("BTN" + 5);
		Button b6 = new Button("BTN" + 6);
		Button b7 = new Button("BTN" + 7);
		Button b8 = new Button("BTN" + 8);
		Button b9 = new Button("BTN" + 9);

		GridBagLayout bg = new GridBagLayout();
		setLayout(bg);

		// get grid back layout
		GridBagConstraints con = new GridBagConstraints();
		con.weightx = 1;
		con.weighty = 1;
		con.fill = GridBagConstraints.BOTH;

		// prepare contraints for btn1
		con.gridx = 0;
		con.gridy = 0;
		con.gridwidth = 2;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b1, con);
		add(b1);

		// prepare contraints for btn2
		con.gridx = 2;
		con.gridy = 0;
		con.gridwidth = 2;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b2, con);
		add(b2);

		// prepare contraints for btn3
		con.gridx = 0;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b3, con);
		add(b3);

		// prepare contraints for btn4
		con.gridx = 1;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b4, con);
		add(b4);

		// prepare contraints for btn5
		con.gridx = 2;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b5, con);
		add(b5);

		// prepare contraints for btn6
		con.gridx = 3;
		con.gridy = 1;
		con.gridwidth = 1;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b6, con);
		add(b6);

		// prepare contraints for btn7
		con.gridx = 0;
		con.gridy = 2;
		con.gridwidth = 3;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b7, con);
		add(b7);

		// prepare contraints for btn8
		con.gridx = 0;
		con.gridy = 3;
		con.gridwidth = 3;
		con.gridheight = 1;
		// add control
		bg.setConstraints(b8, con);
		add(b8);

		// prepare contraints for btn9
		con.gridx = 3;
		con.gridy = 2;
		con.gridwidth = 1;
		con.gridheight = 2;
		// add control
		bg.setConstraints(b9, con);
		add(b9);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public Insets insets() {

		return new Insets(40, 20, 20, 20);
	}

	public static void main(String[] args) {

		Main s = new Main();
		s.setSize(new Dimension(300, 220));

		s.setTitle("example");
		s.setVisible(true);

	}

}
