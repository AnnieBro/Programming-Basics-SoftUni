x = float(input())
y = float(input())
h = float(input())

greenArea = 2 * (x * x - 1.2 + x * y - 1.5 * 1.5)
redArea = 2 * x * y + x * h
greenPaint = greenArea / 3.4
redPaint = redArea / 4.3

print(f"{greenPaint:.2f} \n{redPaint:.2f}")