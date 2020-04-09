import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWrapTest {

    @Test
    public void testWordWrap() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                "Lorem ipsum dolor\n" +
                        "sit amet, consectetur\n" +
                        "adipiscing elit,\n" +
                        "sed do eiusmod tempor\n" +
                        "incididunt ut labore\n" +
                        "et dolore magna\n" +
                        "aliqua. Ut enim ad\n" +
                        "minim veniam, quis\n" +
                        "nostrud exercitation\n" +
                        "ullamco laboris nisi ut\n" +
                        "aliquip ex ea\n" +
                        "commodo consequat. Duis\n" +
                        "aute irure dolor in\n" +
                        "reprehenderit in\n" +
                        "voluptate velit esse\n" +
                        "cillum dolore eu fugiat\n" +
                        "nulla pariatur.\n" +
                        "Excepteur sint occaecat\n" +
                        "cupidatat non\n" +
                        "proident, sunt in culpa\n" +
                        "qui officia deserunt\n" +
                        "mollit anim id est laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 20));
    }
}
