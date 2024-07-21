package com.testNg.learning;

import org.testng.annotations.Test;

public class DependentTests {
    @Test
    public static void aVerifyLoginSuccess(){
        System.out.println("Login Success");
    }

    @Test(dependsOnMethods = "aVerifyLoginSuccess")
    public static void verifyBookingTicket(){
        System.out.println("Book Ticket");
    }

    @Test
    public void firstTest(){
        System.out.println("TestNG Test");
    }

    @Test(dependsOnMethods = "aVerifyLoginSuccess")
    public void secondTest(){
        System.out.println("second test");
    }

    @Test(dependsOnMethods = "verifyBookingTicket")
    public static void verifyTicketBookedSuccessfully(){
        System.out.println("Ticket send to mail");
    }
}
