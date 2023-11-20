package n2exercici1;

public class NationalPhone implements Phone{
    private String phoneNumber;

    @Override
    public String showPhone(){
        return "Phone number: " + this.phoneNumber;
    }


    public NationalPhone(int phoneNumber) {
        this.phoneNumber = "+34" + String.valueOf(phoneNumber);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" + phoneNumber + '}';
    }
}
