package me.berniga.Exceptions;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class EntryException extends Exception{
    private int roomNumber;

    public EntryException(int roomNumber){
        this.roomNumber=roomNumber;
    }

    public String toString(){
        return "The key of the room "+roomNumber+" is already taken by its owner";
    }
}
