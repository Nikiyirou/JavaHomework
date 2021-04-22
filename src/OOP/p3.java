package OOP;

public class p3 {
    public p3(){
        System.out.println("this is constructor");
    }
    public void methodOne(){
        System.out.println("This is methodOne");
    }

    //overload
    public void methodOne(String methodName){
        System.out.println("This is " + methodName);
    }
}

class nextClass extends p3{
    public nextClass(){
        System.out.println("This is NextClassConstructor");
    }

    @Override
    public void methodOne(String methodName) {
        System.out.println("This is " + methodName);
    }
}
