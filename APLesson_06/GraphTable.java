import java.util.Scanner;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num = kb.nextInt();
		System.out.println("Please enter the size of the table: ");
		int size = kb.nextInt();
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%d | %d\n", i, i*num);
		}
	}
}