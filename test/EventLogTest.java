import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventLogTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("tearing");
    }

    @Test
    public void addEvent() throws Exception {
        Event event1 = new Event("Event1", "PhoneCall");
        EventLog log = new EventLog();
        assertEquals(log.addEvent(event1) , true);
    }

    @Test
    public void getNumEvents() throws Exception {
        EventLog log = new EventLog();
        Event event1 = new Event("Event1", "PhoneCall");
        log.addEvent(event1);
        assertEquals(log.getNumEvents(), 1);
    }

}