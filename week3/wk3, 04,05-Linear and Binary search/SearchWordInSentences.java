public class SearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "Java is great.",
            "Python is powerful.",
            "I love programming."
        };
        String keyword = "love";

        for (String sentence : sentences) {
            if (sentence.contains(keyword)) {
                System.out.println("Found: " + sentence);
                return;
            }
        }
        System.out.println("Not Found");
    }
}