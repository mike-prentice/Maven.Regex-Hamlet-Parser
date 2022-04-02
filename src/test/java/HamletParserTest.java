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
    public void changeWholeDocumentTest() {
        HamletParser.findAndChangeHamlet();
        HamletParser.findAndChangeHoratio();
        HamletParser.print();
    }


    @Test
    public void testFindAndChangeHoratio() {
        //Given
        //When
        //Then

    }

    @Test
    public void testFindAndChangeHamlet() {
        //Given
        //When
        //Then

    }
}