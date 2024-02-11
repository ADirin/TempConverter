package org.example;
public class FahrtToCel {
	
	public static int convertFahr(int f) {
		int c=  (int)((f-32) * 5.0/9.0);
		return c;
	}

	//This method convert thr cel to fsh
	public static int convertCel(int c){
		return (int) ((c * 9.0 / 5.0) + 32);
	}

}
