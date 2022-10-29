import java.util.Scanner;

class findSum{
  long maxSubarraySum(int arr[], int n){
    long max_so_far=arr[0];
    long currMax=arr[0];
    for(int i=1;i<arr.length;i++){
        currMax=Math.max(arr[i],currMax+arr[i]);
        max_so_far=Math.max(currMax,max_so_far);
    }
    return max_so_far;
    }
}
public class Kadane {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter total number of elements in array");
        int num=in.nextInt();
        int[] array=new int[num];
        System.out.println("Enter the array elements");
        for(int i=0;i<num;i++) {
       	 array[i]=in.nextInt();
        }
        findSum obj=new findSum();
        System.out.println("The maximum sum in given array is "+obj.maxSubarraySum(array, num));
	}

}
