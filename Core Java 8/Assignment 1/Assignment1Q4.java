class ResultDeclaration {
	public String declareResults(double subject1Marks, double subject2Marks, double subject3Marks) {

		if ((subject1Marks + subject2Marks + subject3Marks) > 60) {
			if (subject1Marks > 60 && subject2Marks < 60 && subject2Marks < 60) {
				return "failed";
			} else if (subject1Marks < 60 && subject2Marks > 60 && subject2Marks < 60) {
				return "failed";
			} else if (subject1Marks < 60 && subject2Marks < 60 && subject2Marks > 60) {
				return "failed";
			} else if ((subject1Marks + subject2Marks) > 60 || (subject2Marks + subject3Marks) > 60
					|| (subject3Marks + subject1Marks) > 60) {
				return "passed"
						+ "\n"
						+ "promoted";
			}
		}

		if ((subject1Marks + subject2Marks + subject3Marks) < 60) {
			return "failed";
		}

		if ((subject1Marks + subject2Marks) > 60 || (subject2Marks + subject3Marks) > 60
				|| (subject3Marks + subject1Marks) > 60) {
			return "promoted";
		}
		return "passed";
	}

}

public class Assignment1Q4 {
	public static void main(String[] args) {

		ResultDeclaration result = new ResultDeclaration();
		System.out.println(result.declareResults(10, 30, 40));

	}
}