package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After
	 * an ID is entered, use another input dialog to ask the user to enter a
	 * name. Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog
	 * to ask the user to enter an ID number. If that ID exists, display that
	 * name to the user. Otherwise, tell the user that that entry does not
	 * exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list
	 * in a message dialog in the following format: ID: 123 Name: Harry Howard
	 * ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4:
	 * Remove Entry When this button is clicked, prompt the user to enter an ID
	 * using an input dialog. If this ID exists in the HashMap, remove it.
	 * Otherwise, notify the user that the ID is not in the list.
	 *
	 */
	HashMap<Integer, String> logSearch = new HashMap<Integer, String>();

	JButton addEntry;
	JButton searchByID;
	JButton viewList;
	JButton removeEntry;
	
	String list = "";

	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.GUI();
	}

	public void GUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		addEntry = new JButton();
		searchByID = new JButton();
		viewList = new JButton();
		removeEntry = new JButton();
		addEntry.addActionListener(this);
		searchByID.addActionListener(this);
		viewList.addActionListener(this);
		removeEntry.addActionListener(this);
		addEntry.setText("Add Entry");
		searchByID.setText("Search by ID");
		viewList.setText("View List");
		removeEntry.setText("Remove Entry");
		panel.add(addEntry);
		panel.add(searchByID);
		panel.add(viewList);
		panel.add(removeEntry);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource().equals(addEntry)) {
			String iDNumber = JOptionPane.showInputDialog("Enter an ID number.");
			int iDNumberI = Integer.parseInt(iDNumber);
			String name = JOptionPane.showInputDialog("Enter a name.");
			logSearch.put(iDNumberI, name);
		}
		if (e.getSource().equals(searchByID)) {
			String iDNumber2 = JOptionPane.showInputDialog("Enter an ID number.");
			int iDNumberI2 = Integer.parseInt(iDNumber2);
			if (logSearch.containsKey(iDNumberI2)) {
				JOptionPane.showMessageDialog(null, logSearch.get(iDNumberI2));
			} else {
				JOptionPane.showMessageDialog(null, "That entry does not exist.");
			}
		}
		if (e.getSource().equals(viewList)) {
			for (int s : logSearch.keySet()) {
				list = list + "\nID: " + s + " Name: " + logSearch.get(s);
			}
			JOptionPane.showMessageDialog(null, list);
		}
		if (e.getSource().equals(removeEntry)) {
			String iDNumber3 = JOptionPane.showInputDialog("Enter an ID number.");
			int iDNumberI3 = Integer.parseInt(iDNumber3);
			if (logSearch.containsKey(iDNumberI3)) {
				list = "";
				logSearch.remove(iDNumberI3);
			}
			else {
				JOptionPane.showMessageDialog(null, "That ID is not in the list.");
			}
		}
	}
}
