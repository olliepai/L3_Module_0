package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

	JFrame frame;
	JLabel label;
	String text = "";
	Stack<String> message = new Stack<String>();
	Stack<String> delete = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.GUI();
	}

	public void GUI() {
		frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		label = new JLabel(text);
		frame.addKeyListener(this);
		frame.add(panel);
		panel.add(label);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyChar());
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			String undo = message.pop();
			delete.push(undo);
		} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			message.push(delete.pop());
		} else {
			message.push(Character.toString(e.getKeyChar()));
		}
		text = "";
		for (String s : message) {
			text = text + s;
		}
		System.out.println(text);
		label.setText(text);
		frame.repaint();
	}
}
