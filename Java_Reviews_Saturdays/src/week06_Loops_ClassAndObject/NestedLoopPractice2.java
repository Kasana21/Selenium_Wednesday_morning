package week06_Loops_ClassAndObject;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        String s = "abcabcabcabcXY";
        String result = "";

      /*  char c = 'b';
        int f = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                f++;
            }

        }
        System.out.println(f);//4*/


        for (int j = 0; j < s.length(); j++) {//getting each charecter one by one

            char c = s.charAt(j);
            int f = 0;

            for (int i = 0; i < s.length(); i++) {// checking if each charater matchin
                if (s.charAt(i) == c) {
                    f++;
                }
            }
                if(result.contains(""+c)){
                    continue;

            }
           // System.out.println(c+ " : "+f); this way or below
            result += c+""+f;//a4b4c4 without unique characters*/
           /* if (f == 1){// thi is to find unique character
                result+=c;//XY
            }*/
        }
        System.out.println(result);//a4b4c4X1Y1
    }
}
