package com.stt.oops.polymorphism;

public class Child extends Parent{

    public static void main(String[] args) {

        Parent parent = new Parent();

        Child child = new Child();
        child.sum(5, 5, 5);

        parent.testAutomation();
        child.testAutomation();

        String str = child.getText("Tool");
        System.out.println(str);

        String s = "Test :: " + "Software";
        System.out.println(s + " :: " +child.getText());

    }

    @Override
    public void testAutomation(){

        int a = 5;
        String s = "Selenium Automation";
        if(a == 5){
            System.out.println("Level 1 completed");
        }

        if(s == "Selenium Automation"){
            System.out.println("Both are same");
        }
    }

    public void sum(int a, int b){
        System.out.println(a+b);
    }

    public void sum(int a, double b){
        System.out.println(a+b);
    }

    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public String getText(){
        return "Automation Testing";
    }

    public String getText(String text){
        String s = "Selenium " + text;
        return s;
    }

    public void getText(int a){
        System.out.println("Test");
    }

}
