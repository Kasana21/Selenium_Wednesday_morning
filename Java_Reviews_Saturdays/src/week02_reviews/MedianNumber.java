package week02_reviews;

public class MedianNumber {
    public static void main(String[] args) {
        int a =10;
        int b = 15;
        int c =20;
        boolean aIsMedian = b>a && a>c || c>a && a>b;
        //in order for a to be median number berween three DIFFERENT numbers
        //a need to be less than b and greater than c. or a need to be less than c and greater than b

        boolean bIsMedian = (a > b && b>c) || (c >b && b> a);
        //in order for b to be median number berween three DIFFERENT numbers
        //b need to be less than a and greater than c. or a need to be less than c and greater than a

        boolean cIsMedian = !aIsMedian && !bIsMedian;
        // if both a nas b are not the median number between three different numbers. then c must be the median number


        if (aIsMedian){
            System.out.println(a +" is the median number");
        }

    }
}
/*
create a class mediannumber.write a program that can find a median number between diferent givent inegers
ex: a=10, b=15,c=20
output
15 is the median num
 */