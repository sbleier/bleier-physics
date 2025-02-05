import java.util.Arrays;

public class forces {
    public static void main(String[] args) {
        double[] thirdForce = findThirdForce(32, 105, 10, 10);
        System.out.printf("Third force in magnitude: %.2f \nThird force in degrees: %.2f", thirdForce[0], thirdForce[1]);
    }

    public static double[] findThirdForce(double angle1, double angle2, double side1, double side2){
        double[] solutions = new double[2];

        double force1X = side1 * Math.cos(Math.toRadians(angle1));
        double force1Y = side1 * Math.sin(Math.toRadians(angle1));

        double force2X = side2 * Math.cos(Math.toRadians(angle2));
        double force2Y = side2 * Math.sin(Math.toRadians(angle2));

        double totalX = force1X + force2X;
        double totalY = force1Y + force2Y;

        solutions[0] = Math.sqrt(totalX * totalX + totalY * totalY);
        solutions[1] = Math.toDegrees(Math.atan(totalY / totalX));
        return solutions;
    }
}
