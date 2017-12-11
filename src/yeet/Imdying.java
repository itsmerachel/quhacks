package yeet;
import processing.core.PApplet;
import java.util.Random;

public class Imdying extends PApplet {
    public static void main(String[] args) {
        PApplet.main("Imdying");
    }

    public void settings() {
        size(300, 300);
    }

    public void setup() {
        fill(120, 50, 240);
    }

    public void draw() {
        ellipse(width / 2, height / 2, second(), second());
        int a = 0;

        RanGen sam = new RanGen();
        sam.what();
    }




}

