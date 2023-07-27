import java.util.Random;

public class MyMethods {

    public static void myWait(int time) {

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static String randomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        int length = 6;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            char randomChar = characters.charAt(index);
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        return randomString + "@gmail.com";
    }

}

