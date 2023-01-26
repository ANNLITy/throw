import java.util.*;

public abstract class Transport implements Competing {
    private static final String pitStop="Уходит на Пит-Стоп";
    private static final String bestTime="Достигает лучшее время";
    private static final String maxSpeed="Достигает маскимальной скорости";
    private static String brand;
    private String model;
    private double engineVolume;
    private Set<Mechanics> mechanics;
    private Set<Driver> drivers;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        mechanics = new HashSet<>();
        drivers = new HashSet<>();
    }
    public Set<Driver> getDrivers() {
        return drivers;
    }



    public Set<Mechanics> getMechanics() {
        return mechanics;
    }

      abstract void checkTeam();

    public void getDiagnosed() throws CantCheckException {
        

    }


    public static String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        String basic = "basic";
        if (brand == null || brand.isEmpty()) {
            this.brand = basic;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String basic = "basic";
        if (model == null || model.isEmpty()) {
            this.model = basic;
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public Double setEngineVolume(Double engineVolume) {
        double Default = 1;
        if (engineVolume <=0){
            this.engineVolume = Default;
        }
        return engineVolume;
    }

    public abstract void start();
    public abstract void stop();
    @Override
    public String[] getPitStop() {
        return new String[]{pitStop};
    }

    @Override
    public String[] getBestTime() {
        return new String[]{bestTime};
    }

    @Override
    public String[] getMaxSpeed() {
        return new String[]{maxSpeed};
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
    abstract void printType();

}
