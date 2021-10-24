public class Distance {
    double x;
    double y;
    double z;
    public Distance(double a, double b, double c) {
        x = a;
        y = b;
        z = c;
    }
    public void count1(Distance s) {
        double m = Math.sqrt((x - s.x) * (x - s.x) + (y - s.y) * (y - s.y)
                + (z - s.z) * (z - s.z));
        System.out.println("两点的距离：" + m);
    }

    public static void main(String[] args) {
        Distance  p = new Distance (1, 1, 1);
        Distance  p2 = new Distance (2, 2, 2);
        System.out.println("("+p.x+","+p.y+","+p.z+")"+"("+p2.x+","+p2.y+","+p2.z+")");
        p.count1(p2);
    }

}






