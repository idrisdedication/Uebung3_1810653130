public class Aufgabe5VehicleTest {

    public static void main(String[] args){

                                                                                            // Familienwagen
        Vehicle meinAuto = new Vehicle();
        meinAuto.setName("Ford Galaxy");
        meinAuto.setPower(110);
        meinAuto.setWeight(1800);

        System.out.println("Name = " + meinAuto.printName());
        meinAuto.calculatePower();

                                                                                            // Testfahrzeug Burmester
        Vehicle anderesAuto = new Vehicle("Mercedes-AMG G 63", 430, 2550);
        System.out.println("Name = " + anderesAuto.printName());
        anderesAuto.calculatePower();
    }
}
