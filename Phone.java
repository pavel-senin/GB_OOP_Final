public abstract class Phone{
    private int phoneNumber;
    private String subName;

    public void Phone(String subName, int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.subName = subName;
    }
    public void Phone(String subName) {
        this.phoneNumber = 0;
        this.subName = subName;
    }
    public void Phone(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.subName = "";
    }
    public void Phone() {
        this.phoneNumber = 0;
        this.subName = "";
    }
    public abstract void showPhone();
    public abstract void status();
    public abstract void setPhoneNumber(int phoneNumber);
    public abstract void setSubName(String subName);
}
