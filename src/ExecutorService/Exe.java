package ExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exe {
   static class A{
        String getMethod(){
            return "A.getMethod";
        }
    }
    static class B{
        String getMethod(){
            return "B.getMethod";
        }
    }

    public static void runSameTime(){
        ExecutorService service = Executors.newFixedThreadPool(2);
        try{
            Future<String> aFuture = service.submit(() -> (new A()).getMethod());
            Future<String> bFuture = service.submit(() -> (new B()).getMethod());

            boolean allDone = false;
            while(!allDone){
                if(aFuture.isDone() && bFuture.isDone()){
                    System.out.println(bFuture.get() + " " + aFuture.get());
                    allDone = true;
                }
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
    }

    public static void main(String[] args) {
        runSameTime();
    }
}
