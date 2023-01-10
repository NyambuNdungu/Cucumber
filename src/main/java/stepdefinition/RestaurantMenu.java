package stepdefinition;

import java.util.ArrayList;

public class RestaurantMenu implements RestaurantMenuI {

    ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();

    @Override
    public boolean addMenuItem(RestaurantMenuItem newMenuItem) throws IllegalArgumentException {
        return MenuItems.add(newMenuItem);

    }

    public boolean DoesItemExist (RestaurantMenuItem newMenuItem){
        boolean Exists = false;
        if (MenuItems.contains(newMenuItem)){
            Exists = true;
        }
        return Exists;
    }
}
