import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());

		for (int i = 0; i < t; i++) {
			String newLine = in.readLine();
			String[] student = newLine.split("\\s");
			int n = Integer.parseInt(student[0]);
			int max = 0;
			for (int j = 0; j < n; j++) {
				int s = Integer.parseInt(student[j + 1]);
				if (s > max)
					max = s;
			}
			System.out.println("Case " + (i + 1) + ": " + max);
		}
	}

}
