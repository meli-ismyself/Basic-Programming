/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Loop1();
	}
	
	public static void Loop1(){
		int row=10;
		int maxVal=10;
		int maxVal2=1;
		int maxValB=10;
		int maxSpace2=1;
		int maxSpace3=19;
		int i, j, x, y, z;
		int a, b, c, d, e;
		
		for(i=1; i<=row; i++){
			for(j=1; j<=maxVal; j++ ){
				System.out.print("+");
			}
			maxVal--;
			System.out.print("*");
			
			if(i>0){
				for(int k=1; k<=maxSpace2; k++){
					System.out.print("@");
				}
				maxSpace2 +=2;
				System.out.print("*");
			}
			
			/*for(a=1; a<=row; a++){
				for(b=1; b<=maxValB; b++){
					System.out.print("+");
				}
				maxValB--;
			}*/
			System.out.println();
		}
		
		//tes
		
		for(x=1; x<=row; x++){
			for(y=1; y<=maxVal2; y++ ){
				System.out.print("+");
			}
			maxVal2++;
			System.out.print("*");
			
			if(x>=0){
				for( z=1; z<=maxSpace3; z++){
					System.out.print("@");
				}
				maxSpace3 -=2;
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}