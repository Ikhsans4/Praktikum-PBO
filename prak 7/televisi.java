
/**
 * Write a description of class televisi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class televisi implements KontrolTv
{
    private String merek;
    private boolean hidup;
    private String [] saluran = { "RCTI", "SCTV", "INDOSIAR", 
        "TPI", "ANTV", "TRANSTV", "TRANS7"};
    
    private int volume = 0;
    
    public televisi(String merek){
        this.merek = merek;
    }
    public void hidupkan(boolean hidup){
        if(hidup){
            this.hidup = true;
            System.out.println("Televisi dihidupkan");
        } else{
            this.hidup = false;
            System.out.println("Televisi dimatikan");
        }
    }
    public void pindahChannel(int channel){
        if(channel == 1){
            System.out.println("Saluran RCTI");
        }else if(channel == 2){
            System.out.println("Saluran SCTV");
        }else if(channel == 3){
            System.out.println("Saluran INDOSIAR");
        }else if(channel == 4){
            System.out.println("Saluran TPI");
        }else if(channel == 5){
            System.out.println("Saluran ANTV");
        }else if(channel == 3){
            System.out.println("Saluran TRANSTV");
        }else if(channel == 3){
            System.out.println("Saluran TRANS7");
        }
    }
    public void keraskanVolume(int tambah){
        if (this.hidup) {
            if (this.volume == 100) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.volume + "%");
            } else {
                this.volume += tambah;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu donk TV-nya!!");
        }
    }
    public void pelankanVolume(int kurang){
       if (this.hidup) {
            if (this.volume == 0) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= kurang;
                System.out.println("Volume sekarang: " + this.volume);
            }
        } else {
            System.out.println("Nyalakan dulu donk TV-nya!!");
        }
    }
}
