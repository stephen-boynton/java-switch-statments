/**
 * Created by stephenboynton on 6/28/17.
 */
public class Main {

    public static void main (String[] args) {
        char switchValue = 'a';
        switch(switchValue) {
            case 'A' :case 'B':case 'C':case 'D':case 'E':
                System.out.println("Value was " + switchValue);
                break;
            default:
                System.out.println("Was not A, B, C, D, or E. You fucker.");
                break;
        }
    }


}
