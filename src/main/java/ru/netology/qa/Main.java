package ru.netology.qa;

public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Даниил";
        post.surname = "Саликов";
        post.patronymic = "Владимирович";
        post.passport = "4444 № 44444444";
        post.phone = "+7 (666)-666-69-69";

        post.birthday = new FormDate();
        post.birthday.day = 18;
        post.birthday.month = 2;
        post.birthday.year = 2003;
    }
}