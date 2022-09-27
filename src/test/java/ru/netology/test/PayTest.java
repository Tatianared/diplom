package ru.netology.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.data.DataHelper;
import ru.netology.page.PaymentPage;
import ru.netology.page.StartPage;

import static com.codeborne.selenide.Selenide.open;

public class PayTest {


    @BeforeEach
    void setUp() {
        open("http://localhost:8080");
    }


    @Test
    void shouldBuyTourWithDebetApprovedCard() {
        var startPage = new StartPage();
        StartPage.openPaymentPage();
        DataHelper.getAcceptedUser();



    }


}
