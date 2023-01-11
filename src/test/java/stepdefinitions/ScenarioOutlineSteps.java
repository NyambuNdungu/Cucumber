package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ScenarioOutlineSteps {

    Integer InitialBillAmount;
    Double TaxRate;

    @Given("I have a customer")
    public void i_have_a_customer() {

    }

    @Given("user enters initial bill amount as {int}")
    public void user_enters_initial_bill_amount_as(Integer initialBillAmount) {
        this.InitialBillAmount = initialBillAmount;
    }

//    @Given("Sales Tax Rate is {int} Percent")
//    public void sales_tax_rate_is_percent(Integer taxRate) {
//        this.TaxRate = Double.valueOf(taxRate);
//        System.out.println("Tax Rate: " + taxRate);
//    }

//    @Then("final bill amount calculate is {int}")
//    public void final_bill_amount_calculate_is(Integer expectedValue) {
//        double SystemCalcValue =
//                BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
//        System.out.println("Expected Value: " + expectedValue);
//        System.out.println("System Calculated Value: " + SystemCalcValue);
////        assertTrue(expectedValue==SystemCalcValue);
//    }
    @Given("Sales Tax Rate is {double} Percent")
    public void sales_tax_rate_is_percent(Double taxRate) {
        this.TaxRate = taxRate;
        System.out.println("Tax Rate: " + taxRate);
    }

    @Then("final bill amount calculate is {double}")
    public void final_bill_amount_calculate_is(Double expectedValue) {
        double SystemCalcValue =
                BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount, this.TaxRate);
        System.out.println("Expected Value: " + expectedValue);
        System.out.println("System Calculated Value: " + SystemCalcValue);
//        assertTrue(expectedValue==SystemCalcValue);
    }


    }

