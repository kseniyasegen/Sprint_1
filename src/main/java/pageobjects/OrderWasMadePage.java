package pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderWasMadePage {
    // локатор для текста Заказ оформлен
    @FindBy(how = How.XPATH, using = ".//div[@class='Order_ModalHeader__3FDaJ']")
    private SelenideElement orderWasMadeText;

    //МЕТОДЫ
    //получить текст "Заказ оформлен"
    public String getTextOrderWasMade() {
        return orderWasMadeText.getText();
    }
}
