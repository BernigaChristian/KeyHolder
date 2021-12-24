package me.berniga;
import me.berniga.Exceptions.*;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class Main {
    public static void main(String[] args) {
        KeyHolder keys=new KeyHolder();
        System.out.println(keys);
        try{
            Key customer1= keys.enter(1);
            keys.exit(customer1);
            customer1=keys.enter("Giorgio");
        } catch(EntryException| OwnerMissMatchException| FullKeyHolderException| OwnersRoomNotFoundException|ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());}
        System.out.println(keys);
    }
}
