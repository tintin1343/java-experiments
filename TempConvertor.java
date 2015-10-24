import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TempConvertor {

	public static void main(String[] args) throws IOException {

		int in = 1;
		double output = 0.0;
		double input = 0.0;

		BufferedReader b = callMenu();

		try {
			in = Integer.parseInt(b.readLine());
			// present a switch case

			switch (in) {

			case 1:
				System.out.println("Enter the temp in degrees:");
				input = Double.parseDouble(b.readLine());
				output = degreeToFarenheit(input);
				System.out.println(input + " Degrees is " + output
						+ " Farenheit.");
				break;

			case 2:
				System.out.println("Enter the temp in farenheit:");
				input = Double.parseDouble(b.readLine());
				output = farenheitToDegree(input);
				System.out.println(input + " Farenheit is " + output
						+ " Degrees.");
				break;

			case 3:
				break;

			default:
				break;
			}

		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static BufferedReader callMenu() {
		System.out.println("""""""""""""""""""""""""""""""""");
		System.out.println("This is a Temperature Convertor");
		System.out.println("""""""""""""""""""""""""""""""""");
		
		System.out.println("Please enter a number between 1-3:");
		System.out.println("1. Degree to Farenheit");
		System.out.println("2. Farenheit to Degree");
		System.out.println("3. End");

		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		return b;

	}

	// converts entered temperature in degrees to farenheit
	// input : in degrees
	// output : in farenheit
	// Eg: 25 D-> 77.0 F
	// Eg: 23.9 -> 75.0F
	private static double degreeToFarenheit(double input) {
		return input * (double) (9.0 / 5.0) + 32.0;
	}

	// converts entered temperature in farenheit to degrees
	// input : in farenheit
	// output : in degree
	// Eg: 77.0 F-> 25 D
	// Eg: 75.0F -> 23.9 D
	private static double farenheitToDegree(double input) {
		return (double) ((input - 32.0) * (5.0 / 9.0));
	}

}
