package geometry.entity;

import geometry.Color;


import java.util.Random;
/**
 * class Trapeze.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class Trapeze implements Figure {
    private static final int MAX_LENGTH = 100;
    private int a;
    private int b;
    private int h;
    private Color color;

    public Trapeze() {
        Random random = new Random();
        this.a = random.nextInt(MAX_LENGTH) + 1;
        this.b = random.nextInt(MAX_LENGTH) + 1;
        this.h = random.nextInt(MAX_LENGTH) + 1;
        this.color = Color.values()[random.nextInt(Color.values().length)];

    }


    @Override
    public void draw() {
        System.out.printf("Фигура: трапеция, площадь: %d кв. ед., основание: %d ед., %d ед., высота: %d ед. цвет: %s", this.getArea(), this.getA(), this.getB(), this.getH(), this.getColor());
        System.out.println();
    }

    @Override
    public int getArea() {
        return ((this.a + this.b) * this.h) / 2;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int getH() {
        return this.h;
    }
}
