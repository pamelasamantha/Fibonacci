package week5;

import acm.program.GraphicsProgram;
import acm.graphics.*;
import acm.program.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxDiagram extends GraphicsProgram {
	
	private static final int MAX_NAME = 25;
	private static final double BOX_WIDTH = 120;
	private static final double BOX_HEIGHT = 50;
	private JTextField nameField;
	private JButton addButton;
	private JButton removeButton;
	private JButton clearButton;
	
	
	public void init() {
		contents = new HashMap<String, GObject>();
		addActionListeners();
		addMouseListeners();
	}
	
	private void controller() {
		nameField = newJTextField(MAX_NAME);
		nameField.AddActionListener(this);
		addButton = new JButton("Add");
		removeButton = new JButton("Remove");
		clearButton = new JButton("Clear");
		add(new JLabel("Name"), SOUTH);
		add(nameField, SOUTH);
		add(addButton, SOUTH);
		add(removeButton, SOUTH);
		add(clearButton, SOUTH);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == addButton || source == nameField) {
		addBox(nameField.getText());
		} else if (source == removeButton) {
		removeBox(nameField.getText());
		} else if (source == clearButton) {
		removeContents();
		}

}
