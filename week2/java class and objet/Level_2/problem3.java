class problem3 {
    String text;

    public problem3(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        problem3 checker1 = new problem3("madam");
        problem3 checker2 = new problem3("Racecar!");
        problem3 checker3 = new problem3("hello");
        problem3 checker4 = new problem3("A man, a plan, a canal: Panama");

        checker1.displayResult();
        checker2.displayResult();
        checker3.displayResult();
        checker4.displayResult();
    }
}