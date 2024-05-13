
package coffee;

import java.util.HashMap;
import java.util.Map;


public class CoffeeFlavorFactory {
    private final Map<String, Coffee> flavors;

    public CoffeeFlavorFactory() {
        flavors = new HashMap<>();
    }

    public Coffee getCoffeeFlavor(String flavorName) {
        Coffee flavor = flavors.get(flavorName);

        if (flavor == null) {
            flavor = new CoffeeFlavor(flavorName);
            flavors.put(flavorName, flavor);
        }

        return flavor;
    }

    public int getTotalCoffeeFlavors() {
        return flavors.size();
    }
}


