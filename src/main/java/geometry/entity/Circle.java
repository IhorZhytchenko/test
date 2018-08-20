package geometry.entity;

import geometry.Color;


import java.util.Random;
/**
 * class Circle.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class Circle implements Figure {

    private static final int MAX_LENGTH = 100;
    private int r;
    private Color color;

    public Circle() {
            Random random = new Random();
            this.r = random.nextInt(MAX_LENGTH) + 1;
            this.color = Color.values()[random.nextInt(Color.values().length)];

    }

    @Override
    public void draw() {
        System.out.printf("Фигура: круг, площадь: %d кв. ед., радиус: %d ед., цвет: %s", this.getArea(), this.getR(), this.getColor());
        System.out.println();
    }

    @Override
    public int getArea() {
        return (int) Math.round(Math.pow(this.r, 2) * Math.PI);
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public int getR() {
        return this.r;
    }
}

