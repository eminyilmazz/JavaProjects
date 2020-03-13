package Clip;

// Muhammed Emin Yılmaz 090150303
public class TestClip {
    public static void main(String[] args) {
        Clip clip = new Clip(4, 3);
        clip.trigger();
        clip.trigger();
        clip.trigger();
        clip.trigger(); //Test: Clipte mermi yokken ateş etmek
        clip.reloadClip();
        clip.fillClip(); //Test: Clip doluyken mermi koymak
        clip.trigger();
        clip.fillClip();
        clip.reloadClip(); //Test: Clip doluyken mermi koymak
    }
}
