public class PointDistanceCalculator {
    public static Double calculateDistance(Point a, Point b) {

        return Math.sqrt(Math.pow(b.getY()-a.getY(),2)+Math.pow(b.getX()-a.getX(),2));
    }
}
