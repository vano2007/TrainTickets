package com.example.traintickets.Model;

public class RailwayTicketChild extends RailwayTicket{
    // задание полей
    private float ticketDiscount; // скидка на детский билет

    public RailwayTicketChild() {
    }

    public RailwayTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; // нужно умножить количество билетов на стоимость одного билета и на скидку и всё разделить на 100
    }
}
