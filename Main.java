public class Main {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone();
        LandlinePhone llp = new LandlinePhone();
        mp.setPhoneNumber(7589);
        mp.showPhone();
        mp.setSubName("Max");
        mp.showPhone();
        mp.status();
        llp.setPhoneNumber(8800);
        llp.showPhone();
        llp.setSubName("Alex");
        llp.showPhone();
        llp.status();
        llp.toCallTo(mp);
    }
}