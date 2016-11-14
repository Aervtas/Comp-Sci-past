package test1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String h = sc.nextLine();
		String k = "";
		for(int i=0; i<h.length(); i++){
			if(93<(int)h.charAt(i)+ 31)
				k += (char)((int)h.charAt(i)+ 31-62);
			else
				k += (char)((int)h.charAt(i)+31
						);
		}
		System.out.println(k);
	}
}