package yeet;

import processing.core.PApplet;
import java.lang.Math;

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
        noStroke();
        for(int i=1; i < 360; i++){
            fill(i,90,90);
            ellipse(i*2,200, 30,30);
        }
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
        text("",400,100);
        loop();
    }
}

