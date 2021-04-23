package DesignPattern;

public class CurrencyExchange {
    double currenncyRatio;
    public double CurrencyRatio(){
        return currenncyRatio;
    }
}

class China extends CurrencyExchange{
    double currenncyRatio = 6.49;
    public double CurrencyRatio() {
        // aslkdfhakjsdhfl;kah
        return super.CurrencyRatio();
    }
}

class Thailand extends CurrencyExchange{
    double currenncyRatio = 31.39;
}

class Japan extends CurrencyExchange{
    double currenncyRatio = 107.95;
}

//factory class
class CurrencyFactory{
    public static CurrencyExchange change(String countryName){
        if("China".equals(countryName)){
            CurrencyExchange ChinaCurr = new China();
            return ChinaCurr;
        }
        if("Thailand".equals(countryName)){
            CurrencyExchange ThailandCurr = new Thailand();
            return ThailandCurr;
        }
        if("Japan".equals(countryName)){
            CurrencyExchange JapanCurr = new Japan();
            return JapanCurr;
        }
        return null;
    }
}