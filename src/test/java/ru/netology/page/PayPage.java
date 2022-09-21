package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;


public class PayPage {
    private SelenideElement cashButton = $$("button").find(Condition.exactText("Купить"));
    private SelenideElement creditButton = $$("button").find(Condition.exactText("Купить в кредит"));


    public void openPaymentPage() {
        cashButton.click();
    }

    public void openCreditPage() {
        creditButton.click();
    }
}

