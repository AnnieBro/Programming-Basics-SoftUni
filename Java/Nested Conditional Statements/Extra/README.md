# Nested Conditional Statements - Extra

The exercises are as follows:

### 1. Match Tickets
> A group of football fans wants to buy tickets for Euro 2016. The ticket categories are two:
  - **VIP** - 499.99 lv
  - **Normal** - 249.99 lv
  
> The fans have a budget and their number determines the percentage needed for the transport:
  - 1 to 4 - 75% of budget
  - 5 to 9 - 60% of budget
  - 10 to 24 - 50% of budget
  - 25 to 49 - 40% of budget
  - 50 or more - 25% of budget
  
> Input budget (real number), category (**VIP** or **Normal**) and the number of people (whole number) and output to the second decimal place:
  - if the budget is enough: **"Yes! You have (remaining money) leva left."**
  - if the budget is not enough: **"Not enough money! You need (money needed) leva."

### 2. Bike Race
> A charity bike race is coming up and the prices to join vary based on age group and track type:
  - **Juniors**
    - trail - 5.50 lv
    - cross-country - 8 lv
    - downhill - 12.25 lv
    - road - 20 lv

  - **Seniors**
    - trail - 7 lv
    - cross-country - 9.50 lv
    - downhill - 13.75 lv
    - road - 21.50 lv
    
> If the cross-country competitors are 50 or more, they get a 25% discount. The organisers take up 5% of the collected money for expenses. Input juniors and seniors (whole number) and track type (String, not case sensitive, from the listed above) and output the donated money up to the second decimal place.

### 3. Flowers
> A flower shop offers bouquets of three types of flowers and the prices of one flower depend on the season:
  - **Spring** and **Summer**
    - Chrysantemums - 2.00 lv
    - Roses - 4.10 lv
    - Tulips - 2.50 lv

  - **Autumn** and **Winter**
    - Chrysantemums - 3.75 lv
    - Roses - 4.50 lv
    - Tulips - 4.15 lv
    
> During holidays the prices rise by 15% and the price for the making of each bouquet is 2 lv. These are the offered discounts, which correspond in the listed order, can be stacked and are applied after price increase if it's a holiday:
  - over 7 tulips in Spring - 5% off of bouquet price
  - 10 or more roses in Winter - 10% off of bouquet price
  - over 20 flowers in any season - 20% off of bouquet price
  
> Input number of chrysantemum, roses and tulips (whole numbers), season (String, not case sensitive, listed above) and whether it's a holiday (**Y/N**) and output the price of the bouquet up to the second decimal place.
    
### 4. Car to Go
> A car rental service is in order and depending on the budget and season, the offered specifications are such:
  - Budget under or equal to 100 lv:
    - Class: **"Economy class"**
    - Season:
      - Summer: **"Cabrio"** - 35% of budget
      - Winter: **"Jeep"** - 65% of budget
      
  - Budget over 100 lv and under or equal to 500 lv:
    - Class: **"Compact class"**
    - Season:
      - Summer: **"Cabrio"** - 45% of budget
      - Winter: **"Jeep"** - 80% of budget
      
  - Budget over 500 lv:
    - Class: **"Luxury class"**
    - Season: **"Jeep"** - 90% of budget for any season
    
> Input budget (real number) and season (**Summer/Winter**, not case sensitive) and output (money to second decimal place): **"(Class type)"** **"(Car type) - (car price)"**.

### 5. Vacation
> A vacation service gives various resort offers depending on budget and season:
  - Budget under or equal to 1000 lv:
    - Accommodation: **"Camp"**
    - Season:
      - Summer: **"Alaska"** - 65% of budget
      - Winter: **"Morocco"** - 45% of budget
      
  - Budget over 1000 lv and under or equal to 3000 lv:
    - Accommodation: **"Hut"**
    - Season:
      - Summer: **"Alaska"** - 80% of budget
      - Winter: **"Morocco"** - 60% of budget
      
  - Budget over 3000 lv:
    - Accommodation: **"Hotel"**
    - Season:
      - Summer: **"Alaska"** - 90% of budget
      - Winter: **"Morocco"** - 90% of budget
      
> Input budget (real number) and season (**Summer/Winter**, not case sensitive) and output (money to second decimal place): **"(Location) - (Accommodation) - (Price)"**.

### 6. Truck Driver
> A truck driver wants to calculate his earnings for a season (a season is 4 months). Depending on the season and driven kilometres, he earns this much per kilometre:
  - Under or equal to 5000:
    - **Spring/Autumn**: 0.75 lv/km
    - **Summer**: 0.90 lv/km
    - **Winter**: 1.05 lv/km
    
  - Over 5000 and under or equal to 10 000:
    - **Spring/Autumn**: 0.95 lv/km
    - **Summer**: 1.10 lv/km
    - **Winter**: 1.25 lv/km
    
  - Over 10 000 and under or equal to 20 000: 1.45 lv/km for any season.
  
> 10% of the final price is removed for taxes. Input season (String, not case sensitive) and kilometres per month (real number) and output the final earnings up to the second decimal place.

### 7. School Camp
> A private school is organising camping trips for the students and depending on the holiday season and the group type the prices in the hotel vary:
  - **Boys/Girls**:
    - Winter - 9.60
    - Spring - 7.20
    - Summer - 15

  - Mixed:
    - Winter - 10
    - Spring - 9.50
    - Summer - 20
    
> The type of sports also vary based on group type and season:
  - **Girls**:
    - Winter - **"Gymnastics"**
    - Spring - **"Athletics"**
    - Summer - **"Volleyball"**
      
  - **Boys**:
    - Winter - **"Judo"**
    - Spring - **"Tennis"**
    - Summer - **"Football"**
    
  - **Mixed**:
    - Winter - **"Ski"**
    - Spring - **"Cycling"**
    - Summer - **"Swimming"**    

> Input season (String, not case sensitive), group type (String, listed above, not case sensitive), number of students and nights (both whole numbers) and output (money up to second decimal place): **"(Sport type) (price) lv."**.

### 8. Numbers from One to Ten
> Print the numbers from one to ten each on a separate line.

### 9. Multiply by Two
> Input various positive numbers until a negative number is entered. 
  - After every input number output: **"Result: (number * 2)"** on a separate line, to the second decimal place.     
  - When a negative number is input, output: **"Negative number"**
