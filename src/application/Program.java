package application;

import model.entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy") ;

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date :");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date: ");
            Date checkOut = sdf.parse(sc.next());


            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date :");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date: ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
    }
}
