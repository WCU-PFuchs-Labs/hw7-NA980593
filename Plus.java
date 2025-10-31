public class Plus extends Binop {
     /**
      * @param left the left value
      * @param right the right value
      * @return the result of adding
      * left to right 
      */
    public double eval(double left, double right) {
        return left + right;
    }
    public String toString() {
        return "+";
    }
}
