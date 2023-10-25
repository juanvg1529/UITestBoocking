package seleniumgluecode;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pom.BookingPage;
import pom.HomePage;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class stepsDef extends TestBase {

    protected String checkIneDay="";
    protected String checkIneMonth="";
    protected String checkIneYear="";
    protected String checkOuteDay="";
    protected String checkOuteMonth="";
    protected String checkOuteYear="";
    @Given("The user enter at booking.com")
    public void the_user_enter_at_booking_com() throws Throwable {

        String titleHomePage= homePage.getTitle();
        Assert.assertNotNull(titleHomePage);
        System.out.println(titleHomePage);

        // Write code here that turns the phrase above into concrete actions

    }

    @When("the user selects the city and the dates to stay")
    public void the_user_selects_the_city_and_the_dates_to_stay(DataTable table)throws Throwable  {
        HomePage homePage = new HomePage(driver);
        BookingPage bookingPage=  homePage.closeAdvertisement(driver);
         Assert.assertNotNull(bookingPage);
        var city=table.row(1);
        bookingPage.setCity(city.get(0));
        bookingPage.clickCalendar();
        var todaysDate=bookingPage.getTodaysDate();
        var threedaysFromTodayDate=bookingPage.getDateFromThreeDaysFromToday();

        if( table.row(1).get(1).equals("today")) {
            checkIneDay= todaysDate.split("-")[0];
            checkIneMonth = todaysDate.split("-")[1];
            checkIneYear = todaysDate.split("-")[2];
        }

        ;

        if( table.row(1).get(2).equals("threeDaysFromToday")) {
            checkOuteDay = threedaysFromTodayDate.split("-")[0];
            checkOuteMonth = threedaysFromTodayDate.split("-")[1];
            checkOuteYear = threedaysFromTodayDate.split("-")[2];
        }



    }

    @When("the user search for the options")
    public void the_user_search_for_the_options()throws Throwable  {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the user checks for availability")
    public void the_user_checks_for_availability(DataTable arg1)throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @When("the user selects the first option of room")
    public void the_user_selects_the_first_option_of_room() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the user reserves the room")
    public void the_user_reserves_the_room() throws Throwable{
        // Write code here that turns the phrase above into concrete actions

    }

    @When("the user provide personal info about the reservation")
    public void the_user_provide_personal_info_about_the_reservation(DataTable arg1)throws Throwable  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @When("the user provide the phone number and the reservation acceptance")
    public void the_user_provide_the_phone_number_and_the_reservation_acceptance(DataTable arg1)throws Throwable  {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @Then("the user confirms that the reservation has done successfully")
    public void the_user_confirms_that_the_reservation_has_done_successfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }


    @Given("The user set up the enviroment")
    public void theUserSetUpTheEnviroment()throws Throwable {
        setup();

    }
}
