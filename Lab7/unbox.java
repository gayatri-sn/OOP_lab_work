//import java.lang;
public class unbox 
{
    public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
       
        Double y=2.5;  // boxes double to an Double object
        y=y+5;
        Byte z=2;   // boxes byte to an Byte object
        z++;
        
        short s=3;   // boxes short to an Short object
        s++;
        Character c='a';  // boxes character to an Character object
        c++;
        System.out.println(x+"\tinteger"); 
        System.out.println(y+"\tdouble");
        System.out.println(z+"\tbyte");
       
        System.out.println(c+"\tcharacter");
        System.out.println(s+"\tshort");
     } 
  
}
