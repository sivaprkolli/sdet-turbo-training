package com.testNg.learning;

import org.testng.annotations.Test;

public class ParallelTests {

    @Test
    public static void verifyLoginSuccess(){
        System.out.println("Login Success");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
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
