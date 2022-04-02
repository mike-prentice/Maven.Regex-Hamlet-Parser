import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
    }

    @Test
    public void testChangeHoratioToTariq() throws IOException {
        String expected;

        String actual =HamletParser.changeHoratioToLeon();
    }

    @Test
    public void testFindHoratio() {
        //Given
        //When
        boolean actual = HamletParser.findHoratio(hamletText);
        //Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHamlet() {
        // Given
        String expected = "Found Hamlet";
        //When
        String actual = HamletParser.findHamlet(hamletText);
        //Then
        Assert.assertEquals(expected, actual);
    }
}