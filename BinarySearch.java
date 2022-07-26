package algorithms;

public class BinarySearch<T extends Comparable<T>> 
{

	public int binarySearch(T[] arr, T x) 
	{
		int l = 0, r = arr.length - 1;
		while (l <= r) {
		int m = l + (r - l) / 2;
		int res = x.compareTo(arr[m]);
		if (res == 0)
		return m;
		if (res > 0)
		l = m + 1;
		else
		r = m - 1;
		}
		return -1;
	}
}
