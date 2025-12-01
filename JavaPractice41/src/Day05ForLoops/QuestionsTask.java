package Day05ForLoops;

public class QuestionsTask {
    public static void main(String[] args) {
      /* int i = 0;
        for(int i = 0; i <= 2 ; i++) {
            System.out.println(i);
        }

        int k= 0;
        int m = 0;
        for (int i = 0; i <=3 ; i++) {
            k++;
            if (i == 2){
                i = 4;
            }
            m++;
        }
        System.out.println(k + "," + m);

       */
      int sum = 0;
      int j = 5;
      int i;
        for (i = 0; i < 10 && j> 0; i++, j --) {
           if (i% 3 == 0 || j%5 == 0){
               sum = sum + i + j;
           }
        }
        System.out.println("Sum = " + sum);
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
}
