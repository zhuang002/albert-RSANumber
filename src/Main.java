import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		int count = 0;
		for (int i=low; i<=high;i++) {
			if (isRSANumber(i)) {
				count++;
			}
		}
		System.out.println("The number of RSA numbers between 10 and 12 is "+count);
	}

	private static boolean isRSANumber(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i=1;i<=num;i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count==4;
	}

}
