public class User {
  private LCD lcd;
  private Keypad keypad;
  private CardReader card;
  private CashDispenser cash;
    
  public User(LCD lcd, Keypad keypad, CardReader card, CashDispenser cash) {
    this.lcd = lcd;
    this.keypad = keypad;
    this.card = card;
    this.cash = cash;
  }
  
  public void io() {
    
    try {
      Thread.sleep(2000);
    } catch (Exception ex) {
      System.out.println(ex);
    }



    lcd.print("Welcome!");
    lcd.print("Press ENTER to begin: ");

    CardReader.readCard();

    lcd.print("Please Enter Your 4-Digit Pin: ");
    Keypad.enterPin();

    //Withdrawn Amount
    lcd.print("Enter Amount To Withdraw (Increments of 10): ");
    int amount = keypad.getAmount();

    int result = cash.getCash(amount);
    if (result == 1) {
      lcd.print("Cash Dispense Error\n");
    } else {
      lcd.print("Cash being dispensed:\n");
      lcd.print(cash.get100s());
      lcd.print(cash.get20s());
      lcd.print(cash.get10s());
      
      lcd.print("Thank you for service!\n");
      try {
        Thread.sleep(5000);
        System.out.println("Please wait...");
        Thread.sleep(5000);
      } catch (Exception ex) {
        System.out.println(ex);
      }
    }

    



  }
  
}