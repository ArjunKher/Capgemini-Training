class Student {
    private int subjectA,subjectB,subjectC;
    Student(){
    	
    }
    Student(int a, int b, int c){
    	subjectA = a;
    	subjectB = b;
    	subjectC = c;
    }
    

    public int studentsTotalMarksInAllSubjects(Student[] students) {
    	
    	
    	int stu1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int stu2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int stu3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
    	
		return stu1+stu2+stu3;
		}

    public double studentsAverageMarksInAllSubjects(Student[] students) {
    	int stu1 = students[0].subjectA+students[0].subjectB+students[0].subjectC;
    	int stu2 = students[1].subjectA+students[1].subjectB+students[1].subjectC;
    	int stu3 = students[2].subjectA+students[2].subjectB+students[2].subjectC;
		return (stu1+stu2+stu3)/3;
		}
    public int[] subjectWiseMarks(Student[] students,String subjectName) {
    	
		return null;
		}
    public int subjectATotalByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}
    public int subjectBTotalByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}
    public int subjectCTotalByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot;
		}

   public int subjectTotalByStudents(int[] marks) {
	   int tot = 0;
	   for(int i=0;i<marks.length;i++) {
		   tot+=marks[i];
	   }
	return tot;}
   public double subjectAverageByStudents(int[] marks) {
	   int tot = 0;
	   for(int i=0;i<marks.length;i++) {
		   tot+=marks[i];
	   }
	return tot/3;
   }

    public double subjectAAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}
    public double subjectBAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}
    public double subjectCAverageByStudents(int[] marks) {
    	int tot = 0;
 	   for(int i=0;i<marks.length;i++) {
 		   tot+=marks[i];
 	   }
 	return tot/3;
 	}

}


public class Assignment1Q9 {

	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		

	}

}