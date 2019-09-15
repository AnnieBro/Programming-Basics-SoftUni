whiskeyPrice = float(input())
beer = float(input())
wine = float(input())
rakiya = float(input())
whiskey = float(input())

rakiyaPrice = whiskeyPrice / 2
winePrice = rakiyaPrice * (1 - 0.4)
beerPrice = rakiyaPrice * (1 - 0.8)
total = whiskeyPrice * whiskey + rakiyaPrice * rakiya + winePrice * wine + beerPrice * beer

print(f"{total:.2f}")