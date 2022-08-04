package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int last = number / 100;
        int second = (number / 10) % 10;
        int first = (number % 100) % 10;
        System.out.println("" + first + second + last);
    }
}
