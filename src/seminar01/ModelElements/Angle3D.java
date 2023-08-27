package seminar01.ModelElements;

public class Angle3D {

    public final int[] angle3d = new int[2];

    public Angle3D(int x, int z) {

        angle3d[0] = x;
        angle3d[1] = z;
    }

    public int[] getAngle3D() {
        return angle3d;
    }
}
