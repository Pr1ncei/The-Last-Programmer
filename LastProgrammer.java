import java.util.Scanner;

/*
 * The Last Programmer: a Text-based Adventure Game
 * 
 * Year 21xx, everything is in chaos. The world has 
 * taken by an AI, and your job as the last programmer is
 * to defeat the rogue AI, SRC, who started it all.
 * 
 * @author: Prince Pamintuan
 */

public class LastProgrammer{

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        displayMenu();
        askUserToStart();
    }

    private static void askUserToStart(){
        while (true) {
            System.out.print("Do you want to start the game? (Y/N) ");
            String option = input.nextLine().strip().toUpperCase();

            if (option.equals("Y") || option.equals("YES")) {
                startGame();
                break;
            } 
            
            if (option.equals("N") || option.equals("NO")) {
                System.out.println("Okie dokie Goodbye!");
                break;
            } 
            
            System.out.println("Invalid Answer. Please try again.");
            
        }
    }


    /*
     * Displays the intro of the game and also the setup
     */
    private static void displayMenu(){
        typingEffect("====================================", 20);
        typingEffect("        THE LAST PROGRAMMER        ", 50);
        typingEffect("====================================", 20);

    }

    /*
     * Starts the game and presents the player with sets of choices 
     */
    private static void startGame(){
        loadingEffect("Loading game", 5);

        // Game Logic and Setup Here 
    }

    private static void typingEffect(String text, int delay){
        for (char c: text.toCharArray()){
            System.out.print(c);
            try{
                Thread.sleep(delay);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private static void loadingEffect(String text, int dotCount){
        System.out.print(text);
        for(int i = 0; i < dotCount; i++){
            try{
                Thread.sleep(500);
                System.out.print(".");
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

    }

}