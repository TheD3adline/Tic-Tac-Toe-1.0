import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Field field = new Field();
        Scanner sc = new Scanner(System.in);
        char player1, player2;

        while(true) {
            System.out.println("Welcome to my little Tic-Tac-Toe console game!");
            if(Math.random() < 0.5) {
                player1 = 'x';
                player2 = 'o';
                System.out.println("The coin flipped heads!");
            } else {
                player1 = 'o';
                player2 = 'x';
                System.out.println("The coin flipped tails!");
            }
            System.out.println("Player " + player1 + " will start the round!");
            while(!field.checkWin()) {
                field.print();
                System.out.println("Player " + player1 + ", enter column for your turn and press enter! Then enter row and press enter again!");
                field.move(player1, sc.nextInt(), sc.nextInt());
                if(field.checkWin()) {
                    System.exit(0);
                }
                field.print();
                System.out.println("Player " + player2 + ", enter column for your turn and press enter! Then enter row and press enter again!");
                field.move(player2, sc.nextInt(), sc.nextInt());
                if(field.checkWin()) {
                    System.exit(0);
                }
            }
        }
    }
}