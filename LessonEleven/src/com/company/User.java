package com.company;

public class User {
    public String name;
    public Passport pass;
    private Phone phone;

    // вложенный класс
    class Passport {
        public String regDate;
        public String number;

        @Override
        public String toString() {
            return "Passport{" + "name=" + name + ", " + "regDate='" + regDate + '\'' + ", number='" + number + '\'' + '}';
        }
    }

    static class Photo {
        public String url;
        public int size;
    }

    // для вложенных классов доступно три модификатора доступа:
    // 1. public
    // 2. private
    // 3. package-protected

    private class Phone {
        public String number;
        public String countryCode;
    }
}