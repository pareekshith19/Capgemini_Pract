public class StringConcatComparison {
    public static void main(String[] args) {
        int N = 1_000_000;

        long start = System.nanoTime();
        String str = "";
        for (int i = 0; i < N; i++) str += "a";
        System.out.println("String: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");
        System.out.println("StringBuilder: " + (System.nanoTime() - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) sbf.append("a");
        System.out.println("StringBuffer: " + (System.nanoTime() - start) / 1e6 + " ms");
    }
}