package collectionsframeworks;

import java.util.Collection;
import java.util.List;

public class Applications {

    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premier Room", 4, 175);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Collection<Room> rooms = List.of(cambridge, manchester, piccadilly, oxford);
        double total = getPotentialRevenue(rooms);
        //double total = getPotentialRevenue(cambridge, manchester, piccadilly);
        System.out.println(total);
    }
        //private static double getPotentialRevenue(Room room1, Room room2, Room room3){
        private static double getPotentialRevenue(Collection<Room> rooms){
            //return room1.getRate() + room2.getRate() + room3.getRate();

            return rooms.stream()
                    .mapToDouble(r -> r.getRate())
                    .sum();
    }
}
