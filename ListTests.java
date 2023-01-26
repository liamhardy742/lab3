import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {

    private List<String> testList, outputList;
    private StringCheckerClass sc;

    @Before
    public void setUp() {
        testList = new ArrayList<>();
        outputList = new ArrayList<>();
        testList.add("One");
        testList.add("Two");
        testList.add("Three");
        testList.add("Four");
        sc = new StringCheckerClass("T");
        
    }

    @Test
    public void testFilterUsual() {
        outputList.add("Two");
        outputList.add("Three");
        print(ListExamples.filter(testList,sc));
        assertEquals(outputList,ListExamples.filter(testList,sc));
    }

    @Test
    public void testMerge() {
        outputList.add("A");
        outputList.add("Aba");
        outputList.add("Accsa");
        outputList.add("Capricorn");
        outputList.add("Decide");
        List<String> testList1 = new ArrayList<>();
        testList1.add("A");
        testList1.add("Capricorn");
        List<String> testList2 = new ArrayList<>();
        testList2.add("Aba");
        testList2.add("Accsa");
        testList2.add("Decide");
        assertEquals(outputList, ListExamples.merge(testList1, testList2));
    }

    public static void print(List<String> list) {
        System.out.println("{ ");
        for (int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i) + ", ");
        }
        System.out.println("}");
    }

    @Test
    public void testPrepend() {
        LinkedList testList = new LinkedList();
        testList.prepend(10);
        testList.prepend(20);
        assertEquals("testing root's value:",20,testList.root.value);
        assertEquals("testing root's next value:",10, testList.root.next.value);
    }
}