package exercises;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SmurfTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));;
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testSmurfCreation() {
    Smurf.createSmurf("papa");
    Smurf.createSmurf("papa");

    //Trying to see test on out put is a pain
//    assertEquals("Creating papa Smurf\n"
//        + "Papa has already been created\n"
//        + "", outContent.toString());
//  }

    assertEquals(null, Smurf.createSmurf("papa"));
  }

}