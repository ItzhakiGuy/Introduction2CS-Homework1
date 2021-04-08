/*
Course: Intro To Computer Science
Homework: 1
Task: 5
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// prints 3 random number and then the minimal one
public class Gen3
{
	public static void main(String[] args)
	{
		int numin1=Integer.parseInt(args[0]);
		int numin2=Integer.parseInt(args[1]);
		int high=Math.max(numin1, numin2);
		int low=Math.min(numin1, numin2);
		int num1=((int)(Math.random()*(high-low+1)))+low;
		System.out.println(num1);
		int num2=((int)(Math.random()*(high-low+1)))+low;
		System.out.println(num2);
		int num3=((int)(Math.random()*(high-low+1)))+low;
		System.out.println(num3);
		System.out.println("The minimal generated number was "+Math.min(Math.min(num1, num2), num3));
	}
}