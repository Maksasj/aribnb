package aribnb.utils.itemlore_builder;

import java.util.ArrayList;
import java.util.List;

public class ItemAbilitiesLore {
    private static List<String> ability_description = new ArrayList<>();
    private static String abilitie_type;
    public ItemAbilitiesLore(List<String> description, AbilitieLoreType type) {
        ability_description = description;
        abilitie_type = type.toString();
    }

    public List<String> getAbilityDescription() {
        return ability_description;
    }

    public String getAbilityType() {
        return abilitie_type;
    }
}
