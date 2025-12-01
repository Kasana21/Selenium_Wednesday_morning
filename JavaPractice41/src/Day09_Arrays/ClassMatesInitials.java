package Day09_Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {
        /*ClassMatesInitials Task: Create a class named ClassMatesInitials and write a program with the following specifications:
   1.1 Create an array of strings named classmates.
   1.2 Store full names of 10 classmates.
   1.3 Print the initials of each student's name in separate lines.
         */

        // THIS WILL ALSO WORK IF THE LAST NAME IS JUST A LETTER NOT A FULL LAST NAME
        // 1.1 Create an array of strings named classmates.
      //  1.2 Store full names of 10 classmates.
        String[] classMates = {"Oksana Reha ", "Paola Guacho", "Ala Usatii", "Silvio Mendrz ", "Tatiana Pitigoi", "Crystal Lazos ", "Tsering Dickey", "Dariia Hubarieva", "Esmaulhasna Varli", "Mariana Kuberska"};

        //   1.3 Print the initials of each student's name in separate lines.
        for (String eachName : classMates){ // for(int i = 0; i < classMates.length: i++)
            System.out.println(eachName.charAt(0) + "" + eachName.charAt(eachName.indexOf(' ') + 1));
        }

        // for loo[ -> classMates[i]
        // for each -> eachName
        /*
        OR
        PG
        AU
        SM
        TP
        CL
        TD
        DH
        EV
        MK
         */

    }
}
