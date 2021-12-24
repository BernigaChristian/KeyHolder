package me.berniga.Exceptions;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class OwnerMissMatchException extends Exception{
    private String wrongOwner;
    private String rightOwner;
    private int roomNumber;

    public OwnerMissMatchException(String wrong,String right,int roomNumber){
        this.wrongOwner=wrong;
        this.rightOwner=right;
        this.roomNumber=roomNumber;
    }

    public String toString(){
        return "The room "+roomNumber+" doesn't belong to "+wrongOwner+"; it is "+rightOwner+"'s";
    }

}
