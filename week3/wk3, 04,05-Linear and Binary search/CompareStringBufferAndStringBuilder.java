public class CompareStringBufferAndStringBuilder {
    public static void main(String[] args) {
        int N = 1_000_000;

        long start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sbuf.append("hello");
        }
        long end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");
    }
}