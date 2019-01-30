package stuff;

import java.util.Scanner;

public class Test1 {

	static Scanner text = new Scanner(System.in);
	
	public static void main(String[] args) {
		yeet();
	}

	public static void yeet() {
		System.out.println("is this working?");
		if(text.nextLine().toLowerCase().contains("yes")) {
			System.out.println("yes");
		}
	}
}
