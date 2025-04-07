package StringProblems;

public class CheckIfCharacterExistsInString {
    public static void main(String[] args) {
        String str = "PrabhakaranR";
        char target = 'z';
        System.out.println(search(str, target));
    }

    static boolean search(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
