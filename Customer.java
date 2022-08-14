////////////////////////////////////////////////////////////////////////////////
//File:              Customer.java
// Course:           CSC232A, Fall2022
// Authors:          Mustafa Mudassar/Suleman Baloch
//
// Acknowledgements: 
//
// Online sources:   
////////////////////////////////////////////////////////////////////////////////

/**
   Customer class simulates customers.

   @author Mustafa Mudassar/Suleman Baloch<mustafamudassar_2024@depauw.edu/SulemanBaloch_2024@depauw.edu>
*/

class Customer {
  private String name;
  private Integer arrivalTime;
  public Customer(String name, Integer arrivalTime){
    this.name = name;
    this.arrivalTime = arrivalTime;
  }
  
  /**
    Get the customer's name.
    @return the customer's name
  */
  public String getName(){
    return name;
  }
  /**
    Get the customer's arrival time.
    @return the customer's arrival time
  */
  public Integer getArrivalTime(){
    return arrivalTime;
  }

  /**
    List the customer information.
    @param name name of the customer to be listed
    @param arrivalTime arrival time of the customer to be listed
    @return the String representation of the customer information
  */
  public String toString(Customer customerObject){
    String name = customerObject.getName();
    int arrivalTime = customerObject.getArrivalTime();
    return "Customer { name: " + name + ", arival time: " + arrivalTime + " }";
  }
}