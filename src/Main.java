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
                System.out.println("Player " + player1 + ", enter row 1 2 3 for your turn and press enter! Then enter column A B C and press enter again!");
                do {
                    if(field.checkWin()) {
                        field.print();
                        System.exit(0);
                    }
                } while(!field.move(player1, sc.nextInt(), sc.next().charAt(0)));
                field.print();
                System.out.println("Player " + player2 + ", enter row 1 2 3 for your turn and press enter! Then enter column A B C and press enter again!");
                do {
                    if(field.checkWin()) {
                        field.print();
                        System.exit(0);
                    }
                } while(!field.move(player2, sc.nextInt(), sc.next().charAt(0)));
            }
        }
    }
}