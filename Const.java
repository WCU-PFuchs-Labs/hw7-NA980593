public class Const extends Unop {
    /** the constant value */
    private double value;
    /**
     * @param d the value to set the constant to.
     */
    public Const(double d) {
        value = d;
    }
    /**
     * @return the value of the constant.
     */
    public double eval(double[] data) {
        return value;
    }
    public String toString() {
        return String.valueOf(value);
    }
}
