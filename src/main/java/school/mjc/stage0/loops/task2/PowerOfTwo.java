package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        if (power < 0)
            System.out.println("too much power");
        else if (power == 0)
            System.out.println(1);
        else
            while (i <= power)
                System.out.println( (int) Math.pow(2, i++));
    }
}
