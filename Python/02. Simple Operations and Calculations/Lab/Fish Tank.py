length = int(input())
width = int(input())
height = int(input())
percentage = float(input())

volume = length * width * height * 0.001
print(f"{volume * (1 - (percentage/100)):.3f}")