package week06_Loops_ClassAndObject;

public class CydeoStudent {
    public String name;
    public int age;
    public char gender;
    public boolean isMerried, isEmployeed;
    public int batchNumber;
    public String programingLanguage;
    public String groupName;

    // public static String schoolName = "Cydeo";


    public void setInfo(String name, int age, char gender, boolean isMerried, boolean isEmployeed, int batchNumber, String programingLanguage, String groupName) {
       this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMerried = isMerried;
        this.isEmployeed = isEmployeed;
        this.batchNumber = batchNumber;
        this.programingLanguage = programingLanguage;
        this.groupName = groupName;
    }

    public String toString() {
 return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMerried=" + isMerried +
                ", isEmployeed=" + isEmployeed +
                ", batchNumber=" + batchNumber +
                ", programingLanguage='" + programingLanguage + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }


   /* public static void study(){// cant share any instants with objects
        System.out.println(name+" is studying " + programmingLanguage);
    } */
    public void study(){
        System.out.println(name+" is studying " + programingLanguage);
    }
}
/*
in each object, user should be able to store the:
name,age, gender, isMarried, isEmployeed, batch, programing language, and group name info of
 */