package Day04Statements;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        GradeLevel Task: Create a class called GradeLevel. Given a number (byte) gradeLevel, determine and print which
	school type someone is in. The grade levels and types are:
		1-5: Elementary school
		6-8: Middle school
		9-12: High school
		13-16: College
		17-18: Grad School
		For any other grade level, print "Invalid grade level."
			Example:
				   gradeLevel = 8
			Output:
				  Middle school
         */
        byte gradeLevel = 8;
        boolean validGradeLevel = (gradeLevel >= 1 && gradeLevel <= 18);
        String result = "";
        if (validGradeLevel) {
            if (gradeLevel >=1 && gradeLevel<= 5){
               result ="Elementary school";
            } else if (gradeLevel>=6 && gradeLevel<=8) {
                result = "Middle school";
            } else if (gradeLevel>=9 && gradeLevel<=12) {
                result = "High school";
            }else if (gradeLevel >= 13 && gradeLevel<=16){
                result = "College";
            }else{
                result ="Grad School";
            }

        }else{
            System.out.println("Invalid grade level.");
        }
        System.out.println(result);
    }
}
