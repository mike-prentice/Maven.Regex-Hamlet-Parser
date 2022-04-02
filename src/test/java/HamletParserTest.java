import org.junit.Before;
import org.junit.Test;

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
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {
        // Given

        //When
        HamletParser.findHoratio(hamletText);
        System.out.println(hamletText);
        //Then
    }

    @Test
    public void testFindHamlet() {
        // Given
        //When
        HamletParser.findHamlet();
        //Then
    }
}