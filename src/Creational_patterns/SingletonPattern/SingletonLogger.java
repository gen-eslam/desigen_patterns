package Creational_patterns.SingletonPattern;
// initialize when you open the program
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
