import org.example.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PhoneBookTest {

    @Test
    public void testAdd() {
        int expected1 = 1;
        int expected2 = 2;
        int expected3 = 2;

        Assertions.assertEquals(expected1, PhoneBook.add("Александр", "+74957480110"));
        Assertions.assertEquals(expected2, PhoneBook.add("Павел", "89613795611"));
        Assertions.assertEquals(expected3, PhoneBook.add("Александр", "+79871234569"));
    }
    @Test
    public  void testFindByNumber() {
        String expected = "Павел";
        PhoneBook.add("Павел", "+74957894561");
        Assertions.assertEquals(expected, PhoneBook.findByNumber("+74957894561"));
        Assertions.assertNull(PhoneBook.findByNumber("84957418520"));
    }

    @Test
    public void testFindByName() {
        String expected = "+74957894561";
        PhoneBook.add("Павел", "+74957894561");
        Assertions.assertEquals(expected, PhoneBook.findByName("Павел"));
        Assertions.assertNull(PhoneBook.findByName("Олег"));
    }
}
