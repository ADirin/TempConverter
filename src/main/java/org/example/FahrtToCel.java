package org.example;
public class FahrtToCel {
	
	public static int convertFahr(int f) {
		int c=  (int)((f-32) * 5.0/9.0);
		return c;
	}

}
