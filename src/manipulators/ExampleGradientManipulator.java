package manipulators;

import java.awt.*;
import java.util.Random;

public class ExampleGradientManipulator extends Manipulator {

    @Override
    public Color getColorAtPoint(int x, int y, float brightness, Random random) {
        float red = ((float) x) / image.getWidth();
        float blue = ((float) y) / image.getHeight();
        return new Color(red, brightness, brightness);
    }
}
