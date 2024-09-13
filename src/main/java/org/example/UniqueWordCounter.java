package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class UniqueWordCounter {
    public void countUniqueWords() {
        try {
            String textInput = FileUtils.readFileToString(new File("text_to_read.txt"), "UTF-8");

            String[] words = StringUtils.split(textInput);

            //create a HashSet and iterate over each word and add to the HashSet
            Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

            int uniqueWordCount = uniqueWords.size();

            FileUtils.writeStringToFile(new File("text_unique_words.txt"), "Unique word count: " + uniqueWordCount, "UTF-8");

            System.out.println("Unique word count: " + uniqueWordCount);
        } catch (IOException e) {
            System.err.println("Error reading or writing file: " + e.getMessage());
        }
    }

}
