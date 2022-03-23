public class ATM {
  private LCD lcd;
  private Keypad keypad;
  private CardReader card;
  private CashDispenser cash;
 
  public void init() {
    System.out.println("ATM.init");

    lcd = new LCD();
    lcd.init();

    keypad = new Keypad();
    keypad.init();

    card = new CardReader();
    card.init();

    cash = new CashDispenser();
    cash.init();


  }
  public void run() {
    System.out.println("ATM.run");

    String bank = "NewCo";
    System.out.println("ATM version 0.0.1");
    System.out.println("Copyright (C) 2021 " + bank);
    System.out.println("Code By Leo Castillo");

    User user = new User(lcd, keypad, card, cash);
    while(true) {
      user.io();
    }

  }
}