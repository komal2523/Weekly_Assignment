package Assignment;

public class Program4_Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 24;

        System.out.println("Factors of " + number + " are:");

        for (int i = 1; i <= number; i++)
        {

            if (number % i == 0)
            {
                System.out.println(i);
            }
        }
	}

}
