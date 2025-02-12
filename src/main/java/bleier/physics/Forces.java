package bleier.physics;

public class Forces {
    public static void main(String[] args) {
        Force force1 = new Force(32, 10);
        Force force2 = new Force(105, 10);
        Force solution = force1.add(force2);
        System.out.print(solution);

    }


}
