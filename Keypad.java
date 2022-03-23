import java.util.Scanner;
public class Keypad { 

static int entries = 0;

  public void init() {
    System.out.println("Keypad.init");
  }

  public int getAmount() {
    Scanner scan = new Scanner(System.in);
    scan.close();
    return scan.nextInt();

  }

  public static int enterPin() {
    Scanner pin = new Scanner(System.in);
    pin.close();
    int num = pin.nextInt();
      while (num < 999 && num < 10000) {
        System.out.println("Invalid Entry");
        entries += 1;
        System.out.println("Attempts: " + entries);
        return enterPin();
      }
    return num;
  }

  public static int getEntries() {
      return entries;
  }

}