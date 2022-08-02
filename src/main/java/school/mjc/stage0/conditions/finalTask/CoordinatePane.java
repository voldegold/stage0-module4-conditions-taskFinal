package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        if (x==0 && y==0) System.out.println("zero");
        else System.out.println((x>0) ? (y>0 ? "first" : "fourth") : (y>0 ? "second" : "third"));
    }
}
