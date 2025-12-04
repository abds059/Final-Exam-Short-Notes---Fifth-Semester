# Lec 20 - Components Of Expert Systems (Detailed)

## Knowledge Base

### Definition and Role

- Contains facts, rules and heuristics
- Contains both declarative as well as procedural knowledge

### Types Of Knowledge Stored

- #### Facts

    Fundamental truths about the domain such as patient symptoms  

- #### Rules

    Conditional statements describing relationships b/w different knowledge pieces
    For e.g, "If a patient has fever and cough, he may be experiencing flu"

### Methods Of Knowledge Representation

- #### Rule Based Systems

    Knowledge represented in form of if-then rules which are used to draw conclusions 

- #### Semantic Networks and Frames

    - Semantic Networks: Graph based representation of knowledge that depict relationship between entities
    - Frames: Data structures to represent objects, concepts or situations. Each frame encapsulates information about a particular concept and its associated attributes

## Knowledge Acquisition

### Methods For Building Knowledge Bases

- #### Manual Entry

    Knowledge input manually by human expert

- #### Automated Learning

    ML techniques can be utilized to automatically populate and update knowledge base by analyzing data and identifying patterns

### Challenges In Knowledge Management

- #### Knowledge BottleNeck

    Major challenge as capturing and codifying knwoledge is slow and difficult process

- #### Dynamic Knowledge 

    Regular updation of knowledge base requires robust mechanisms for knowledge acquistion and management

---

## Inference Engine

### Definition and Role

- Responsible for applying logical rules to knowledge base to derive info or to reach conclusion about something
- Simulates reasoning of human expert

### Mechanisms Of Inference

#### 1. Forward Chaining:

- Starts with known facts
- Applies rules to extract more facts until goal is reached
- For e.g, a medical diagnostic system might use forward chaining to start with symptoms and apply rules to diagnose a disease

#### 2. Backward Chaining

- Starts with a goal
- Works backward to determine if there is evidence to support the goal (by checking relevant facts)
- For e.g, a legal expert system might start with a desired legal outcome and work backward to see if the facts of a case support it

### Types Of Inference Engine

- #### Rule-Based Inference Engines

    - These engines use "if-then" rules to infer new knowledge
    - Are straightforward and easy to implement but may struggle with more complex or uncertain scenarios

- ####  Fuzzy Logic Inference Engines

    - Fuzzy logic allows for reasoning in situations where information is incomplete or ambiguous
    - Handles uncertainty by considering degrees of truth rather than binary true/false outcomes

- #### Case-Based Reasoning

    - In case-based reasoning, system compares new problems to previous cases stored in the knowledge base, applying solutions from similar cases to the current problem
    - This method is particularly useful in domains like law or medicine, where past cases are often used as precedents

### Optimization and Efficiency

- #### Inference Efficiency

    - Efficency of infernce engine is cruicial
    - Achieved through techniques like pruning irrelevant rules and parallel processing can be used to optimize decision making process

- #### Handling Complex Scenarios

    - Inference engine must be able to handle complex scenarios 
    - Situations like joining of multiple rules or contradictory information cases should be handled correctly

### Explanation Facilities

- A facility that provides reasons/jusifications to users as to why a decision was made
- Crucial for building user trust and understanding

#### Types of Explanations

- **Trace Explanations** 

    Show the sequence of rules applied and how the final conclusion was reached

- **Justification Explanations** 

    Provide the rationale behind why certain rules were applied, often including references to the knowledge base or external sources

---

## User Interface

### Design Principles

####  Interaction Models

- **Graphical User Interfaces (GUIs)**
 
    Modern expert systems often employ GUIs, which provide a more intuitive way to interact with the system. Users can click on icons, select
    options from menus, and view outputs in a more visually appealing format

- **Natural Language Interfaces**
    
    Some expert systems incorporate natural language processing (NLP) to allow users to interact with the system using everyday language. This approach can make the system more accessible, particularly for non technical users

### Feedback Mechanisms

- **Interactive Feedback**

    The UI should provide real-time feedback to users, such as confirming data
    inputs, showing progress on complex tasks, and explaining any errors or
    issues encountered

- **Customization and Adaptability**

    The interface should be customizable to suit the needs of different users. For
    example, an expert user might prefer detailed technical feedback, while a
    novice user might need simpler, more guided interactions

### Case Studies of User Interface Design

- **Medical Expert System Interface**
 
    In a medical expert system, the UI might allow doctors to input symptoms
    through dropdown menus, view diagnostic suggestions, and see detailed
    explanations of the system’s reasoning, all within an easy-to-navigate
    interface

- **Financial Expert System Interface**

    A financial expert system might feature a dashboard where users can input
    financial metrics, run simulations, and view visualizations of potential
    investment outcomes

### Integrating Expert Systems with Other Technologies

- **Hybrid Systems**

    - Expert systems are often integrated with other AI technologies, such as ML algorithms, to enhance their capabilities
    - For instance, ML can be used to update the knowledge base or optimize the inference engine

- **Future Trends**

    The future of expert systems lies in their integration with advanced analytics, big
    data, and real-time processing capabilities, allowing them to handle more complex
    scenarios and provide even more accurate and timely advice

---

