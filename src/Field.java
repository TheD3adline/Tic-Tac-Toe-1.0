public class Field {

    private char[][] fields = new char[3][3];
    private final char horLine = '-';
    private final char verLine = '|';

    public Field() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                fields[i][j] = ' ';
            }
        }
    }

    public void print() {
        System.out.println(fields[0][0] + "" + verLine + "" + fields[0][1] + "" + verLine + "" + fields[0][2]);
        System.out.println(horLine + "" + horLine + "" + horLine + "" + horLine + "" + horLine);
        System.out.println(fields[1][0] + "" + verLine + "" + fields[1][1] + "" + verLine + "" + fields[1][2]);
        System.out.println(horLine + "" + horLine + "" + horLine + "" + horLine + "" + horLine);
        System.out.println(fields[2][0] + "" + verLine + "" + fields[2][1] + "" + verLine + "" + fields[2][2]);
    }

    public void move(char player, int y, int x) {
        if(this.fields[y][x] == ' ') {
            this.fields[y][x] = player;
        } else {
            System.out.println("Error: Field already occupied!");
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

    public char[][] getFields() {
        return fields;
    }

    public void setFields(char[][] fields) {
        this.fields = fields;
    }
}
