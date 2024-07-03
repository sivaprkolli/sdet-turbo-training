package com.stt.oops.accessModifiers;

public class Test1 {

    int a = 10;
    public String s = "Selenium";
    protected boolean b = true;
    private double d = 1213.4534;

    void studentData(){
        int sd = 5;
        System.out.println("Student data");
    }

    protected void teachersData(){
        System.out.println("Teachers data");
    }

    private void adminMembersData(){
        System.out.println("Admin data");
    }

    public void collageData(){
        System.out.println("Full data for advertisement");
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.adminMembersData();
        double dd = test1.d;
        System.out.println(dd);
    }

}
