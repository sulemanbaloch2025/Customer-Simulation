////////////////////////////////////////////////////////////////////////////////
//File:              Main.java
// Course:           CSC232A, Fall2022
// Authors:          Mustafa Mudassar/Suleman Baloch
//
// Acknowledgements: 
//
// Online sources:   
////////////////////////////////////////////////////////////////////////////////

/**
   Main class simulates customers.

*/

class Main {
  public final static WaitingLine waitingLine = new WaitingLine();

  /**
    Add the customer information, create a list, sort the information according to the arrival time, and remove customer after serving.
    @param args not used
  */
  public static void main(String[] args) {
    waitingLine.addCustomer(new Customer("Mustafa", 50));
    waitingLine.addCustomer(new Customer("Suleman", 12));
    waitingLine.addCustomer(new Customer("Murtaza", 31));
    waitingLine.addCustomer(new Customer("Gibran", 43));
    waitingLine.addCustomer(new Customer("Maaz", 1));
    System.out.println("creating list:");
    for(int i = 0; i < waitingLine.getWaitingLineSize(); i++){   
      System.out.println(waitingLine.get(i).toString(waitingLine.get(i)));
    }
    
    waitingLine.sortArrivalTime();
    
    System.out.println("serving list:");
    while(waitingLine.waitingLineIsEmpty() == false){
      System.out.println(waitingLine.get(0).toString(waitingLine.get(0)));
      waitingLine.removeCustomer(waitingLine.get(0));
    }

    if(waitingLine.waitingLineIsEmpty()){
      System.out.println(" No customer waiting currently."); 
    }
  }
}