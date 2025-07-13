//Quiz 4-3 prob 10
package quiz0403;

public class ArrayPalindromeChecker {
    public static boolean isPalindrome(int[] list) {
        for(int i=0; i<list.length/2; i++) {
            if(list[i]!=list[list.length-1-i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] palindromeArray = {1, 2, 3, 2, 1};
        int[] nonPalindromeArray = {1, 2, 3, 4, 5};

        System.out.println("회문 확인: " + isPalindrome(palindromeArray));
        System.out.println("회문 확인: " + isPalindrome(nonPalindromeArray));

    }
}
