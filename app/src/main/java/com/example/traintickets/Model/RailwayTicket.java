package com.example.traintickets.Model;

public class RailwayTicket {
    // задание полей сущности
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов

    public RailwayTicket() {
    }

    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    // метод подсчёта стоимости взрослых билетов
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets; // нужно умножить количество билетов на стоимость одного билета
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
