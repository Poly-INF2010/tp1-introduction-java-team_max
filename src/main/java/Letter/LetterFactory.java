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
        BaseShape shape_A = new BaseShape();
        Rectangle rectangle_right = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle_left = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle_middle = new Rectangle(halfMaxHeight, stripeThickness);

        Double[] right = new Double[]{-35.0, 0.0};
        Double[] left = new Double[]{35.0, 0.0};
        Double[] middle = new Double[]{0.0, 0.0};

        for(Point2d coord : rectangle_left.getCoords()){
            coord.translate(left).rotate(Math.toRadians(-27));
        }
        for(Point2d coord : rectangle_right.getCoords()){
            coord.translate(right).rotate(Math.toRadians(27));
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.translate(middle);
        }
        shape_A.add(rectangle_left.add(rectangle_right).add(rectangle_middle));
        return shape_A;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape shape_B = new BaseShape();

        Rectangle rectangle = new Rectangle(stripeThickness, maxHeight);
        Circle circle1 = new Circle(maxWidth);
        Circle circle2 = new Circle(maxWidth);
        Circle empty1 = new Circle(halfMaxWidth);
        Circle empty2 = new Circle(halfMaxWidth);

        Double[] pos1 = new Double[]{0.0, 0.0};
        Double[] pos2 = new Double[]{0.0, 0.0};

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

        shape_B.add(circle1.add(circle2));
        return shape_B;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape shape_C = new BaseShape();

        Ellipse ellipse_main = new Ellipse(maxWidth, maxHeight);
        Ellipse ellipse_empty = new Ellipse(maxWidth, halfMaxHeight);

        Double[] ellipse = new Double[]{-10.0, 0.0};

        for(Point2d coord : ellipse_main.getCoords()){
            coord.translate(ellipse);
        }

        shape_C.add(ellipse_main.remove(ellipse_empty));
        return shape_C;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape shape_E = new BaseShape();

        Rectangle rectangle_top = new Rectangle(halfMaxHeight, halfMaxWidth);
        Rectangle rectangle_bottom = new Rectangle(halfMaxHeight, halfMaxWidth);
        Rectangle rectangle_middle = new Rectangle(halfMaxHeight, halfMaxWidth);
        Rectangle rectangle_side = new Rectangle(halfMaxWidth, maxHeight);

        Double[] top = new Double[]{0.0, 60.0};
        Double[] bottom = new Double[]{0.0, -60.0};
        Double[] middle = new Double[]{0.0, 0.0};
        Double[] side = new Double[]{-50.0, 0.0};

        for(Point2d coord : rectangle_top.getCoords()){
            coord.translate(top);
        }
        for(Point2d coord : rectangle_bottom.getCoords()){
            coord.translate(bottom);
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.translate(middle);
        }
        for(Point2d coord : rectangle_side.getCoords()){
            coord.translate(side);
        }

        shape_E.add(rectangle_middle.add(rectangle_bottom.add(rectangle_side.add(rectangle_top))));
        return shape_E;
    }

    /** TODO
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

//        FAILLLLL
//        int[][] matrix_H = new int[maxWidth.intValue()][maxHeight.intValue()];
//        for (Point2d point : shape_H.getCoords()) {
//            int x = (int) Math.round(point.X());
//            int y = (int) Math.round(point.Y());
//            matrix_H[x][y] = 1;
//        }
//
//        for (double i = 0; i < maxWidth; i++) {
//            for (double j = 0; j < maxHeight; j++) {
//                if ((i > 0.25 * maxWidth && i < 0.75 * maxWidth) && (j > 0.25 * maxHeight && j < 0.75 * maxHeight)) {
//                    Point2d coord = new Point2d(Double.valueOf(i), Double.valueOf(j));
//                    shape_H.remove(coord);
//                }
//            }
//        }
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape shape_N = new BaseShape();

        Rectangle rectangle_right = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle_left = new Rectangle(stripeThickness, maxHeight);
        Rectangle rectangle_middle = new Rectangle(stripeThickness, maxHeight);

        Double[] right = new Double[]{-40.0, 0.0};
        Double[] left = new Double[]{40.0, 0.0};
        Double[] middle = new Double[]{0.0, 0.0};

        for(Point2d coord : rectangle_left.getCoords()){
            coord.translate(left);
        }
        for(Point2d coord : rectangle_right.getCoords()){
            coord.translate(right);
        }
        for(Point2d coord : rectangle_middle.getCoords()){
            coord.translate(middle).rotate(Math.toRadians(-30.0));
        }

        shape_N.add(rectangle_left.add(rectangle_right).add(rectangle_middle));
        return shape_N;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape shape_O = new BaseShape();
        Ellipse letter_O = new Ellipse(maxWidth, maxHeight);
        Ellipse empty_O = new Ellipse(halfMaxWidth, halfMaxHeight);
        shape_O.add(letter_O);
        shape_O.remove(empty_O);
        return shape_O;
    }
}
