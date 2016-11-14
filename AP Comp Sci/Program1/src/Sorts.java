
public class Sorts {

	public int[] selSort(int[] arr){

		for(int i=arr.length-1; i>=0; i--){	//count down
			//find largest number
			int k = arr[i], place = i;
			for(int j=i; j>=0; j--){
				if(k < arr[j]){
					k = arr[j];
					place = j;
				}
			}
			//swap number placement
			int temp = arr[i];
			arr[i] = k;
			arr[place] = temp;
		}
		return arr;
	}

	public int[] insSort(int[] arr){

		//increment through all values of array
		for(int i=1; i<arr.length; i++){
			//save next element
			int k = arr[i], j = i;
			//shift all values right
			while(j>0 && k<arr[j-1]){
				arr[j] = arr[j-1];
				j--;
			}
			//input
			arr[j] = k;
		}
		return arr;
	}

	public int[] merSort(int[] arr){
		//return if 1
		if(arr.length==1)
			return arr;
		//Split the array into half if even
		int length=0;
		if(arr.length%2 == 0){ 
			length = arr.length/2;
			int[] wat = new int[length];
			int[] wut = new int[length];
			for(int i=0; i<length;i++)
				wat[i] = arr[i];
			for(int i=length; i<arr.length; i++)
				wut[i-length] = arr[i];
			return merge(merSort(wat), merSort(wut));
		}
		//if array is odd pass one element of the array to make it even
		if(arr.length%2 == 1){
			int[] wat = {arr[0]};
			int[] wut = new int[arr.length-1];
			for(int i=1; i<arr.length;i++){
				wut[i-1] = arr[i];
			}
			return merge(merSort(wat), merSort(wut));
		}
		return arr;

	}

	private int[] merge(int[] x1, int[] x2){
		//initialize sorted array
		int[] arr = new int[x1.length+x2.length];
		int i=0, j=0, k=0;
		//run through both arrays
		while(i<x1.length && j<x2.length){
			if(x1[i] < x2[j]){
				arr[k] = x1[i];
				i++;
			}
			else{
				arr[k] = x2[j];
				j++;
			}
			k++;
		}
		while(i<x1.length){
			arr[k] = x1[i];
			i++;
			k++;
		}
		while(j<x2.length){
			arr[k] = x2[j];
			j++;
			k++;
		}
		return arr;
	}
	
	public void quiSort2(int[] arr, int i, int j){		//couldn't figure this out
		
		if(i >= j)
			return;
		
		int p = arr.length/2;
		
		while(i <= j){
			if(arr[i] <= arr[p])
				i++;
			else if(arr[p] <= arr[j])
				j--;
			else{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if(p<j){
			int temp = arr[j];
			arr[j] = arr[p];
			arr[p] = temp;
			p = j;
		}
		else if(p>i){
			int temp = arr[i];
			arr[i] = arr[p];
			arr[p] = temp;
			p=i;
		}
		quiSort2(arr, i, p-1);
		quiSort2(arr, p+1, j);
		
	}
	
	public void quiSort(int[] arr){
		quiSort2(arr, 0, arr.length-1);
	}
}
