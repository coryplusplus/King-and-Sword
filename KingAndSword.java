import java.util.Scanner;


public class KingAndSword {
	
	
	public static int logBase2(int x)
	{
		return (int) (Math.log(x)/Math.log(2));
	}
	
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Enter number of prisoners:");
    	String input = in.nextLine();
    	int prisoners = Integer.parseInt(input);
    	int x = (int) Math.pow(2, logBase2(prisoners));
    	int y = prisoners - x;
    	int answer = 1;
    	for(int i = 1; i <= y; i++)
    	{
    		answer = answer + 2;
    	}

    	System.out.println("Prisoner number " + answer + " will be the last one alive");
   }
}


