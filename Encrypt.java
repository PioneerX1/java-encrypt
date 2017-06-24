import java.io.Console;

//state purpose
//read input
//encrypt input
//output encrypted message

public class Encrypt {
  public static void main(String[] args) {
    System.out.println("This program will encrypt a phrase. Please enter a message below.");
    String inputPhrase = inputMessage();
    String encryption = encryptMessage(inputPhrase);
    outputMessage(encryption);
  }

  public static String inputMessage() {
    Console myConsole = System.console();
    String userPhrase = myConsole.readLine();
    return userPhrase;
  }

  public static String encryptMessage(inputPhrase) {
    String newMessage = inputPhrase.replaceAll("e", "$");
    newMessage = newMessage.replaceAll("a", "%");
    newMessage = newMessage.replaceAll("i", "*");
    newMessage = newMessage.replaceAll("o", "@");
    newMessage = newMessage.replaceAll("u", "!");
    newMessage = newMessage.replaceAll("s", "#");
    newMessage = newMessage.replaceAll("t", "^");
    return newMessage;
  }

  public static void outputMessage(phrase) {
    System.out.println(phrase);
  }
}
