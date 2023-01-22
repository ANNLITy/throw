import java.util.ArrayList;

public abstract class Driver {
    public String fio;
    public String driversLicense;
    public String experience;

    @Override
    public String toString() {
        return "Водитель " + fio+
                " "+ "Наличие водительких прав: "+ driversLicense+ " ";
    }

    public Driver(String fio, String driversLicense, String experience) throws LackOfDrivingLicense {
        this.fio = fio;
        if (driversLicense == null || driversLicense.isEmpty()) {
            throw new LackOfDrivingLicense("Отсутствуют водительские права");
        } else {
            this.driversLicense = driversLicense;
        }
        this.experience = experience;

    }
    public void checkLicense() throws LackOfDrivingLicense{

    }
    public void start() {
        System.out.println("Начинает движение");

    }
    public void stop(){
        System.out.println("Останавливает автомобиль");

    }
    public void refuel(){
        System.out.println("Заправляет автомобиль");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        String Default = "default";
        if (fio == null || fio.equals("")) {
            this.fio = Default;
        } else {
            this.fio = fio;
        }
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public void setDriversLicense(String driversLicense) throws LackOfDrivingLicense  {
        if (driversLicense == null || driversLicense.isEmpty()) {
            throw new LackOfDrivingLicense("Отсутствуют водительские права");
        } else {
            this.driversLicense = driversLicense;
        }
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        String Default = "default";
        if (experience == null || experience.equals("")) {
            this.experience = Default;
        } else {
            this.experience = experience;
        }
    }
}
