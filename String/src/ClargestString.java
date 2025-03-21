public class ClargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "aan"};
        String largestLetter = fruits[0];
        String smallestLetter = fruits[0];

        for (int i = 1; i < fruits.length; i++) {
            if (largestLetter.compareTo(fruits[i]) < 0) {
                largestLetter = fruits[i];
            }
            if (smallestLetter.compareTo(fruits[i]) > 0) {
                smallestLetter = fruits[i];
            }
        }

        System.out.println("The largest string is: " + largestLetter);
        System.out.println("The smallest string is: " + smallestLetter);
    }
}
