package qa2019;

import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.Test;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
    }

    @Test
    public static void testStuff() {
        assertEquals(3.0f, 3.0f);
        assertEquals(4.0f, 3.0f);
    }

}
