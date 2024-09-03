package Array_Programs;

public class LargestElementInArray {
        public static void main(String args[])
        {
        	int[] arr= {10,20,45,20,13,45,12,78,22};
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
        	System.out.println("Largest Elemet in the array is : "+arr[arr.length-1]);
        }
        
//        int max=arr[0];
//        for(int i=1;i<arr.length;i++)
//        {
//        	if(arr[i]>max)
//        	{
//        		max=arr[i];
//        	}
//        }
//        System.out.println("largest element in the array is : "+max);

}
