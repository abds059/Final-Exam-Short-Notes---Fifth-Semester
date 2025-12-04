# Lec 19 - Fundamentals Of Expert Systems

## Expert System

A system designed to mimick (replicate) the decision making capabilities of a human expert

### Primary Objective

- Emulate decision making capabilities of a human expert
- Involves
    - Diagnosing issues
    - Providing advice
    - Solving complex problems
- Designed to be accessible 
- Should allow **non-experts to benefit from expert level knowledge of a domain** 

### Core Functions

- #### Decision Support

    Enable decison making by evaluating data against **fixed set of pre-defined rules**

- #### Automation Of Expert Knowledge

    Enable consistent and repeatable decision making

- #### Training and Education

    Enable user trainings by simulating problem-solving scenarios

---

## Components Of Expert Systems

- ### 1. Knowledge Base

    - Core component
    - Contains domain specific rules, facts and heuristics

    #### Example

    In medical expert system 
        - Knowledge base may include facts about diseases, symptoms, diagnostic criteria and treatment protocol

    #### Types Of Knowledge

    - **Declarative Knowledge:**

        Knowledge about facts and concepts such as specific symptoms of a disease or properties of materials in an engineering application

    - **Procedural Knowledge:**

        Knowledge about procedures or rules for problem-solving within the domain such as steps to diagnose an illness based on symptoms 

- ### 2. Inference Engine

    - Responsible for applying logical rules to knowledge base to derive info or to reach conclusion about something
    - Simulates reasoning of human expert

    There are two reasoning approaches utilized by an exprrt system:

    #### 1. Forward Chaining:
    - Starts with known facts
    - Applies rules to extract more facts until goal is reached
    - For e.g, a medical diagnostic system might use forward chaining to start with symptoms and apply rules to diagnose a disease

    #### 2. Backward Chaining
    - Starts with a goal
    - Works backward to determine if there is evidence to support the goal (by checking relevant facts)
    - For e.g, a legal expert system might start with a desired legal outcome and work backward to see if the facts of a case support it

    #### Example Of Inference Techniques

    - **Rule Based Inferencing:**
        
        Utilizes if-then rules to generate conclusions

    - **Case-Based Inferencing:**

        Involves comparing new problems to past cases (in knowledge base) to find similar cases and applying its solution

- ### 3. UI

    - Allows user to interact with the expert system
    - Takes user inputs, queries and delivers advice and solutions
    - Well designed interface is crucial for non-expert users to access system's capabilities easily

    #### Example

    In financial expert system, UI may enable users to input various financial metrics and receive investment advice

- ### 4. Explanation Facility

    - A facility that provides reasons/jusifications to users as to why a decision was made
    - Crucial for building user trust and understanding

    #### Example

    After diagnosing a condition, a medical expert system might explain why a particular diagnosis was made based on the symptoms and rules applied 

- ### 5. Knowledge Acquistion Module

    - Helps in continuous knwoledge update and refinement of the knowledge base
    - Can involve automated processes to learn from new data or inputs from human experts

    #### Example

    A knowledge acquistion module in a legal expert system may automatically incorporate new legal precedents and rulings into the system

---

## Real World Applications Of Expert Systems

- ### Medical Diagnosis System

    - Assist doctors in:
        - Diagnosing diseases 
        - Suggesting treatments
        - Predicting patient outcomes

    - Can analyze complex medical data and offer diagnostic recomendation based on **established knowledge**

    #### Example

    **MYCIN** 
    - An early expert system designed to diagnose bacterial infections and recommend antibiotic treatments
    - Utilized a rule-based approach to determine the best course of action based on patient symptoms and laboratory results

- ### Financial Decision Making

    - Systems deployed to guide:
        - Investment decisions
        - Access credit risks
        - Manage portfolios

    - Can process large amounts of data and identify patterns for forming investment strategies 

    #### Example

    - An expert system might analyze stock market trends and advise investors on best time to buy/sell assets, taking into account risk factors and historical data
    
    - **FINEVA (FINancial EVAluation) is a knowledge-based decision support system designed to assess corporate performance and financial viability**

- ### Industrial Process Controls

    - Expert Systems are used to monitor and control critical and complex operations such as manufacuturing, chemical processing and power generation
    - Used to:
        - Ensure and maintain optimal performance  
        - Respond to emergencies

    #### Example

    In power plant, expert systems can be utilized to monitor various parameters like temperature, pressue and flow rate and automatically adjust controls for safe and efficient operations 

- ### Legal Expert Systems

    - Legal expert systems assist in research, case analysis and drafting of legal docs
    - Can analyze:
        - Legal texts 
        - Identify relevant precedents
        - Suggest legal strategies

    #### Example

    A legal expert system might help lawyers determine outcome of a case based on similar past cases and their associated rulings

- ### Agricultural Management

    - Expert systems are used to optimize crop production by analyzing factors like soil conditions, weather patterns and plant health
    - Can suggest planting schedules, pest controls measures and irrigation strategies

    #### Example

    An expert system in agriculture may advise farmers on best time to plant crops based on soil moisture levels, expected rainfall and historical yield data

--- 

