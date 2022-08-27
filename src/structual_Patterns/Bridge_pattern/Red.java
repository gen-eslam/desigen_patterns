package structual_Patterns.Bridge_pattern;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}
