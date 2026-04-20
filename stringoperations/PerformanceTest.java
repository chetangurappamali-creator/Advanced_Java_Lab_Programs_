//Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for appending
//the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify your answer which
//one is better.
package stringoperations;

public class PerformanceTest {
    public static void main(String[] args) {

        int n = 10000;

        // StringBuffer Test
        StringBuffer sbuffer = new StringBuffer();
        long startBuffer = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuffer.append("AIET");
        }

        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        // StringBuilder Test
        StringBuilder sbuilder = new StringBuilder();
        long startBuilder = System.nanoTime();

        for (int i = 0; i < n; i++) {
            sbuilder.append("AIET");
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        // Display results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Comparison
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}
