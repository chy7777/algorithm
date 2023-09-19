import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int checkNum = sc.nextInt();
		
		int n = 0;
		for(int i=0;i<arr.length;i++) {
			if(checkNum == arr[i]) {
				n++;
			}
		}
		
		System.out.println(n);
		
	}

}
