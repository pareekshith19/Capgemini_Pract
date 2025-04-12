public class ConcatenateStringsWithStringBuffer {
    public static void main(String[] args) {
        String[] strings = {"Java", " ", "is", " ", "awesome!"};
        StringBuffer sb = new StringBuffer();

        for (String str : strings) {
            sb.append(str);
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}