# While-Loop - Extra

The exercises are as follows:

### 1. Dishwasher
> Gosho works at a restaurant and is in charge of filling the dishwasher at the end of the day.
  - **Input**: Number of bottles of detergent [1... 10] and then keep getting number of cookware for each dishwasher filling [1... 100] until command prompt **"End"**.
    - Each bottle contains 750 ml detergent.
    - A dish needs 5 ml of detergent.
    - A saucepan needs 15 ml of detergent.
    - Every third filling of the dishwasher is only with saucepans, while all the rest - with dishes.
  - **End of program**:
    - If command prompt reached before running out of detergent, output: 
      - **"Detergent was enough!"**
      - **"(number of clean dishes) dishes and (number of clean saucepans) pots were washed."**
      - **"Leftover detergent (leftover) ml."**
    - If detergent runs out before command prompt, output:
      - **"Not enough detergent, (amount necessary for last batch) ml. more necessary!"**

### 2. Report System
> There is a sales event for charity and you can pay for products via cash or card.
  - **Input**: Charity money goal [1... 10 000] and then on every next line input the bought items' prices [1... 500] until command prompt **"End"** or reaching the charity money goal.
    - The sales go one after the other with cash or card (1 - cash, 2 - card, 3 - cash, 4 - card, etc.).
    - If the product is over 100 lv, you can **NOT** pay in cash.
    - If the product is ounder 10 lv, you can **NOT** pay by card.
    - Upon successful transaction, output: 
      - **"Product sold!"**.
    - Upon unsuccessful transaction, output: 
      - **"Error in transaction!"**.
  - **End of program**:
    - If target goal is reached or gone over, output:
      - **"Average CS: (cash average)"**
      - **"Average CC: (card average)"**
    - If received command prompt, output:
      - **"Failed to collect required money for charity."**

### 3. Stream of Letters
> A program reads a hidden message in a sequence of symbols.
  - **Input**: Series of letters (could be **char** or **String**) once per line until command prompt **"End"**.
    - Words are formed in order of input.
    - Ignore non-Latin symbols.
    - The secret letters are **c**, **o** and **n**.
      - The first usage of each of these letters marks the letter as found, but isn't saved in the word itself. 
      - Every other usage of the same secret letter outputs it.
      - Upon entering all three secret letters in one word, a space is created and the counter of these letters resets for the next word to come.
  - **End of program**:
    - Upon reaching the command prompt, output last fully formed word (in other words, a space **ENDS** a fully formed word).
    
## This here is for the next topic (For-Loop):

### 4. Numbers Divided by Three
  - **Input**: (None)
  - **End of program**:
    - Output numbers from 1 to 100 that can be divided by three on a separate line each.

### 5. Average Number
  - **Input**: Whole number **n** and then an **n**-amount of whole numbers.
  - **End of program**:
    - Output average of all entered numbers (except n, of course), to second decimal place.

> Note: This is where I start making considerable formatting changes.
