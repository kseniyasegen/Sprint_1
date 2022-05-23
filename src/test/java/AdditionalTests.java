import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.MainPage;
import pageobjects.MakeOrderForWhoPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class AdditionalTests {

    MainPage mainPage;

    @Before
    public void start() {
        System.setProperty("selenide.browser", "edge");
        mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        webdriver().driver().getWebDriver().manage().window().maximize();
        mainPage.clickOnMainCookieButton();
    }
    //1) Проверить: если нажать на логотип «Самоката», попадёшь на главную страницу «Самоката».
    @Test
    public void verifyThatClickOnScooterTextOpenMainPage() throws InterruptedException {
        MakeOrderForWhoPage makeOrderForWhoPage = mainPage.clickOnMakeOrderButton();
        MainPage mainPage1 = makeOrderForWhoPage.clickOnScooterText();
        Assert.assertTrue(mainPage1.getTextOnMainPage().contains("Привезём его прямо к вашей двери,"));
    }

    @After
    public void closeDriver() {
        webdriver().driver().getWebDriver().quit();
    }
}
