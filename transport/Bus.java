public class Bus<B extends ClassD> extends Transport implements Competing {


    private int doors;
    private int route;
    private String emergencyExit;
    private int standingPlaces;

    public int getStandingPlaces() {
        return standingPlaces;
    }

    public int setStandingPlaces(int standingPlaces) {
        int Default = 1;
        if (standingPlaces <= 0) {
            this.standingPlaces = Default;
        }
        return standingPlaces;
    }

    public int getDoors() {
        return doors;
    }

    public int setDoors(int doors) {
        int Default = 1;
        if (doors <= 0) {
            this.doors = Default;
        }
        return doors;
    }

    public int getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = Integer.parseInt(route);
    }

    public String getEmergencyExit() {
        return emergencyExit;
    }

    public void setEmergencyExit(String emergencyExit) {
        String Default = "default";
        if (emergencyExit == null || emergencyExit.equals("")) {
            this.emergencyExit = Default;
        } else {
            this.emergencyExit = emergencyExit;
        }
    }

    Places places;

    public Bus(String brand, String model, double engineVolume, int doors, int route, String emergencyExit, int standingPlaces, Places places) {
        super(brand, model, engineVolume);
        this.doors = doors;
        this.route = route;
        this.emergencyExit = emergencyExit;
        this.standingPlaces = standingPlaces;
        this.places = places;


    }
    @Override
    public void getDiagnosed() throws CantCheckException {
        throw new CantCheckException("Автобусы не могут проходить диагностику");

    }

    @Override
    public String toString() {
        return "Bus{" + " " + places;
    }

    @Override
    void printType() {
        System.out.println();

    }

    public enum Places {
        ESPECIALlYSMALL("до 10 мест"),
        SMALL("до 25 мест"),
        AVERAGE("40-50 мест"),
        LARGE("60-80 мест"),
        ESPECIALLYLARGE("100-120 мест");

        private String type;

        Places(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            String Default = "Данных по транспортному средству недостаточно";
            if (type == null || type.equals("")) {
                this.type = Default;
            } else {
                this.type = type;
            }
        }


        @Override
        public String toString() {

            return type + "}";
        }
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
    public void drive(B classD){
        System.out.println(classD+" управляет автобусом"+ getModel()+ "и будет участвовать в заезде");
    }


}
