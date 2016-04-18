import java.util.Scanner;
import javax.swing.JOptionPane;

public class HW9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		OddEvenGame myOddEvenGame = new OddEvenGame();

		int evenOrOdd;
		int randomNum;
		String guess;
		int userGuess;

		boolean again = true;

		while (again) {

			randomNum = myOddEvenGame.getANumber();

			userGuess = myOddEvenGame.userGuess();

			evenOrOdd = myOddEvenGame.calculateOddOrEven(randomNum);

			guess = myOddEvenGame.calculateWinOrLoss(evenOrOdd, userGuess);
			
			myOddEvenGame.displayMessage(randomNum, guess);

			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to try again?");
			if (dialogResult == JOptionPane.NO_OPTION)
				again = false;

		}
	}
}