package geometry;

import geometry.entity.Figure;
import geometry.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * class Generator.
 *
 * @author Ihor Zhytchenko (igor.zhytchenko@gmail.com)
 * @version $1$
 * @since 18.08.2018
 */
public class Generator {
    private static final int MAX_SIZE = 100;
    private List<Creator> creators = new ArrayList<>();

    public Generator() {
        this.creators.add(new CircleCreator());
        this.creators.add(new SquareCreator());
        this.creators.add(new TrapezeCreator());
        this.creators.add(new TriangleCreator());
    }

    public List<Figure> generateFigure() {
        List<Figure> result = new ArrayList<>();
        Random random = new Random();
        int count = random.nextInt(MAX_SIZE) + 1;
        int size = creators.size();
        for (int i = 0; i < count; i++) {
            result.add(this.creators.get(random.nextInt(size)).createFigure());
        }
        return result;
    }
}
