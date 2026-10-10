package geometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);

        System.out.println("X: " + p1.getX());
        System.out.println("Y: " + p1.getY());

        p1.setX(1);
        p1.setY(1);

        System.out.println("Updated point: " + p1.getX() + ", " + p1.getY());

        System.out.println("Distance: " + p1.distance(p2));

        Point p3 = new Point(1, 1);
        System.out.println("Points equal: " + p1.equals(p3));

        p1.translate(2, 3);
        System.out.println("After translate: "
                + p1.getX() + ", " + p1.getY());

        Segment s1 = new Segment(0, 0, 3, 4);

        System.out.println("Segment length: " + s1.length());
        System.out.println("Slope: " + s1.getSlope());
        System.out.println("Intercept: " + s1.getIntercept());

        Point p4 = new Point(6, 8);
        System.out.println("P4 on line: " + s1.isOnLine(p4));

        Point p5 = new Point(1.5f, 2);
        System.out.println("P5 on segment: " + s1.isOnSegment(p5));

        Segment s2 = new Segment(3, 4, 0, 0);
        System.out.println("Segments equal: " + s1.equals(s2));

        s1.translate(1, 1);
        System.out.println("New segment length: " + s1.length());
    }
}