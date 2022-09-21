package ru.netology.data;


import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;


public class DataHelper {
    private DataHelper() {
    }

    static Faker faker = new Faker(new Locale("en"));

    @Value
    public static class CardNumber {
        private String cardNumber;
        private String status;
    }

    public static CardNumber approvedCardInfo() {

        return new CardNumber("4444 4444 4444 4441", "APPROVED");
    }

    public static CardNumber declinedCardInfo() {

        return new CardNumber("4444 4444 4444 4442", "DECLINED");
    }

    @Value
    public static class CardInfo {
        private String month;
        private String year;
        private String cvc;
        private String owner;
    }

    public static String generateRandomOwner() {
        return faker.name().firstName() + " " + faker.name().lastName();
    }

    public static String getRandomCVC() {
        return faker.numerify("###");
    }

    public static String getRandomYear() {
        return faker.numerify("##");
    }
    public static String getRandomMonth() {
        return faker.numerify("##");
    }
}