mackerelPrice = float(input())
spratPrice = float(input())
chamois = float(input())
horseMackerel = float(input())
mussels = int(input())

chamoisPrice = mackerelPrice * (1 + 0.6)
horseMackerelPrice = spratPrice * (1 + 0.8)
total = chamoisPrice * chamois + horseMackerelPrice * horseMackerel + 7.5 * mussels
print(f"{total:.2f}")