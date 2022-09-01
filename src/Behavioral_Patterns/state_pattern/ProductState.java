package Behavioral_Patterns.state_pattern;

public interface ProductState {
    void next(Product prod);
    void previous(Product prod);
}
