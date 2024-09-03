package Array_Programs;

public class SortArray {
        public static void main(String args[])
        {
        	int[] arr= {10,56,23,42,32,12,78,40};
        	System.out.println("sorted array : ");
        	for(int i=0;i<arr.length;i++)
        	{
        		for(int j=i+1;j<arr.length;j++)
        		{
        			if(arr[i]>arr[j]) {
        				
        				int temp=arr[i];
        				arr[i]=arr[j];
        				arr[j]=temp;
        			}
        			}
        		System.out.print(arr[i]+",");
        	}
        }
}
