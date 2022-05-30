package ru.netology.statistic;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;// заполните другие поля даты рождения
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "4444 № 44444444";// заполните другие поля
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;
    }
}