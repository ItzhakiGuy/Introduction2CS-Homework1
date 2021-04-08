/*
Course: Intro To Computer Science
Homework: 1
Task: 1
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// prints division of coins to quarters and cents
public class Coins
{
	public static void main(String[] args)
	{
		int coins=Integer.parseInt(args[0]);
		System.out.println("Use "+(coins/25)+" quartes and "+(coins%25)+" cents");
	}
}