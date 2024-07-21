package com.testNg.learning;

import org.testng.annotations.Test;

public class TestsInDefaultOrder {

    @Test
    public static void verifyLoginSuccess(){
        System.out.println("Login Success");
    }

    @Test
    public static void verifyBookingTicket(){
        System.out.println("Book Ticket");
    }

    @Test
    public static void verifyTicketBookedSuccessfully(){
        System.out.println("Ticket send to mail");
    }

    @Test
    public void firstTest(){
        System.out.println("TestNG Test");
    }
}
