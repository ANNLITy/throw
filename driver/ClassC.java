public class ClassC extends Driver{
    public String licenseC;

    public ClassC(String fio, String driversLicense, String experience) throws LackOfDrivingLicense {
        super(fio, driversLicense, experience);
    }

    public String getLicenseC() {
        return licenseC;
    }

    public void setLicenseC(String licenseC) {
        String basic = "basic";
        if (licenseC == null || licenseC.isEmpty()) {
            this.licenseC = basic;
        } else {
            this.licenseC = licenseC;
        };
    }

}
