package com.testNg.learning;

import org.testng.annotations.Test;

public class GroupingTests {
    @Test(groups = {"Smoke"})
    public static void verifyLoginSuccess(){
        System.out.println("Login Success");
    }

    @Test(groups = {"Smoke", "Regression"})
    public static void verifyBookingTicket(){
        System.out.println("Book Ticket");
    }

    @Test(groups = {"Regression"})
    public static void verifyTicketBookedSuccessfully(){
        System.out.println("Ticket send to mail");
    }

    @Test(groups = "Automation")
    public void firstTest(){
        System.out.println("TestNG Test");
    }
}
