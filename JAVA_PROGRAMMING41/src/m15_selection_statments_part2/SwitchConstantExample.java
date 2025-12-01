package m15_selection_statments_part2;

public class SwitchConstantExample {

    public static final int OPTION_ONE = 1 ;
    public static final int OPTION_TWO = 2 ;
    public static final int OPTION_THREE = 3 ;
    public static void main(String[] args) {
        int choice = 2;

        switch (choice){
            case OPTION_ONE: //or could be 1 as a value
                System.out.println("Option one is selected");
                break;
            case OPTION_TWO:
                System.out.println("Option two is selected");
                break;
            case OPTION_THREE:
                System.out.println("Option three is selected");
                break;
            default:
                System.out.println("Invalid option");
        }

    }
}
