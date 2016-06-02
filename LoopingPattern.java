/* package whatever; // don't place package name! */
// http://www.programiz.com/c-programming/examples/pyramid-pattern
// http://stackoverflow.com/questions/2047228/auto-increment-alphabet-in-java


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println(" ++++++++++++++++ printPyramid1 ++++++++++++++++ ");
		printPyramid1();
		
		System.out.println(" ++++++++++++++++ printPyramid2 ++++++++++++++++ ");
		printPyramid2();
		
		System.out.println(" ++++++++++++++++ printPyramid3 ++++++++++++++++ ");
		printPyramid3();
		
		System.out.println(" ++++++++++++++++ printPyramid4 ++++++++++++++++ ");
		printPyramid4();
		
		System.out.println(" ++++++++++++++++ printPyramid5 ++++++++++++++++ ");
		printPyramid5();
		
		System.out.println(" ++++++++++++++++ printPyramid6 ++++++++++++++++ ");
		printPyramid6();
		
		System.out.println(" ++++++++++++++++ printPyramid7 ++++++++++++++++ ");
		printPyramid7();
		
		System.out.println(" ++++++++++++++++ printPyramid8 ++++++++++++++++ ");
		printPyramid8();
		
		System.out.println(" ++++++++++++++++ printPyramid9 ++++++++++++++++ ");
		printPyramid9();
		
		System.out.println(" ++++++++++++++++ printPyramid10 ++++++++++++++++ ");
		printPyramid10();
		
		System.out.println(" ++++++++++++++++ printPyramid11 ++++++++++++++++ ");
		printPyramid11();
	}
	
	public static void printPyramid1(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void printPyramid2(){
		
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void printPyramid3(){
		int charNo=65;
		for(int i=1;i<=5;i++) {
    		for(int j=1;j<=i;j++) {
    		System.out.print((char)charNo + " ");
			} 
			System.out.println();
			charNo++;
		} 
	}
	
	public static void printPyramid4(){
		int maxVal=5;
		for(int i=1; i<=5; i++){
			for (int j=1; j<=maxVal; j++){
				System.out.print("* ");
			}
			maxVal--;
			System.out.println();
		} 
	}
	
	public static void printPyramid5(){
		
		for(int i=5; i>=1; i--){
			for(int j=1; j<=i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void printPyramid6(){
		int maxVal=2, spaceVal=4;
		for(int i=1; i<=5; i++){
			for(int s=1; s<=spaceVal; s++){
				System.out.print("  ");
			}
			for(int j=1; j<=maxVal; j++ ){
				System.out.print("* ");
			}
			System.out.println();
			maxVal+=2;
			spaceVal--;
		}
	}
	public static void printPyramid7(){
		int maxVal=2, spaceVal=4;
		for(int i=1; i<=5; i++){
			for(int s=1; s<=spaceVal; s++){
				System.out.print("  ");
			}
			for(int j=1; j<=maxVal; j++ ){
				System.out.print(j + " ");
			}
			System.out.println();
			maxVal+=2;
			spaceVal--;
		}
	}
	public static void printPyramid8(){
		int maxVal=1, spaceVal=4, no=1;
		for(int i=1; i<=5; i++){
			for(int s=1; s<=spaceVal; s++){
				System.out.print("  ");

			}
			for(int j=1; j<=maxVal; j++ ){
				System.out.print(no);
				no++;
			}
			System.out.println();
			maxVal+=2;
			spaceVal--;
		}
		
	}
	
	public static void printPyramid9(){
		int maxVal=1, spaceVal=4, no=0, middleRow=0;
	
		for(int i=1; i<=5; i++){
			for(int s=1; s<=spaceVal; s++){
				System.out.print("  ");

			}
			for(int j=1; j<=maxVal; j++ ){
				middleRow = maxVal/2+1;
				//System.out.println(" i ke +++>> "+i +" maxVal +++>> "+maxVal + " middleRow +++++++++>> " + middleRow );
				
				if(j>middleRow){
					no--;
				}else{
					no++;
				}
			System.out.print(no + " ");	
			}
			System.out.println();
			maxVal+=2;
			spaceVal--;
		}
	}
	
	public static void printPyramid10(){
		int maxVal=9, spaceVal=1, no=0, middleRow=0, j, i;
	
		for( i=1; i<=5; i++){
			//System.out.println("i ke +++>> " + i + " maxVal +++>> " + maxVal);
			if(maxVal<9){
				for(int s=1; s<=spaceVal; s++){
					System.out.print("  ");
				}	
			}
			
			for( j=1; j<=maxVal; j++ ){
				//System.out.println(" i ke +++>> "+i +" maxVal +++>> "+maxVal + " middleRow +++++++++>> " + middleRow );

			System.out.print("* ");	
			}
			System.out.println();
			maxVal-=2;
				if(i>1){
				spaceVal++;	
			}
			
		}
	}
	
	public static void printPyramid11(){
		int maxVal=1, no=1;
		for(int i=1; i<=4; i++){
			for(int j=1; j<=maxVal; j++){
				System.out.print(no + " ");
				no++;
			}
			System.out.println();
			maxVal++;
		}
		
	}
}