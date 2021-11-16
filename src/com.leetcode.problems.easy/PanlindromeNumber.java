
public class PanlindromeNumber {

  public static void main(String... args) {
    int number1 = 123454321;
    int number2 = -121;
    int number3 = 1234554321;
    int number4 = 12345;

    System.out.println("Is " + number1 + " a palindrome: " + isPalindrome(number1));
    System.out.println("Is " + number2 + " a palindrome: " + isPalindrome(number2));
    System.out.println("Is " + number3 + " a palindrome: " + isPalindrome(number3));
    System.out.println("Is " + number4 + " a palindrome: " + isPalindrome(number4));
  }

  // 1. Converting int to String
  static boolean isPalindromeConvterInt(int x) {
    String str = String.valueOf(x);
    int len = str.length();
    int start = 0;
    int end = len - 1;
    while(start < end) {
      if(str.charAt(start) == str.charAt(end)) {
        start++;
        end--;
      } else {
        return false;
      }
    }
    return true;
  }

  // 2. Without converting int to String and not using additional memory
  static boolean isPalindrome(int x) {
    int reverse = 0;
    int n = x;
    if(x < 0) {
      return false;
    }

    while(n != 0) {
      reverse = reverse * 10 + n % 10;
      n = n / 10;
    }

    if(reverse == x) {
      return true;
    }
    return false;
  }
}
