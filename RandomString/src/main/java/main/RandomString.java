package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomString {

    public static String getRandomString(int length) {
        Random random = new Random();
        List<Character> chars = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (char i = 'a'; i < 'z'; i++) {
            chars.add(i);
        }
        for (char i = 'A'; i < 'Z'; i++) {
            chars.add(i);
        }
        for (char i = '0'; i < '9'; i++) {
            chars.add(i);
        }

        for (int i = 0; i < length; i++) {
            int limit = chars.size();
            int randomIndex = random.nextInt(limit);
            char randomChar = chars.get(randomIndex);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(getRandomString(10));
    }

}

