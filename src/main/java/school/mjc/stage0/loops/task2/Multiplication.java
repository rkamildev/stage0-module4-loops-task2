package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 1;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        }
        else {
            System.out.println("0");
            while (i <= Math.abs(multiplyByAndToInclusive)){
                System.out.println(i * multiplyByAndToInclusive);
                i++;
            }
        }
    }
}
