import java.util.ArrayList;

public class FindAndReplace {
  public static void main(String[] args) {

  }
  public static String findReplace(String input, String toFind, String toReplace) {
    String[] phraseSplit = input.split(" ");
    String lowerCaseFind = toFind.toLowerCase();
    for ( Integer i = 0; i < phraseSplit.length; i++) {
      String lowerCaseIndex = phraseSplit[i].toLowerCase();
      if (lowerCaseIndex.equals(lowerCaseFind)) {
      phraseSplit[i] = lowerCaseIndex.replace(toFind, toReplace);
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
