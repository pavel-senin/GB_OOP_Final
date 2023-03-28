public class LandlinePhone extends Phone implements ToCall{
    private int phoneNumber;
    private String subName;


    @Override
    public void toCallTo(Phone phoneToCall){
        System.out.println("++++++++++++++++++++++++++++++");
        this.status();
        this.showPhone();
        System.out.println("Calling to");
        phoneToCall.status();
        phoneToCall.showPhone();
        System.out.println("++++++++++++++++++++++++++++++");
    };
    @Override
    public void status(){
        System.out.println("Landline phone");
    }


    @Override
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    };
    @Override
    public void setSubName(String subName){
        this.subName = subName;
    };
    @Override
    public void showPhone(){
        System.out.println("Name: "+ this.subName);
        System.out.println("Number: "+ this.phoneNumber);

    }
}
