public class Compare {

    //public static int counter; keeps track of the calls of either method
    public static int counter = 0;

    public static int recursiveF(int n) {
        //base cases for F(n): for F(0) should equal 0, for F(1) should equal 2,
        //and F(2) should equal 4 and anything greater than 2 should filter down
        //to the else statement where it shall start that recursive calls.
        counter++;

        if (n <= 0)
            return 0;
        else if (n == 1)
            return 2;
        else if (n == 2)
            return 4;
        else 
            return recursiveF(n-1) + n*recursiveF(n-2) - 2*recursiveF(n-3) + 5; 
    }

    public static int iterativeF(int n) {

        counter = 0;
        int previous1 = 4;
        int previous2 = 2;
        int previous3 = 0;

        // base cases
        if (n < 1)
            return previous3;
        else if (n == 1)
            return previous2;
        else if (n == 2)
            return previous1; 
            
        int count = 3, current;

        // iterate from 3 (end of base cases) to n
        while (count <= n) {
            current = previous1 + (count * previous2) - (2 * previous3) + 5;
            // shift values over
            previous3 = previous2;
            previous2 = previous1;
            previous1 = current;
            count++;
            counter++;
        }
            return previous1;  
        }
    }