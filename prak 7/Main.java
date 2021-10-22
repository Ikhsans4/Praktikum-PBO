
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        KontrolTv tvku = new televisi("SHARP");
        tvku.hidupkan(true);
        tvku.keraskanVolume(10);
        tvku.pelankanVolume(3);
        tvku.pindahChannel(5);
        tvku.hidupkan(false);
    }
}
