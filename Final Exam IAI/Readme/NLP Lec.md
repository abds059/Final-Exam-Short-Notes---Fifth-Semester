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


