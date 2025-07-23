package homework;

import java.util.Arrays;

public class Homework07 {
	public static void main(String[] args) {
		String[] report = {"Introduction", "Research", "Conclusion"};
		String[] copyReport = Arrays.copyOf(report, report.length);
		
		copyReport[0] = "Team Feedback";
	
		System.out.print("원본 보고서: ");
		for (String string : report) System.out.print("," + string);
		System.out.println();
		System.out.print("복사된 보고서: ");
		for (String string : copyReport) System.out.print("," + string);

	}
}
