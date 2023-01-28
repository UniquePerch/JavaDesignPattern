package org.behavioralPattern.strategy;

public class Main {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();
        ticket.setPrice(200);
        ticket.setDiscount(new StudentDiscount());
        System.out.println(ticket.getPrice());
    }
}
