/*
Course: Intro To Computer Science
Homework: 1
Task: 3
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// prints the X solution of the Linear Equation
public class LinearEq
{
	public static void main(String[] args)
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double y=Double.parseDouble(args[2]);
		System.out.println("X = "+((y-b)/a));
	}
}