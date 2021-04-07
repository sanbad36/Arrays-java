public class Main {

	
	void revD(int arr[],int d) {
		for(int i = 0;i<d;i++) { leftOne(arr); }
	}
	
	void leftOne(int arr[]) {
		int temp = arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
	 }
	 arr[arr.length-1] = temp;
	}
	
	void printArr(int arr[]) {
		for(int i = 0; i<= arr.length-1;i++) { System.out.print(arr[i]+" "); }
	}
  
	public static void main(String[] args) {	
		int arr[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,56,77};
		Main a1 = new Main();
		a1.revD(arr,2);
		a1.printArr(arr);
	}
}
