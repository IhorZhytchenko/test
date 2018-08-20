package geometry.service;

import geometry.entity.Figure;
import geometry.entity.Square;
/**
 * class SquareCreator.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class SquareCreator implements Creator {
    @Override
    public Figure createFigure() {
        return new Square();
    }
}
