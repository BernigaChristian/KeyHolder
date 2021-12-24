package me.berniga.Exceptions;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class OwnersRoomNotFoundException extends Exception{
    private String owner;

    public OwnersRoomNotFoundException(String owner){
        this.owner=owner;
    }

    public String toString(){
        return "there are no rooms belong to "+owner;
    }
}
