package structual_Patterns.Filter_pattern;

public class Red implements Colour {
    @Override
    public String toString() {
        return getClass().getName().toLowerCase();
    }
}
