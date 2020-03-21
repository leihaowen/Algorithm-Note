
public class test {

	public static void main(String args[]) {
		
		int a[] = {6,1,4,3,2,5}; 
		p(a);
		int n = 6;
		double s =  1.30;
		boolean flag = false;
		double j = n;
		while(j > 1 || flag == true) {
			int i = 0;
			int b = max((int)(j/s),1);
			flag = false;
			while(i + b <= n - 1) {
				if(a[i] > a[b+i]) {
					int x = a[i];
					a[i] = a[b+i];
					a[b+i] = x;
					flag = true;
					System.out.println("X");
					p(a);
				}
				System.out.print("i: " + i);
				System.out.println("  j: " + b);
				i++;
			}
			j = b;
			System.out.println(b);
			p(a);
			
		}
		p(a);
	}

	private static int max(int i, int j) {
		if(i > j)
			return i;
		else return j;
	}
	
	public static void p(int[] a) {
		for(int look : a) {
			System.out.print(look);
		}
		System.out.println();
	}
}
