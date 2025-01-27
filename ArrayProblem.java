mport java.util.*;
import java.util.Scanner;
public class ArrayProblem
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter the size of array : ");
		int n = input.nextInt();
		System.out.print(" Enter the size of subarray : ");
		int k = input.nextInt();
		int[] arr = new int[n];
		System.out.print(" Enter the elements of the array : ");
		for(int i = 0; i < n; i++){
		    arr[i] = input.nextInt();
		}
		for(int i = 0; i <= n/2; i++){
		    int temp = arr[i];
		    arr[i] = arr[n-1-i];
		    arr[n-1-i] = temp;
		}
		System.out.print(" The reverse array is : ");
		for(int i = 0; i < n; i++){
		    System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.print(" The subarray are : ");
		for(int i=0;i<=n-k;i++){
		    System.out.print("(");
		    for(int j=i;j<i+k;j++){
		        System.out.print(" "+arr[j]+" ");
		    }
		    System.out.print(")");
		}
	}
}