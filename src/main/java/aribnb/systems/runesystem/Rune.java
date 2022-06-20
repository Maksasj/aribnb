package aribnb.systems.runesystem;

import java.util.List;

public class Rune {
    private Integer lvl;
    private Integer max_lvl;

    public Rune(Integer _lvl, Integer _max_lvl) {
        lvl = _lvl;
        max_lvl = _max_lvl;
    }

    public Integer getLvl() {
        return lvl;
    }

    public void setLvl(Integer value) {
        lvl = value;
    }

    public void setMaxLvl(Integer value) {
        max_lvl = value;
    }

    public List<String> getDescription(Integer lvl) {
        return null;
    }
}
