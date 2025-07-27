public class Main {
    public static void main(String[] args) {
        WheeledRobot somsak = new WheeledRobot("Somsak", 2, 0.2);
        somsak.moveForward(1);
        somsak.rotate(90);
        somsak.moveForward(3);
        WheeledRobot somsri = new WheeledRobot("Somsri", 2, 0.1);
        somsri.moveForward(2);
        somsri.rotate(90);
        somsri.moveForward(6);
        Robot monkol = new Robot("Monkol");
        monkol.moveForward(4);
        monkol.rotate(90);
        monkol.moveForward(4);
// your path for Monkol
// Output results
        System.out.println(somsak.getLocation());
        System.out.printf("Wear level: %.2f\n\n", somsak.getWearLevel());
        System.out.println(somsri.getLocation());
        System.out.printf("Wear level: %.2f\n\n", somsri.getWearLevel());
        System.out.println(monkol.getLocation());
}
}