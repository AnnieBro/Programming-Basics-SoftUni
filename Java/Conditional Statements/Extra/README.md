# Conditional Statements - Extra

The exercises are as follows:

### 1. Pipes in Pool
> A pool with volume **V** has **two pipes**. Each pipe has a set debit (litres of water per hour). The worker turns both pipes on **at the same time** and leaves for **H** hours. Input the volume **V**, both of the pipes' debits **P1** and **P2** (all whole numbers) and the hours **H** the worker was absent. Output:
  - if the pool doesn't overflow: **"The pool is (how much is filled up)% full. Pipe 1: (first pipe percentage)%. Pipe 2: (second pipe percentage)%."**
  - if the pool overflows: **"For (amount of hours) hours the pool overflows with (extra liters water) liters."**

### 2. Sleeping Tom Cat
> Tom the cat loves to sleep, but his owner wants to play with him once the person has free time. To sleep well, Tom's playing limit is 30 000 minutes per year. Tom's playing time depends on the rest days of his owner:
  - if it's a work day, the owner plays 63 minutes a day with him;
  - if it's a rest day, the owner plays 127 minutes a day with him.
> We assume the year has 365 days. Input the number of rest days of the owner (whole number) and output:
  - if Tom's playing hours are over the limit: **"Tom will run away"** **"(excess hours) hours (excess minutes) minutes more for play"** on two separate lines;
  - if Tom's playing hours aren't over the limit: **"Tom sleeps well"** **"(hours left) hours and (minutes left) minutes less for play"**.

### 3. Harvest
> Vineyard with an area of **X** sq. m saves 40% of its harvest for wine production. From 1 sq. m vine **Y** kilos of grape are taken. For 1 litre of wine are necessary 2.5 kilos of grape. The desired amount of wine is **Z** litres. Input X (whole number), Y (real number), Z and number of workers (whole numbers). Output:
  - if the amount of wine is less than the desired one: **"It will be a tough winter! More (needed wine) liters wine needed."**, rounded down to the lesser whole number.
  - if the amount of wine is more or equal to the desired one: **"Good harvest this year! Total wine: (total amount) liters"**, rounded down to the smaller whole number, and **"(liters of wine left) liters left -> (wine per 1 worker) liters per person."**, rounded up to the bigger whole numbers.

### 4. Transport Price
> A student has to travel **n** km. They have the following transportation options:
  - Taxi - Starting price: 0.70 lv. Day: 0.79 lv/km. Night: 0.90 lv/km;
  - Bus - Day/night: 0.09 lv/km. Can be used for min 20 km distances;
  - Train - Day/night: 0.06 lv/km. Can be used for min 100 km distances.
> Input n (kilometres, whole umber) and String **"day"** or **"night"** depending on when they are travelling. Output the lowest possible price for the input data.

### 5. Firm
> A firm gets a query for a project, which a set amount of hours are needed for. The firm has a set amount of days. 10% of the days the employees are in training and cannot work on the project. The usual work day is 8 hours. Any employee can work on the project for 2 hours extra a day. The hours are rounded down to the lowest whole number. Input the necessary hours, the days the firm has and the employees willing to work extra (all whole numbers) and output:
  - if the time is enough: **"Yes! (extra hours) hours left."**;
  - if the time isn't enough: **Not enough time! (needed hours) hours needed."**.

### 6. Pets
> Marina loves to travel, but she has three pets - a dog, a cat and a turtle. She needs to know whether the food she leaves them during a trip would be enough for them. Each animal has its separate food quantity and type. Input the days and the left food (whole numbers) and the food per day for the dog, the cat and the turtle (real numbers) and output:
  - if the food is enough: **"(kilos left) kilos of food left."**, rounded down to the lower whole number;
  - if the food isn't enough: **"(kilos needed) more kilos of food are needed."**, rounded up to the higher whole number.

### 7. Flower Shop
> Maria wants to buy a present for her son and she owns a flower shop. The prices are these:
  - Magnolias - 3.25 lv;
  - Hyacinths - 4 lv;
  - Roses - 3.50 lv;
  - Cacti - 8 lv.
> From the total earnings she has to pay 5% for the shop. Input amounts of each of the four flowers (all whole numbers) and the price of the present (real number) and output:
  - if the money is enough: **"She is left with (remaining money) leva."**, rounded down to the lower whole number;
  - if the money isn't enough: **"She will have to borrow (needed money) leva."**, rounded up to the higher whole number.

### 8. Fuel Tank
> Input String for fuel with choices of **Diesel**, **Gasoline** or **Gas** (not case sensitive) and the litres of fuel (real number) and output:
  - if the litres >= 25: **"You have enough (type of fuel)."**;
  - if the litres < 25: **"Fill your tank with (type of fuel)!"**;
  - if the entered fuel is not one of the choices: **"Invalid fuel!"**.

### 9. Fuel Tank pt. 2
> Fuel prices are such:
  - Gasoline - 2.22 lv/l;
  - Diesel - 2.33 lv/l;
  - Gas - 0.93 lv/l.
> If the driver owns a discount card, they use the following discounts per litre:
  - Gasoline - 0.18 lv/l;
  - Diesel - 0.12 lv/l;
  - Gas - 0.08 lv/l.
> For certain amounts, the driver gets the following discounts from the total price:
  - Between 20 and 25 l included - 8% discount;
  - Over 25 l - 10% discount.
> Input the fuel type (String), the amount (real number) and whether they have a discount card (String with **Yes** or **No**) and output **"(final fuel price) lv."**, up to the second decimal place.
