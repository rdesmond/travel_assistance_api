package com.models.allmyles.hotels.details;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
    //ID of the room in question
    String room_id;

    //ID to use when booking this room
    String booking_id;

    //Contains data about the price of the room
    RoomPrice price;

    //Contains the traits of the given room, including the category, bed/shower availability, whether smoking is
    // allowed, and whether it is a suite.
    Traits room_type;

    //One of: ‘single’, ‘double’, ‘twin’, ‘king size’, ‘queen size’, ‘pullout’, ‘water bed’
    String bed_type;

    //Contains a short text about the room
    String description;

    //Contains the amount left to be booked of this room
    int quantity;

    //The exact description of the board offered with the room
    String board;

    //The generic category the board belongs to (no_meal, breakfast_
    // inclueded, half_board, full_board, all_inclusive, dinner_only)
    String board_category;

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getBoard_category() {
        return board_category;
    }

    public void setBoard_category(String board_category) {
        this.board_category = board_category;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }

    public RoomPrice getPrice() {
        return price;
    }

    public void setPrice(RoomPrice price) {
        this.price = price;
    }

    public Traits getRoom_type() {
        return room_type;
    }

    public void setRoom_type(Traits room_type) {
        this.room_type = room_type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Room{" +
                "bed_type='" + bed_type + '\'' +
                ", booking_id='" + booking_id + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", room_id='" + room_id + '\'' +
                ", room_type=" + room_type +
                ", board=" + board +
                ", board_category=" + board_category +
                '}';
    }
}