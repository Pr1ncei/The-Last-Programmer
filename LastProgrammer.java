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

/*
 * Suggestions: Add Type Effect to the Game 
 */


public class LastProgrammer{

    private static final Scanner input = new Scanner(System.in);
    private static String option = "";

    public static void main(String[] args){
        displayMenu();
        
        while (true) {
            System.out.print("Do you want to start the game? (Y/N) ");
            option = input.nextLine().strip();

            if (option.equalsIgnoreCase("Y") || option.equalsIgnoreCase("YES")) {
                startGame();
                break;
            } else if (option.equalsIgnoreCase("N") || option.equalsIgnoreCase("NO")) {
                System.out.println("Okie dokie Goodbye!");
                break;
            } else {
                System.out.println("Invalid Answer. Please try again.");
            }
        }
    }

    /*
     * Displays the intro of the game and also the setup
     */
    private static void displayMenu(){
        System.out.println(" THE LAST PROGRAMMER ");
        // Design this later 
    }

    /*
     * Starts the game and presents the player with sets of choices 
     */
    private static void startGame(){
        System.out.println("The game has started.");

        // Game Logic and Setup Here 
    }
}