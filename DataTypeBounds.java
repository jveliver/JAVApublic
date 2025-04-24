public class DataTypeBounds {
    public static void main(String[] args) {
    /*  Data Type	Size	    Description
        ---------   ----        -----------
        byte	    1 byte	    Stores whole numbers from -128 to 127
        short	    2 bytes	    Stores whole numbers from -32,768 to 32,767
        int	        4 bytes	    Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	    8 bytes	    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	    4 bytes	    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	    8 bytes	    Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean	    1 bit	    Stores true or false values
        char	    2 bytes	    Stores a single character/letter or ASCII values */

        // Byte data type
        System.out.println("Byte MIN: " + Byte.MIN_VALUE);
        System.out.println("Byte MAX: " + Byte.MAX_VALUE);

        // Short data type
        System.out.println("Short MIN: " + Short.MIN_VALUE);
        System.out.println("Short MAX: " + Short.MAX_VALUE);

        // Integer data type
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);
        System.out.println("Integer MAX: " + Integer.MAX_VALUE);

        // Long data type
        System.out.println("Long MIN: " + Long.MIN_VALUE);
        System.out.println("Long MAX: " + Long.MAX_VALUE);

        // Float data type - 4.9 multiplied by 10 raised to the power of -45
        System.out.println("Float MIN: " + Float.MIN_VALUE);  // Smallest positive non-zero value
        System.out.println("Float MAX: " + Float.MAX_VALUE);

        // Double data type - 4.9 multiplied by 10 raised to the power of -324
        System.out.println("Double MIN: " + Double.MIN_VALUE);  // Smallest positive non-zero value

        System.out.println("Double MAX: " + Double.MAX_VALUE);
    }
}

