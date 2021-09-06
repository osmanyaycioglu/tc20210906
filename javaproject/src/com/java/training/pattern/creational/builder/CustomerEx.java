package com.java.training.pattern.creational.builder;


public class CustomerEx {

    private final String name;
    private final String surname;
    private final int    age;
    private final int    height;


    private CustomerEx(final String nameParam,
                       final String surnameParam,
                       final int ageParam,
                       final int heightParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.age = ageParam;
        this.height = heightParam;
    }

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

        private String name;
        private String surname;
        private int    age;
        private int    height;


        private CustomerExBuilder() {
        }

        public String getName() {
            return this.name;
        }

        public CustomerExBuilder name(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public String getSurname() {
            return this.surname;
        }

        public CustomerExBuilder surname(final String surnameParam) {
            this.surname = surnameParam;
            return this;
        }

        public int getAge() {
            return this.age;
        }

        public CustomerExBuilder age(final int ageParam) {
            this.age = ageParam;
            return this;
        }

        public int getHeight() {
            return this.height;
        }

        public CustomerExBuilder height(final int heightParam) {
            this.height = heightParam;
            return this;
        }

        public CustomerEx build() {
            // Validate
            return new CustomerEx(this.name,
                                  this.surname,
                                  this.age,
                                  this.height);
        }
    }
}
