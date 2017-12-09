package yeet;

import processing.core.PApplet;
import java.lang.Math;
//runner class

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
            ellipse((float) (i*2.8), 250, 30,30);


            //ellipse(0,250,)
            //(x – 0)2 + (y – 0)2 = sqrt(250),
            //sqrt(sqrt(250) - (x)) = y
            //ellipse(250,0)
            //ellipse(0, -250)
            //ellipse(-250, 0)
        }
    }

    public void loop(){
        for(int i =0;i<tool.randarray().length;i++){ //something something Cory Scaffolding
            fill((i+1)*36, 90, 90);
            ellipse(i*40,i*40,tool.randarray()[i],tool.randarray()[i]);
            redraw();
        }

    }
    public void mousePressed(){
        textSize(60);
        fill(0,0,100);
        text("LGBT Rights!!!!",500,200);
        loop();
    }
}

