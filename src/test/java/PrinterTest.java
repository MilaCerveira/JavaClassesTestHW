import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;
    @Before public void before (){
        printer = new Printer(100, 50);
    }
    @Test
    public void hasSheets(){
        assertEquals(100, printer.getSheets());
    }
    @Test
    public void reducesToner(){
        assertEquals(49, printer.reduceToner());
    }
}
