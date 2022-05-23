package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MakeOrderAboutRentPage {
    // локатор для поля Про аренду
    @FindBy(how = How.XPATH, using = ".//div[text()='Про аренду']")
    private SelenideElement aboutRent;

    // локатор для поля Когда привезти самокат
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement whenToBringField;

    // локатор для поля Срок аренды
    @FindBy(how = How.XPATH, using = ".//div[@class='Dropdown-root']")
    private SelenideElement perionOfRentField;

    // локатор для поля Срок аренды (выпадающий список)
    @FindBy(how = How.XPATH, using = ".//div[text()='двое суток']")
    private SelenideElement dropdownPerionOfRentField;

    // локатор для поля Цвет самоката (ЧЕРНЫЙ)
    @FindBy(how = How.XPATH, using = ".//input[@id='black']")
    private SelenideElement colorOfScooterField;

    // локатор для поля Комментарий для курьера
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentForTheCourierField;

    // локатор для поля Заказать в форме заказа
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement aboutRentMakeOrderButton;

    //МЕТОДЫ
    //выбор даты в поле whenToBringField
    private void setDateOnWhenToBringField(String a) {
        whenToBringField.setValue(a);
    }

    //ввод комментария в поле commentForTheCourierField
    public void setCommentForTheCourierField(String a) {
        commentForTheCourierField.setValue(a);
    }

    //выбор срока аренды в поле perionOfRentField
    public void setPerionOfRentField() {
        perionOfRentField.click();
    }

    //выбор срока аренды из списка
    public void setDropdownPerionOfRentField() {
        dropdownPerionOfRentField.click();
    }

    //клик на черный цвет самоката
    public void clickСolorOfScooterField() {
        colorOfScooterField.click();
    }

    //клик на кнопку Заказать в форме заказа
    public void clickAboutRentMakeOrderButton() {
        aboutRentMakeOrderButton.click();
    }


    //клик в любую область для смещения фокуса с поля Дата
    public void clickAboutRent() {
        aboutRent.click();
    }

    public MakeOrderDoYouWantToMakeAnOrderPage setOrderFields(String a, String b) {
        setDateOnWhenToBringField(a);
        clickAboutRent();
        setPerionOfRentField();
        setDropdownPerionOfRentField();
        setCommentForTheCourierField(b);
        clickAboutRentMakeOrderButton();
        return page(MakeOrderDoYouWantToMakeAnOrderPage.class);
    }
}
