import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LC205 {
    public static void main(String[] args) {

        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("foo","bar"));
        System.out.println(isIsomorphic("paper","title"));

    }

    //Given two strings s and t, determine if they are isomorphic.
    //
    //Two strings s and t are isomorphic if the characters in s can be replaced to get t.
    //
    //All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
    //
    //
    //
    //Example 1:
    //
    //Input: s = "egg", t = "add"
    //Output: true
    //Example 2:
    //
    //Input: s = "foo", t = "bar"
    //Output: false
    //Example 3:
    //
    //Input: s = "paper", t = "title"
    //Output: true
    //
    //
    //Constraints:
    //
    //1 <= s.length <= 5 * 104
    //t.length == s.length
    //s and t consist of any valid ascii character.

    public static boolean isIsomorphic(String s, String t){
        Map<Character, Character> map = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if(arr1.length != arr2.length) return false;

        boolean flag = true;

        for(int i = 0;i<arr1.length;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],arr2[i]);
            }

            if(map.containsKey(arr1[i])){
                if(map.get(arr1[i]) != arr2[i]){
                    flag = false;
                }
                if(!flag) break;
            }
        }
        Set<Character> set = new HashSet<>();
        if(!isSame(set,map)) return false;

        return flag;

    }
    public static boolean isSame(Set<Character> set, Map<Character, Character> map){
        for(char ch: map.values()){
            if(!set.add(ch)) return false;
        }
        return true;
    }
}
