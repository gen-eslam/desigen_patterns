package structual_Patterns.Filter_pattern;

import java.util.ArrayList;
import java.util.List;

public class BlueFilter implements Filter{

    @Override
    public List<Purse> meetFilter(List<Purse> purses) {
        List<Purse> bluePurses = new ArrayList<>();

        for(Purse purse : purses){
            //change the string >>"structual_patterns.filter_pattern.blue" to >> "blue" when you need this pattern;
            if(purse.getColour().getClass().getName().equalsIgnoreCase("structual_patterns.filter_pattern.blue")){
                bluePurses.add(purse);
            }
        }

        return bluePurses;
    }
}
