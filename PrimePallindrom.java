package algorithms;

import java.util.ArrayList;
class Demo{
	public static boolean isPrime(int n){
		if(n==0||n==1){
			return false;
		}
			for(int i=2;i<n;i++){
				if(n%i==0){
					return false;
				}
			}
	return true;
	}
	public static ArrayList<Integer> isPrimePallindrom(ArrayList<Integer> alist){
		ArrayList<Integer> blist = new ArrayList<Integer>();
		for(int i=0;i<alist.size();i++){
			int a = alist.get(i);
			int reverse=0;
			while(a>0){
				int r = a%10;
				reverse = reverse*10+r;
				a=a/10;
			}
			if(reverse==alist.get(i)){
				blist.add(reverse);
			}
			
		}
		return blist;
	}
}

public class PrimePallindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		ArrayList<Integer> blist = new ArrayList<Integer>();
			for(int i=0;i<=1000;i++){
			if(Demo.isPrime(i)){
				alist.add(i);
			}
					}
	System.out.println(alist);
	 blist = Demo.isPrimePallindrom(alist);
	System.out.println(blist);


	}

}
