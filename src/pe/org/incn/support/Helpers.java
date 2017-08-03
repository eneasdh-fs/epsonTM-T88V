package pe.org.incn.support;

/**
 * Helpers
 *
 * @author enea <enea.so@live.com>
 */
public class Helpers {

    /**
     * Returns true if it finds an element within a string array.
     *
     * @param elements
     * @param value
     * @return
     */
    public static boolean existInStringArray(String[] elements, String value) {
        for (String element : elements) {
            if (element.equals(value)) {
                return true;
            }
        }

        return false;
    }

    /**
     * Combine multiple strings into one.
     *
     * @param elements
     * @return
     */
    public static String concat(String... elements) {
        String out = "";

        for (String element : elements) {
            out += element;
        }

        return out;
    }

    /**
     * Right autocomplete.
     *
     * @param text
     * @param quantity
     * @return
     */
    public static String rightAutocomplete(String text, Integer quantity) {
        if (quantity > 0) {
            String exp = concat("%-", quantity.toString(), "s");
            return String.format(exp, text);
        }

        return text;
    }
}
