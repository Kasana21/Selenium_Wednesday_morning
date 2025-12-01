package Day05ForLoops;

public class lab3Questions {

        public static void main(String[] args) {
          /*  int j=3;
            int i =0;
            while(i<3){
                j +=1;
                i+=1;
            }
            System.out.println(j);

            int start=1;
            int sum =0;
            do {
                if (start%2 == 0){
                    start++;
                }
                sum+= start;
            }while (++start <=10);
            System.out.println(sum);

           */



            int x =20;
            while (x>0){
                do {
                    x-=2;
                }while (x>5);
            }
            x--;
            System.out.println(x);

            int c =0;
            boolean flag = true;
            for (int i = 0; i < 8; i++) {
                while (flag){
                    c++;
                    if (i>c||c>3){
                        flag = false;
                    }
                }
            }
            System.out.println(c);

        }
    }


