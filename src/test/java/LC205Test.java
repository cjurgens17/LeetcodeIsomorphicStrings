import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class LC205Test {

    @org.junit.Test
    public void isIsomorphic() {

        boolean one = LC205.isIsomorphic("egg","add");
        boolean two = LC205.isIsomorphic("foo","bar");
        boolean three = LC205.isIsomorphic("paper","title");

        assertTrue(one);
        assertFalse(two);
        assertTrue(three);
    }

    @org.junit.Test
    public void isSame() {
        Set<Character> set = new HashSet<>();
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        map.put('a','a');
        map.put('b','a');
        map2.put('a','b');
        map2.put('b','c');

        boolean one = LC205.isSame(set,map);
        boolean two = LC205.isSame(set,map2);

        assertFalse(one);
        assertTrue(two);

    }
}