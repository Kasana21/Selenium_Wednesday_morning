package m21_methods_par3;

public class VoidMethodPractice {
    public static void main(String[] args) {

        displayGrade(197);
    }
    public static void displayGrade(int score){
        if (score<0 || score>100){
            System.out.println("Invalid score: " + score);
            return;
        }
        if (score>=90){
            System.out.println("Excellent, you made an A");
        }else if (score>=80){
            System.out.println("Great, you made an B");
        }else if(score>=70){
            System.out.println("Good, you made an C");
        } else if (score>=60) {
            System.out.println("Passed, you made an D");
        }else {
            System.out.println("Failed, You made an F");
        }

    }
}
