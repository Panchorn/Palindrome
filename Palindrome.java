public class Palindrome {  
  public static void main(String[] args) {
    String data = "Eva, can I see bees in a cave"; // "This message is not palindrome!!!"

    String input = data.replaceAll("\\W+", "").toLowerCase();
    boolean isPalindrome = true;
    int start = 0;
    int end = input.length()-1;
    while (start < end) {
      char firstChar = input.charAt(start++);
      char secondChar = input.charAt(end--);
      if (firstChar != secondChar) {
        System.out.println(firstChar + " != " + secondChar);
        isPalindrome = false;
        break;
      }
    }
    System.out.println(input + " is " + ((isPalindrome) ? "palindrome" : "not palindrome"));
  }
}