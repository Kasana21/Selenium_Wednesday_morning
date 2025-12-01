package Day04Statements;

public class AgeGroups {
    public static void main(String[] args) {
        /*
        AgeGroups Task: Create a class named AgeGroups. An integer variable named age is given.
	Write a program that can determine the age group of a person. The age groups are:

		Teenager (0 ~ 20)
		Adult   (21 ~ 55)
      Senior  (55 or older)

		If the age is negative or greater than 150, print "Invalid."


			Example:
				   age = 42

			Output:
				  Young Middle-Aged Adult
         */
        int age = 1142;
        boolean validAge = (age>=0 && age<=150);
        String result ="";
        if (validAge){
            if (age >= 0 && age <= 20){
               result="Teenager";
            } else if (age>20 && age<56) {
               result="Adult";
            } else if (age>54) {
                result="Senior";
            }

        }else{
            result="Invalid";
        }
        System.out.println(result);
    }
}
