package geometry.service;

import geometry.entity.Circle;
import geometry.entity.Figure;
/**
 * class CircleCreator.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class CircleCreator implements Creator {
    @Override
    public Figure createFigure() {
        return new Circle();
    }
}
