# Week 11

## Structural Design Patterns

### 1. Adapter Pattern

- Helps connect two things together even when they are not compatible 

#### Real World Example

- You have a three pin plug charger 
- But the switch has two pin socket
- So you use an adapter to plug in your charger to the switch

#### Computer World Example

- Suppose you have a UI and database
- The database is designed to expect a certain amount of data
- In future you modify the application to accept a new type of data 
- Since you cannot accept that data in the database directly and you cannot modify the main functionality so you just create an adapter class that transforms the new data to the required data


#### Class Example

![Adapter Code Example](./Week%2011%20images/Adapter%20Code%20Example.png)

![Adapter main function](./Week%2011%20images/Adapter%20main%20function.png)

- Adapter Code Example: [code](./Week%2011%20codes/Adapter%20Code%20Example.java)

#### Advantages

- Facilitates the integration of different systems by providing common interfacef that both can understand
- Seperates client code from adaptee code 

#### Disadvantages

- Adds additional layer of complexity to the code
- Additional performance overhead as additional processing may be required to translate data between interfaces
- If tight coupling exixt between adapter and adaptee then a dependency will be created that makes it harder for the adaptee to be modified

---

### 2. Facade Pattern

- Implements abstraction and hides compelxity by providing a simplified interface to interact with all interfaces
- Instead of interacting with multiple objects in a complicated way, you just interact with a single object
- Supports loose coupling
- Emphasize the abstraction and hide the complex details by exposing a simple interface

#### Real World Example

- Suppose you want to arrange a party for 500 people 
- So you go to an event organizer and tell them the details of the event
- You dont need to personally worry about the arrangements as the organizer does that for you 

#### Computer World Example

- Suppose you use the `.length()` method from the `<strings>` library
- You dont need to know:
    - How this method is implemented in the library
    - What other methods are defined there
- You just run the method and get your desired output

#### Class Example

![Facade Code Example(1)](./Week%2011%20images/Facade%20Code%20Example(1).png)
![Facade Class Implementation](.//Week%2011%20images/Facade%20Class%20Implementation.png)
![Facade Class main function](./Week%2011%20images/Facade%20Class%20main%20function.png)

- Facade Method Code Example: [Code](./Week%2011%20codes/Facade%20Code%20Example.java)
- Code Explanation: [link](https://chatgpt.com/s/t_691f5e6c6c808191ab063c0f17330c1a)

#### Advantages

- Minimizes complexity of subsystems
- Aids principle of loose coupling
- Software becomes more flexible and easily expandable

#### Disadvantages

- Complex implementation
- Additonal level of indirection 
- High degree of dependence on facade interface

---
