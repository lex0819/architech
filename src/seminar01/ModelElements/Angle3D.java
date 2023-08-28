package seminar01.ModelElements;

/**
 * Класс для работы с углами поворота
 * угол x - вправо-влево
 * угол z - вверх-вниз
 * возвращает массив из двух элементов с градусами углов
 */
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
