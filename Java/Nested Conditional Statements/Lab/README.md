# Nested Conditional Statements - Lab

The exercises are as follows:

### 1. Personal Titles
> Input age (real number) and gender (**m** or **f**) and output title:
  - **"Mr."** - man (**m**) >= 16 years of age;
  - **"Master"** - boy (**m**) < 16 years of age;
  - **"Ms."** - woman (**f**) >= 16 years of age;
  - **"Miss"** - girl (**f**) < 16 years of age;

### 2. Small Shop
> A Bulgarian opens up small shops in a couple of cities and sells for different prices:
  - **Sofia**
    - coffee - 0.50 lv
    - water - 0.80 lv
    - beer - 1.20 lv
    - sweets - 1.45 lv
    - peanuts - 1.60 lv
    
  - **Plovdiv**
    - coffee - 0.40 lv
    - water - 0.70 lv
    - beer - 1.15 lv
    - sweets - 1.30 lv
    - peanuts - 1.50 lv
    
  - **Varna**
    - coffee - 0.45 lv
    - water - 0.70 lv
    - beer - 1.10 lv
    - sweets - 1.35 lv
    - peanuts - 1.55 lv
> Input product, city (Strings, not case sensitive) and amount (real number) and output the total price.

### 3. Fruit or Vegetable
> Input name of product (String, not case sensitive) and output whether it's a **"fruit"**, **"vegetable"** or **"unknown"**:
  - **fruit**: banana, apple, kiwi, cherry, lemon and grapes;
  - **vegetable**: tomato, cucumber, pepper and carrot;
  - **unknown** - anything else.

### 4. Invalid Number
> A number is **valid** if it's in the range of [100 ; 200] or it's 0. Input whole number and output **"invalid"**, if it does not meet the conditions. (If it's valid, do not output anything.)

### 5. Fruit Shop
> A fruit shop has the following prices per kilo on a **work day**:
  - banana - 2.50
  - apple - 1.20
  - orange - 0.85
  - grapefruit - 1.45
  - kiwi - 2.70
  - pineapple - 5.50
  - grapes - 3.85
> and the following during a **weekend**:
  - banana - 2.70
  - apple - 1.25
  - orange - 0.90
  - grapefruit - 1.60
  - kiwi - 3.00
  - pineapple - 5.60
  - grapes - 4.20
> Input fruit (String, one of the upper listed, not case sensitive), day of the week (String, not case sensitive) and amount (real number) and output the price up to the second decimal place. Output **"error"**, if the entered fruit or day of week is not valid.

### 6. Trade Commissions
> A company gives the following commissions based on city and the sales **s**:
  - **Sofia**
    - [0 ; 500] - 5%
    - (500 ; 1000] - 7%
    - (1000 ; 10 000] - 8%
    - > 10 000 - 12%
    
  - **Varna**
    - [0 ; 500] - 4.5%
    - (500 ; 1000] - 7.5%
    - (1000 ; 10 000] - 10%
    - > 10 000 - 13%
    
  - **Plovdiv**
    - [0 ; 500] - 5.5%
    - (500 ; 1000] - 8%
    - (1000 ; 10 000] - 12%
    - > 10 000 - 14.5%
> Input city (String, not case sensitive) and sales **s** (real number) and output the commission up to the second decimal place. Output **"error"** if invalid name of city entered.
  

### 7. Ski Trip
> Atanas wants to go on a ski trip to Bansko, but he has to calculate prices of hotel rooms and reserve one. He may use a discount depending on the type of room and the amount of days he stays:
  - **room for one person**
    - 18.00 lv per night
    - doesn't have available discounts;
    
  - **apartment**
    - 25.00 lv per night
    - < 10 days - 30% from final price
    - [10 ; 15] days - 35% from final price
    - > 15 days - 50% from final price
    
  - **president apartment**
    - 35.00 lv per night
    - < 10 days - 10% from final price
    - [10 ; 15] days - 15% from final price
    - > 15 days - 20% from final price
    
> After his stay, Atanas may leave either **positive** or **negative** feedback:
  - if **positive**, add 25% to the final price after the discount;
  - if **negative**, remove 10% from the final price after the discount.
  
> Input days he's staying (whole number), room type and feedback (Strings from upper lists, not case sensitive) and output final price up to the second decimal place.
