////////////////////////////////////////////////////////////////////////////////
//File:              WaitingLine.java
// Course:           CSC232A, Fall2022
// Authors:          Mustafa Mudassar/Suleman Baloch
//
// Acknowledgements: 
//
// Online sources:   
////////////////////////////////////////////////////////////////////////////////
import java.util.ArrayList;

class WaitingLine{
  private ArrayList<Customer> customerList;  
  public WaitingLine(){
    customerList = new ArrayList<Customer>();
  }

  /**
    Add a customer in the waiting list.
    @param customerObject customer to be added to the list
  */
  public void addCustomer(Customer customerObject){
    customerList.add(customerObject);
  }

  /**
    Remove a customer from the waiting list.
    @param customerObject customer to be removed
  */
  public void removeCustomer(Customer customerObject){
    for(int i = 0; i < customerList.size(); i++){
      if(customerList.get(i) == customerObject){
        customerList.remove(i);
        break;
      }
      else if(i == customerList.size()-1){
        System.out.println("Customer not found on the waiting line.");
      }
    }
    return;
  }

  /**
    Checks if the waiting line is empty.
  */
  public boolean waitingLineIsEmpty(){
    if(customerList.size() == 0){
      return true;
    }
    return false;
  }

  /**
    Get the number of customers in the waiting list.
  */
  public int getWaitingLineSize(){
    return customerList.size();
  }
  
  /**
    Get the customer's information specified by the index parameter.
    @param index specifies the index of the customer in the list
  */
  public Customer get(int index){
    return customerList.get(index);
  }

  /**
    Implement the sortWaitingLine method with the private customerList variable that belongs to the WaitingLine class.
  */
  public void sortArrivalTime(){
    sortWaitingLine(customerList);
    return;
  }
  
  /**
    Sort the customer information according to their arrival time. It uses quick sort.
    @param givenCustomerList list of the customer information
  */
  public void sortWaitingLine(ArrayList<Customer> givenCustomerList) {
    if(givenCustomerList.size() <= 1){
      return;
    }
    ArrayList<Customer> small = new ArrayList<Customer>();
    ArrayList<Customer> large = new ArrayList<Customer>();
    Customer pivot = givenCustomerList.get(0);
    for(int i = 1; i < givenCustomerList.size(); i++){
      if(givenCustomerList.get(i).getArrivalTime() < pivot.getArrivalTime()){
        small.add(givenCustomerList.get(i));
      }
      else{
        large.add(givenCustomerList.get(i));
      }
    }
    sortWaitingLine(small);
    sortWaitingLine(large);
    givenCustomerList.clear();
    givenCustomerList.addAll(small);
    givenCustomerList.add(pivot);
    givenCustomerList.addAll(large);
    return;
  }
}