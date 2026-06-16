package views;

import java.util.Scanner;

public class CmdLineView {
    private Scanner scanner;

public CmdLineView(){
    this.scanner = new Scanner(System.in);
}
public void initialPrompt(){
    System.out.println("type the number of dice and the number of sides in the format XdY, where X is the number of dice and Y the number of sides :");
}
public String getInput(){
    return( scanner.nextLine());
}
public void displayResults(int[] array){
int total= 0;
    for (int i = 0; i < array.length; i++) {
        System.out.println("The roll of dice number " + (i + 1) + " was " + array[i]);
        total += array[i];
    }System.out.println();
    System.out.println("The total rolled was "+ total);
}









}
