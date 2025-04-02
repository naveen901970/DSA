public class Toremoveduplicates {

    public static void to_remove_dupplicates_in_string(String strg, int index, StringBuilder newstr, boolean map[]) {
        if (index == strg.length()) {
            System.out.println(newstr);
            return;
        }
        char currchar = strg.charAt(index);// i was worng becuse i was used the int os it gives in nunber
        if (map[currchar - 'a'] == true) {
            to_remove_dupplicates_in_string(strg, index + 1, newstr, map);
        } else {
            map[currchar - 'a'] = true;
            to_remove_dupplicates_in_string(strg, index + 1, newstr.append(currchar), map);
        }
    }

    public static void main(String[] args) {
        String strg = "apnacollege";
        to_remove_dupplicates_in_string(strg, 0, new StringBuilder(""), new boolean[26]);
    }
}
/*
 * Code Explanation
 * Method: to_remove_dupplicates_in_string
 * Parameters:
 * 
 * strg: The original string (e.g., "apnacollege").
 * 
 * index: The current index being processed.
 * 
 * newstr: A StringBuilder that accumulates the non-duplicate characters.
 * 
 * map: A boolean array of size 26 (for letters 'a' to 'z'). It keeps track of
 * whether a character has been seen already.
 * 
 * How It Works:
 * Base Case:
 * 
 * When index equals strg.length(), the method prints the final newstr (which
 * contains the string without duplicates) and returns.
 * 
 * Processing Each Character:
 * 
 * Retrieve the current character:
 * currchar = strg.charAt(index).
 * 
 * Check if the character has already been added:
 * 
 * The code uses the expression map[currchar - 'a'] to check the flag for that
 * character.
 * 
 * If true:
 * The character is a duplicate, so it skips adding it and moves to the next
 * index.
 * 
 * If false:
 * It marks the character as seen (map[currchar - 'a'] = true) and appends the
 * character to newstr.
 * 
 * Recursive Call:
 * The function then recursively calls itself with the next index.
 * 
 * Visualization: Recursion Flow for "apnacollege"
 * Let's walk through how the method processes "apnacollege":
 * 
 * Index 0: 'a'
 * 
 * Map check: 'a' not seen → mark as seen.
 * 
 * StringBuilder: Append 'a'.
 * 
 * New newstr: "a"
 * 
 * Index 1: 'p'
 * 
 * Map check: 'p' not seen → mark as seen.
 * 
 * StringBuilder: Append 'p'.
 * 
 * New newstr: "ap"
 * 
 * Index 2: 'n'
 * 
 * Map check: 'n' not seen → mark as seen.
 * 
 * StringBuilder: Append 'n'.
 * 
 * New newstr: "apn"
 * 
 * Index 3: 'a'
 * 
 * Map check: 'a' is already seen → do not append.
 * 
 * New newstr: Remains "apn"
 * 
 * Index 4: 'c'
 * 
 * Map check: 'c' not seen → mark as seen.
 * 
 * StringBuilder: Append 'c'.
 * 
 * New newstr: "apnc"
 * 
 * Index 5: 'o'
 * 
 * Map check: 'o' not seen → mark as seen.
 * 
 * StringBuilder: Append 'o'.
 * 
 * New newstr: "apnco"
 * 
 * Index 6: 'l'
 * 
 * Map check: 'l' not seen → mark as seen.
 * 
 * StringBuilder: Append 'l'.
 * 
 * New newstr: "apncol"
 * 
 * Index 7: 'l'
 * 
 * Map check: 'l' is already seen → do not append.
 * 
 * New newstr: Remains "apncol"
 * 
 * Index 8: 'e'
 * 
 * Map check: 'e' not seen → mark as seen.
 * 
 * StringBuilder: Append 'e'.
 * 
 * New newstr: "apncole"
 * 
 * Index 9: 'g'
 * 
 * Map check: 'g' not seen → mark as seen.
 * 
 * StringBuilder: Append 'g'.
 * 
 * New newstr: "apncoleg"
 * 
 * Index 10: 'e'
 * 
 * Map check: 'e' is already seen → do not append.
 * 
 * New newstr: Remains "apncoleg"
 * 
 * Index 11 (Base Case):
 * 
 * Since index == strg.length(), the recursion ends and "apncoleg" is printed.
 * 
 * Flow Diagram
 * Here's a simplified diagram representing the recursive calls:
 * 
 * sql
 * Copy
 * Edit
 * Start: to_remove_dupplicates_in_string("apnacollege", 0, "", map=[false...])
 * │
 * ├─ Index 0: 'a' → not seen → newstr = "a", mark 'a'
 * │ │
 * │ └─ Call with index 1
 * │
 * ├─ Index 1: 'p' → not seen → newstr = "ap", mark 'p'
 * │ │
 * │ └─ Call with index 2
 * │
 * ├─ Index 2: 'n' → not seen → newstr = "apn", mark 'n'
 * │ │
 * │ └─ Call with index 3
 * │
 * ├─ Index 3: 'a' → already seen → newstr remains "apn"
 * │ │
 * │ └─ Call with index 4
 * │
 * ├─ Index 4: 'c' → not seen → newstr = "apnc", mark 'c'
 * │ │
 * │ └─ Call with index 5
 * │
 * ├─ Index 5: 'o' → not seen → newstr = "apnco", mark 'o'
 * │ │
 * │ └─ Call with index 6
 * │
 * ├─ Index 6: 'l' → not seen → newstr = "apncol", mark 'l'
 * │ │
 * │ └─ Call with index 7
 * │
 * ├─ Index 7: 'l' → already seen → newstr remains "apncol"
 * │ │
 * │ └─ Call with index 8
 * │
 * ├─ Index 8: 'e' → not seen → newstr = "apncole", mark 'e'
 * │ │
 * │ └─ Call with index 9
 * │
 * ├─ Index 9: 'g' → not seen → newstr = "apncoleg", mark 'g'
 * │ │
 * │ └─ Call with index 10
 * │
 * ├─ Index 10: 'e' → already seen → newstr remains "apncoleg"
 * │ │
 * │ └─ Call with index 11 (base case)
 * │
 * End: Print "apncoleg"
 * Conclusion
 * StringBuilder Usage:
 * 
 * Efficiently builds the result without creating multiple immutable String
 * objects.
 * 
 * Boolean Map:
 * 
 * Keeps track of which characters have already been added to avoid duplicates.
 * 
 * Recursion:
 * 
 * Processes each character sequentially and builds the final string as it
 * unwinds.
 * 
 * The code removes duplicate characters from the input string "apnacollege" and
 * prints "apncoleg". This approach is efficient for problems where you want to
 * process each character only once and build a result dynamically.
 * 
 * If you need further clarification or additional diagrams, feel free to ask!
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * You said:
 * any worng in code
 * 
 * 
 * ChatGPT said:
 * Reasoned for 7 seconds
 * The logic of your code is correct for removing duplicate characters from a
 * lowercase alphabetic string. However, here are a few points and minor
 * improvements you might consider:
 * 
 * Naming Conventions & Typos:
 * 
 * The method name "to_remove_dupplicates_in_string" has a typo ("dupplicates"
 * should be "duplicates").
 * 
 * Consider using camelCase for method names (e.g., removeDuplicatesInString).
 * 
 * Handling Only Lowercase Letters:
 * 
 * The boolean array map is of size 26 and uses the expression currchar - 'a',
 * which works fine for lowercase letters only. If you plan to handle uppercase
 * or other characters, you’ll need to adjust the mapping.
 * 
 * Use of StringBuilder:
 * 
 * Since StringBuilder is mutable, appending in the recursive call modifies the
 * same instance throughout the recursion. In your case, this is acceptable
 * because you only have one path through the recursion (you don’t need to
 * backtrack).
 * 
 * If you intended to use backtracking (i.e., exploring multiple branches),
 * you’d need to remove the last character after the recursive call returns. But
 * for this one-path scenario, it’s fine.
 * 
 * Output vs. Return:
 * 
 * Your method prints the result directly instead of returning it. Depending on
 * your requirements, you might want to return the final string instead.
 */