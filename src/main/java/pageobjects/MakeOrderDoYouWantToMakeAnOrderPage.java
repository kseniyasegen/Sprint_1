package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MakeOrderDoYouWantToMakeAnOrderPage {
    // локатор для кнопки Да
    @FindBy(how = How.XPATH,using = ".//div[@class='Order_Modal__YZ-d3']/div[2]/button[2]")
    private SelenideElement yesButton;



    //МЕТОДЫ
    //клик на кнопку Да
    public OrderWasMadePage clickYesButton() {
        yesButton.click();
        return page(OrderWasMadePage.class);
    }

}
