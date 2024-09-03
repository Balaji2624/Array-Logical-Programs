package Array_Programs;

public class ElementInOddPosition {
      public static void main(String args[])
      {
    	  int[] arr= {10,20,45,32,45,22,42};
    	  System.out.println("Element present in the odd position : ");
    	  for(int i=0;i<arr.length;i=i+2)
    	  {
    		  System.out.println(arr[i]);
    	  }
      }
}
