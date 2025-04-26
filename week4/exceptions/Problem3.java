class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

public class Problem3 {
    public static void registerUser(String username) throws UserAlreadyExistsException {
        if ("existingUser".equals(username)) {
            throw new UserAlreadyExistsException("User already exists");
        }
        System.out.println("User registered successfully");
    }

    public static void checkUserExistence(String username) throws UserNotFoundException {
        if (!"existingUser".equals(username)) {
            throw new UserNotFoundException("User not found");
        }
    }

    public static void main(String[] args) {
        try {
            registerUser("existingUser");
        } catch (UserAlreadyExistsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            checkUserExistence("nonExistingUser");
        } catch (UserNotFoundException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
