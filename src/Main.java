import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n = sc.nextDouble();

		if (n > 0 && n <= 25) {
			System.out.println("intervalo (0,25)");
		} else if (n > 25 && n <= 50) {
			System.out.println("intervalo (25,50)");
		} else if (n > 50 && n <= 75) {
			System.out.println("intervalo (50,75)");
		} else if (n > 75 && n <= 100) {
			System.out.println("intervalo (75,100)");
		} else if (n < 0 || n > 100) {
			System.out.println("Fora do intervalo");
		}
		sc.close();
	}
}