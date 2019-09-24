import math

L = float(input()) * 100
W = float(input()) * 100
A = float(input()) * 100

danceHallArea = L * W
wardrobeArea = A * A
benchArea = danceHallArea / 10
dancerSpace = 40 + 7000
dancers = (danceHallArea - wardrobeArea - benchArea) / dancerSpace

print(math.floor(dancers))