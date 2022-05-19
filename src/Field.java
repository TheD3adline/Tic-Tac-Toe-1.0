public class Field {

    private char[][] fields = new char[3][3];

    public Field() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                fields[i][j] = ' ';
            }
        }
    }

    public void print() {
        System.out.println("  A B C");
        System.out.println("1 " + fields[0][0] + "|" + fields[0][1] + "|" + fields[0][2]);
        System.out.println("  -----");
        System.out.println("2 " + fields[1][0] + "|" + fields[1][1] + "|" + fields[1][2]);
        System.out.println("  -----");
        System.out.println("3 " + fields[2][0] + "|" + fields[2][1] + "|" + fields[2][2]);
    }

    public boolean move(char player, char x, char y) {      //method for the players to make a move in the field, returns a boolean to end the input loop of the current
        int z = Character.getNumericValue(x);               //player when a valid input and compliant turn was made.
        if((z == 1) || (z == 2) || (z == 3)) {
            if((y == 'A') || (y == 'a')) {
                if(this.fields[z - 1][0] == ' ') {
                    this.fields[z - 1][0] = player;
                    return true;
                } else {
                    System.out.println("Error: Field already occupied!");
                    return false;
                }
            } else if((y == 'B') || (y == 'b')) {
                if(this.fields[z - 1][1] == ' ') {
                    this.fields[z - 1][1] = player;
                    return true;
                } else {
                    System.out.println("Error: Field already occupied!");
                    return false;
                }
            } else if((y == 'C') || (y == 'c')) {
                if(this.fields[z - 1][2] == ' ') {
                    this.fields[z - 1][2] = player;
                    return true;
                } else {
                    System.out.println("Error: Field already occupied!");
                    return false;
                }
            } else {
                System.out.println("Error: Invalid input!");
                return false;
            }
        } else {
            System.out.println("Error: Invalid input!");
            return false;
        }
    }

    public boolean checkWin() {     //method to check for the win condition after each turn, not entirely happy with it, but it is what it is now
        if((fields[0][0] == 'x') && (fields[0][1] == 'x') && (fields[0][2] == 'x')) {
            fields[0][0] = 'X'; fields[0][1] = 'X'; fields[0][2] = 'X';     //highlights the winning line, prints the winner and returns true to end the main gameplay loop
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[1][0] == 'x') && (fields[1][1] == 'x') && (fields[1][2] == 'x')) {
            fields[1][0] = 'X'; fields[1][1] = 'X'; fields[1][2] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[2][0] == 'x') && (fields[2][1] == 'x') && (fields[2][2] == 'x')) {
            fields[2][0] = 'X'; fields[2][1] = 'X'; fields[2][2] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'x') && (fields[1][0] == 'x') && (fields[2][0] == 'x')) {
            fields[0][0] = 'X'; fields[1][0] = 'X'; fields[2][0] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][1] == 'x') && (fields[1][1] == 'x') && (fields[2][1] == 'x')) {
            fields[0][1] = 'X'; fields[1][1] = 'X'; fields[2][1] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][2] == 'x') && (fields[1][2] == 'x') && (fields[2][2] == 'x')) {
            fields[0][2] = 'X'; fields[1][2] = 'X'; fields[2][2] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'x') && (fields[1][1] == 'x') && (fields[2][2] == 'x')) {
            fields[0][0] = 'X'; fields[1][1] = 'X'; fields[2][2] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][2] == 'x') && (fields[1][1] == 'x') && (fields[2][0] == 'x')) {
            fields[0][2] = 'X'; fields[1][1] = 'X'; fields[2][0] = 'X';
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[0][1] == 'o') && (fields[0][2] == 'o')) {
            fields[0][0] = 'O'; fields[0][1] = 'O'; fields[0][2] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[1][0] == 'o') && (fields[1][1] == 'o') && (fields[1][2] == 'o')) {
            fields[1][0] = 'O'; fields[1][1] = 'O'; fields[1][2] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[2][0] == 'o') && (fields[2][1] == 'o') && (fields[2][2] == 'o')) {
            fields[2][0] = 'O'; fields[2][1] = 'O'; fields[2][2] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[1][0] == 'o') && (fields[2][0] == 'o')) {
            fields[0][0] = 'O'; fields[1][0] = 'O'; fields[2][0] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][1] == 'o') && (fields[1][1] == 'o') && (fields[2][1] == 'o')) {
            fields[0][1] = 'O'; fields[1][1] = 'O'; fields[2][1] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][2] == 'o') && (fields[1][2] == 'o') && (fields[2][2] == 'o')) {
            fields[0][2] = 'O'; fields[1][2] = 'O'; fields[2][2] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[1][1] == 'o') && (fields[2][2] == 'o')) {
            fields[0][0] = 'O'; fields[1][1] = 'O'; fields[2][2] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][2] == 'o') && (fields[1][1] == 'o') && (fields[2][0] == 'o')) {
            fields[0][2] = 'O'; fields[1][1] = 'O'; fields[2][0] = 'O';
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        }  else if((fields[0][0] != ' ') && (fields[0][1] != ' ') && (fields[0][2] != ' ') && (fields[1][0] != ' ') && (fields[1][1] != ' ') && (fields[1][2] != ' ') && (fields[2][0] != ' ') && (fields[2][1] != ' ') && (fields[2][2] != ' ')) {
            System.out.println("The game is a draw!");      //also checks if all fields have been occupied by the players without having a winning line and then calls a draw
            return true;
        }
        return false;
    }
}
