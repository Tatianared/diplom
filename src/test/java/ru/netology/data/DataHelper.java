package ru.netology.data;


import com.github.javafaker.Faker;
import lombok.Value;

import java.util.Locale;


public class DataHelper {
    private DataHelper() {
    }

    static Faker faker = new Faker(new Locale("en"));

    @Value
    public static class CardInfo {
        String cardNumber;
        String month;
        String year;
        String cvc;
        String owner;

    }

    public static String getApprovedCardNumber() {

        return ("4444 4444 4444 4441");
    }

    public static String getApprovedCardStatus() {
        return "APPROVED";
    }

    public static String getDeclinedCardStatus() {
        return "DECLINED";
    }

    public static String getDeclinedCardNumber() {

        return ("4444 4444 4444 4442");
    }

    public static String getRandomCardNumber() {
        return faker.business().creditCardNumber();
    }
    public static String getRandomOwner() {
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

    public static CardInfo getApprovedUser() {
        return new CardInfo(getApprovedCardNumber(), getRandomMonth(), getRandomYear(), generateRandomOwner(), getRandomCVC());
    }
}