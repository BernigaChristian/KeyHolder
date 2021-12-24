package me.berniga.Exceptions;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class FullKeyHolderException extends Exception{
    public FullKeyHolderException(){super();}

    @Override
    public String toString() {
        return "The key holder is full";
    }
}
