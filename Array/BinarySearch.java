package test;

import java.util.Scanner;

class BinarySearch
{  
    public static void binarySearch(int arr[], int first, int last, int key)
    {  
        if (last>=first)
        {  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key)
            {  
            	System.out.println("Element found at index : "+mid);  
            }  
            if (arr[mid] > key)
            {  
            	binarySearch(arr, first, mid-1, key);//search in left subarray  
            }
            else
            {  
            	binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        System.out.println("Element not found");  
    }  
    
    public static void main(String args[])
    {  
    	 Scanner scan = new Scanner(System.in);
    	 System.out.print("Enter the number of elements in array you want to Search From: ");
         int n = scan.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i<n;i++)
         {
        	 System.out.print("Enter "+(i+1)+" Element: ");
             arr[i] = scan.nextInt();
         }
        System.out.print("Enter the number you want to search: ");
 		int search;
 		search = scan.nextInt();
        scan.close(); 
        binarySearch(arr,0,n-1,search);     
    }  
}  