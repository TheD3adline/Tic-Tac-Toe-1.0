import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    //this is my tic-tac-toe console app for practice purposes. Humble beginnings...

        Field field = new Field();
        Scanner sc = new Scanner(System.in);
        char player1, player2;

        while(true) {
            System.out.println("Welcome to my little Tic-Tac-Toe console game!");
            if(Math.random() < 0.5) {   //simulates a little coin flip to decide the starting player, wasn't really necessary to do for this but wanted to try it out
                player1 = 'x';
                player2 = 'o';
                System.out.println("The coin flipped heads!");
            } else {
                player1 = 'o';
                player2 = 'x';
                System.out.println("The coin flipped tails!");
            }
            System.out.println("Player " + player1 + " will start the round!");
            while(!field.checkWin()) {  //loops the primary gameplay as long as .checkWin() returns false
                field.print();
                System.out.println("Player " + player1 + ", enter row 1 2 3 for your turn and press enter! Then enter column A B C and press enter again!");
                while(!field.move(player1, sc.next().charAt(0), sc.next().charAt(0)));  //loops player 1 as long as .move() doesn't return true, and it only does so when the player
                if(field.checkWin()) {                                                  //makes a valid move, so only when the nested scanner inputs are of the right type and as asked
                    field.print();                                                      //and only when the player didn't pick an already occupied field
                    System.exit(0);     //this if() calls the method that checks the win condition, prints the winner or if the game is a draw and exits the program
                }
                field.print();
                System.out.println("Player " + player2 + ", enter row 1 2 3 for your turn and press enter! Then enter column A B C and press enter again!");
                while(!field.move(player2, sc.next().charAt(0), sc.next().charAt(0)));  //all the same as above just for player 2
                if(field.checkWin()) {
                    field.print();
                    System.exit(0);
                }
            }
        }
    }
}