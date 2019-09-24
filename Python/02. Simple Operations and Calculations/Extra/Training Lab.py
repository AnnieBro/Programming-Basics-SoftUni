import math

w = float(input()) * 100
h = float(input()) * 100

h -= 100
rows = math.floor(h / 70)
columns = math.floor(w / 120)
workingPlaces = rows * columns - 3
print(workingPlaces)