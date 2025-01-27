
import java.util.*;
import java.util.Scanner;
public class HighestNumber
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the size of Array : ");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.print(" Enter the Array : ");
		for(int i = 0; i < n; i++){
		    array[i] = input.nextInt();
		}
		int temp = 0;
		for(int i = 0; i < n-1; i++){
		    if(array[i]>array[i+1]){
		        temp = array[i];
		    }
		    else{
		        temp = array[i+1];
		    }
		}
		 System.out.println(" The maximum element is : "+ temp);
	}
}
