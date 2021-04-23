package ExceptionHandling;

public class ExceptionHandler {
    public void handleException(String cardType, String address){
        try {
            if (cardType == "AMEX") {
                throw new CardTypeException("AMEX found");
            }
            if (address != "US") {
                throw new AddressException("Outside US");
            }
        } catch (CardTypeException e) {
            System.out.println("CardTypeException: " + e.getMessage());
        } catch (AddressException e) {
            System.out.println("AddressException: " + e.getMessage());
        }
    }
}

class CardTypeException extends Exception{
    CardTypeException(String msg) {
        super(msg);
    }
}

class AddressException extends Exception{
    AddressException(String msg) {
        super(msg);
    }
}
