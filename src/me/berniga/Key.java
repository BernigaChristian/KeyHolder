package me.berniga;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class Key {
    private final int roomNumber;
    private String owner;
    private static int rooms=0;

    public Key(){
        this.roomNumber=++rooms;
        this.owner="";
    }

    public void setOwner(String owner){
        this.owner=owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    @Override
    public String toString() {
        return "Key room " + roomNumber + ": owner(" + (owner.equalsIgnoreCase("")?"empty)":owner+")");
    }
}
