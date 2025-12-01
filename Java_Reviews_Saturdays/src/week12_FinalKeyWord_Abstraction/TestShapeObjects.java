package week12_FinalKeyWord_Abstraction;

public class TestShapeObjects {

    public static void main(String[] args) {

        Cube cube = new Cube(10);

        cube.method1();//instance method of the child classes
        cube.calc_volume();

        System.out.println(Volume.HAS_VOLUME);//true
        System.out.println(Cube.HAS_VOLUME);//true

        cube.calc_area();
        cube.calc_perimeter();








    }

}