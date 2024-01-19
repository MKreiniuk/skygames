package skytecgames.com.model;

import junit.framework.TestCase;
//import org.junit.Test;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotEquals;


class ClanDTOTest extends TestCase {

    @Test
   public void testEquals() {
        ClanDTO test1 = new ClanDTO(1, "Test1", 100);
        ClanDTO test2 = new ClanDTO(1, "Test2", 200);
        assertEquals(test1, test2);
        test2.setId(2);
        assertNotEquals(test1, test2);
    }


}