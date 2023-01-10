package stepdefinition;

public class RestaurantMenuItem {

    public RestaurantMenuItem(String itemName, String description, int price) {
        ItemName = itemName;
        Description = description;
        Price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public int getPrice() {
        return Price;
    }

    private String ItemName;
    private String Description;
    private int Price;
}
