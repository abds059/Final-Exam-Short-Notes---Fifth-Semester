# NLP Lec 

## Intro To NLP

- Techniques for enabling machines to understand and generate human language
- Involves the development of algorithms and models that allow machines to understand, interpret, and 
generate human language
- For e.g, Chatgpt

### Tokenization

- Process of splitting a piece of text into smaller units (tokens)
- Tokens can be words, phrases or other meaningful elements

#### Types Of Tokenization

- **Word Tokenization:** Splitting sentence into individual words
- **Sentence Tokenization:** Splitting a text into individual sentences
- **Subword Tokenization:** Breaking words into meaningful parts (used in BERT and GPT)

#### Challenges In Tokenization

- Handling punctuations, contractions and compound words
- Example: "can't" could be tokenized as ["ca", "n't"] or ["can", "not"], depending on the approach

---

### Stemming

- Process of **reducing a word to its root form** 
- **Root maynot always be valid**

#### Examples

- `running` becomes `run`
- `jumps` becomes `jump`
- `relational` becomes `relat`

#### Porter Stemmer: 

Most common stemming algo (widely used)

#### Snowball Stemmer: 

Improvement of Porter Stemmer (supports muliple languages) 

---

### Lemmatization

- Process of **reducing word to dictionary form (lemma)**
- Considers the context and converts the word to a valid base form

#### Examples

- `running` becomes `run`
- `better` becomes `good`

#### Difference From Stemming

More sophisticated then stemming, as it uses dictionary to map words to their base form (also computationally expensive)

#### WordNet Lemmatizer

Utilizes WordNet (a large lexical English database) to perform lemmatization

---

### Comparision: Stemming vs Lemmatization

- Stemming is fast but less accurate often used in search engines for query processing
- Lemmatization is slow but more accurate and is used in sentiment analysis

---

### Stop Words

- Common words that are mostly removed during text processing due to their less semantic value
- For e.g, `the`, `is`, `and`

#### Role In NLP

Removing stopwords helps in reducing dimensionality of the text data improving efficiency of algos 

#### Challenges

- Identifying domain specific words
- Deciding whether to remove or keep stopwords depends on situation (for e.g, in sentiment analysis words like `not` are important)

---

### Information Extraction (IE) In NLP

- Process of automatically extracting structured info from unstructured texts
- Structured info includes:
    - entities
    - relationships
    - attributes

#### Applications OF IE

- Used in multiple domains like business intelligence, bioinformatics, social media analysis, etc..

- Specific examples include:
    - Extracting product names and prices from e-commerce websites
    - Identifying medical conditions and treatments from clinical reports
    - Gathering information about people, locations, and organizations from news articles

---

### Named Entity Recognition (NER)

- Key subtask of IE
- Focused on identifying and classifying proper nouns (people, organizations, locations, dates and quantities)
- Crucial for understanding `who`, `where` and `when` in given text

#### Challenges In NER

- #### Ambiguity and Context Insensitivity
    
    - Entities can be ambigous requiring context to classify them
    - E.g, Apple may refer to a fruit or company

- #### Variability In Entity Names

    - Entities can have multiple names/aliases making consistent recognition difficult
    - E.g, Newyork and NYC

- #### Domain and Language Variability

    - NER models trained on one domain will underperform on other domains 

- #### Rule Based Approaches

    - Detection using RE and gazetteers (predefined entity lists)
    - E.g, Name detection done using `Mr.[A-Z][a-z]+`
    - Limited as they fail to generalize across different domains and languages

### NER Techniques

#### Machine Learning Based Approaches

- #### Supervised Learning

    - Training on labeled data using manually annotated entities
    - HMMs, CRFs, LSTM-CRF and BERT
    - E.g, BERT models can recognize entities by understanding context so are highly effective

- #### Unsupervised Learning

    - Use of clustering and pattern recognition to identify entities
    - Less common but applicable when labeled data is scarce

#### Evaluation Metrics

- Precision, recall and F1-score commonly used to evaluate performance of NER systems
    
    - Precision (percentage of correctly identified entities out of all identified entities)
    - Recall (percentage of correctly identified entities out of all actual entities)
    - F1 (harmonic mean of precision and recall)

---

### POS Tagging

- Assign grammatical tags (noun, verb, adjective) to each word
- Helps understand sentence structure

### POS Tagging Techniques

#### Rule Based Approaches

- Uses dictionary + hand crafted rules 
- E.g, Word after `the` is likely a `noun`

- #### Limitations: 

    Cannot handle ambigous or unseen words

#### ML Based Approaches

- #### Supervised Learning

    - Uses labeled corpora
    - Algorithms like HMMs, LSTM, Tranformers
    - E.g, LSTM uses full sentence context to choose correct POS tag

- #### Unsupervised Learning

    - Clusters words by distribution patterns
    - Less accurate but useful in scenarios where labels are unavailable

#### Evaluation Metrics

- Accuracy: Percentage of correctly tagged words

### Challenges In POS Tagging

- #### Ambiguity

    - Words may have multiple POS
    - For e.g, run (noun/verb)

- #### Morphological Variability

    - Languages like Turkish/Finnish have complex word forms

- #### Domain and Language Differences

    - Models trained on one domain may fail on other domains

---

### Text Normalization

- #### Lowercasing

- #### Removing Punctuations and Special Chars

- #### Handling Contractions

- #### Stemming and Lemmatization

- #### Removing Stopwords

#### Challenges In Text Normalization

- #### Language and Domain Specificity

    Normalization should be language specific as different languages or domain have different morphological rules and different domains ahve different jargons 

- #### Ambiguity In Normalization

    Certain words/phrases may have many valid normalizations (like US and United States)

- #### Balancing Consistency and Meaning

    - Overnormalization may lead to loss of information
    - Undernormalization may lead to inconsistency
    - So balanced approach is needed

---

### NLU

- Enable machines to interpret, extract and understand meaning from human language
- Used in translation, chatbots, QA systems, sentiment analysis

#### Importance

- Bridges gap b/w human communication and machine processing 
- Enables intelligent interaction

### Challenges In NLU

- Unlike structured data human language is utterly ambigous
- This pose significant challenges to NLU systems

- #### Lexical Ambiguity

    - Occurs when single word has multiple meanings
    - For e.g, the word `bank`
    - #### Challenges: Requires context understanding

- #### Syntactic Ambiguity

    - Arises when a sentence structure can be parsed in multiple ways
    - E.g, **`I saw a man with the telescope`**
        - Who has the telescope ?
    - #### Challenge: Grammer + context required

- #### Semantic Ambiguity

    - Occurs when a sentence or phrase can be interpreted in multiple ways (even if syntax is clear)
    - E.g, **He ate the cake with a spoon**
        - Used a spoon or cake had a spoon ?
    - #### Challenge: Need understanding of logical meaning

- #### Pragmatic Ambiguity

    - Meaning changes based on intention, tone or social context
    - E.g, **Can you pass the salt ?**
        - Request not a question
    - #### Challenge: Must understand intent + culture

---