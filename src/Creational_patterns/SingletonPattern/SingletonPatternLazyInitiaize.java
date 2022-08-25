package Creational_patterns.SingletonPattern;
public class SingletonPatternLazyInitiaize {
    private  SingletonPatternLazyInitiaize(){};
    private static SingletonPatternLazyInitiaize instance =null ;
    public synchronized static SingletonPatternLazyInitiaize getInstance(){
        if(instance==null){
            instance = new SingletonPatternLazyInitiaize();
        }
        return instance;
    };
    public void logMessageStart(){
        System.out.println("Start message is logged");
    }
    public void logMessageStop(){
        System.out.println("Stop message is logged");
    }
}
