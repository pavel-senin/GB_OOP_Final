public class MobilePhone extends Phone implements ToCall{
    private int phoneNumber;
    private String subName;


    @Override
    public void toCallTo(Phone phoneToCall){
        System.out.println("++++++++++++++++++++++++++++++");
        this.status();
        this.showPhone();
        System.out.println("is calling to");
        phoneToCall.status();
        phoneToCall.showPhone();
        System.out.println("++++++++++++++++++++++++++++++");
    };
    @Override
    public void status(){
        System.out.println("Mobile phone");
    }


    @Override
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
        System.out.println("New number is " + this.phoneNumber);
    };
    @Override
    public void setSubName(String subName){
        this.subName = subName;
        System.out.println("New name is " + this.subName);
    };

    @Override
    public void showPhone(){
        System.out.println("Name: "+ this.subName);
        System.out.println("Number: "+ this.phoneNumber);

    }
}
