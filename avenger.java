import java.util.*;

class avenger
{
	String name,planet;
	String w;
	int age,power;
	
	public void getdetails()
	{
		Scanner n1= new Scanner(System.in);
		Scanner n2= new Scanner(System.in);
		System.out.println("enter the name of avenger");
		name = n1.nextLine();
		System.out.println("enter the age of avenger");
		age = n1.nextInt();
		System.out.println("enter the power of avenger");
		power = n1.nextInt();
		System.out.println("enter the weapon of avenger");
		w = n2.nextLine();
		System.out.println("enter the planet of avenger");
		planet = n2.nextLine();
		
	}
	
	public void displaydetails()
	{
		System.out.println(" avenger name= "+name);
		System.out.println(" avenger age= "+age +" years");
		System.out.println(" avenger power= " +power +" watt");
		System.out.println(" avenger weapon= "+w);
		System.out.println(" avenger planet= "+planet);
	}
	
	public static void main(String [] arg)
	{
		int i;
		avenger[] obj= new avenger[5];
		
		//get details
		
		for(i=0;i<=4;i++)
		{
			obj[i]=new avenger();
			obj[i].getdetails();
			System.out.println("\n");
		}
		
		//print details
		
		for(i=0;i<=4;i++)
		{
			System.out.println(i+")");
			obj[i].displaydetails();
			System.out.println("\n");
		}
	}
	
}