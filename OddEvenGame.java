import javax.swing.JOptionPane;

public class OddEvenGame {

	public OddEvenGame() {

	}

	public int getANumber() {

		int computerNum = 1 + (int) (Math.random() * 10);
		return computerNum;
	}

	public int userGuess() {

		String guess = JOptionPane.showInputDialog("Roll the dice! Guess even or odd?\nEnter 0 for even, 1 for odd");
		int userGuess = Integer.parseInt(guess);
		return userGuess;
	}

	public int calculateOddOrEven(int num) {

		int evenOrOdd = num % 2;
		return evenOrOdd;
	}

	public String calculateWinOrLoss(int num, int guess) {

		if (num == guess)
			return "won";
		else
			return "lose";
	}

	public void displayMessage(int num, String guess) {
		String message = String.format("The number was %d.\n You %s!", num, guess);
		JOptionPane.showMessageDialog(null, message);
	}

}
