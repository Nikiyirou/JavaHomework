package DesignPattern;

public class AppleDesignerFactory {
    private static AppleDesignerFactory instance;
    private AppleDesignerFactory(){};
    public static synchronized AppleDesignerFactory getInstance(){
        if(instance == null){
            instance = new AppleDesignerFactory();
        }
        return instance;
    }

    @Override
    protected AppleDesignerFactory clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    protected AppleDesignerFactory readResolve(){
        return getInstance();
    }
}
