public class Variables {
    public static void main(String[] args){

        // int x;  //  Declaration
        // x = 10; //  Initialization


        // DATA TYPE                    // VALUE                           // SIZE
        boolean bool = true;            // primitive                       // 1 bit
        byte byteNumber = -128;         // -128 to 127                     // 1 byte       
        short shortNumber = -32768;     //-32.768 to -32.767               // 2 bytes      
        int integer = 20931094;         //-2billion to 2 billion           // 4 bytes      
        long longNumber = 2903810L;      // -9.. to 9 quintillion           // 8 bytes


        float floatNumber = 2.234f;     // fraction up to 6-7 digits       // 4 bytes
        double doubleNumber = 2.415;    // fraction up to 15 digits        // 8 bytes 

        char someChar = 'f';            // Single char/letter/ASCII        // 2 bytes
        String str = "Thalison";        // Sequence of Chars               // Varies

        System.out.println("boolean: "+bool+" byte: "+byteNumber+" short: "+shortNumber+" int: "+integer+" long: "+longNumber);
        System.out.println("float: "+floatNumber+" double: "+doubleNumber+" char: "+someChar+" String: "+str);

    }
}