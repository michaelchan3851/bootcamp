public class DemoSwitch {
    // static final (constant) (0-2)
    // instance variable(1X)
    // static variable (1-2)
    // constructors
    // public instance method //main logic
    // static methods // tools
    // private methods

    // Switch pattern matching is a preview feature in Java 20
    public static void main(String[] args) throws Exception {
        System.out.println(grade(90));
        Weekday weekday = Weekday.TUE;
        // Approach 1
        int result = switch (weekday) { // Suppose 一眼望曬, you must write all the posibility
            case MON, TUE -> 1;
            case WED -> 3;
            case THU -> 4;
            case FRI -> 5;
            // default -> 0;
        };

        // Approach 2
        int result2 = switch (weekday) { // Suppose 一眼望曬, you must write all the posibility
            case MON, TUE: // condition is not allowed in Java 17
                System.out.println("Monday or Tuesday ");
                yield 2; // yield means "return" + break
            case WED:
                System.out.println("Wednesday");
                yield 3;
            case THU:
                System.out.println("Thursday");
                yield 4;
            case FRI:
                System.out.println("Friday");
                yield 5;
            // default -> 0;
        };
        System.out.println(result2); // 1
    }

    public static int getWeekDayNumber(Weekday weekday) {
        switch (weekday) { // enum
            case MON:
                return 1;
            case TUE:
                return 2;
            case WED:
                return 3;
            case THU:
                return 4;
            case FRI:
                return 5;
            default:
                return 0;
        }
    }

    public static char grade(int score) {
        char grade = ' '; // char can't empty, at least one space
        switch (score) {
            case 90:
                grade = 'A';
                break;
            case 80:
                grade = 'B';
                break;
            default:
                grade = 'F';
                break;
        }
        return grade;
    }
}
