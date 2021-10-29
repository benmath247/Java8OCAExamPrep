package chapter2.satements;

public class SwitchStatements {

    /*
    a single value is evaluated and flow is redirected to the first matching case. If no such statement is found
    an optional default case can be called. if not default, switch is skipped.

    target variable is not evaluated until runtime

    supports byte, short, char, int, String enum, and wrapper classes. all case values have to be the same data type
     */
    private static int getSortOrder(String firstName, final String lastName) {
        String middleName = "Ben";
        int id = 0;
        final String suffix = "JR";

        switch (firstName) {
            case "Test":
                return 1;
            //case middleName: wont compile because middleName is not final
            case suffix: // compiles because final
                return 2;
            default:
                System.out.println("default");
                return 3;

        }
    }

    public static void main(String[] args) {
        int i = getSortOrder("Ben", "Math");
        System.out.print(i);

    }

}
