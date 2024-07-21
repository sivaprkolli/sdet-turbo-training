package com.testNg.learning;

import org.testng.annotations.Test;

public class TestPriorities {

    @Test(priority = 1)
    public static void verifyLoginSuccess(){
        System.out.println("Login Success");
    }

    @Test(priority = 2)
    public static void verifyBookingTicket(){
        System.out.println("Book Ticket");
    }

    @Test(priority = 3)
    public static void verifyTicketBookedSuccessfully(){
        System.out.println("Ticket send to mail");
    }

    @Test
    public void firstTest(){
        System.out.println("TestNG Test");
    }
}
