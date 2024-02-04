package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO (FAIT)
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {
        Rectangle rectangle_right = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle_left = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle_middle = new Rectangle(halfMaxHeight, halfStripeThickness);

        Double[] right = new Double[]{-30.0, 0.0};
        Double[] left = new Double[]{30.0, 0.0};
        Double[] middle = new Double[]{0.0, 0.0};

        for(Point2d coord : rectangle_left.getCoords()){
            coord.translate(left).rotate(Math.toRadians(-22));
        }
        for(Point2d coord : rectangle_right.getCoords()){
            coord.translate(right).rotate(Math.toRadians(22));
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.translate(middle);
        }
        return rectangle_left.add(rectangle_right).add(rectangle_middle);
    }

    /** TODO        (FAIT)
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        Rectangle rectangle = new Rectangle(stripeThickness, maxHeight);
        Circle circle1 = new Circle(halfMaxHeight + halfStripeThickness);
        Circle circle2 = new Circle(halfMaxHeight + halfStripeThickness);
        Circle empty1 = new Circle(maxWidth);
        Circle empty2 = new Circle(maxWidth);

        Double[] pos1 = new Double[]{40.0, -37.0};
        Double[] pos2 = new Double[]{40.0, 37.0};

        for(Point2d coord : circle1.getCoords()){
            coord.translate(pos1);
        }
        for(Point2d coord : circle2.getCoords()){
            coord.translate(pos2);
        }
        for(Point2d coord : empty1.getCoords()){
            coord.translate(pos1);
        }
        for(Point2d coord : empty2.getCoords()){
            coord.translate(pos2);
        }
        circle1.remove(empty1);
        circle2.remove(empty2);

        return rectangle.add(circle1.add(circle2));
    }

    /** TODO        (FAIT)
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        Ellipse ellipse_main = new Ellipse(maxWidth + halfMaxWidth, maxHeight);
        Ellipse ellipse_empty = new Ellipse(maxWidth, maxHeight-halfStripeThickness);
        Rectangle rectangle_empty = new Rectangle(halfMaxWidth, halfMaxHeight);

        Double[] rectangle = new Double[]{40.0, 0.0};

        for(Point2d coord : rectangle_empty.getCoords()){
            coord.translate(rectangle);
        }
        return ellipse_main.remove(ellipse_empty.add(rectangle_empty));
    }

    /** TODO    (FAIT)
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {

        Rectangle rectangle_top = new Rectangle(maxWidth,halfStripeThickness);
        Rectangle rectangle_bottom = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle rectangle_middle = new Rectangle(maxWidth, halfStripeThickness);
        Rectangle rectangle_side = new Rectangle(halfStripeThickness, maxHeight);

        Double[] top = new Double[]{0.0, 70.0};
        Double[] bottom = new Double[]{0.0, -70.0};
        Double[] side = new Double[]{-40.0, 0.0};

        for(Point2d coord : rectangle_top.getCoords()){
            coord.translate(top);
        }
        for(Point2d coord : rectangle_bottom.getCoords()){
            coord.translate(bottom);
        }
        for(Point2d coord : rectangle_side.getCoords()){
            coord.translate(side);
        }
        return rectangle_middle.add(rectangle_bottom.add(rectangle_side.add(rectangle_top)));
    }

    /** TODO        (FAIT)
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape shape_H = new BaseShape();

        Rectangle rectangle_right = new Rectangle(halfMaxWidth, maxHeight);
        Rectangle rectangle_left = new Rectangle(halfMaxWidth, maxHeight);
        Rectangle rectangle_middle = new Rectangle(halfMaxHeight, stripeThickness);

        Double[] right = new Double[]{-50.0, 0.0};
        Double[] left = new Double[]{50.0, 0.0};
        Double[] middle = new Double[]{0.0, 0.0};

        for(Point2d coord : rectangle_left.getCoords()){
            coord.translate(left);
        }
        for(Point2d coord : rectangle_right.getCoords()){
            coord.translate(right);
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.translate(middle);
        }

        shape_H.add(rectangle_left.add(rectangle_right).add(rectangle_middle));
        return shape_H;
    }

    /** TODO        (FAIT)
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        Rectangle rectangle_right = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle_left = new Rectangle(halfStripeThickness, maxHeight);
        Rectangle rectangle_middle = new Rectangle(halfStripeThickness, maxHeight+5.0);

        Double[] right = new Double[]{-38.0, 0.0};
        Double[] left = new Double[]{38.0, 0.0};

        for(Point2d coord : rectangle_left.getCoords()){
            coord.translate(left);
        }
        for(Point2d coord : rectangle_right.getCoords()){
            coord.translate(right);
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.rotate(Math.toRadians(-27.0));
        }
        return rectangle_left.add(rectangle_right).add(rectangle_middle);
    }

    /** TODO    (FAIT)
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        Ellipse letter_O = new Ellipse(maxWidth + halfMaxWidth, maxHeight);
        Ellipse empty_O = new Ellipse(maxWidth, maxHeight - halfStripeThickness);

        return letter_O.remove(empty_O);
    }
}


