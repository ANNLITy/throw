import java.util.Arrays;

public class Main {
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
            ClassB driverOne = new ClassB("Антонов Антон Антонович", "", "", "");
            ClassC driverTwo = new ClassC("Андреев Андрей Андреевич", "Имеется", "");
            ClassD driverThree = new ClassD("Алексеев Алексей Алексеевич", "Имеется", "");
            carOne.drive(driverOne);
            carTwo.drive(driverTwo);
            busOne.drive(driverThree);
        } catch (LackOfDrivingLicense e){
            System.out.println("Не имеется водительских прав");

        }















    }

}
