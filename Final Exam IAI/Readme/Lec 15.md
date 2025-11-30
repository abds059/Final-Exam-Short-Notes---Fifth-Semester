# Lec 15

## Knowledge Representation Techniques

- Ways to store, organize and encode knowledge to make it easier for AI systems to reason, learn and make decisions

## 1.  Semantic Networks

Graph based representation of knowledge that depict relationship between entities

#### Components 

- **Nodes:**

    - Represent objects, concepts or entities
    - For e.g, Dog, cat, animal 

- **Edges:**

    - Represent relationships between nodes
    - For e.g, We have two nodes (Dog and animal) -> so *"Dog is a animal"* (here **"is a"** will be an edge)

- **Attributes:**

    - Provide additional info about concepts and relationships
    - For e.g, **"Dog"** might have attributes like **breed, size** 
    
---

### Types Of Relationships

- #### Is A

    - Represents hierarchial relationships
    - For e.g, "Dog is a mammal"

- #### Part Of

    - Represents **part-whole** relationships
    - For e.g, "Wheel is a part of car"

- #### Has A

    - Represents ownerships or possession
    - For e.g, "Car has engine"

---

### Applications

- #### Knowledge Bases

    - Used in knowledge bases to represent and organize information
    - For e.g, **Medical Knowledge base** might use semantic networks to represent relationships between diseases, symtoms and treatments

- #### NLP

    - Helps in understanding meaning and context of words
    - For e.g, **WordNet** -> A large semantic network used to find meanings, synonyms, and relationships between words

- #### Expert Systems

    - Used in expert systems to store domain specific knowledge for problem solving
    - For e.g, Medical System: **symptom -> indicates -> disease**

---

### Advantages 

- #### Intuitive Representation

    Provides visual and intuitive way to represent relationships between concepts

- #### Flexibility

    Can be easily expanded and modified by adding new nodes and relationships

### Limitations

- #### Scalability

    Large networks become complicated and hard to manage

- #### Lack Of Formal Semantics

    Relationships maybe be unclear or loosely defined

---

## 2. Frames

- Data structures to represent objects, concepts or situations
- Each frame encapsulates information about a particular concept and its associated attributes

### Components

- #### Slots

    - Represent attributes and properties of frames
    - Describe what information the frame contains
    - For e.g, 
        - Car Frame -> Make, Model, Year, Color
        - Student Frame -> Name, Age, Major, GPA

- #### Filler

    - Actual value assigned to the slot
    - For e.g, 
        - Car Frame -> Make = **"Toyota"**
        - Student Frame -> Name = **"Ali"**

- #### Default Values

    - Predefined (default) values that apply to all instances of a frame
    - For e.g, 
        - Car Frame -> Make = **"Toyota"** (maybe overridden later by filler)
        - Student Frame -> Name = **"Ali"**

- #### Inheritance

    - A frame can inherit properties from parent frames 
    - For e.g, A sedan inherits attributes from Car Frame

---

### Applications

- #### Object Oriented Systems

    - Utilized in OOP to represent classes and objects, including attributes and methods

- #### Knowledge Representation

    - Frame store facts about entities and their relationships  
    
- #### AI Planning

    - Frames represents actions, goals and sequences

---

### Advantages

- #### Structured Representation

    - Provides a well-organized structure for representing knowledge with clear attributes and relationships

- #### Inheritance

    - Supports inheritance and reuse of knowledge across diferent frames

### Limitations

- #### Complexity

    - If there are many slots or deep inheritance, then it frames can be complex to manage

- #### Limited Flexibility

    - Frames work well for fixed structures but struggle with unusual or unexpected cases

---

## 3. Scripts

- Knowledge structures used to represent sequences of events or actios within a particular context

### Components

- #### Slots

    - Represent elements of scripts (actions, roles or participants)
    - For e.g, 
        - A script for **"Going To Restaurant"** includes slots for "Arrival", "Ordering", "Eating" and "Payment"

- #### Fillers

    - Values assigned to the slots
    - For e.g, 
        - The **"Arrival"** slot may include actions like **"Enter restaurant"** or **"Wait to be seated"**
 
- #### Scripts Instances

    - Detailed description of events
    - How general script happened in specific situations
    - For e.g, a script instance might describe a particular visit to a restaurant

---

### Applications

- #### NLU (Natural Language Understanding)

    - Scripts help AI understand stories, dialogues, and conversations
    -  For e.g, understanding a story or dialogue might involve recognizing and following the sequence of events described in a script

- #### AI Planning

    - Used to plan and simulate sequences of actions and events in AI systems
    - For e.g, A planning system might use scripts to generate and evaluate different plans for achieving a goal

- #### Robotics

    - Scripts help robots follow step-by-step procedures
    - Useful for tasks requiring a fixed sequence of actions
    - For e.g, A robot might follow a script to perform a sequence of actions in a household chore

---

### Advantages

- #### Contextual Understanding

    Help in understanding and predicting sequence of events

- #### Flexibility

    Can be adopted to model different scenarios and sequences of actions

### Limitations

- #### Rigidity

    May not handle unexpected events due to rigid flow

- #### Complexity

    Can become complex when dealing with multiple scripts or intricate sequence of events

---

## Comparision Of Techniques

### Semantic Networks vs Frames

- #### Semantic Networks

    - Focus on representing relationships between concepts and are useful for visualizing and exploring connections
    - They are often used in knowledge bases and NLP

- #### Frames

    - Focus on representing detailed attributes and properties of specific entities or concepts
    - They are used in object-oriented systems and AI planning

### Scripts vs. Other Techniques:

- #### Scripts

    Represent sequences of actions and events, providing a framework for understanding narratives and planning
    - They are different from semantic networks and frames, which focus on relationships and attributes