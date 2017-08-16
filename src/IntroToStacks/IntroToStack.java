package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		//   Don't forget to import the Stack class
		Stack<Double> doubleStack = new Stack<Double>();
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			double randomDouble = new Random().nextDouble() * 100;
			doubleStack.push(randomDouble);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String numberOneS = JOptionPane.showInputDialog("Enter in a number.");
		int numberOneI = Integer.parseInt(numberOneS);
		String numberTwoS = JOptionPane.showInputDialog("Enter in another number that is larger than the first number.");
		int numberTwoI = Integer.parseInt(numberTwoS);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < doubleStack.size(); i++) {
			if (doubleStack.get(i) > numberOneI && doubleStack.get(i) < numberTwoI) {
				System.out.println(doubleStack.get(i));
			}
			doubleStack.pop();
			
		}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
