package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int f = number / 1000;
        int s = (number / 100) % 10;
        int t = (number / 10) % 100 % 10;
        int fo = number % 1000 % 100 % 10;
        System.out.println(f+s+t+fo);
    }
}
