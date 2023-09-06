package seminar04;

import seminar04.libraly.IShape;

import java.util.ArrayList;
import java.util.List;

public class GeometryFigures {
    private static List<IShape> toolbox;

    public GeometryFigures() {
        if(toolbox == null){toolbox = new ArrayList<IShape>();}
    }


    // Метод для добавления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    // Метод для удаления фигуры
    public void remove(int num){
        try {
            toolbox.remove(num);
        }catch (IndexOutOfBoundsException e ){
            System.out.printf("There is not %s number in the box of figures\n", num);
        }
    }

    // Метод поиска необходимой фигуры
    public IShape findShape(int num){
        try {
            return toolbox.get(num);
        }catch (IndexOutOfBoundsException e ){
            System.out.printf("There is not %s number in the box of figures\n", num);
        }
        return null;
    }

    // Метод отображения подробной информации о фигуре
    public void getInfo(int num) {
        try {
            IShape figure = toolbox.get(num);

            System.out.printf("Area of figure number %s is %s and perimeter is %s\n", num, figure.getArea(), figure.getPerimeter());

        }catch (IndexOutOfBoundsException e ){
            System.out.printf("There is not %s number in the box of figures\n", num);
        }
    }

}
