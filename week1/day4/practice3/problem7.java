import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class problem7 {

    public static String generateOTP() {
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            otp.append((int) (Math.random() * 10));
        }
        return otp.toString();
    }

    public static boolean areOTPsUnique(String[] otps) {
        Set<String> uniqueOTPs = new HashSet<>(Arrays.asList(otps));
        return uniqueOTPs.size() == otps.length;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        if (areOTPsUnique(otps)) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Generated OTPs are not all unique.");
        }
    }
}