package seminar01.ModelElements;

public class Point3D {

    public final int[] point3d = new int[3];

    public Point3D(int x, int y, int z) {

        point3d[0] = x;
        point3d[1] = y;
        point3d[2] = z;
    }

    public int[] getPoint3d() {
        return point3d;
    }
}
