import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class PhoneBookTest {

    @Test
    public void testAdd() {
        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 2;

        Assert.assertEquals(expected1, PhoneBook.add("Александр", "+74957480110"));
        Assert.assertEquals(expected2, PhoneBook.add("Павел", "89613795611"));
        Assert.assertEquals(expected3, PhoneBook.add("Александр", "+79871234569"));
    }
}
