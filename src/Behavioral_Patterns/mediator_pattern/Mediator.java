package Behavioral_Patterns.mediator_pattern;

public interface Mediator {

    void addColleague(Colleague user);
    void sendMessage(String msg, Colleague user);
}
