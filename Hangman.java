import java.util.Arrays;
import java.util.Scanner;
public class Hangman {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scannerObj = new Scanner(System.in);

        // 3 different arrays, 1 for each difficulty
        String[] Easy = {"rock", "hat", "car", "pen", "tree"};
        String[] Medium = {"soccer", "laptop", "circle", "eagle", "doctor"};
        String[] Hard = {"happiness", "cylinder", "dinosaur", "quantitative", "development"};

        // Prints out intro message
        System.out.println("----------------------------");
        System.out.println(" Welcome to HANGMAN");
        System.out.println("----------------------------");
        System.out.println("Please choose a difficulty: \n 1. Easy \n 2. Medium \n 3. Hard");
        System.out.print("Enter here: ");

        // Asks for user input on Difficulty
        int difficulty = scannerObj.nextInt();
        // Generates a random number that chooses one word from the corresponding array
        int randomNumber = (int) (Math.random() * 4) + 1;
        // Initalizing the word of the game
        String word = "";

        // Assigns String word to the word from the array randomly chosen
        if (difficulty == 1) {
            word = Easy[randomNumber];
        } else if (difficulty == 2) {
            word = Medium[randomNumber];
        } else if (difficulty == 3) {
            word = Hard[randomNumber];
        } else {
            System.out.println("Please enter a number 1-3");
        }

        // Initializing player lives
        int playerLives = 5;

        System.out.println("----------------------------");

        // Creates the hidden word to show how many letters are in the word
        char[] hidden = new char[word.length()];
        // A for loop that makes the char[] hidden all dashes
        for (int i = 0; i < hidden.length; i++) {
            hidden[i] = '-';
        }

        // This counter keeps track to how many letters have been correctly guessed
        int counter = 0;

        // While the player still has lives
        while (playerLives > 0) {

            // Draw the board
            draw(playerLives);

            // TAKE OUT
            System.out.println(word);

            // Prints out the hidden word in dashes
            System.out.println("----------------------------");
            System.out.println("The word is: " + Arrays.toString(hidden));
            System.out.println("----------------------------");

            // I ask user for his guess, store it in char userLetter
            System.out.print("Enter a letter: ");
            char userLetter = scannerObj.next().charAt(0);

            // Initialize this boolean
            Boolean correct = false;
            // THis counter keeps track to how many letters have been correctly guessed

            System.out.println();

            // For loop that goes through the game word, sees if the input matches to a letter in the game word
            for (int i = 0; i < word.length(); i++) {
                if (userLetter == word.charAt(i)) {
                    // Updates boolean value, and uncovers the letter
                    System.out.println("Excellent!");
                    correct = true;
                    hidden[i] = word.charAt(i);
                    counter++;
                }
            }


            // If the input doesnt match a letter in the game word, lose a life.
            if (!correct) {
                System.out.println("Ouch! No " + userLetter);
                // If player isnt on there last life, try again
                if (playerLives != 1) {
                    System.out.println("Try Again");
                }
                playerLives--;
            }

            System.out.println("Player lives: " + playerLives);

            System.out.println("----------------------------");
            // If the player has guessed all the correct letters, break the loop
            if (counter == word.length()) {
                break;
            }

        }





        // If game is over print lose message
        if (playerLives == 0) {
            System.out.println("Sorry! You Lose");
            // Else player won. Print win message
        } else {
            System.out.println("YOU WIN!");
        }

    }


// Draws the hangman depending on how many lives the player has
     public static void draw(int playerLives) {
         if (playerLives == 5) {
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     (- -)");
             System.out.println("   | >---|  |---<");
             System.out.println("   |     ---- ");
             System.out.println("   |     |  |");
             System.out.println("   |     |  |");
             System.out.println("   |    ");
             System.out.println("-------");
         } else if (playerLives == 4) {
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     (- -)");
             System.out.println("   | >---|  |---<");
             System.out.println("   |     ---- ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |    ");
             System.out.println("-------");
         } else if (playerLives == 3) {
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     (- -)");
             System.out.println("   | >---|  |");
             System.out.println("   |     ---- ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |    ");
             System.out.println("-------");
         } else if(playerLives == 2){
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     (- -)");
             System.out.println("   |     |  |");
             System.out.println("   |     ---- ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |    ");
             System.out.println("-------");
         } else if(playerLives == 1){
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     (- -)");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |    ");
             System.out.println("-------");
         }  else if(playerLives == 0){
             System.out.println("    ------ ");
             System.out.println("   |      |");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |   ");
             System.out.println("   |     ");
             System.out.println("   |     ");
             System.out.println("   |    ");
             System.out.println("-------");
         }


     }
}






















