import javax.swing.JOptionPane;

public class teeking {

	public static void main(String[] args) {
		
		int firstNum, secondNum;
		double answer;
		int x=1;
		String input;
		
		do{
		try{
		
		input = JOptionPane.showInputDialog(null, "enter a number");
		firstNum = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog(null, "enter another number");
		secondNum = Integer.parseInt(input);
		
		answer = firstNum/secondNum;
		JOptionPane.showMessageDialog(null, "Your anser is " + answer);
		x = 2;
		
		} 
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "You aren't permitted to do that");
		}
		}while (x==1);

}
}
