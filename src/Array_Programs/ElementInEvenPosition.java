package Array_Programs;

public class ElementInEvenPosition {
      public static void main(String args[])
      {
    	  int[] arr= {10,20,56,30,45,20,22};
    	  System.out.println("Element present in Even position are : ");
    	  for(int i=1;i<arr.length;i=i+2)
    	  {
    		  System.out.println(arr[i]);
    	  }
      }
}
