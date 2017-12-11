package yeet;

import java.util.Random;

public class RanGen {

    static public double fuck = 0.0;
    private int namehere[] = new int[10]; // the reason why you have to use the "new" token is because arrays are a actually their own kind of,,,,, object. the same way that an object is an object,; also uhhhharrays cant change indexes and stuff u can lokk at the documentation :) ik a decent part of this

    public RanGen() {
        //write code here
    }

    public int[] randarray() {
        Random asd = new Random();
        int a;
        for (a = 0; a < 10; a++) {
            namehere[a] = asd.nextInt(300) + 1;
        }//lol if you think about it we're just writing another way to use java.util.randomlollllolloloool
    return namehere;
    }
}
