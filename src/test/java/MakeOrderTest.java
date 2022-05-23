import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.*;
import testdata.OrderDetails;
import testdata.User;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;

public class MakeOrderTest {

    MainPage mainPage;

    @Before
    public void start() {
        System.setProperty("selenide.browser", "edge");
        mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        webdriver().driver().getWebDriver().manage().window().maximize();
        mainPage.clickOnMainCookieButton();
    }

    //тест с данными user1 и orderDetails1
    @Test
    public void verifyThatOrderWasMadeUser1OrderDetails1() throws InterruptedException {
        User user1 = User.getUser1();
        OrderDetails orderDetails1 = OrderDetails.getOrderDetails1();
        MakeOrderForWhoPage makeOrderForWhoPage = mainPage.clickOnMakeOrderButton();
        MakeOrderAboutRentPage makeOrderAboutRentPage = makeOrderForWhoPage.setDataFields(user1.getFirstName(), user1.getSecondName(), user1.getAdress(), user1.getStation(), user1.getPhone());
        MakeOrderDoYouWantToMakeAnOrderPage makeOrderDoYouWantToMakeAnOrder = makeOrderAboutRentPage.setOrderFields(orderDetails1.getDate(), orderDetails1.getComment());
        OrderWasMadePage orderWasMadePage = makeOrderDoYouWantToMakeAnOrder.clickYesButton();
        Assert.assertTrue(orderWasMadePage.getTextOrderWasMade().contains("Заказ оформлен"));
    }

    //тест с данными user2 и orderDetails2
    @Test
    public void verifyThatOrderWasMadeUser2OrderDetails2() throws InterruptedException {
        User user2 = User.getUser2();
        OrderDetails orderDetails2 = OrderDetails.getOrderDetails2();
        MakeOrderForWhoPage makeOrderForWhoPage = mainPage.clickOnMakeOrderButton();
        MakeOrderAboutRentPage makeOrderAboutRentPage = makeOrderForWhoPage.setDataFields(user2.getFirstName(), user2.getSecondName(), user2.getAdress(), user2.getStation(), user2.getPhone());
        MakeOrderDoYouWantToMakeAnOrderPage makeOrderDoYouWantToMakeAnOrder = makeOrderAboutRentPage.setOrderFields(orderDetails2.getDate(), orderDetails2.getComment());
        OrderWasMadePage orderWasMadePage = makeOrderDoYouWantToMakeAnOrder.clickYesButton();
        Assert.assertTrue(orderWasMadePage.getTextOrderWasMade().contains("Заказ оформлен"));
    }

    @After
    public void closeDriver() {
        webdriver().driver().getWebDriver().quit();
    }
}
