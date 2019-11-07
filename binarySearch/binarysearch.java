//it's time complexity is O(log n)
import java.util.*; 
class Linear{
	public static int search(int[] arr, int l , int r, int x){
		if(r>=l){
			int mid = l +(r-l)/2;
			if(arr[mid]==x){
				return mid;
			}else if(arr[mid]>x){
				return search(arr,l,mid-1,x);
			}else{
				return search(arr,mid+1,r,x);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {10,20,40,60,70};
		int n = arr.length;
		int x = 60;
		int result = search(arr,0,n-1,x);
		if(result == -1){
			System.out.println("Element is not present in array");
		}else{
			System.out.println("Element present at index: "+result);
		}
	}
}
