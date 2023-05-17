package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a | b){
            System.out.println("a or b is true");
        }

        int numA = 10;
        int numB = 5;
        int numC = 10;

        if (numA > numB) {
            System.out.println("10 is greater than 5");
        }

        if (a && c) {
            System.out.println("we are the same");
        }

        if (a != b) {
            System.out.println("we are not the same");
        }

        // write your code below

    }

}

