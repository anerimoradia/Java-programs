package collectionsframeworks;

import java.util.*;

public class Application {

    public static void main(String[] args){

        //Set c = new HashSet();

        Collection<String> c = new ArrayDeque<>();
        c.add("snowboard");
        c.add("linux");
        c.add("books");
        c.add("snowboard");

        Collection<String> favoriteThings = new HashSet<>(c);
        System.out.println(favoriteThings);
    }
}
