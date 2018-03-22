public class Main {

    public static void main(String[] args) {
        ZESPOLONE Z = new ZESPOLONE(5,10);
        ZESPOLONE Z1 = new ZESPOLONE(3,15);
        ZESPOLONE Z2 = new ZESPOLONE(7,8);

        System.out.println(Z.toString(Z.dodaj(Z1,Z2)));

        System.out.printf(Z.toString(Z));
    }
}
