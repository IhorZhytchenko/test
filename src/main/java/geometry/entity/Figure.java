package geometry.entity;

import geometry.Color;
/**
 * interface Figure.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public interface Figure {

    void draw();
    int getArea();
    Color getColor();

}
