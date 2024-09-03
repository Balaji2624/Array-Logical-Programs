package Array_Programs;

public class SmallestElementInArray {
      public static void main(String args[])
      {
    	  int[] arr= {10,20,50,45,62,78,30,22};
    	  for(int i=0;i<arr.length;i++)
    	  {
    		  for(int j=i+1;j<arr.length;j++)
    		  {
    			  if(arr[i]>arr[j])
    			  {
    				  int temp=arr[i];
    				  arr[i]=arr[j];
    				  arr[j]=temp;
    			  }
    		  }
    	  }
    	  System.out.println("Smallest number of an array is :"+arr[0]);
      }
}
