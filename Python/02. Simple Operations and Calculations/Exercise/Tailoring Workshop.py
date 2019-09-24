tables = int(input())
length = float(input())
width = float(input())

tableclothArea = (length + 0.60) * (width + 0.60)
tablesquareArea = (length / 2) * (length / 2)
tableclothPrice = tableclothArea * 7 * tables
tablesquarePrice = tablesquareArea * 9 * tables
USD = tableclothPrice + tablesquarePrice
BGN = USD * 1.85

print(f"{USD:.2f} USD")
print(f"{BGN:.2f} BGN")