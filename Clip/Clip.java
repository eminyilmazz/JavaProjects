package Clip;

// Muhammed Emin Yılmaz 090150303
public class Clip {

    private int clipSize;
    private int bulletsInClip;

    public Clip(int clipSize, int bulletsInClip) {
        this.clipSize = clipSize;
        this.bulletsInClip = bulletsInClip;
}

    public void trigger() { //This function fires a bullet
        if (bulletsInClip > 0) {
            bulletsInClip--;
            System.out.println("Shot's fired. You have " + bulletsInClip + " bullets left in the clip.");
        } else {
            System.out.println("You don't have any bullet in the clip.");
        }
    }

    public void reloadClip() { //Reloads the clip to its maximum capacity
        if (bulletsInClip == clipSize) {
            System.out.println("You already have the maximum amount of bullets in the clip.");
        } else {
            bulletsInClip = clipSize;
            System.out.println("Reloaded. You have " + bulletsInClip + " bullets in the clip.");
        }
    }   /* Soruda sadece bir mermi mi dolduruyor yoksa tüm şarjör mü dolduruyor belirtilmediği için iki method
         * yazma gereği hissettim. Yukarıda şarjörün tamamı doldurulken altta ki methodda sadece bir tane mermi
         * şarjöre ekleniyor. */

    public void fillClip() { //Fills the clip by one bullet
        if (bulletsInClip == clipSize) {
            System.out.println("You already have the maximum amount of bullets in the clip.");
        } else {
            bulletsInClip++;
            System.out.println("Put one bullet into the clip. You have " + bulletsInClip + " bullets in the clip.");
        }
    }
}