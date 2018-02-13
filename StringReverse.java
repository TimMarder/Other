public class StringReverse {

    public static final string ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String makeString(int length) {
	String str = "";

	for (int i = 0 ; i < length ; i++) {
	    int randLetter = (int) (Math.random() * 26);
	    str = str + ALPHABET.substring(randLetter , randLetter + 1);
	}
	return str;
    }

    //try writing method to run in linear time --  O(N)
    //and a method to run in logarithmic time -- O(logN)
}
