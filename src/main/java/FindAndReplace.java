import java.util.ArrayList;

public class FindAndReplace {
  public static void main(String[] args) {

  }
  public static String findReplace(String input, String toFind, String toReplace) {
    String[] phraseSplit = input.split(" ");
    for ( Integer i = 0; i < phraseSplit.length; i++) {
      if (phraseSplit[i].equals(toFind)) {
      phraseSplit[i] = phraseSplit[i].replace(toFind, toReplace);
      }
    }
    String finishedPhrase = "";
    for ( String phraseWord : phraseSplit) {
      finishedPhrase = finishedPhrase + " " + phraseWord;
    }
    finishedPhrase = finishedPhrase.trim();
    return finishedPhrase;
  }

}
