import java.util.Scanner;
import java.io.File;

public class Driver {
	
	public static void main(String[] args) {
		
		String date = "2016/04/18";
		String newDate = date.replace(date.substring(8, 10), Integer.toString(Integer.parseInt(date.substring(8,10))+1));
		System.out.println(newDate);
		
		Gathering gather = new Gathering();
		
		String choice;
		Scanner in = new Scanner(System.in);
		
		while (0<1)
		{
			System.out.println("------------------------------------------");
			System.out.println("Please choose an option");
			System.out.println("1. Add Liquid data.");
			System.out.println("2. Add sleep data.");
			System.out.println("3. Add steps data.");
			System.out.println("4. Print out all events.");
			System.out.println("5. Delete data entry.");
			System.out.println("6. Display data for a day.");
			System.out.println("7. Display data for the a week.");
			System.out.println("8. Display data for the a month.");
			System.out.println("9. Display data for the a year.");
			System.out.println("10. Exit.");
			System.out.println("------------------------------------------");
			
			choice = in.nextLine();
			
			if (choice.equals("1"))
			{
				System.out.println("Please enter the amount of liquids you've drank in FL OZs.");
				int setValue = in.nextInt();
				gather.newEvent("Liquid", setValue);
			}
			else if (choice.equals("2"))
			{
				System.out.println("Please enter the amount of sleep you had.");
				int setValue = in.nextInt();
				gather.newEvent("Sleep", setValue);
			}
			else if (choice.equals("3"))
			{
				System.out.println("Please enter the amount of steps you took. ");
				int setValue = in.nextInt();
				gather.newEvent("Steps", setValue);
			}
			else if (choice.equals("4"))
			{
				System.out.println(gather.getAllEvents());
			}
			else if (choice.equals("5"))
			{
				System.out.println("not functioning yet");
			}
			else if (choice.equals("6"))
			{
				System.out.println("Please choose what type of data you want displayed for a day.");
				System.out.println("1. Liquid Data.");
				System.out.println("2. Sleep Data.");
				System.out.println("3. Steps Data.");
				choice = in.nextLine();
				
				if (choice.equals("1"))
				{
					System.out.println("Enter the day: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Liquid", "Day", dlDate));
				}
				else if (choice.equals("2"))
				{
					System.out.println("Enter the day: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Sleep", "Day", dlDate));
				}
				else if (choice.equals("3"))
				{
					System.out.println("Enter the day: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Steps", "Day", dlDate));
				}
				
			}
			else if (choice.equals("7"))
			{
				System.out.println("Please choose what type of data you want displayed for the week.");
				System.out.println("1. Liquid Data.");
				System.out.println("2. Sleep Data.");
				System.out.println("3. Steps Data.");
				choice = in.nextLine();
				
				if (choice.equals("1"))
				{
					System.out.println("Enter the first day of the week: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Liquid", "Week", dlDate));
				}
				else if (choice.equals("2"))
				{
					System.out.println("Enter the first day of the week: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Sleep", "Week", dlDate));
				}
				else if (choice.equals("3"))
				{
					System.out.println("Enter the first day of the week: (YYYY/MM/DD) ");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Steps", "Week", dlDate));
				}
			}
			
			else if (choice.equals("8"))
			{
				System.out.println("Please choose what type of data you want displayed for the month.");
				System.out.println("1. Liquid Data.");
				System.out.println("2. Sleep Data.");
				System.out.println("3. Steps Data.");
				choice = in.nextLine();
				
				if (choice.equals("1"))
				{
					System.out.println("Enter the month (YYYY/MM)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Liquid", "Month", dlDate));
				}
				else if (choice.equals("2"))
				{
					System.out.println("Enter the month (YYYY/MM)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Sleep", "Month", dlDate));
				}
				else if (choice.equals("3"))
				{
					System.out.println("Enter the month (YYYY/MM)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Steps", "Month", dlDate));
				}
			}
			else if (choice.equals("9"))
			{
				System.out.println("Please choose what type of data you want displayed for a year.");
				System.out.println("1. Liquid Data.");
				System.out.println("2. Sleep Data.");
				System.out.println("3. Steps Data.");
				choice = in.nextLine();
				
				if (choice.equals("1"))
				{
					System.out.println("Enter the year (YYYY)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Liquid", "Year", dlDate));
				}
				else if (choice.equals("2"))
				{
					System.out.println("Enter the year (YYYY)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Steps", "Year", dlDate));;
				}
				else if (choice.equals("3"))
				{
					System.out.println("Enter the year (YYYY)");
					String dlDate = in.nextLine();
					System.out.println(gather.report("Sleep", "Year", dlDate));
				}
			}
			else if (choice.equals("10"))
			{
				System.exit(0);
			}
			else {
				System.out.println("Invalid Input, try again");
			}
		}

	}
}
