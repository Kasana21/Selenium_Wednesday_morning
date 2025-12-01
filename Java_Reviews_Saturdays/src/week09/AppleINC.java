package week09;
import java.time.LocalDate;
import java.util.ArrayList;
public class AppleINC {
    public static void main(String[] args) {
        Tester[] testers = {
                new Tester("Sajjad", 'M', LocalDate.of(1998, 3, 4), "A01", "QA", 100000),
                new Tester("Serhan", 'M', LocalDate.of(1997, 7, 4), "A02", "SDET", 105000),
                new Tester("Ana", 'F', LocalDate.of(1996, 9, 4), "A03", "QE", 110000),
        };


        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982,12,4), "9874","Front end Developer",110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989,4,14), "3265","Back end Developer",120000),
                new Developer("Ediz", 'M', LocalDate.of(2001,10,28), "9563","Developer",130000),
                new Developer("Hamid",'M',LocalDate.of(1989,10,10),"303","Developer",200000),
                new Developer("Serhan",'M',LocalDate.of(1990,11,25),"308","Developer",160000)
        };

        Developer dev2 = new Developer("Halima", 'F', LocalDate.of(1997, 12, 4), "1224", "Swift Developer", 150000);

        ScrumTeam scrum1 = new ScrumTeam("Nazar", "Olzhas", "Kudret", 14);
        scrum1.addTesters(testers);
        scrum1.addDevelopers(developers);
        scrum1.addDeveloper(dev2);

        System.out.println(scrum1);


        scrum1.removeDeveloper("9563");

        System.out.println(scrum1);

        scrum1.removeTester("A02");

        System.out.println(scrum1);


        System.out.println("------------------------------------------");

        for (Tester eachTester : scrum1.testers) {
            System.out.println(eachTester.name +" : "+eachTester.salary);
        }

        System.out.println("------------------------------------------");

        for (Developer eachDev : scrum1.developers) {
            System.out.println(eachDev.name +" : "+eachDev.salary);
        }

        System.out.println("------------------------------------------");


        ScrumTeam scrum2;

        ScrumTeam scrum3;


        System.out.println("------------------------------------------");

        // ArrayList<ScrumTeam> scrums = new ArrayList<>();
        //  ScrumTeam[] scrumTeams = {scrum1};



    }

}

/*
4.create a class called AppleInc:
            1. create an array of Testers and add the testers from your group
            2. create an array of developers add the developers from your group
            3. create an object of ScrumTeam named scrum1 and store the testers & developers above to the scrum team
            4. Display the full infos of the scrum team
            5. Create another object of ScrumTeam named scrum2 and store 2 testers & 5 develoeprs objects
            6. Create an array of ScrumTeam and store all the scum objects (scrum1 & scrum2)
 */


/*
        Tester[] testers = {
                new Tester("Grizly", 'F', LocalDate.of(1994, 7, 14), "F34", "SDET", 96000),
                new Tester("Grimly", 'F', LocalDate.of(1993, 10, 4), "g65", "QA", 99000),
                new Tester("Rooster", 'F', LocalDate.of(1992, 2, 2), "J98", "SDET", 98000)};


        Developer[] developers = {
                new Developer("Hilal", 'F', LocalDate.of(1982, 12, 4), "u5r","Developer", 110000),
                new Developer("Mahmut", 'M', LocalDate.of(1989, 4, 14), "75k","Developer", 120000),
                new Developer("Ediz", 'M', LocalDate.of(2001, 10, 28), "87tf", "Developer",130000),
                new Developer("Hamid", 'M', LocalDate.of(1989, 10, 10), "98uo", "Developer",200000),
                new Developer("Serhan", 'M', LocalDate.of(1990, 11, 25), "60ph", "Developer",160000)
        };


        ScrumTeam scrumTeam1 = new ScrumTeam("Paul", "Olga", "Jake", 13);
        scrumTeam1.addTesters(testers);
        scrumTeam1.addDevelopers(developers);


        System.out.println(".........................");

        for (Tester each : scrumTeam1.testers) {  // giving you each name of tester
            System.out.println(each.name + " salary is " + each.salary);
        }


        System.out.println();

        for (Developer each : scrumTeam1.developers) { // gives your each name os developer
            System.out.println(each.name + " : " + each.salary);
        }


        // /////////////////////////////////////////////////////////////////////


        ScrumTeam scrumTeam2 = new ScrumTeam("Eagle", "Bunny", "Susan", 11);

        Tester[] testers2 = {
                new Tester("Monica", 'F', LocalDate.of(1994, 3, 2), "F3ds4", "SDET", 97080),
                new Tester("Ross", 'M', LocalDate.of(1998, 4, 2), "P0fd9", "QA", 99800),
                new Tester("Phoebe", 'F', LocalDate.of(1995, 4, 6), "G4re5", "QA", 10080),
                new Tester("Vader", 'F', LocalDate.of(1989, 5, 12), "K98we", "QA", 101080)
        };
        scrumTeam2.addTesters(testers2);

       Developer[] developers2 = {

                new Developer("Deano", 'F', LocalDate.of(1982, 12, 4), "830","Developer",100000),
                new Developer("Angel", 'M', LocalDate.of(1989, 4, 16), "9D2", "Developer",120080),
                new Developer("Deamon", 'M', LocalDate.of(2000, 10, 25), "53M", "Developer",130700),
                new Developer("God", 'M', LocalDate.of(1999, 10, 10), "3DM", "Developer",200600),
                new Developer("Jesus", 'M', LocalDate.of(1980, 11, 23), "45fG","Developer", 160080),
                new Developer("Michael", 'M', LocalDate.of(1999, 10, 10), "67RG","Developer", 209000),
                new Developer("Puma", 'M', LocalDate.of(1980, 11, 23), "87HT", "Developer",160700)

        };

        scrumTeam2.addDevelopers(developers2);

        ScrumTeam scrumTeam3 = new ScrumTeam("Jesus", "Omaz", "William", 13);


        Tester[] testers3 = {
                new Tester("Bella", 'F', LocalDate.of(1994, 7, 14), "F3f4", "SDET", 96080),
                new Tester("Bursa", 'F', LocalDate.of(1993, 10, 4), "g6d5", "QA", 99080),
                new Tester("Holly", 'F', LocalDate.of(1992, 2, 2), "J9e8", "SDET", 98008)};

        scrumTeam3.addTesters(testers3);

        Developer[] developers3 = {
                new Developer("Hawk", 'F', LocalDate.of(1982, 12, 4), "7o","Developer", 110600),
                new Developer("Mercedes", 'M', LocalDate.of(1989, 4, 16), "4r", "Developer",120800),
                new Developer("Jesus", 'M', LocalDate.of(2000, 10, 25), "6u", "Developer",130080),
                new Developer("Anaconda", 'M', LocalDate.of(1999, 10, 10), "5y","Developer", 208000),
                new Developer("Malone", 'M', LocalDate.of(1980, 11, 23), "7g", "Developer",160800)
        };


        scrumTeam3.addDevelopers(developers3);

        //3
        ScrumTeam[] scrums = new ScrumTeam[3];

        //3.1
        scrums[0] = scrumTeam1;
        scrums[1] = scrumTeam2;
        scrums[2] = scrumTeam3;

        for (ScrumTeam eachScrum : scrums) { // each scrum team

            for (Tester eachTester : eachScrum.testers) { // each tester

                System.out.println(eachTester.name + " " + eachTester.jobTitle + " $" + eachTester.salary);
            }
        }

        //3.3
        for (ScrumTeam eachScrum : scrums) {

            for (Developer eachDeveloper : eachScrum.developers) {
                System.out.println(eachDeveloper.name + " " + eachDeveloper.jobTitle + " $" + eachDeveloper.salary);
            }
        }
        System.out.println();
        //        3.4 Which tester has the maximum salary?
        //
        //        3.5 Which tester has the minimum salary?

        System.out.println("Max and Min salary Testers are :" + "\n");


        double max$ = scrums[0].testers.get(0).salary;
        double min$ = scrums[0].testers.get(0).salary;

        Tester max$$Tester = null;
        Tester min$$Tester = null;


        for (ScrumTeam eachScrum : scrums) {
            for (Tester eachTester : eachScrum.testers) {

                if (eachTester.salary > max$) {
                    max$ = eachTester.salary;
                    max$$Tester = eachTester;


                }
                if (eachTester.salary < min$) {
                    min$ = eachTester.salary;
                    min$$Tester = eachTester;

                }

            }

        }
        System.out.println("Hyundai driver is = " + min$$Tester);
        System.out.println("Maybach driver is =  " + max$$Tester);


        //       3.6 Which developer has the maximum salary?
        //
        //        3.7 Which developer has the minimum salary?

        System.out.println("Max and Min salary Developers are : ");


        double maxDev$ = scrums[0].developers.get(0).salary;
        double minDev$ = scrums[0].developers.get(0).salary;


        Developer max$$Developer = null;
        Developer min$$Developer = null;


        for (ScrumTeam eachScrum : scrums) {
            for (Developer eachDeveloper : eachScrum.developers) {
                if (eachDeveloper.salary > maxDev$) {
                    maxDev$ = eachDeveloper.salary;
                    max$$Developer = eachDeveloper;
                }

                if (eachDeveloper.salary < minDev$) {
                    minDev$ = eachDeveloper.salary;
                    min$$Developer = eachDeveloper;
                }


            }

        }

        System.out.println("Nissan driver is = " + min$$Developer);
        System.out.println("Spider  driver is =  " + max$$Developer);


        System.out.println("3.8 How many testers are making more than 115k?");


        int countTesters = 0;
        for (ScrumTeam eachScrum : scrums) {

            for (Tester eachTester : eachScrum.testers) {


                if (eachTester.salary > 115000) {
                    countTesters++;
                }
            }

        }

        System.out.println("The amount of testes who are making more then 115k are: " + countTesters);

        System.out.println("3.9 How many developers are making more than 115k?");


        int countDev = 0;

        for (ScrumTeam scrumTeam : scrums) {
            for (Developer EachDeveloper : scrumTeam.developers) {
                if (EachDeveloper.salary > 115000) {
                    countDev++;
                }
            }
        }
        System.out.println("The amount of developers who are making more then 115k are: " + countDev);


        System.out.println(" 3.10 remove all the developers from all scrum teams that has the salary less than $80000");
        System.out.println(" 3.11 remove all the testers from all scrum teams that has the salary greater than $145000");


        for (ScrumTeam eachScrum : scrums) {

            eachScrum.developers.removeIf(p -> p.salary < 80000);
            eachScrum.testers.removeIf(p -> p.salary > 11500);
        }
    }
*/

