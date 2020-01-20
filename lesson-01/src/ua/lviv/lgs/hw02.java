package ua.lviv.lgs;

public class hw02 {

	public static void main(String[] args) {

		Boolean bool1 = true;
		Boolean bool2 = new Boolean(false);
		Character c = new Character('k');
		Byte b = 25;
		Short s = 456;
		Integer i = 2000;
		Long l = 2595L;
		Float f = 12.55f;
		Double d = 25.55122554;

		// Boolean

		System.out.println("First value of Boolean Wrapper is ... " + bool1.booleanValue());
		System.out.println("Second value of Boolean Wrapper is ... " + bool2.booleanValue() + "\n");

		// Char
		System.out.println("Minimum value of Character Wrapper is ... " + (int) c.MIN_VALUE);
		System.out.println("Maximum value of Character Wrapper is ... " + (int) c.MAX_VALUE + "\n");

		// Byte

		System.out.println("Minimum value of Byte Wrapper is ... " + b.MIN_VALUE);
		System.out.println("Maximum value of Byte Wrapper is ... " + b.MAX_VALUE + "\n");

		// Short

		System.out.println("Minimum value of Short Wrapper is ... " + s.MIN_VALUE);
		System.out.println("Maximum value of Short Wrapper is ... " + s.MAX_VALUE + "\n");

		// Integer

		System.out.println("Minimum value of Integer Wrapper is ... " + i.MIN_VALUE);
		System.out.println("Maximum value of Integer Wrapper is ... " + i.MAX_VALUE + "\n");

		// Long

		System.out.println("Minimum value of Long Wrapper is ... " + l.MIN_VALUE);
		System.out.println("Maximum value of Long Wrapper is ... " + l.MAX_VALUE + "\n");

		// Float

		System.out.println("Minimum value of Float Wrapper is ... " + f.MIN_VALUE);
		System.out.println("Maximum value of Float Wrapper is ... " + f.MAX_VALUE + "\n");

		// Double

		System.out.println("Minimum value of Double Wrapper is ... " + b.MIN_VALUE);
		System.out.println("Maximum value of Double Wrapper is ... " + b.MAX_VALUE);

	}

}
