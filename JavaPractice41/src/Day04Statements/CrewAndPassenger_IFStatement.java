package Day04Statements;

public class CrewAndPassenger_IFStatement {
    public static void main(String[] args) {
        /*  CrewAndPassenger Task: Create a class called CrewAndPassenger. Given the total number of people on the ship,
	determine how many should be crew members and how many can be passengers.
		Total: 50 ====> 20 crew, 30 passengers
		Total: 75 ====> 25 crew, 50 passengers
		Total: 100 ====> 30 crew, 70 passengers
		Any other number of people on the ship is not valid.
		Print how many of each type there should be.
			Example:
				   number = 75
			Output:
				  25 crew, 50 passengers
         */

        int totalPeople = 100;
        boolean validTotal = (totalPeople == 50 || totalPeople <=100);
        if(validTotal){
            if (totalPeople == 50){
                System.out.println("20 crew, 30 passengers");
            } else if (totalPeople == 75) {
                System.out.println("25 crew, 50 passengers");
            }else if (totalPeople == 100){
                System.out.println("30 crew, 70 passengers");
            }
        }else {
            System.out.println("Not valid number of people");
        }
    }
}
