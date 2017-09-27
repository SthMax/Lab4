/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */
/**
 * Just for Reclamation.
 */
public class ReclamationProject {

    /**
     *This method received something and output someting.
     * @param a input String a
     * @param b input String b
     * @return value r
     */
    static String doit(final String a, final String b) {
        String shortOne, longOne;
        if (a.length() > b.length()) {
            shortOne = b;
            longOne = a;
        } else {
            longOne = a;
            shortOne = b;
        }
        String r = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < shortOne.length(); i++) {
            for (int j = shortOne.length() - i; j > 0; j--) {
                for (int k = 0; k < longOne.length() - j; k++) {
                    if (shortOne.regionMatches(i, longOne, k, j) && j > r.length()) {
                        r = shortOne.substring(i, i + j);
                    }
                }
            }
        }
        return r;
    }
}
