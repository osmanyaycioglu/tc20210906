package com.java.training.pattern.creational.builder;


public class CustomerEx2 {

    private String name;
    private String surname;
    private int    age;
    private int    height;


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public static CustomerExBuilder builder() {
        return new CustomerExBuilder();
    }

    public static class CustomerExBuilder {

        private final CustomerEx2 ce = new CustomerEx2();


        private CustomerExBuilder() {
        }

        public String getName() {
            return this.ce.name;
        }

        public CustomerExBuilder name(final String nameParam) {
            this.ce.name = nameParam;
            return this;
        }

        public String getSurname() {
            return this.ce.surname;
        }

        public CustomerExBuilder surname(final String surnameParam) {
            this.ce.surname = surnameParam;
            return this;
        }

        public int getAge() {
            return this.ce.age;
        }

        public CustomerExBuilder age(final int ageParam) {
            this.ce.age = ageParam;
            return this;
        }

        public int getHeight() {
            return this.ce.height;
        }

        public CustomerExBuilder height(final int heightParam) {
            this.ce.height = heightParam;
            return this;
        }

        public CustomerEx2 build() {
            // Validate
            return this.ce;
        }
    }
}
