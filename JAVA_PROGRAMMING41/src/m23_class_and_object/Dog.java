package m23_class_and_object;

public class Dog {
    //instance variables
    public String name;
    public String bread;
    public int age;
    public String color;

    public void bark(){
        System.out.println(name + " is barking");
    }
    public void eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
