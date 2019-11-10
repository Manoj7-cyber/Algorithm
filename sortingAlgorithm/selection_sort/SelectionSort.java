//Time complexity = O(n^2)
class SelectionSort{
	public static void selectionSort(int arr[]){
		int n = arr.length;
		for(int i = 0;i<n;i++){
			int min_index = i;
			for(int j = i+1;j<n;j++){
				if(arr[j]<arr[min_index]){
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {64,89,12,34,56,90,11};
		selectionSort(arr);
		System.out.println("Printint sorted array");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
