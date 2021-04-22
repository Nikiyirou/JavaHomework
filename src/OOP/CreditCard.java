package OOP;

public abstract class CreditCard {
    String holderName;
    String cardNumber;
    double accountBalance;
    String cardType;
    public abstract Boolean isCardAcceptable(String cardType);

    void payBill(double bill){
        accountBalance -= bill;
    }
}

class VisaCard extends CreditCard{
    public VisaCard(String holderName, String cardNumber, int accountBalance, String cardType){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    public Boolean isCardAcceptable(String cardType){
        return cardType == "VisaCard";
    }
}

class MasterCard extends CreditCard{
    public MasterCard(String holderName, String cardNumber, int accountBalance, String cardType){
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    public Boolean isCardAcceptable(String cardType){
        return cardType == "MasterCard";
    }
}


