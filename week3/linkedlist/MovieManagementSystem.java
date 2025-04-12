class MovieManagementSystem {
    static class Movie {
        String title;
        String director;
        int year;
        double rating;
        Movie prev, next;

        Movie(String title, String director, int year, double rating) {
            this.title = title;
            this.director = director;
            this.year = year;
            this.rating = rating;
        }
    }

    Movie head = null, tail = null;

    // Add movie at the end
    void addMovieEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }

    // Add movie at the beginning
    void addMovieBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add at a specific position
    void addMovieAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos == 0) {
            addMovieBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addMovieEnd(title, director, year, rating);
            return;
        }
        newMovie.next = temp.next;
        newMovie.prev = temp;
        temp.next.prev = newMovie;
        temp.next = newMovie;
    }

    // Remove movie by title
    void removeMovie(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equalsIgnoreCase(title)) {
            temp = temp.next;
        }
        if (temp == null) return;
        if (temp == head) {
            head = head.next;
            if (head != null) head.prev = null;
        } else if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
        } else {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    // Search movie by director or rating
    void searchMovie(String director, Double rating) {
        Movie temp = head;
        while (temp != null) {
            if ((director != null && temp.director.equalsIgnoreCase(director)) ||
                (rating != null && temp.rating == rating)) {
                System.out.println("Found: " + temp.title);
            }
            temp = temp.next;
        }
    }

    // Update movie rating
    void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }

    // Display all movies forward
    void displayForward() {
        Movie temp = head;
        System.out.println("Movies in order:");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movies in reverse
    void displayReverse() {
        Movie temp = tail;
        System.out.println("Movies in reverse:");
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.year + " | Rating: " + temp.rating);
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        MovieManagementSystem mms = new MovieManagementSystem();
        mms.addMovieEnd("Inception", "Nolan", 2010, 9.0);
        mms.addMovieBeginning("Interstellar", "Nolan", 2014, 8.6);
        mms.addMovieAtPosition(1, "The Matrix", "Wachowski", 1999, 8.7);
        mms.displayForward();

        System.out.println("\nAfter Update & Deletion:");
        mms.updateRating("The Matrix", 9.5);
        mms.removeMovie("Interstellar");
        mms.displayForward();
        mms.displayReverse();
    }
}
