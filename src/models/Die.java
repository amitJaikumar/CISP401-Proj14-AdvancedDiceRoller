package models;

import java.util.Random;
public class Die { public Die(){}

public int[] splitDie(String argument){

    String[] temp = argument.split("d");
    int[] arrays;
    arrays = new int[2];
    arrays[0] = Integer.parseInt(temp[0]);
    arrays[1] = Integer.parseInt(temp[1]);
    return arrays;
}


    public int[] rollDice(String argu) {
Random random = new Random();
        int[] split = splitDie(argu);
        int sides = split[1];
        int index1 = split[0]; int[] finals = new int[index1];
        for (int i = 0; i < index1; i++) {
            finals[i] = (int) (random.nextInt( sides)) + 1;
        }

        return finals;
    }













}
