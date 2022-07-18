public class BonusMilesService {

    public int calculate(int cost) {

        int expenses = 20;
        int bonusMiles = cost / expenses;
        return bonusMiles;
    }
}
