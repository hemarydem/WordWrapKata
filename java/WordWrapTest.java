import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordWrapTest {

    @Test
    public void oneLongLine() {
        String inputString = "012345678901234567890123456789";

        String expectedtring = "012345678901234567890123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void simpleBreakAtLimit() {
        String inputString = "01234567890123456789 0123456789";

        String expectedtring = "01234567890123456789\n0123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void simpleBreakBeforeLimit() {
        String inputString = "01234567890 1234567890123456789";

        String expectedtring = "01234567890\n1234567890123456789";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaks() {
        String inputString = "01234567890 12345678901234567890 1234567890";

        String expectedtring = "01234567890\n12345678901234567890\n1234567890";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaksComplex() {
        String inputString = "01234567890 12345678 901234567890 1234567890";

        String expectedtring = "01234567890 12345678\n901234567890\n1234567890";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void twoBreaksWithLongWord() {
        String inputString = "0123456789012345 1234567890123456789012345 1234567890";

        String expectedtring = "0123456789012345\n1234567890123456789012345\n1234567890";

        assertEquals(expectedtring, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void lorem40Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                "Lorem ipsum dolor sit amet, consectetur\n" +
                        "adipiscing elit, sed do eiusmod tempor\n" +
                        "incididunt ut labore et dolore magna\n" +
                        "aliqua. Ut enim ad minim veniam, quis\n" +
                        "nostrud exercitation ullamco laboris\n" +
                        "nisi ut aliquip ex ea commodo\n" +
                        "consequat. Duis aute irure dolor in\n" +
                        "reprehenderit in voluptate velit esse\n" +
                        "cillum dolore eu fugiat nulla pariatur.\n" +
                        "Excepteur sint occaecat cupidatat non\n" +
                        "proident, sunt in culpa qui officia\n" +
                        "deserunt mollit anim id est laborum.";


        assertEquals(expectedString, WordWrap.wordWrap(inputString, 40));
    }


    @Test
    public void lorem20Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                "Lorem ipsum dolor\n" +
                        "sit amet,\n" +
                        "consectetur\n" +
                        "adipiscing elit,\n" +
                        "sed do eiusmod\n" +
                        "tempor incididunt\n" +
                        "ut labore et dolore\n" +
                        "magna aliqua. Ut\n" +
                        "enim ad minim\n" +
                        "veniam, quis\n" +
                        "nostrud\n" +
                        "exercitation\n" +
                        "ullamco laboris\n" +
                        "nisi ut aliquip ex\n" +
                        "ea commodo\n" +
                        "consequat. Duis\n" +
                        "aute irure dolor in\n" +
                        "reprehenderit in\n" +
                        "voluptate velit\n" +
                        "esse cillum dolore\n" +
                        "eu fugiat nulla\n" +
                        "pariatur. Excepteur\n" +
                        "sint occaecat\n" +
                        "cupidatat non\n" +
                        "proident, sunt in\n" +
                        "culpa qui officia\n" +
                        "deserunt mollit\n" +
                        "anim id est laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 20));
    }

    @Test
    public void lorem10Max() {

        String inputString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

        String expectedString =
                "Lorem\n" +
                        "ipsum\n" +
                        "dolor sit\n" +
                        "amet,\n" +
                        "consectetur\n" +
                        "adipiscing\n" +
                        "elit, sed\n" +
                        "do\n" +
                        "eiusmod\n" +
                        "tempor\n" +
                        "incididunt\n" +
                        "ut labore\n" +
                        "et dolore\n" +
                        "magna\n" +
                        "aliqua.\n" +
                        "Ut enim\n" +
                        "ad minim\n" +
                        "veniam,\n" +
                        "quis\n" +
                        "nostrud\n" +
                        "exercitation\n" +
                        "ullamco\n" +
                        "laboris\n" +
                        "nisi ut\n" +
                        "aliquip\n" +
                        "ex ea\n" +
                        "commodo\n" +
                        "consequat.\n" +
                        "Duis aute\n" +
                        "irure\n" +
                        "dolor in\n" +
                        "reprehenderit\n" +
                        "in\n" +
                        "voluptate\n" +
                        "velit\n" +
                        "esse\n" +
                        "cillum\n" +
                        "dolore eu\n" +
                        "fugiat\n" +
                        "nulla\n" +
                        "pariatur.\n" +
                        "Excepteur\n" +
                        "sint\n" +
                        "occaecat\n" +
                        "cupidatat\n" +
                        "non\n" +
                        "proident,\n" +
                        "sunt in\n" +
                        "culpa qui\n" +
                        "officia\n" +
                        "deserunt\n" +
                        "mollit\n" +
                        "anim id\n" +
                        "est\n" +
                        "laborum.";

        assertEquals(expectedString, WordWrap.wordWrap(inputString, 10));
    }
}
