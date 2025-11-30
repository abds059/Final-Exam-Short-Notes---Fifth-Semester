# Week 12

## Behavioural Design Patterns

### 1. Template Method

- You define the main (core) structure of the program in the parent class
- The sub classes override some methods but dont usually change the core logic

- Use case -> Implementation of a multistep algorithm with customization allowed through subclasses

#### Real World Example

- Whether you want to make coffee or tea, some steps stay the same
    - Like you boil water 
    - Add sugar/milk
    - Serve 

- Only one step is different that depends on what you make
    - Like for coffee you add coffee powder
    - Or for tea you will add respective tea powder or leaves

#### Computer World Example

- Suppose you are creating a program to design courses (e.g, CS, Electrical, Mechanical)
- Every degree follows same basic structure 

    - **Semester 1** 
        - Same for all departments -> (Maths, Physics -  common subjects)
    - **Semesters 2 - 8** 
        - CS (DSA, OS, ML)
        - EE (Circuit Design, Signals, Power Systems)
        - ME (Mechanics, Thermodynamics, Fluid Mechanics)

#### Class Example

![Template Class](./Week%2012%20images/Template%20Class.png)
![Subclasses](./Week%2012%20images/Subclasses.png)
![main function](./Week%2012%20images/Template%20Class%20main%20function.png)

- **Template Class Code** can be found [here](./Week%2012%20codes/Template%20Code%20Example.java)
- **Code Explanation** can be found [here](https://chatgpt.com/s/t_69206d60bbec8191aebb36a8452cd2ec)

#### Advantages

- **Code Reusability**
    - Common steps are written once in the abstract class
    - Subclasses reuse these instead of rewriting them

- **Consistent Structure**
    - All subclasses follow the same sequence
    - This results in a program that is well organized and easier to understand

- **Easy To Extend**
    - You can add new subclasses to change only the special methods/steps
    - The main algorithm stays the same

#### Disadvantages

- **Less Flexibility**
    - Overall structure is fixed
    - If a subclass needs a different sequence, you must change the main template 

- **Can Become Complex**
    - If the algorithm has many steps then there would be many classes 
    - Many subclasses will result in high complexity
    - Becomes harder to track which subclass overwrites which step

---

### 2. Chain Of Responsibility Pattern

- Here we form a chain of handlers to handle a particular request
- If an object cannot handle the request, it passes request to next object in the chain
- The request is forwarded until an object handles the request

#### Real World Example

- Every organizations has customer care personal that handle customer complaints
- If the employee is unable to handle customer's complaint -> they forward it to the next department
- The receiver may forward it to the next department

#### Computer World Example

- Consider a software application that sends email and faxes
- Suppose we also have a customer support that handles customer issues
- For handling issues we have to handlers
    - **Fax Handler:** Handles fax issues
    - **Email Handlers:** Handles email issues

- Lets assume first in our chain we have fax handler and the chain ends on email handler
- So whenever an issue comes:
    - Fax handler receives it first
        - **If** its a fax issue -> fixes it
        - **Else** -> Forwards to email handler

    - The Email handler then receives it and fixes it and the chain ends

#### Class Example

![Chain Code Example(1)](./Week%2012%20images/Chain%20Code%20Example(1).png)
![Fax Handler Class](./Week%2012%20images/Fax%20Handler%20Class.png)
![Email Hander Class](./Week%2012%20images/Email%20Handler%20Class.png)
![Chain main function](./Week%2012%20images/Chain%20main%20function.png)

- **Template Class Code** can be found [here](./Week%2012%20codes/Chain%20Of%20Responsibility%20Code%20Example.java)
- **Code Explanation** can be found [here](https://chatgpt.com/s/t_6920912df96881918fb363fa065ed5d8)

#### Advantages

- You can have more than one handlers to handle a particular request
- The node of chain can be added or removed dynamically (order can also be shuffled easily)
- A handler doesnot need to know how the nexh handler will handle the request

#### Disadavantage

- There is no gurantee that the request will be handled fully
- Debugging may become tricky for this kind of design

---