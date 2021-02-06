import java.util.ArrayList;

public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(i >= list.size()-1){
            return true;
        }
        else if(list.get(i) > list.get(i+1)){
            return false;
        }
        else{
            return isSortedRec(list, i+1);
        }
    }

     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int i) {
    if (arr.length-1 <= i) {
		return count==0;
	}
	else if (arr[i] == x){
        return hasCountCopiesRec(arr, x, count-1, i+1);
	}
	else {
		return hasCountCopiesRec(arr, x, count, i+1);
	}
}

    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearch(arr, num, lowerBound, upperBound);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {    
    int midpoint = (lowerBound + upperBound)/2;    
    if (lowerBound > upperBound) {
        return true;
    }
    if (num == arr[midpoint]) {
        return true;
    }
    else if (num < arr[midpoint]) {
        int new_up = midpoint-1;
        return binarySearchRec(arr, num, lowerBound, new_up);
    }
    else {
        int new_up_2 = midpoint-1;
        return binarySearchRec(arr, num, lowerBound, new_up_2);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(5);
        int[] test_array = {1, 2, 2, 3, 4};
        System.out.println(isSorted(arr));
        System.out.println(hasCountCopies(test_array, 2, 2));
        System.out.println(hasCountCopies(test_array, 2, 3));
    }
}
