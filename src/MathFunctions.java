
public class MathFunctions {

	public boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public void printNumberTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			printRow(i);
			System.out.println("");
		}
	}

	private void printRow(int i) {
		for (int j = 1; j <= i; j++) {
			if (j % 2 == 0)
				printXX(j);
			else
				System.out.print(j + " ");
		}
	}

	private void printXX(int j) {
		for (int k = 2; k <= j; k += 2)
			System.out.print("x" + " ");
	}

	public void printEventNumbersUsingLoop(int number) {
		for (int i = 2; i <= number; i += 2) {
			System.out.print(i + " ");
		}
	}

	public void printEvenNumbersNotUsingLoop(int number) {
		int currentNumber = 2;
		if (currentNumber <= number) {
			System.out.print(currentNumber + " ");
		}
		currentNumber = currentNumber + 2;
		if (currentNumber <= number) {
			System.out.print(currentNumber + " ");
		}
		currentNumber = currentNumber + 2;
		if (currentNumber <= number) {
			System.out.print(currentNumber + " ");
		}
		currentNumber = currentNumber + 2;
		if (currentNumber <= number) {
			System.out.print(currentNumber + " ");
		}
		currentNumber = currentNumber + 2;
		if (currentNumber <= number) {
			System.out.print(currentNumber + " ");
		}

	}

	public int sum(int i, int j) {
		// TODO Auto-generated method stub
		return i + j;
	}
}
