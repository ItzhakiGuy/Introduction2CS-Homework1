/*
Course: Intro To Computer Science
Homework: 1
Task: 2
Name: Guy Itzhaki
E-mail: itzhaki1234@gmail.com
*/
// prints the value of the future money
public class FVCalc
{
	public static void main(String[] args)
	{
		double valtod=Double.parseDouble(args[0]);
		double percent=Double.parseDouble(args[1]);
		double years=Double.parseDouble(args[2]);
		System.out.println("After "+((int)(years))+" years, $"+valtod+" saved at "+(percent)+"% will yield $"+(valtod*(Math.pow(1+(percent/100), years))));
	}
}