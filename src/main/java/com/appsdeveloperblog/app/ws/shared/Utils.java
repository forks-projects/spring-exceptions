package com.appsdeveloperblog.app.ws.shared;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Random;

@Component
public class Utils {
    private Random RANDOM = new SecureRandom();
    private final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqurstuvwxyz";
    private final int ITERATIONS=10000;
    private final int KEY_LENGTH=256;

    public String generatedUserId(int length) {
        return generateRandomString(length);
    }

    private String generateRandomString(int length) {
        StringBuilder returnValue = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            returnValue.append((ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length()))));
        }
        return new String(returnValue);
    }

}
