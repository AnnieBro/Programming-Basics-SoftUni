# Nested Conditional Statements - Exercise

The exercises are as follows:

### 1. Point on Rectangle Border
> Point {**x**,**y**} is located on a side of a rectangle {**x1**,**y1**}-{**x2**,**y2**} (knowing **x1** < **x2** and **y1** < **y2**). Input **x1**, **x2**, **y1**, **y2**, **x**, **y** (real numbers) and output **"Border"** if on side or **"Inside / Outside"** otherwise.

### 2. Cinema
> A cinema hall's seats are placed in a rectangular form with **r** rows and **c** columns. There are three types of projections:
  - **Premiere** - 12.00 lv;
  - **Normal** - 7.50 lv;
  - **Discount** - 5.00;
> Input projection type (String, not case sensitive), rows and columns (whole numbers) and output: **"(price) leva"**, to the second decimal place.

### 3. Summer Outfit
> Based on daytime and temperature, Victor wants to plan his summer outfit:
  - **Morning**
    - [10 ; 18] degrees: Outfit = **"Sweatshirt"**, Shoes = **"Sneakers"**
    - (18 ; 24] degrees: Outfit = **"Shirt"**, Shoes = **"Moccasins"**
    - over or equal to 25 degrees: Outfit = **"T-Shirt"**, Shoes = **"Sandals"**
    
  - **Afternoon**
    - [10 ; 18] degrees: Outfit = **"Shirt"**, Shoes = **"Moccasins"**
    - (18 ; 24] degrees: Outfit = **"T-Shirt"**, Shoes = **"Sandals"**
    - over or equal to 25 degrees: Outfit = **"Swim Suit"**, Shoes = **"Barefoot"**

  - **Evening**
    - [10 ; 18] degrees: Outfit = **"Shirt"**, Shoes = **"Moccasins"**
    - (18 ; 24] degrees: Outfit = **"Shirt"**, Shoes = **"Moccasins"**
    - over or equal to 25 degrees: Outfit = **"Shirt"**, Shoes = **"Moccasins"**

> Input degrees (whole number) and daytime (String, not case sensitive) and output: **"It's (degrees) degrees, get your (outfit) and (shoes)."**

### 4. New House
> Marin and Nelly are moving into a new house and Nelly loves flowers so much, that she wants to research how much money it'd cost to plant a certain amount of a certain type of flower. These are the prices:
  - **Roses** - 5 lv
  - **Dahlias** - 3.80 lv
  - **Tulips** - 2.80 lv
  - **Narcissus** - 3 lv
  - **Gladiolus** - 2.50
  
> The following discounts are available:
  - more than 80 roses - 10%
  - more than 90 dahlias - 15%
  - more than 80 tulips - 15%
  - less than 120 narcissus - 15% **MORE EXPENSIVE**
  - less than 80 gladiokus - 20% **MORE EXPENSIVE**
  
> Input flower type (String, from the listed above, CASE SENSITIVE), amount of flowers and budget (whole number) and output (money to the second decimal place):
  - if the budget is enough: **"Hey, you have a great garden with (amount of flowers) (flower type) and (remaining money) leva left."**
  - if the budget is not enough: **"Not enough money, you need (necessary amount) leva more."**

### 5. Fishing Boat
> Tony and his friends love fishing so much, that they want to rent a ship. The price depends on the season:
  - **Spring** - 3000 lv
  - **Summer** and **Autumn** - 4200 lv
  - **Winter** - 2600 lv
  
> There are discounts depending on the number of people:
  - <= 6 people - 10%
  - [7 ; 11] people - 15%
  - over 12 people - 25%
  - if even amount and NOT **Autumn** - 5% added discount
  
> Input budget (whole number), season (String, not case sensitive, listed above) and number of fishermen (whole number) and output to the second decimal place:
  - if the budget is enough: **"Yes! You have (remaining money) leva left."**;
  - if the budget is not enough: **"Not enough money! You need (remaining money) leva."**

### 6. Journey
> A young programmer wants to plan a trip. The destination depends on the budget, while the accommodation and amount of it spent depend on the season:
  - 100 lv or under - Somewhere in **"Bulgaria"**
    - **summer** - **"Camp"**, 30% of budget
    - **winter** - **"Hotel"**, 70% of budget
    
  - 1000 lv or under - Somewhere in **"Balkans"**
    - **summer** - **"Camp"**, 30% of budget
    - **winter** - **"Hotel"**, 70% of budget

  - over 1000 lv - Somewhere in **"Europe"**
    - **summer** - **"Hotel"**, 30% of budget
    - **winter** - **"Hotel"**, 70% of budget
    
> Input budget (real number) and season (**summer** or **winter**) and output on two lines (money up to second decimal place): **"Somewhere in (destination)"** **"(accommodation) - (money spent)"**

### 7. Operations Between Numbers
> Input two whole numbers (**N1** and **N2**) and an operator between them and output:
  - if it's a sum, substraction or multiplication: **"{N1} (operator) {N2} = (result) - (even/odd)"**;
  - if it's a division: **"{N1} / {N2} = (result)"**, to the second decimal place;
  - if it's a modular division: **"{N1} % {N2} = (rest)"**;
  - if it's a division by 0: **"Cannot divide {N1} by zero"**.

### 8. Hotel Room
> A hotel offers 2 types of rooms, for which the prices vary based on the months they're booked for:
  - **May** and **October**:
    - **"Apartment"** - 65 lv/night
    - **"Studio"** - 50 lv/night
    
  - **June** and **September**:
    - **"Apartment"** - 68.70 lv/night
    - **"Studio"** - 75.20 lv/night
    
  - **July** and **August**:
    - **"Apartment"** - 77 lv/night
    - **"Studio"** - 76 lv/night
    
> The following discounts are available:
  - Studio - more than 7 nights during May and October: 5% discount;
  - Studio - more than 14 nights during May and October: 30% discount;
  - Studio - more than 14 nights during June and September: 20% discount;
  - Apartment - more than 14 nights during any month: 10% discount;
  
> Input month (String, not case sensitive, listed above) and number of nights (whole number) and output on two lines, up to the second decimal place: **"Apartment: (total price) lv."** **"Studio: (total price) lv."**

### 9. On Time for the Exam
> A student needs to be on time for an exam. Input the hour of the exam, the minutes of the exam, the hour of arrival and the minutes of arrival (whole numbers) and output (minutes always 2 digits):
  - First line:
    - if the student arrives after the start of the exam: **"Late"**;
    - if the student arrives <= 30 minutes before the exam: **"On time"**;
    - if the student arrives more than 30 minutes before the exam: **"Early"**.
    
  - Second line:
    - if early, under 1 hour: **"mm minutes before the start"**;
    - if early, over or exactly 1 hour: **"hh:mm hours before the start"**; 
    - if late, under 1 hour: **"mm minutes after the start"**;
    - if late, over or exactly 1 hour: **"hh:mm hours after the start"**.

### 10. Volleyball
> Vladi is a student, lives in Sofia and travels back to his hometown **h** times per year. He loves volleyball, but due to work he only plays during weekends and holidays. 
  - he plays in Sofia, when he's not at work, not in his hometown and in 2/3 of holiday days;
  - he plays in his hometown on sundays with his friends;
  - he's not at work 3/4 of weekends he's in Sofia;
  - he plays 15% more volleyball than usual during leap years;
  - we assume the year has exactly 48 weekends suitable for volleyball.
> Input whether it's a leap year (String, **leap** or **normal**, not case sensitive), holidays (**p**, whole number, which are not Saturday or Sunday) and days he travels back (**h**, whole number) and output the amount of days he could play volleyball in a year.
