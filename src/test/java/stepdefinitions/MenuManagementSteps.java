package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefinition.RestaurantMenuItem;

public class MenuManagementSteps {
    RestaurantMenuItem NewMenuItem;
    @Given("i have a menu item with name {string} and price {int}")
    public void i_have_a_menu_item_with_name_and_price(String newMenuItemName, Integer price) {

                NewMenuItem= new RestaurantMenuItem(newMenuItemName,newMenuItemName,price);
                System.out.println("Step 1");
    }

    @When("i add that menu item")
    public void i_add_that_menu_item() {
       LocationMenu.addMenuItem(NewMenuItem);
       System.out.println("Step 2");
    }

    @Then("menu item with name {string} should be added")
    public void menu_item_with_name_should_be_added(String string) {
        boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
        System.out.println("Step 3: " + Exists);
    }

}
