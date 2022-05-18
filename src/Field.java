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

    public boolean move(char player, char x, char y) {
        int z = Character.getNumericValue(x);
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
        } else if((fields[0][0] == 'o') && (fields[0][1] == 'o') && (fields[0][2] == 'o')) {
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
