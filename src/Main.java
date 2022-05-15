public class Main {
    public static void main(String[] args) {

        Field field = new Field();

        field.print();

        System.out.println();

        field.move('x', 0, 0);

        field.print();

        System.out.println();

        field.move('x', 1, 0);

        field.print();

        System.out.println();

        field.move('x', 2, 0);

        field.print();

        System.out.println();

        field.move('o', 0, 2);

        field.print();

        System.out.println();

        field.move('o', 1, 2);

        field.print();

        System.out.println();

        field.move('o', 2, 2);

        field.print();

        System.out.println();
    }
}