vegetablePrice = float(input())
fruitPrice = float(input())
vegetables = int(input())
fruits = int(input())

BGN = vegetablePrice * vegetables + fruitPrice * fruits
euros = BGN / 1.94
print(f"{euros:.2f}")