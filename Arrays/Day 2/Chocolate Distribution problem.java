/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int len = sc.nextInt() , tmp , indice = 0;
	     int[] arr = new int[len];
	     sc.nextLine();
	     for(int i=0;i<len;i++){
	         arr[i] = sc.nextInt();
	     }
	     sc.nextLine();
		 int m = sc.nextInt();
		 int min = Integer.MAX_VALUE;
		 //sort the input increasingly
    		/* for(int i=0;i<len-1;i++){
    		    for(int j=0;j<len-1-i;j++){
    		     if(arr[j] > arr[j+1]){
    		         tmp = arr[j];
    		         arr[j] = arr[j+1];
    		         arr[j+1] = tmp;
    		     }
    		    } 
    		 }*/
    		 Arrays.sort(arr);
		 //search for minimum diff
		 for(int i=0;i<len-m+1;i++){
		     if(arr[i+m-1] - arr[i] < min)
		       {
		           min = arr[i+m-1] - arr[i];
		           indice = i;
		       }
		 }
		 
		 System.out.println(min);
	}
}
