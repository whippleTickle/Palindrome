public class Palindrome {


    public static void main(String[] args) {
        paliTest();
    }

    /**
     * @param a the string to be checked
     * @return true/false if a is a palindrome
     */
    public static boolean isPal(String a) {
        if( a == null) {
            throw new NullPointerException();
        }
        int y = a.length() - 1, x = 0;

        boolean result = true;
        while( x< y && result) {
            if(a.charAt(x) != a.charAt(y)) {
                result = false;
            }
            y--;
            x++;
        }
        return result;
    }

    public static void paliTest() {
        assert (isPal("sos")) : "True";
        assert (isPal("p")) :"True";
        assert (!isPal("booking")) : "False";
    }
}
