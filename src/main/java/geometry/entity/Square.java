package geometry.entity;

import geometry.Color;

import java.util.Random;
/**
 * class Square.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class Square implements Figure {
    private static final int MAX_LENGTH = 100;
    private int a;
    private Color color;

    public Square() {
        Random random = new Random();
        this.a = random.nextInt(MAX_LENGTH) + 1;
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }

    @Override
    public void draw() {
        System.out.printf("Фигура: квадрат, площадь: %d кв. ед., длина стороны: %d ед., цвет: %s", this.getArea(), this.getA(), this.getColor());
        System.out.println();
    }

    @Override
    public int getArea() {
        return this.a * this.a;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public int getA() {
        return this.a;
    }
}
