# CUSTOMER-SIMULATION
Project for Object Orientated Software Development CSC 232B Class

This problem involves the design and implementation of two classes that are helpful in simulating a customer service system. The idea is that the simulation is of an office (perhaps a bank, or the DMV) with multiple stations, and customers may need to enter several waiting lines over the course of their visit. Each time they enter a line, their priority in the line is determined by when they first entered the office, so that someone who has been around for several hours going from station to station will be served in front of someone else who has just arrived.
PART 1: MODELING CUSTOMERS
You should create a class called Customer that contains fields describing a customer in the simulation. It should at least contain a String giving the customer name and an int giving an arrival time. Feel free to include other fields such as age, email address, and how much money they have (although these will not be used in this problem).

The Customer class needs an appropriate constructor, getters, and setters (if applicable), as well as a toString() method that returns a String representation of the customer such as the following:

"Customer { name: Brian Howard, age: 55, arrival time: 47 }"
PART 2: MODELING WAITING LINES
Create a class called WaitingLine that behaves like a queue or a stack; that is, it should have methods to add and remove Customer objects, as well as a boolean method to check whether it is empty. It may have other methods as well, such as returning the current number of customers in the line or "peeking" at the customer at the head of the line without removing them, but these are not necessary for this problem.

The rule for which customer is at the head of the line (the next to be removed) is that it must be the one with the smallest arrival time (if more than one customer has the same arrival time, you may choose any of them). This means that the line is a "priority queue", where the smallest waiting time has the highest priority. You are free to choose any implementation of this that you wish, although you should try to make it reasonably efficient. You may assume that a waiting line will never have more than 100 customers, if that helps.
PART 3: CREATE A SIMPLE DRIVER CLASS
For testing purposes, create a main method that constructs several customers with a variety of arrival times, prints them to the console, then adds them to a waiting line. Write a loop that empties the waiting line and prints each customer in the order in which they are removed
