public class Main {

    public static void main(String[] args) {

        BonusMilesService servise = new BonusMilesService();

        int price = 10_000;
        int miles = servise.calculate(price);
        System.out.println(miles);
    }
}
