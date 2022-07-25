package com.company;



public class Main {

    public static void main(String[] args) {
        //  вложенные классы (inner)
        User user = new User();
        user.name = "Vasya";
        User.Passport pass = user.new Passport(); // создание обьекта вложенного ксласса
        System.out.println(pass);
        User.Photo photo = new User.Photo();

    }
}
