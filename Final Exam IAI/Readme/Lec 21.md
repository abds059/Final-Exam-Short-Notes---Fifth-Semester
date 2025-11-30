# Lec 21 - Building a Simple Expert System

## 1. Problem Identification

- #### Understanding the Domain

    - Clearly define the problem the expert 
    system is intended to solve
    - For e.g, diagnosing diseases, 
    recommending financial investments, or troubleshooting technical 
    issues

- #### Knowledge Acquisition 

    - Gather domain-specific knowledge from human experts, literature, and other resources
    - This includes identifying key facts, rules, and decision-making processes used by 
    experts

## 2. Knowledge Representation

- #### Creating the Knowledge Base

    - Organize the acquired knowledge into a structured form, often using rules, facts, and if-then statements
    - For e.g, If a patient has a fever and a sore throat, then they may have 
    strep throat

- #### Encoding the Knowledge

    - Use a programming language or expert system shell to encode the knowledge base
    - This involves converting the rules and facts into code that can be processed by 
    the inference engine

## 3. Designing the Inference Engine

- #### Forward Chaining

    Start with known facts and apply rules to derive new facts or reach conclusions

- #### Backward Chaining

    Start with a goal (e.g., a diagnosis) and work backward to see if there are facts that support this goal

- #### Control Strategies

    Implement strategies for selecting and applying rules, such as conflict resolution (e.g., prioritizing certain rules over others)

## 4. User Interface Design

- #### Interactive Interface

    - Design an interface that allows users to input 
    data and receive explanations for the system’s decisions
    - For e.g, A chatbot interface where users input symptoms and 
    receive a diagnosis

## 5. Coding the Expert System

- ####  Selecting a Programming Language

    Choose a suitable language, such as Python, PROLOG, or a dedicated expert system shell

## 6. Evaluating System Performance

- #### Accuracy

    Measure how often the expert system makes correct diagnoses or decisions
 
- #### Reliability
 
    Assess the system’s ability to consistently provide accurate results over time

## 7. User Feedback

- #### Collecting Feedback

    Ask users to provide feedback on the system’s usability, accuracy, and helpfulness

- #### Improving the System

    Use feedback to refine the knowledge base, inference engine, and user interface

---