public class reverseString {

    // A recursive function that reverses a string
    public static String reverseString(String stringVal) {
        if (stringVal.length() == 1) {
            return stringVal;
        }
        return stringVal.charAt(stringVal.length() - 1) + reverseString(stringVal.substring(0, stringVal.length() - 1));
    }

    public static void main(String[] args) {
        reverseString object = new reverseString();
        String result = object.reverseString("Software developer");
        System.out.println(result);
    }
}
