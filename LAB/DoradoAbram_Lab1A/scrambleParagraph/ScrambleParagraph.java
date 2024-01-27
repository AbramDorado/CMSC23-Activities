package ph.edu.upm.students.DoradoAbram_Lab1A.scrambleParagraph;

import ph.edu.upm.students.DoradoAbram_Lab1A.vehicleApp.IActivity;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ScrambleParagraph implements IActivity {

    public void showDescription() {

        System.out.println("PROGRAM DESCRIPTION:");
        System.out.println(" This program that asks the use to enter a complete paragraph of more than one sentence\n" +
                "using only periods for punctuation. The program should then alter the paragraph so that:");
        System.out.println("1. The sentences are in reverse order.");
        System.out.println("2. Each word in each sentence is in reverse order.");
        System.out.println("3. All the vowels of each word must be at the end of the words, preserving the order of the vowels in the reversed word");
        System.out.println("4. The first letter of each new sentence should be in uppercase and each new sentence should end with a period.");
        System.out.println("5. The capital letters of the old sentence should be converted to lowercase.");
        System.out.println();
    }

    private boolean vowelsChecker(Character letter){
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
            return true;
        else
            return false;
    }

    private String moveToLast(String newWordReversed){

        char[] arrOfNewWordReversed = newWordReversed.toCharArray();
        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        for(Character letter : arrOfNewWordReversed){
            if(vowelsChecker(letter)){
                vowels.append(letter);
            }
            else{
                consonants.append(letter);
            }
        }
        return consonants.toString() + vowels;
    }

    private String wordScramble(String word){

        word = word.toLowerCase(); // convert lower case
        if(word.length() == 1){
            return word;
        }
        else{
            char[] wordArray = word.toCharArray();
            Character lastLetter = wordArray[wordArray.length-1];

            StringBuilder newWordReversed = new StringBuilder();
            newWordReversed.append(lastLetter);
            newWordReversed.append(wordScramble(word.substring(0, word.length()-1) ) );
            String finalWord = moveToLast(newWordReversed.toString());

            return finalWord;
        }
    }

    private String capitalizer(String word){
        char[] arrOfWords = word.toCharArray();
        String firstLetter = String.valueOf(arrOfWords[0]);
        Integer letterCount = arrOfWords.length;

        StringBuilder newWord = new StringBuilder();
        newWord.append(firstLetter.toUpperCase());

        for (int i = 1; i < letterCount; i++) {
            newWord.append(arrOfWords[i]);
        }
        return newWord.toString();
    }


    public void execute() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a paragraph: ");
        String paragraphString = input.nextLine();

        //tokenize the string to be able to split
        StringTokenizer sentences = new StringTokenizer(paragraphString, ".");
        Integer numOfSentence = sentences.countTokens();
        //instantiate the array that will contain all the sentences in the paragraph
        String[][] origParagraph = new String[numOfSentence][];

        Integer countOfWords;
        for (int i = 0; i < numOfSentence; i++) {
            String currentSentence = sentences.nextToken().trim();
            StringTokenizer words = new StringTokenizer(currentSentence, " ");

            countOfWords = words.countTokens();  //number of words in the current sentence
            String[] wordsArray = new String[countOfWords];

            for (int j = 0; j < countOfWords; j++) {
                String currentWord = words.nextToken().trim();
                wordsArray[j] = currentWord; //add the word in the wordsArray
            }
            origParagraph[i] = wordsArray;
        }
/////////////////////

        //reverse the sentences
        int i = 0;
        int j = numOfSentence-1;
        while(i<j){
            String[] temp = origParagraph[i];
            origParagraph[i] = origParagraph[j];
            origParagraph[j] = temp;
            i++;
            j--;
        }
///////////////////////

        for (String[] sentence : origParagraph){

            //reverse the words
            countOfWords = sentence.length;
            int k = 0;
            int l = countOfWords - 1;

            while(k<l){
                String temp = sentence[k];
                sentence[k] = sentence[l];
                sentence[l] = temp;
                k++;
                l--;
            }

            //Moving the vowels at the end of the word
            for (int m = 0; m < countOfWords; m++) {
                String getWord = sentence[m];
                getWord = wordScramble(getWord);

                if(m==0){ //if first word
                    getWord = capitalizer(getWord);
                    sentence[m] = getWord;
                } else if (m == countOfWords-1) { //if last word
                    getWord = getWord + ".";
                    sentence[m] = getWord;
                } else{
                    sentence[m] = getWord;
                }
            }
        }

        //Print the new paragraph that is scrambled
        for(String[] sentence : origParagraph){
            for(String word : sentence){
                System.out.print(word + " ");
            }
        }
    }
}
