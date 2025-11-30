# Week 10

# Design Patterns

- Way of reusing abstract knowledge about a problem and its solution
- Should be sufficiently abstract to be reused in different settings

## Categories

- ### Creational Design Patterns

    Deal with creation of object

- ### Structural Design Patterns

    Deal with class structure (Inheritance and Composition)

- ### Behavioural Design Patterns

    Provide solutions for better interaction b/w objects -> loose coupling and flexibility for ease of future extension

## Creational Design Patterns

### 1. Singleton Pattern

- You can create only one object for a class
- The created object should be used throughout the program

#### Real World Example

- You choose cricket team captain once for the whole tournament
- Captain is not usually re-elected for each match

#### Computer World Example

- Using of one file for centralized management of resources
- Implementation of caching mechanism
- Log Manager

#### Class Example

![Singleton Example](./Week%2010%20images/Singleton%20Example.png)

![Singleton main function](./Week%2010%20images/Singleton%20main%20function.png)

- Singleton Code Example: [Source Code](./Week%2010%20codes/singletoneg.java)

- Singleton Code Explanation: [Code Explanation](https://chatgpt.com/s/t_691e9c2d20ec8191a9cbe1ab2e1f01f1)

#### Advantages 

- Provides a single point of access to a shared resource (like database) that can:
    - reduce errors caused by multiple instances (objects)
    - simplify code

- Helps conserve memory and boost performance
- Can be used to prevent concurrent modifications to db objects

#### Disadavantages

- Can make testing harder as hidden dependencies can be introduced by singleton
- Can be source of contention in multithreaded aplications since multiple threads may attempt to modify singelton simultaneously
- Can lead to tight coupling if singleton instance is accessed from multiple classes or modules

---

### 2. Factory Method

- Create a abstract parent class (defines basic structure)
- The child classes define the object creation and other actual operations
- Follows **Open for extension Closed for Modification** principle

#### Real World Example

- Suppose a car manufacturing company is setting up its manufacturing plant
- So in order to run the business for long time and to support future car models the company will design the factory in such a way that it can produce parts for future car models as well

#### Computer World Example

- Suppose our application needs to support SQLServer as well as OracleDB connections
- So, whenever you insert a data into a database, you create a SQLServer–specific connection (SqlServerConnection) or an Oracle server – specific connection (OracleConnection) and then you can proceed
- If we use **if-else** clause here we will have have to repeat a lot of code
- Moreover if we need to add a new connection in future we will need to change all **if-else** clauses

#### Class Example

![Factory Method Example(1)](./Week%2010%20images/Factory%20Method%20Example(1).png)
![Factory Method Example(2)](./Week%2010%20images/Factory%20Method%20Example(2).png)

![Factory Method main function](./Week%2010%20images/Factory%20Method%20main%20function.png)

- Factory Method Code Example: [Source Code](./Week%2010%20codes/factorymethod.java)

- Factory Method Code Explanation: [Code Explanation](https://chatgpt.com/s/t_691eab2eb9448191b98cfe9f9f32ea34)

- Factory Method Explanation (Discussion, Benefits, Downsides) for this code is [here](https://chatgpt.com/s/t_691eb3fdc5288191bb5cd234688ee439) 

---