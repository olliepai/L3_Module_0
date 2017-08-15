package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JButton addNameButton;
	JButton viewNameButton;
	ArrayList<String> guestNames = new ArrayList<String>();
	
	public static void main(String[] args) {
		GuestBook guestBook = new GuestBook();
		guestBook.GUI();
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public void GUI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		addNameButton = new JButton();
		viewNameButton = new JButton();
		addNameButton.setText("Add Name");
		viewNameButton.setText("View Names");
		addNameButton.addActionListener(this);
		viewNameButton.addActionListener(this);
		panel.add(addNameButton);
		panel.add(viewNameButton);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String list = "";
		
		// TODO Auto-generated method stub
		if (e.getSource().equals(addNameButton)) {
			String enterName = JOptionPane.showInputDialog("Enter a name.");
			guestNames.add(enterName);
			
		}
		
		if (e.getSource().equals(viewNameButton)) {
			for (int i = 0; i < guestNames.size(); i++) {
				list = list + "\n Guest #" + (i + 1) + ": " + guestNames.get(i);
			}
			JOptionPane.showMessageDialog(null, list);
		}
	}
}
