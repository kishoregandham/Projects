import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This program takes in a list of names, stores them
 * and gives you a pair of random names, until the list
 * is exhausted.
 * This is a crappy program, inefficient and wack. It did the job and I wrote it in a few minutes. Feel free to edit as you please 
 * @author Perry Ogwuche
 * @date 6/24/13
 *
 */

public class Mixer {

	public static void main(String[] args) {

		String name = "";


		ArrayList<String> names = new ArrayList<String>();

		Scanner userInput = new Scanner(System.in);

		while(!(name.equalsIgnoreCase("q")))
		{
			System.out.print("Enter a name or 'q' when you are done: ");
			name = userInput.next();

			names.add(name);

			if(name.equals("q"))
			{	
				System.out.println("\n"+"Thank you for entering the names"+"\n"+"Here is your randomly generated pairs. ENJOY!!");
				names.remove(names.size()-1);
			}	
		}

		Random randomNumGenerator = new Random();

		//Print out two randomly generated names from the arrayList and Take those names out of the list after they are printed
		for(int i = 0; i<names.size()+1; i++)
		{
			System.out.println(names.remove(randomNumGenerator.nextInt(names.size())) + " , " +  names.remove(randomNumGenerator.nextInt(names.size())));
		}
	}
}