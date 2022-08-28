package structual_Patterns.Filter_pattern;

public class Purse extends Store {
    private Colour colour;

    public Purse(Colour colour){
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}
