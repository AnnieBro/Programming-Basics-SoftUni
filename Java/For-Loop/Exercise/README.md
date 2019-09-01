# For-Loop - Exercise

The exercises are as follows:

### 1. Numbers Ending in Seven
  - **Input**: (none)
  - **End of program**: Output all numbers from 1 to 1000 that end in 7, each on a separate line.

### 2. Half Sum Element
> Program, which checks whether in a list of numbers there is a number equal to the sum of all the others.
  - **Input**: **n** (whole number) and continuously **n** in amount whole numbers.
  - **End of program**: When **n** is reached:
    - If there is such a number, output:
      - **"Yes"**
      - **"Sum = (sum/number)"**
    - If there isn't such a number, output:
      - **"No"**
      - **"Diff = (absolute difference between the biggest available number and the sum)"**
  
### 3. Odd/Even Position
> Program that checks in a list of numbers their sum, the min and max numbers in even and odd positions separately.
  - **Input**: **n** (whole number) and continuously **n** in amount numbers.
  - **End of program**: When **n** is reached, output to the second decimal point:
      - **"OddSum=(sum of numbers on odd positions)"**
      - **"OddMin=(min of numbers on odd positions)"**
      - **"OddMax=(max of numbers on odd positions)"**
      - **"EvenSum=(sum of numbers on even positions)"**
      - **"EvenMin=(min of numbers on even positions)"**
      - **"EvenMax=(max of numbers on even positions)"**
  
### 4. Equal Pairs
> Program that checks in a list of pairs of numbers whether the sums of each pair's numbers are equal.
  - **Input**: **n** (whole number) and continuously 2**n** in amount numbers.
    - The first two are a pair, the second two are also a pair and so on.
    - The value of each pair is the sum of the two numbers in it.
  - **End of program**: When 2**n** is reached:
    - If the sums are equal, output:
      - **"Yes, value=(each sum)"**
    - If the sums aren't equal, output:
      - **"No, maxdiff=(max difference between a consecutive pair's sum)"**
  
### 5. Histogram
> Program that calculates percentages of values.
  - **Input**: **n**(whole number) and continuously **n** in amount numbers [1... 1000].
    - From them, a percentage **p1** is under 200.
    - Another percentage **p2** is from 200 to 399.
    - Another percentage **p3** is from 400 to 599.
    - Another percentage **p4** is from 600 to 799.
    - The last percentage **p5** is from 800 upwards.
  - **End of program**: When **n** is reached, output each percentage on a separate line to the second decimal place format **x.xx%**.
  
### 6. Divide Without Remainder
> Program that calculates percentages of values.
  - **Input**: **n** (whole number) and continously **n** in amount numbers [1... 1000].
    - From them, a percentage **p1** can be divided by **2** without remainder.
    - Another percentage **p2** can be divided by **3** without remainder.
    - Another percentage **p3** can be divided by **4** without remainder.
    - Values in percentages can be repeated!!!
  - **End of program**: When **n** is reached, output each percentage on a separate line to the second decimal place format **x.xx%**. 
  
### 7. Salary
> A company's boss subducts money from their employees' salaries based on how many times they have certain distracting sites open in their tabs.
  - **Input**: Tabs open (**n**) [1... 10] and salary [700... 1500], and continuously **n** in amount open websites (String).
    - The fines go like this:
      - "Facebook"-> 150 lv.
      - "Instagram"-> 100 lv.
      - "Reddit"-> 50 lv.
  - **End of program**:
    - If the employee runs out of money before **n** is reached, output:
      - **"You have lost your salary."**
    - If **n** is reached, output the remaining money of the salary.
