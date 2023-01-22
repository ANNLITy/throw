public class Mechanics {
    public String fio;
    public String company;

    public Mechanics(String fio, String company) {
        this.fio = fio;
        this.company = company;
    }
    public void carryOutMaintenance(){
        System.out.println("Проводит тех. обслуживание");
    }
    public void fixCar(){
        System.out.println("Проводит починку");
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        String basic = "Механик";
        if (fio == null || fio.isEmpty()) {
            this.fio = basic;
        } else {
            this.fio = fio;
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        String basic = "Компания";
        if (company == null || company.isEmpty()) {
            this.company = basic;
        } else {
            this.company = company;
        }
    }

    @Override
    public String toString() {
        return "Mechanics{" +
                "fio='" + fio + '\'' +
                '}';
    }
}
