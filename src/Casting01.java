public class Casting01 {
    public static void main(String[] args) {
        //Declare and initialize a byte with a value of 128
        //Observe NetBeans' complaint
        short myshort = 128;
        //Declare and initialize a short with a value of 128
        short mybyte = 128;
        //Create a print statement that casts this short to a byte
        short shortTobyte = (byte)  127;
        //Declare and initialize a byte with a value of 127
        //Add 1 to this variable and print it
        byte value =(byte) ((byte) 127 + 1);
        //Add 1 to this variable again and print it again
        System.out.println(value + 1);

        
        
        
    }    
}
