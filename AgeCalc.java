import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalc {
	private static int date,month,year;
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		Scanner s = new Scanner(System.in);
        System.out.println("Enter your date of birth in dd-mm-yyyy format: ");
        String dob = s.nextLine();
        String[] arr = dob.split("-");
        date = Integer.parseInt(arr[0]);
        month = Integer.parseInt(arr[1]);
        year = Integer.parseInt(arr[2]);
		LocalDate birthDate = LocalDate.of(year,month,date);
		int years = Period.between(birthDate,today).getYears();
		int month = Period.between(birthDate,today).getMonths();
        int days = Period.between(birthDate,today).getYears();
		System.out.println(days+"-"+month+"-"+years);
		s.close();
	}

}