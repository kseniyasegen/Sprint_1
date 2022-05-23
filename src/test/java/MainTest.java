import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pageobjects.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;



public class MainTest {

    MainPage mainPage;

    @Before
    public void start() {
        System.setProperty("selenide.browser", "edge");
        mainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        webdriver().driver().getWebDriver().manage().window().maximize();
        mainPage.scrollDown();
        mainPage.clickOnMainCookieButton();
    }
    //проверка ответа на первый вопрос faq
    @Test
    public void verifyThatFaqFirstQuestionButtonOpenText() throws InterruptedException {
        mainPage.clickOnFaqFirstQuestionButton();
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
                mainPage.getTextResultTapOnFaqFirstQuestionButton());
    }

    //проверка ответа на второй вопрос faq
    @Test
    public void verifyThatFaqSecondQuestionButtonOpenText() {
        mainPage.clickOnFaqSecondQuestionButton();
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
                mainPage.getTextResultTapOnFaqSecondQuestionButton());
    }

    //проверка ответа на третий вопрос faq
    @Test
    public void verifyThatFaqThirthQuestionButtonOpenText() {
        mainPage.clickOnFaqThirdQuestionButton();
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                mainPage.getTextResultTapOnFaqThirdQuestionButton());
    }

    //проверка ответа на четвертый вопрос faq
    @Test
    public void verifyThatFaqFourthQuestionButtonOpenText() {
        mainPage.clickOnFaqFourthQuestionButton();
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
                mainPage.getTextResultTapOnFaqFourthQuestionButton());
    }

    //проверка ответа на пятый вопрос faq
    @Test
    public void verifyThatFaqFifthQuestionButtonOpenText() {
        mainPage.clickOnFaqFifthQuestionButton();
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                mainPage.getTextResultTapOnFaqFifthQuestionButton());
    }

    //проверка ответа на шестой вопрос faq
    @Test
    public void verifyThatFaqSixthQuestionButtonOpenText() {
        mainPage.clickOnFaqSixthQuestionButton();
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
                mainPage.getTextResultTapOnFaqSixthQuestionButton());
    }

    //проверка ответа на седьмой вопрос faq
    @Test
    public void verifyThatFaqSeventhQuestionButtonOpenText() {
        mainPage.clickOnFaqSeventhQuestionButton();
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
                mainPage.getTextResultTapOnFaqSeventhQuestionButton());
    }

    //проверка ответа на восьмой вопрос faq
    @Test
    public void verifyThatFaqEighthQuestionButtonOpenText() {
        mainPage.clickOnFaqEighthQuestionButton();
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                "Да, обязательно. Всем самокатов! И Москве, и Московской области.",
                mainPage.getTextResultTapOnFaqEighthQuestionButton());
    }

    @After
    public void closeDriver() {
        webdriver().driver().getWebDriver().quit();
    }
}
