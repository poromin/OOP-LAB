import java.util.*;
public class Triangle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		for (int i=1; i<n+1; i++) {
			System.out.println(" ".repeat(n-i) + "*".repeat(i*2-1));
		}
	}
}
