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

    public void move(char player, int x, char y) {
        if((x == 1) || (x == 2) || (x == 3)) {
            if((y == 'A') || (y == 'a')) {
                if(this.fields[x - 1][0] == ' ') {
                    this.fields[x - 1][0] = player;
                } else {
                    System.out.println("Error: Field already occupied!");
                }
            } else if((y == 'B') || (y == 'b')) {
                if(this.fields[x - 1][1] == ' ') {
                    this.fields[x - 1][1] = player;
                } else {
                    System.out.println("Error: Field already occupied!");
                }
            } else if((y == 'C') || (y == 'c')) {
                if(this.fields[x - 1][2] == ' ') {
                    this.fields[x - 1][2] = player;
                } else {
                    System.out.println("Error: Field already occupied!");
                }
            } else {
                System.out.println("Error: Invalid input!");
            }
        } else {
            System.out.println("Error: Invalid input!");
        }
    }

    public boolean checkWin() {
        if((fields[0][0] == 'x') && (fields[0][1] == 'x') && (fields[0][2] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[1][0] == 'x') && (fields[1][1] == 'x') && (fields[1][2] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[2][0] == 'x') && (fields[2][1] == 'x') && (fields[2][2] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'x') && (fields[1][0] == 'x') && (fields[2][0] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][1] == 'x') && (fields[1][1] == 'x') && (fields[2][1] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][2] == 'x') && (fields[1][2] == 'x') && (fields[2][2] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'x') && (fields[1][1] == 'x') && (fields[2][2] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][2] == 'x') && (fields[1][1] == 'x') && (fields[2][0] == 'x')) {
            System.out.println("Congratulations Player x, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[0][1] == 'o') && (fields[0][2] == '0')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[1][0] == 'o') && (fields[1][1] == 'o') && (fields[1][2] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[2][0] == 'o') && (fields[2][1] == 'o') && (fields[2][2] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[1][0] == 'o') && (fields[2][0] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][1] == 'o') && (fields[1][1] == 'o') && (fields[2][1] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][2] == 'o') && (fields[1][2] == 'o') && (fields[2][2] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][0] == 'o') && (fields[1][1] == 'o') && (fields[2][2] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        } else if((fields[0][2] == 'o') && (fields[1][1] == 'o') && (fields[2][0] == 'o')) {
            System.out.println("Congratulations Player o, you have won the game!");
            return true;
        }
        return false;
    }
}
