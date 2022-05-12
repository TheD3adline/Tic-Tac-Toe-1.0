public class Field {

    private char[][] fields = new char[3][3];
    private final char horLine = '-';
    private final char verLine = '|';

    public Field() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                fields[i][j] = 'o';
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
}
