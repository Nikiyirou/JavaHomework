package Java8;

public interface CreditCard {
    String holderName = "";
    String cardNumber = "";
    String cardType = "";
    double accountBalance = 0;
    Boolean isCardAcceptable(String cardType);
    default double payBill(Double Bill){
        return Bill;
    }
    static double refund(double amount){
        return 0.0;
    }
}

class VisaCard implements CreditCard{
    String holderName = "";
    String cardNumber = "";
    String cardType = "";
    double accountBalance = 0;
    public VisaCard(String holderName, String cardNumber, String cardType, double accountBalance){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.accountBalance = accountBalance;
    }

    @Override
    public Boolean isCardAcceptable(String cardType){
        if(cardType == "VisaCard"){
            return true;
        }
        return false;
    }
}

class MasterCard implements CreditCard{
    String holderName = "";
    String cardNumber = "";
    String cardType = "";
    double accountBalance = 0;
    public MasterCard(String holderName, String cardNumber, String cardType, double accountBalance){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.cardType = cardType;
        this.accountBalance = accountBalance;
    }

    @Override
    public Boolean isCardAcceptable(String cardType){
        if(cardType == "MasterCard"){
            return true;
        }
        return false;
    }

}

class Verify{
    public static void main(String[] args) {
        CreditCard cc = new VisaCard("", "", "", 110.0);
        cc.payBill(900.0);
//        cc.refund(12.0);

        CreditCard dd = new MasterCard("", "", "", 123.0);
        dd.payBill(900.0);
//        dd.refund(12.0);
    }
}



