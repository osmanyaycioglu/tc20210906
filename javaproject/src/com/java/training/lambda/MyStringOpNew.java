package com.java.training.lambda;

import java.util.function.Function;

public class MyStringOpNew {

    private String name;
    private String surname;
    private String result;


    public MyStringOpNew(final String nameParam,
                         final String surnameParam) {
        super();
        this.name = nameParam;
        this.surname = surnameParam;
        this.result = this.name + " " + this.surname;
    }

    public String process(final Function<String, String> fun) {
        return fun.apply(this.name + " " + this.surname);
    }

    public MyStringOpNew cat(final Function<String, String> fun) {
        this.result = fun.apply(this.result);
        return this;
    }


    public String getName() {
        return this.name;
    }


    public void setName(final String nameParam) {
        this.name = nameParam;
    }


    public String getSurname() {
        return this.surname;
    }


    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }


    public String getResult() {
        return this.result;
    }


    public void setResult(final String resultParam) {
        this.result = resultParam;
    }


    //    public String mr() {
    //        return "Mr " + this.name + " " + this.surname;
    //    }
    //
    //    public String dear() {
    //        return "Dear " + this.name + " " + this.surname;
    //    }
    //
    //    public String ff() {
    //        return this.name + " " + this.surname + " FF";
    //    }

}
