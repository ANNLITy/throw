public class ClassB extends Driver {
    public String licenseB;

    public String getLicenseB() {
        return licenseB;
    }

    public void setLicenseB(String licenseB) throws LackOfDrivingLicense {
        String Default = "default";
        if (driversLicense == null || driversLicense.equals("")) {
            throw new LackOfDrivingLicense("Отсутствуют водительские права");
        } else {
            this.licenseB = licenseB;
        }
    }

    public ClassB(String fio, String driversLicense, String experience,String licenseB) throws LackOfDrivingLicense {
        super(fio, driversLicense, experience);
        this.licenseB=licenseB;
    }
    @Override
    public void checkLicense() throws LackOfDrivingLicense {
        if (driversLicense == null || driversLicense.equals("")) {
            throw new LackOfDrivingLicense("Отсутствуют водительские права");

        }
    }
}