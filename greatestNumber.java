import javax.swing.JOptionPane;

public class greatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number", "0"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number", "0"));
		
		int largest = Math.max(num1, num2);
		largest = Math.max(largest, num3);
		
		System.out.println("The greatest: " + largest);
	}

}
