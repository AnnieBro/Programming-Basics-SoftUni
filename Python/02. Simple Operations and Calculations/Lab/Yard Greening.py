area = float(input())

price = area * 7.61 * (1 - 0.18)
discount = area * 7.61 * 0.18

print(f"The final price is: {price:.2f} lv.")
print(f"The discount is: {discount:.2f} lv.")