package app.stepdefinitions;

import io.cucumber.java.en.Given;

public class MyStepDefinition {

    @Given("I am writing foo in the console")
    public void foo(){
        System.out.println("foo");
    }

    @Given("I am writing bar in the console")
    public void bar(){
        System.out.println("bar");
    }


    @Given("this should never be executed")
    public void never(){
        System.out.println(">>> -------------------- this should never be executed ------------------- <<<");
    }
}
