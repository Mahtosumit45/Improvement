//Write a program to find the largest and smallest elements in an array.

import java.util.*;

class LargestAndSmallest{
	public static void main(String[] args){
		int[] array = {34,33,35};
			if(array[0]>=array[1]){
				if(array[0]>=array[2]){
					System.out.println(" the greatest number of these three is : "+array[0]);
				}
				else{
					System.out.println(" the greatest number of these three is : "+array[2]);
				}
			}
			else{
				if(array[1]>=array[2]){
					System.out.println(" the greatest number of these three is : "+array[1]);
				}
				else{
					System.out.println(" the greatest number of these three is : "+array[2]);
				}
			}	
	}
}