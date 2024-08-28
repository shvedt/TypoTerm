package com.shvetank;

import java.util.Scanner;

public class App {
    public static Double[] calculateAccuracy (String textToType, String textWritten) {
        String[] refWords = textToType.split(" ");
        String[] userWords = textWritten.split(" ");
        int totalCharacters = textToType.replace(" ", "").length();
        int correctWords = 0, correctCharacters = 0;
        double characterAccuracy, wordAccuracy;

        int minWords = Math.min(refWords.length, userWords.length);

        for (int i = 0; i < minWords; i++) {
            if (refWords[i].equals(userWords[i])) {
                correctWords++;
                correctCharacters += userWords[i].length();
            } else
                for (int j = 0; j < Math.min(refWords[i].length(), userWords[i].length()); j++)
                    if (userWords[i].charAt(j) == refWords[i].charAt(j))
                        correctCharacters++;
        }

        characterAccuracy = ((double) correctCharacters / totalCharacters) * 100;
        wordAccuracy = ((double) correctWords / refWords.length) * 100;

        return new Double[]{wordAccuracy, characterAccuracy};
    }

    public static void typeTest(int wordsNeeded) {
        Scanner myScanner = new Scanner(System.in);
        int timeTakenInSeconds, characterPerMinute;
        double wordPerMinute, characterAccuracy, wordAccuracy;
        String textToType, textWritten;
        long startTime, endTime;

        System.out.println("\nType the following text:");

        textToType = RandomSentencesFromWords.generateSentence(wordsNeeded);

        System.out.println(textToType + "\n");

        System.out.print("Press enter when you are ready ");
        myScanner.nextLine();

        System.out.println("Start\n");

        startTime = System.currentTimeMillis();

        textWritten = myScanner.nextLine();

        endTime = System.currentTimeMillis();
        timeTakenInSeconds = (int) ((endTime - startTime) / 1000);

        Double[] accuracy = calculateAccuracy(textToType, textWritten);
        wordAccuracy = accuracy[0];
        characterAccuracy = accuracy[1];

        wordPerMinute = (double) (textWritten.trim().split("\\s+").length * 60) / timeTakenInSeconds;
        characterPerMinute = (textWritten.length() * 60) / timeTakenInSeconds;

        System.out.printf("%nWords per minute: %.2f%n", wordPerMinute);
        System.out.println("Character per minute: " + characterPerMinute);
        System.out.printf("Word Accuracy: %.2f%%%n", wordAccuracy);
        System.out.printf("Character Accuracy: %.2f%%%n", characterAccuracy);

        myScanner.close();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            int wordsNeeded = Integer.parseInt(args[0]);
            typeTest(wordsNeeded);
        } else
            takeManualInput();
    }

    public static void takeManualInput () {
        Scanner myScanner = new Scanner(System.in);
        int wordsNeeded;

        System.out.print("Enter number of words for the sentence: ");
        wordsNeeded = myScanner.nextInt();

        typeTest(wordsNeeded);

        myScanner.close();
    }
}
