import java.util.*;

public class Main {
    public static ArrayList<Transport> cars = new ArrayList<>();

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
            ClassB driverFour = new ClassB("Антонов Антон Антонович","Имеется", "","");
            Mechanics mechanicOne = new Mechanics("Андрей Андреевич","СтройАвто");
            Mechanics mechanicTwo = new Mechanics("Антон Антонович","Shell");
            Mechanics mechanicThree = new Mechanics("Андрей Андреевич","СтройАвто");
            carOne.drive(driverOne);
            carTwo.drive(driverTwo);
            busOne.drive(driverThree);
            cars.add(carOne);
            cars.add(carTwo);
            cars.add(busOne);
            carOne.getDrivers().add(driverOne);
            carOne.getDrivers().add(driverFour);
            System.out.println(carOne.getDrivers());
            HashMap<Transport,Mechanics> map = new HashMap<>();
            map.put(carOne,mechanicOne);
            map.put(carOne,mechanicTwo);
            map.put(carOne,mechanicThree);
            System.out.println(map.get(carOne));







        } catch (LackOfDrivingLicense e){
            System.out.println("Не имеется водительских прав");



        }
















    }

}
