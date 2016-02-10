import org.junit.*;
import static org.junit.Assert.*;

public class FindAndReplaceTest {

  @Test
  public void findReplace_changeAllInstanceOfOneWordToAnother_changedString() {
    FindAndReplace testFindAndReplace = new FindAndReplace();
    String userInput = "I went to sleep yesterday";
    assertEquals("I went to class yesterday", testFindAndReplace.findReplace(userInput, "sleep", "class"));
  }
  @Test
  public void findReplace_wontChangePartialWordMatches_changedString() {
    FindAndReplace testFindAndReplace = new FindAndReplace();
    String userInput = "I am walking my cat to the cathedral";
    assertEquals("I am walking my dog to the cathedral", testFindAndReplace.findReplace(userInput, "cat", "dog"));
  }
  @Test
  public void findReplace_willReplaceDifferentlyCapitalizedWords_changedString() {
    FindAndReplace testFindAndReplace = new FindAndReplace();
    String userInput = "I am walking my cat to the Park";
    assertEquals("I am walking my cat to the beach", testFindAndReplace.findReplace(userInput, "park", "beach"));
  }
}
