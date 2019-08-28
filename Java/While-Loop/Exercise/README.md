# While-Loop - Exercise

The exercises are as follows:

### 1. Old Books
> Annie comes back to her old grandmother's library and remembers her favourite book. She wants to check if it's still there. Input book name (String, not necessarily case sensitive) and number of books in library (whole number) then start inputting book titles.
  - if the limit is reached before she finds the book, output: **"The book you search is not here!"** **"You checked (total number of books) books."**.
  - if she finds the book, output **"You checked (checked number of books) books and found it."**.

### 2. Exam Preparation
> Marin prepares for an upcoming exam with problems given by his lector. Input max number of dissatisfying grades (whole number) and then input multiple times name of problem (String, case sensitive)and grade to it until the lector gives the command **Enough**.
  - any grade under or equal to 4 is a dissatisfying grade.
  - if Marin reaches the dissatisfying grade limit, output: **"You need a break, (dissatisfying grade amount) poor grades."** and end the program.
  - if Marin reaches **Enough** command, output: **"Average score: (average grade)"** **"Number of problems: (total problem amount)"** **"Last problem: (name of last problem)"**, the average grade up to the second decimal place.

### 3. Vacation
> Jessy decides to save up money for vacation. She either saves up or spends part of her money each day. Input the necessary money for the vacation and the money she has right now (real numbers), then keep inputting action (**spend** or **save**, String, not necessarily case sensitive) and the money she acts with (real number).
  - if she wants to spend more money than she has, she spends everything and is left with 0 lv.
  - if she keeps spending for 5 consecutive days, output: **"You can't save the money."** **"(Days passed)"** and end the program.
  - if she saves up the necessary amount, output: **"You saved the money for (days passed) days."**.

### 4. Walking
> Gabbie wants to start a healthy lifestyle, so she sets a goal of 10 000 steps per day. Some days she might be too tired and she'll go home before reaching her goal. Input steps she takes every time she leaves home during the day.
  - when she wants to go back home, she writes **Going home** and counts her last steps for the day on the way home.
  - if she doesn't achieve her goal for the day after walking home, output: **"(Steps left to goal) more steps to reach goal."**.
  - when she achieves her goal for the day, be it before or after going home, output: **"Goal reached! Good job!"**.

### 5. Coins
> Vending machine producers want to make their machines so that they return as few coins change as possible. Input change (real number) and output a single whole number, which is the least amount of coins the vending machine can return as change.

### 6. Cake
> You're invited to a birthday party, but the birthday boy doesn't know whether the pieces would be enough. Input sizes of cake (width and length, whole numbers) and keep inputting the number of pieces the guests eat until you reach the command prompt **STOP**.
  - the pieces are square, 1 sq. cm, so the number of pieces is equivalent to the area of the cake.
  - if there are pieces left after **STOP**, output: **"(Pieces) pieces are left."**.
  - if the cake runs out of pieces before **STOP**, output: **"No more cake left! You need (pieces needed from last group of people) pieces more."**.
