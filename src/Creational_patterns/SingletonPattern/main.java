package Creational_patterns.SingletonPattern;

public class main {
    public static void main(String[] args)
    {
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();

    }
}
