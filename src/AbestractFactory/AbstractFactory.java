package AbestractFactory;

import factory_pattern.Computer;

public abstract class AbstractFactory {
    abstract Computer getComputer(String computerType);
}
