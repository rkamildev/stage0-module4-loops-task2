package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int res = 1;
        if (printToInclusive == 0)
            System.out.println(1);
        else {
            System.out.println(i);
            while (i <= printToInclusive) {
                res *= i;
                i++;
                System.out.println(res);
            }
        }
    }
}
