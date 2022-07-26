package algorithms;

public class BinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "contribute", "geeks", "ide", "practice" };
		String x = "ide";
		BinarySearch<String> bs = new BinarySearch<String>();
		int result = bs.binarySearch(arr, x);
		if (result == -1)
		System.out.println("Element is not present");
		else
		System.out.println("Element found at " + "index " + result);

	}

}
