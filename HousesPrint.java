package Week3Discussion;

public class HousesPrint {

    public static void main(String[] args) {
        //instances

        ModernFarmhouse MF = new ModernFarmhouse(2, 4, 4, 3, 3000, "Farm house sink");
        MidcenturyModern MCM = new MidcenturyModern(1, 4, 4, 4, 3200, "Open Concept");

        MF.print();
        MCM.print();
    }
}
