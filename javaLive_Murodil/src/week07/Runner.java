package week07;

public class Runner {
    public static void main(String[] args) {
        App appObj = new App();
        appObj.name = "Google Maps";
        appObj.version = 32.1;
        appObj.isFree = true;

        System.out.println(appObj);
        appObj.run();
        appObj.update();

        App youTube = new App();
        //default values
        System.out.println(youTube);
        youTube.name = "YouTube";
        youTube.version = 234.55;
        youTube.isFree = true;
        System.out.println(youTube.toString());
        youTube.run();
        youTube.update();

        System.out.println("-------Bicycle objects-------");
        Bicycle bicycle = new Bicycle();
        bicycle.brand = "Trek";
        bicycle.gear = 5;
        bicycle.ride();
        bicycle.changeGear(10);
        bicycle.ride();
        System.out.println(bicycle);

        bicycle.brand = "AlfaRomeo";
        System.out.println("brand = " + bicycle.brand);
        System.out.println("gear = " + bicycle.gear);
        bicycle.ride();
    }
}