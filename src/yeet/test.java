package yeet;

import processing.core.PApplet;

public class test extends PApplet{
    RanGen tool = new RanGen();
    public static void main(String[] args){
        PApplet.main("yeet.test");
    }

    public void setup() {
        background(0);
        colorMode(HSB, 360, 100, 100);

    }

    public void settings(){
        size(1000, 500);
    }

    public void draw(){
        text("yes",8,8);
        ellipse(100,100,80,95);
    }

    public void loop(){
        text("proof", 500, 500);
        for(int i =0;i<tool.randarray().length;i++){ //something something Cory Scaffolding
            fill((i+1)*36, 90, 90);
            ellipse(i*40,i*40,tool.randarray()[i],tool.randarray()[i]);
            redraw();
        }

    }
    public void mousePressed(){
        text("fuCKING",400,100);
        loop();
    }
}

