package week07;

public class App {
    public String name;
    public double version;
    public boolean isFree;

    public void run() {
        System.out.println(name + " is running...");
    }

    public void update() {
        version += 1.1;
        System.out.println(name + " is updating to version " + version);
    }

    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", isFree=" + isFree +
                '}';
    }
}