import org.example.PhoneBook;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void testAdd() {
        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 2;

        Assert.assertEquals(expected1, phoneBook.add("Александр", "+74957480110"));
        Assert.assertEquals(expected2, phoneBook.add("Павел", "89613795611"));
        Assert.assertEquals(expected3, phoneBook.add("Александр", "+79871234569"));
    }
    @Test
    public  void testFindByNumber() {
        String expected = "Павел";
        PhoneBook.add("Павел", "+74957894561");
        Assert.assertEquals(expected, phoneBook.findByNumber("+74957894561"));
        Assert.assertEquals(null, phoneBook.findByNumber("84957418520"));
    }

    @Test
    public void testFindByName() {
        String expected = "+74957894561";
        phoneBook.add("Павел", "+74957894561");
        Assert.assertEquals(expected,phoneBook.findByName("Павел"));
        Assert.assertEquals(null,phoneBook.findByName("Олег"));
    }
}
