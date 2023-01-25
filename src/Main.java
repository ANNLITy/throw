import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static ArrayList<Transport> cars = new ArrayList<>();
   public static Set<Driver> drivers = new HashSet<>();
    public static void main(String[] args) throws LackOfDrivingLicense, CantCheckException {
        try {
            Bus busOne = new Bus("", " M6 ", 1, 2, 3, "", 2, Bus.Places.AVERAGE);
            System.out.println(busOne);
            System.out.println(Arrays.toString(busOne.getPitStop()));
            LightCar carOne = new LightCar(" ", " x6 ", 2, "", 2, 2, LightCar.Body.SEDAN);
            System.out.println(carOne);
            System.out.println(Arrays.toString(carOne.getBestTime()));
            HeavyCar carTwo = new HeavyCar("", " A6 ", 3, "", "", 2, 2, HeavyCar.Type.N1);
            System.out.println(carTwo);
            System.out.println(Arrays.toString(carTwo.getMaxSpeed()));
            ClassB driverOne = new ClassB("Антонов Антон Антонович", "Имеется", "", "");
            ClassC driverTwo = new ClassC("Андреев Андрей Андреевич", "Имеется", "");
            ClassD driverThree = new ClassD("Алексеев Алексей Алексеевич", "Имеется", "");
            Mechanics mechanicOne = new Mechanics("Андрей Андреевич","СтройАвто");
            Mechanics mechanicTwo = new Mechanics("Антон Антонович","Shell");
            carOne.drive(driverOne);
            carTwo.drive(driverTwo);
            busOne.drive(driverThree);
            cars.add(carOne);
            cars.add(carTwo);
            cars.add(busOne);
            drivers.add(driverOne);
            drivers.add(driverTwo);
            drivers.add(driverThree);
            drivers.add(driverOne);
            drivers.add(driverTwo);
            drivers.add(driverThree);
            carOne.getMechanics().add(mechanicOne);
            carOne.getMechanics().add(mechanicTwo);
            System.out.println(drivers);




        } catch (LackOfDrivingLicense e){
            System.out.println("Не имеется водительских прав");



        }
















    }

}
