package Point;

import java.util.*;

public final class PointOperator {

    /** TODO        (FAIT)
     * Translates a vector of size N by another vector of size N
     * Similar to adding two vector of size N together
     * @param vector Vector to translate
     * @param translateVector Translation to apply
     */
    public static void translate(Double[] vector, Double[] translateVector) {
        for(int i = 0; i< vector.length; i++){
            vector[i] += translateVector[i];
        }
    }

    /** TODO
     * Rotates a vector of size N by a matrix of size N x N
     * Similar to a matrix vector multiplication
     * @param vector Vector to rotate
     * @param rotationMatrix Matrix by which to rotate
     */
    public static void rotate(Double[] vector, Double[][] rotationMatrix) {
        int n = vector.length;
        Double[] vector2 = new Double[n];
        for(int i = 0; i < n; i++){
            double temp = 0;
            for(int j = 0; j < n; j++){
                 temp += rotationMatrix[i][j] * vector[j];
            }
            vector2[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            vector[i] = vector2[i];
        }
    }

    /** TODO        (FAIT)
     * Divide a vector of size N by a scalar
     * @param vector Vector to divide
     * @param divider Scalar by which to divide
     */
    public static void divide(Double[] vector, Double divider) {
        if(vector.length != 0){ /** bleme ???*/
            for(int i = 0; i < vector.length; i++){
                vector[i] /= divider;
            }
        }
    }

    /** TODO        (FAIT)
     * Multiply a vector of size N by a scalar
     * @param vector Vector to multiply
     * @param multiplier Scalar by which to multiply
     */
    public static void multiply(Double[] vector, Double multiplier) {
        if(vector.length != 0){ /** bleme ???*/
            for(int i = 0; i < vector.length; i++){
                vector[i] *= multiplier;
            }
        }
    }

    /** TODO        (FAIT)
     * Add a scalar to a vector of size N
     * @param vector Vector that we have to add to
     * @param adder Scalar to add to vector
     */
    public static void add(Double[] vector, Double adder) {
        if(vector.length != 0){ /** bleme ???*/
            for(int i = 0; i < vector.length; i++){
                vector[i] += adder;
            }
        }
    }
}
