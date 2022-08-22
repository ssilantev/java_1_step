public class AverageWithFunction {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        double average = getAverage(a, b);
        System.out.println("Average = " + average);
    }
public static double getAverage(int a, int b) { // funclion
        return (double) (a+b)/2;
    }
}