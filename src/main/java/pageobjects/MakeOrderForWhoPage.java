package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.page;

public class MakeOrderForWhoPage {
    // локатор для поля Имя
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Имя']")
    private SelenideElement firstNameField;

    // локатор для поля Фамилия
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Фамилия']")
    private SelenideElement secondNameField;

    // локатор для поля Адрес
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement adressField;

    // локатор для поля Станция метро
    @FindBy(how = How.XPATH, using = "//input[@class='select-search__input']")
    private SelenideElement metroStationField;

    // локатор для поля Телефон
    @FindBy(how = How.XPATH, using = ".//input[@placeholder='* Телефон: на него позвонит курьер']")
    public SelenideElement phoneField;

    // локатор для кнопки Далее
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    public SelenideElement nextButton;

    // локатор для названия станции метро
    @FindBy(how = How.XPATH, using = ".//input[@value='Маяковская']")
    public SelenideElement firstMetroStation;

    // локатор Самокат
    @FindBy(how = How.XPATH, using = ".//a[@class='Header_LogoScooter__3lsAR']")
    public SelenideElement scooterText;

    //МЕТОДЫ
    //ввод имени в поле firstNameField
    public void setFirstName(String a) {
        firstNameField.setValue(a);
    }

    //ввод фамилии в поле secondNameField
    public void setSecondNameField(String a) {
        secondNameField.setValue(a);
    }

    //ввод адреса в поле adressField
    public void setAdressField(String a) {
        adressField.setValue(a);
    }

    //ввод телефона в поле phoneField
    public void setPhoneField(String a) {
        phoneField.setValue(a);
    }

    // ввод текста в поле Станция метро
    public void setMetroStationField(String a) {
        metroStationField.setValue(a);
        metroStationField.sendKeys(Keys.ARROW_DOWN);
        metroStationField.sendKeys(Keys.ENTER);
    }

    //метод для ввода всех текстовых данных на странице: имени, фамилии, адреса, телефона, станции метро
    public MakeOrderAboutRentPage setDataFields(String a, String b, String c, String d, String e) {
        setFirstName(a);
        setSecondNameField(b);
        setAdressField(c);
        setMetroStationField(d);
        setPhoneField(e);
        clickOnNextButton();
        return page(MakeOrderAboutRentPage.class);
    }

    // клик на кнопку Далее
    public void clickOnNextButton() {
        nextButton.click();
    }

    //клик на текст Самокат
    public MainPage clickOnScooterText() {
        scooterText.click();
        return page(MainPage.class);
    }
}
