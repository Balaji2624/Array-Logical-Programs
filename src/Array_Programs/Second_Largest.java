package Array_Programs;

public class Second_Largest {
     public static void main(String args[])
     {
    	 int[] arr= {12,48,32,11,48,56,78,12,20};
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
    	 System.out.println("Second largest number from an array : "+arr[arr.length-2]);
     }
}
