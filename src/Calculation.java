public class Calculation {
    static Calculation calc;

    public static void main(String[] args) {
        System.out.println("Calculation");

        calc = new Calculation();
        System.out.println("Add:" + calc.add(2, 3));
    }

    private int add(int x, int y) {
        return x + y;
    }

}
