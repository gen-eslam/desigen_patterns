package Creational_patterns.SingletonPattern;

public class SingletonLogger {
    private static SingletonLogger instance = new SingletonLogger();
    private SingletonLogger(){}
// synchronized ==>>for multithreaded
    public static synchronized SingletonLogger getInstance() {
        return instance;
    }
    public void logMessageStart(){
        System.out.println("Start message is logged");
    }
    public void logMessageStop(){
        System.out.println("Stop message is logged");
    }
}
/*      lazy initialize
* //=>>>>> "memory efficient"
*
*   private static SingletonLogger instance;
*   public static synchronized  SingletonLogger getInstance() {
*        if(instance ==null){
*             instance = new SingletonLogger();
*           }
        return instance;
         }
         public void logMessageStart(){
        System.out.println("Start message is logged");
    }
    public void logMessageStop(){
        System.out.println("Stop message is logged");
    }
*
*
*
*
*
*
*
*
*
*
*
*
*
*
* */