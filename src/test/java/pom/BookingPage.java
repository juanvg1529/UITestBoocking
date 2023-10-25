package pom;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BookingPage extends BasePage{

    public BookingPage(WebDriver driver){
        super(driver);
    }

    private By cityInput = By.className("eb46370fe1");
    private By calendarInput = By.className("d606c76c5a");

    private By monthAndYearhText= By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3");


  /*  public void DatePicker() throws Exception{
        if( isDisplayed(monthAndYearhText)) {
            var montAndyYear =getText(monthAndYearhText);

            while (montAndyYear.equals())
        }
    }*/

    public void setCity(String text) throws Exception{
        waitUntilElement(cityInput,5);
        isDisplayed(cityInput);
        sendKeys(cityInput,text);

    }
    public void clickCalendar() throws Exception{
        isElementClickable(calendarInput,2);
        click(calendarInput);
    }



    public String getTodaysDate(){
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate= LocalDate.now().format(dateTimeFormatter);
        System.out.println(formatDate);
        return  formatDate;
    }

    public String getDateFromThreeDaysFromToday(){
        LocalDate today = LocalDate.now();
        LocalDate threeDaysFromToday = today.plusDays(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = threeDaysFromToday.format(formatter);
        return formattedDate;
    }








}
