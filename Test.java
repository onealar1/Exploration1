import java.time.Duration;
import java.time.Instant;

public class Test {
    public static void main(String[] args){

        Instant start = Instant.now();
        Compare.iterativeF(5);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toNanos();

        System.out.println("Time for iterative method with input 5: " + timeElapsed + " nanoseconds.");
        System.out.println("Number of steps for iterative method with input 5: " + Compare.counter);

        Instant start2 = Instant.now();
        Compare.recursiveF(5);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toNanos();

        System.out.println("Time for recursive method with input 5: " + timeElapsed2 + " nanoseconds.");
        System.out.println("Number of steps for recursive method with input 5: " + Compare.counter);


    }
}
