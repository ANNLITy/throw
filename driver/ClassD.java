public class ClassD extends Driver {
    public String licenseD;

    public String getLicenseD() {
        return licenseD;
    }

    public void setLicenseD(String licenseD) {
        String Default = "default";
        if (licenseD == null || licenseD.equals("")) {
            this.licenseD = Default;
        } else {
            this.licenseD = licenseD;
        }
    }

    public ClassD(String fio, String driversLicense, String experience) throws LackOfDrivingLicense {
        super(fio, driversLicense, experience);
        this.licenseD=licenseD;
    }
}