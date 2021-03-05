import java.util.Scanner;

public class Problem {
	public static void main(String arg[]) {
		Problem p = new Problem();
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		// String input="WELCOME";
		p.solve(input);
	}

	private void solve(String input) {
		if (input.length() > 0) {
			if (input.length() % 2 == 0) {
				System.out.println("Unable to complete the opertion due to the given String length is even:");
			} else {
				int n = input.length();
				int middle = n / 2, m = 1, k = 0;
				boolean flag = false;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= n - i; j++) {
						System.out.print(" ");
					}
					for (int h = n / 2; h <= middle; h++) {
						System.out.print(input.charAt(h));

					}
					if (flag) {
						for (k = 0; k < m; k++) {
							System.out.print(input.charAt(k));
						}
						m++;
					}
					System.out.println("");
					if (middle != n - 1) {
						middle++;
					} else {
						flag = true;
					}

				}
			}

		}
	}

}
