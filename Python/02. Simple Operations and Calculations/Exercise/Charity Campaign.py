days = int(input())
bakers = int(input())
cakes = int(input())
waffles = int(input())
pancakes = int(input())

cakePrice = 45 * cakes
wafflePrice = 5.8 * waffles
pancakePrice = 3.2 * pancakes
total = (cakePrice + wafflePrice + pancakePrice) * bakers * days * (7 / 8)

print(f"{total:.2f}")