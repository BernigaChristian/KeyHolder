package me.berniga;
import me.berniga.Exceptions.*;
import java.util.Scanner;
/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 24/12/2021, venerdì
 **/
public class KeyHolder {
    private Key[] keys;

    public KeyHolder(){
        keys=new Key[10];
        setKeyHolder();
    }

    private void setKeyHolder(){
        for(int i=0;i<keys.length;i++)
            keys[i]=new Key();
    }

    private int firstFree() throws FullKeyHolderException {
        for(int i=0;i<keys.length;i++)
            if(keys[i]==null)    return i;
        throw new FullKeyHolderException();
    }

    public Key enter(int roomNumber)    throws OwnersRoomNotFoundException,EntryException{
        String tempData="";
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < keys.length; i++)
            if (keys[i] != null && keys[i].getRoomNumber() == roomNumber) {
                if (keys[i].getOwner().equalsIgnoreCase("")) {
                    System.out.println("WELCOME IN THE HOTEL\n\tPlease type your name and surname:");
                    keys[i].setOwner(tempData = scan.nextLine());
                } else {
                    System.out.println("Please type your name and surname:");
                    tempData = scan.nextLine();
                }
                return enter(tempData);
            }
        throw new  EntryException(roomNumber);
    }

    public Key enter(String owner)  throws OwnersRoomNotFoundException{
        for(int i=0;i<keys.length;i++)
            if(keys[i]!=null&&keys[i].getOwner().equalsIgnoreCase(owner)){
                Key temp=keys[i];
                keys[i]=null;
                return temp;
            }
        throw new OwnersRoomNotFoundException(owner);
    }

    public void exit(Key k) throws FullKeyHolderException {
        keys[firstFree()]=k;
        k=null;
    }

    public String toString(){
        String keyHolder="KEYHOLDER\n------------------\n";
        int position=0;
        for(Key k:keys)
            keyHolder+="POSITION "+(++position)+"\n\t"+((k==null)?"empty\n":k.toString()+"\n");
        return keyHolder;
    }
}