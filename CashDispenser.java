public class CashDispenser {
  private int num100;
  private int num20;
  private int num10;

  public void init() {
    System.out.println("CashDispenser.init"); 
  }

  public int getCash(int amount) {
    //Hundreds
    num100 = amount / 100;
    amount = amount % 100;

    //Twenties
    num20 = amount / 20;
    amount = amount % 20;

    //Tens
    num10 = amount / 10;
    amount = amount % 10;

    if (amount != 0) {  //Not in increments of 10 -- Error
      return -1;
    }
    return 0;
  }

  public String get100s() {
    return "100s: " + num100;
  }
  public String get20s() {
    return "20s: " + num20; 
  }
  public String get10s() {
    return "10s: " + num10;
  }

}