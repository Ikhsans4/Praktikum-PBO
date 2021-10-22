
/**
 * Write a description of class Lingkaran here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lingkaran
{
    // instance variables - replace the example below with your own
    private double jariJari;
    private double phi = 3.14;

    /**
     * Constructor for objects of class Lingkaran
     */
    public Lingkaran(double jariJari)
    {
        // initialise instance variables
        this.jariJari = jariJari;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double luas()
    {
        // put your code here
        return phi * (this.jariJari*this.jariJari);
    }
}
