package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        if (printToInclusive == 0)
            System.out.print("");
        else
            while (i <= printToInclusive) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
                i++;
            }
    }

    public boolean isPrime(int number) {
        int i = 1;
        if (number != 2) {
            while (i < number / 2) {
                i++;
                if (number % i == 0)
                    return false;

            }
        }
        return true;
    }
}
