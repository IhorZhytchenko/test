package geometry;

import geometry.entity.*;
import geometry.service.Creator;

import java.util.List;
/**
 * class App.
 * launch application.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class App {

    public static void main(String[] args) {
        List<Figure> figures = new Generator().generateFigure();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
