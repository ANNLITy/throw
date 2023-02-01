public class HeavyCar<A extends ClassC> extends Transport implements Competing{
    ;
    private String body;
    private String transmission;
    private int number;
    private int places;

    Type сapacity;

    public HeavyCar(String brand, String model, double engineVolume, String body, String transmission, int number, int places, Type сapacity) {
        super(brand, model, engineVolume);
        this.body = body;
        this.transmission = transmission;
        this.number = number;
        this.places = places;
        this.сapacity = сapacity;
    }

    @Override
    void checkTeam() {

    }

    @Override
    public void getDiagnosed() {

    }

    @Override
    public String toString() {
        return "HeavyCar{"+" "+ сapacity;
    }



    public enum Type {
        N1("Грузоподъемность: до 3,5 тонн "),
        N2("Грузоподъемность: от 3,5 до 12 тонн"),
        N3("Грузоподъемность: свыше 12 тонн");
        private String type;

        Type(String type) {
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
            return type + "}";
        }
    }




    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        String Default = "default";
        if (body == null || body.equals("")) {
            this.body = Default;
        } else {
            this.body = body;
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
    public void drive(A classC){
        System.out.println(classC+" управляет грузовым автомобилем"+ getModel()+ "и будет участвовать в заезде");

    }

    @Override
    public void start() {
        System.out.println("Начинает движение");

    }

    @Override
    public void stop() {
        System.out.println("Делает остановку");

    }



}
