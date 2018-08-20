package geometry.entity;

import geometry.Color;

import java.util.Random;
/**
 * class Triangle.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class Triangle implements Figure {
    private static final int MAX_LENGTH = 100;
    private static final int MAX_ANGLE = 179;
    private int a;
    private int b;
    private int c;
    private int angle;
    private Color color;

    public Triangle() {
        Random random = new Random();
        this.a = random.nextInt(MAX_LENGTH) + 1;
        this.b = random.nextInt(MAX_LENGTH) + 1;
        this.angle = random.nextInt(MAX_ANGLE) + 1;
        this.c = (int) Math.round(Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2) - (2 * this.a * this.b * Math.cos(Math.toRadians(this.angle)))));
        this.color = Color.values()[random.nextInt(Color.values().length)];
    }


    @Override
    public void draw() {
        System.out.printf("Фигура: треугольник, площадь: %d кв. ед., стороны: %d ед., %d ед., %d ед., цвет: %s", this.getArea(), this.getA(), this.getB(), this.getC(), this.getColor());
        System.out.println();
    }

    @Override
    public int getArea() {
        return (int) Math.round((this.a * this.b * Math.sin(Math.toRadians(this.angle))) / 2);
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
