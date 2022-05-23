package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;


public class MainPage {

    // локатор кнопки принятия куки Да все привыкли
    @FindBy(how = How.CLASS_NAME, using = "App_CookieButton__3cvqF")
    private SelenideElement mainCookieButton;

    // локатор лого Яндекс
    @FindBy(how = How.CLASS_NAME, using = "Header_LogoYandex__3TSOI")
    private SelenideElement mainLogoIcon;

    // локатор кнопки "Статус заказа"
    @FindBy(how = How.XPATH, using = ".//button[@class='Header_Link__1TAG7']")
    private SelenideElement orderStatuButton;

    // локатор поля ввода номера заказа "Статус заказа"
    @FindBy(how = How.XPATH, using = ".//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement orderNumberField;

    // локатор поля кнопки Go
    @FindBy(how = How.XPATH, using = ".//button[@class='Button_Button__ra12g Header_Button__28dPO']")
    private SelenideElement goButton;

    // локатор картинки "Самокат"
    @FindBy(how = How.XPATH, using = ".//img[@alt='Scooter blueprint']")
    private SelenideElement scooterBlueprint;

    // локатор текста "Самокат на пару дней"
    @FindBy(how = How.XPATH, using = ".//div[@class='Home_Header__iJKdX']")
    private SelenideElement mainText;

    // локатор текста "Привезём его прямо к вашей двери,а когда накатаетесь — заберём"
    @FindBy(how = How.XPATH, using = ".//div[text()='Привезём его прямо к вашей двери,']")
    private SelenideElement under1MainText;

    // локатор текста "Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю"
    @FindBy(how = How.XPATH, using = "//div[text()='Он лёгкий и с мощными колёсами— самое то, чтобы ехать по набережной и нежно барабанить пальцами по рулю']")
    private SelenideElement under2MainText;

    // локатор Элемент-блок с параметрами самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Table__2kPxP']")
    private SelenideElement charactersTable;

    // локатор текста Модель Toxic PRO
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK' and contains(text(),'Модель Toxic PRO')]")
    private SelenideElement characterModelText;

    // локатор текста Максимальная скорость
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK' and contains(text(),'Максимальная скорость')]")
    private SelenideElement characterMaxSpeedText;

    // локатор текста 40 км/ч
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Column__xlKDK' and contains(text(),'40 км/ч')]")
    private SelenideElement characterMaxSpeedFactText;

    // локатор текста Проедет без подзарядки
    @FindBy(how = How.XPATH, using = "//div[text()='Проедет без поздарядки']")
    private SelenideElement characterWithoutChargerText;

    // локатор текста 80 км
    @FindBy(how = How.XPATH, using = "//div[text()='80 км']")
    private SelenideElement characterWithoutChargerFactText;

    // локатор текста Выдерживает вес
    @FindBy(how = How.XPATH, using = "//div[text()='Выдерживает вес']")
    private SelenideElement characterWeightText;

    // локатор текста 120 кг
    @FindBy(how = How.XPATH, using = "//div[text()='120 кг']")
    private SelenideElement characterWeightFactText;

    // локатор текста "Как это работает"
    @FindBy(how = How.XPATH, using = "//div[text()='Как это работает']")
    private SelenideElement howItWorksText;

    // локатор Элемент "Кружок с цифрой 1 внутри"
    @FindBy(how = How.XPATH, using = "//div[text()='1']")
    private SelenideElement stepOneElement;

    // локатор Элемент "Кружок с цифрой 2 внутри"
    @FindBy(how = How.XPATH, using = "//div[text()='2']")
    private SelenideElement stepTwoElement;

    // локатор Элемент "Кружок с цифрой 3 внутри"
    @FindBy(how = How.XPATH, using = "//div[text()='3']")
    private SelenideElement stepThreeElement;

    // локатор Элемент "Кружок с цифрой 4 внутри"
    @FindBy(how = How.XPATH, using = "//div[text()='4']")
    private SelenideElement stepFourElement;

    // локатор Шаг 1 "Заказываете самокат"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH' and contains(text(),'Заказываете самокат')]")
    private SelenideElement stepOneTitleText;

    // локатор Описание Шага 1 "Выбираете, когда и куда привезти".
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5' and contains(text(),'Выбираете, когда')]")
    private SelenideElement stepOneDescriptionText;

    // локатор Шаг 2 "Курьер привозит самокат".
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH' and contains(text(),'Курьер привозит самокат')]")
    private SelenideElement stepTwoTitleText;

    // локатор Описание Шага 2 "А вы — оплачиваете аренду"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5' and contains(text(),'А вы — оплачиваете аренду')]")
    private SelenideElement stepTwoDescriptionText;

    // локатор Шаг 3 "Катаетесь".
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH' and contains(text(),'Катаетесь')]")
    private SelenideElement stepThreeTitleText;

    // локатор Описание Шага 3 "Сколько часов аренды осталось — видно на сайте"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5' and contains(text(),'Сколько часов аренды осталось — видно на сайте')]")
    private SelenideElement stepThreeDescriptionText;

    // локатор Шаг 4 "Курьер забирает самокат".
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Status__YkfmH' and contains(text(),'Курьер забирает самокат')]")
    private SelenideElement stepFourTitleText;

    // локатор Описание Шага 4 "Когда аренда заканчивается".
    @FindBy(how = How.XPATH, using = "//div[@class='Home_StatusDescription__3WGl5' and contains(text(),'Когда аренда заканчивается')]")
    private SelenideElement stepFourDescriptionText;

    // локатор лого Самокат
    @FindBy(how = How.XPATH, using = ".//a[@class='Header_LogoScooter__3lsAR']")
    public SelenideElement scooterText;

    // локатор Учебный тренажер
    @FindBy(how = How.XPATH, using = ".//div[@class='Header_Disclaimer__3VEni']")
    public SelenideElement trainingSimulatorText;

    // локатор верхней кнопки Заказать
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement makeOrderButton;

    // локатор ссылки Статус заказа
    @FindBy(how = How.CLASS_NAME, using = "Header_Link__1TAG7")
    private SelenideElement orderStatusLink;

    // локатор нижней кнопки Заказать
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g Button_Middle__1CSJM")
    private SelenideElement downMakeOrderButton;

    // локатор Вопросы о важном
    @FindBy(how = How.XPATH, using = "//div[text()='Вопросы о важном']")
    private SelenideElement faqQuestionsText;

    // локатор Вопросы о важном. Сколько это стоит? И как оплатить?
    @FindBy(how = How.XPATH, using = ".//div[text()='Сколько это стоит? И как оплатить?']")
    private SelenideElement faqFirstQuestionButton;

    // локатор Вопросы о важном. Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.XPATH, using = ".//div[text()='Хочу сразу несколько самокатов! Так можно?']")
    private SelenideElement faqSecondQuestionButton;

    // локатор Вопросы о важном. Как рассчитывается время аренды?
    @FindBy(how = How.XPATH, using = ".//div[text()='Как рассчитывается время аренды?']")
    private SelenideElement faqThirdQuestionButton;

    // локатор Вопросы о важном. Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли заказать самокат прямо на сегодня?']")
    private SelenideElement faqFourthQuestionButton;

    // локатор Вопросы о важном. Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли продлить заказ или вернуть самокат раньше?']")
    private SelenideElement faqFifthQuestionButton;

    // локатор Вопросы о важном. Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.XPATH, using = ".//div[text()='Вы привозите зарядку вместе с самокатом?']")
    private SelenideElement faqSixthQuestionButton;

    // локатор Вопросы о важном. Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = ".//div[text()='Можно ли отменить заказ?']")
    private SelenideElement faqSeventhQuestionButton;

    // локатор Вопросы о важном. Я жизу за МКАДом, привезёте?
    @FindBy(how = How.XPATH, using = ".//div[text()='Я жизу за МКАДом, привезёте?']")
    private SelenideElement faqEiqhthQuestionButton;

    // локатор результата тапа на Вопросы о важном. Сколько это стоит? И как оплатить? =>
    // Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    @FindBy(how = How.XPATH, using = ".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']")
    private SelenideElement resultTapOnFaqFirstQuestionButton;

    // локатор результата тапа на Вопросы о важном. Хочу сразу несколько самокатов! Так можно? =>
    // Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    @FindBy(how = How.XPATH, using = ".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']")
    private SelenideElement resultTapOnFaqSecondQuestionButton;

    // локатор результата тапа на Вопросы о важном. Как рассчитывается время аренды? =>
    // Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру.
    // Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    @FindBy(how = How.XPATH, using = ".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']")
    private SelenideElement resultTapOnFaqThirdQuestionButton;

    // локатор результата тапа на Вопросы о важном. Можно ли заказать самокат прямо на сегодня?
    // Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    @FindBy(how = How.XPATH, using = ".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']")
    private SelenideElement resultTapOnFaqFourthQuestionButton;

    // локатор результата тапа на Вопросы о важном. Можно ли продлить заказ или вернуть самокат раньше?
    // Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    @FindBy(how = How.XPATH, using = ".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']")
    private SelenideElement resultTapOnFaqFifthQuestionButton;

    // локатор результата тапа на Вопросы о важном. Вы привозите зарядку вместе с самокатом?
    // Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    @FindBy(how = How.XPATH, using = ".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']")
    private SelenideElement resultTapOnFaqSixthQuestionButton;

    // локатор результата тапа на Вопросы о важном. Можно ли отменить заказ?
    // Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.
    @FindBy(how = How.XPATH, using = ".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']")
    private SelenideElement resultTapOnFaqSeventhQuestionButton;

    // локатор результата тапа на Вопросы о важном. Я жизу за МКАДом, привезёте?
    // Да, обязательно. Всем самокатов! И Москве, и Московской области.
    @FindBy(how = How.XPATH, using = ".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']")
    private SelenideElement resultTapOnFaqEighthQuestionButton;

    //МЕТОДЫ
    //1) Первый вопрос
    //клик на локатор Вопросы о важном. Сколько это стоит? И как оплатить?
    public void clickOnFaqFirstQuestionButton() {
        faqFirstQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Сутки — 400 рублей. Оплата курьеру — наличными или картой."
    public String getTextResultTapOnFaqFirstQuestionButton() {
        return resultTapOnFaqFirstQuestionButton.shouldBe(visible).getText();
    }

    //2) Второй вопрос
    //клик на локатор Вопросы о важном. Хочу сразу несколько самокатов! Так можно?
    public void clickOnFaqSecondQuestionButton() {
        faqSecondQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."
    public String getTextResultTapOnFaqSecondQuestionButton() {
        return resultTapOnFaqSecondQuestionButton.shouldBe(visible).getText();
    }

    //3) третий вопрос
    //клик на локатор Вопросы о важном. Как рассчитывается время аренды?
    public void clickOnFaqThirdQuestionButton() {
        faqThirdQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."
    public String getTextResultTapOnFaqThirdQuestionButton() {
        return resultTapOnFaqThirdQuestionButton.shouldBe(visible).getText();
    }

    //4) четвертый вопрос
    //клик на локатор Вопросы о важном. Можно ли заказать самокат прямо на сегодня?
    public void clickOnFaqFourthQuestionButton() {
        faqFourthQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Только начиная с завтрашнего дня. Но скоро станем расторопнее."
    public String getTextResultTapOnFaqFourthQuestionButton() {
        return resultTapOnFaqFourthQuestionButton.shouldBe(visible).getText();
    }

    //5) пятый вопрос
    //клик на локатор Вопросы о важном. Можно ли продлить заказ или вернуть самокат раньше?
    public void clickOnFaqFifthQuestionButton() {
        faqFifthQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."
    public String getTextResultTapOnFaqFifthQuestionButton() {
        return resultTapOnFaqFifthQuestionButton.shouldBe(visible).getText();
    }

    //6) шестой вопрос
    //клик на локатор Вопросы о важном. Вы привозите зарядку вместе с самокатом?
    public void clickOnFaqSixthQuestionButton() {
        faqSixthQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."
    public String getTextResultTapOnFaqSixthQuestionButton() {
        return resultTapOnFaqSixthQuestionButton.shouldBe(visible).getText();
    }

    //7) седьмой вопрос
    //клик на локатор Вопросы о важном. Можно ли отменить заказ?
    public void clickOnFaqSeventhQuestionButton() {
        faqSeventhQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."
    public String getTextResultTapOnFaqSeventhQuestionButton() {
        return resultTapOnFaqSeventhQuestionButton.shouldBe(visible).getText();
    }

    //8) восьмой вопрос
    //клик на локатор Вопросы о важном. Я жизу за МКАДом, привезёте?
    public void clickOnFaqEighthQuestionButton() {
        faqEiqhthQuestionButton.shouldBe(enabled).click();
    }

    //получить текст "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    public String getTextResultTapOnFaqEighthQuestionButton() {
        return resultTapOnFaqEighthQuestionButton.shouldBe(visible).getText();
    }

    //клик на первую кнопку Заказать
    public MakeOrderForWhoPage clickOnMakeOrderButton() {
        makeOrderButton.click();
        return page(MakeOrderForWhoPage.class);
    }

    //клик на кнопку "Да все привыкли"
    public void clickOnMainCookieButton() {
        mainCookieButton.click();
    }

    //скролл в самый низ страницы
    public void scrollDown() {
        faqEiqhthQuestionButton.scrollTo();
    }

    //сравнение фактического и полученного текста "Самокат за пару дней"
    public String getTextOnMainPage() {
        return mainText.getText();
    }
}
