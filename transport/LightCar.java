import java.util.ArrayList;

public class LightCar<L extends ClassB> extends Transport implements Competing {

    private String transmission;
    private int number;
    private int places;


    static Body body;

    public LightCar(String brand, String model, double engineVolume, String transmission, int number, int places, Body body) {
        super(brand, model, engineVolume);

        this.transmission = transmission;
        this.number = number;
        this.places = places;
        this.body = body;

    }

    @Override
    void checkTeam() {
        System.out.println();

    }

    @Override
    public void getDiagnosed() {


    }

    @Override
    public String toString() {
        return "LightCar{" +" " +body+
                '}';
    }


    static enum Body{
        SEDAN("Седан"),HETCHBACK("Хэтчбэк"),CUPE("Купе"),UNIVERSAL("Универсал"),
        OFFROAD("Внедорожник"),CROSS("Кроссовер"),WAGGON("Пикап"),VAN("Фургон"),MINIVAN("Минивэн");
        private String type;

        Body(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            String basic = "Данных по транспортному средству недостаточно";
            if (type == null || type.isEmpty()) {
                this.type = basic;
            } else {
                this.type = type;
            }
        }

        @Override
        public String toString() {
            return " Кузов=" +" " +type + '\'' ;
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        String Default = "default";
        if (transmission == null || transmission.equals("")) {
            this.transmission = Default;
        } else {
            this.transmission = transmission;
        }
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        int Default = 1;
        if (number <=0){
            this.number = Default;
        }
        return number;
    }

    public int getPlaces() {
        return places;
    }

    public int setPlaces(int places) {
        int Default = 1;
        if (places <=0){
            this.places = Default;
        }
        return places;
    }
    public void drive(L classB){
        System.out.println(classB+" управляет лёгковым автомобилем"+ getModel()+ "и будет участвовать в заезде");
    }

    @Override
    public void start() {


    }

    @Override
    public void stop() {
        System.out.println("Делает остановку");


    }



}
