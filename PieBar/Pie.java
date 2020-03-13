package PieBar;
import java.lang.String;
import java.util.Random;
import static java.lang.Thread.sleep;

public class Pie {
    private String type;
    private int bakingTime;
    private int bakingDegree;
    public Random random = new Random();

    public Pie(String order) {
        this.type = order.replace(" Pie", "");
        this.bakingTime = random.nextInt(10);
        this.bakingDegree = random.nextInt(81) + 170;
    }
    public void bakeThePie () throws InterruptedException {
        System.out.println("We got your order. Our best bakers are working on your pie.");
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Your " + this.type + " Pie is going to bake in " + this.bakingTime +
                           " minutes at " + this.bakingDegree + "°C");
        Thread.sleep(3000);
        for (int i = 0; i < 15; i++) {
            System.out.println("Your " + this.type + " Pie is baking.");
            sleep(1900);
        }
        System.out.println("This is taking too long, we're going to use that time machine we have in our basement");
        Thread.sleep(8000);
        System.out.println("Your pie is ready! Enjoy!");
        Thread.sleep(3000);
        System.out.println("             (\n" +
                "              )\n" +
                "         __..---..__\n" +
                "     ,-='  /  |  \\  `=-.\n" +
                "    :--..___________..--;\n" +
                "     \\.,_____________,./  ");
    }
}
