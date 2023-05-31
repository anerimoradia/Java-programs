package collectionsframeworks;

import java.util.Arrays;

public class FlexibleArray {

    Room[] rooms = new Room[2];

    public void add (Room room){
        Room[] newArray = Arrays.copyOf(this.rooms,this.rooms.length + 1);
        newArray[this.rooms.length] = room;
        this.rooms = newArray;
    }
}
