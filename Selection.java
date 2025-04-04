public class Selection {
    public static void main(String[] args) {

        /*
        Use if to specify a block of code to be executed, if a specified condition is true
        Use else to specify a block of code to be executed, if the same condition is false
        Use else if to specify a new condition to test, if the first condition is false
        Use switch to specify many alternative blocks of code to be executed
        */

        if (420 > 69) {
            System.out.println("420 Is Greater Than 69");
        }

        float time = 12f;
        if (time < 12) {
            System.out.println("Good Morning");
        } else if (time >= 12 && time < 18) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        /*
        There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
        variable = (condition) ? expressionTrue :  expressionFalse;
        */

        String result = (time < 18) ? "Good Day" : "Good Evening";
        System.out.println(result);


        /*
        Instead of writing many if..else statements, you can use the switch statement.

        switch(expression) {
        case x:
            // code block
            break;
        case y:
            // code block
            break;
        default:
            // code block
        }

        When Java reaches a break keyword, it breaks out of the switch block.
        The default keyword specifies some code to run if there is no case match.
        */

        int day = 231;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You're buggin");
        }
    }
}