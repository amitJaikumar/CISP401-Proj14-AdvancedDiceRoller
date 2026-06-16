import models.Die;
import views.CmdLineView;

public class Main {
    public static void main(String[] args) {
        CmdLineView cmdlineview = new CmdLineView();
        Die die = new Die();
        cmdlineview.initialPrompt();
        String temp3000 = cmdlineview.getInput();



        try {
            int[] results = die.rollDice(temp3000);
            cmdlineview.displayResults(results);
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }











    }


















}