__author__ = 'Christian'
import random

l = ["rock", "paper", "scissors"]
points = [0, 0]


def compare(u, c):
    print(u + " <=> " + c)
    if u == c:
        print("Tie!")
        return -1
    elif (u == "rock" and c == "paper") or (u == "paper" and c == "scissors") or (u == "scissors" and c == "rock"):
        print("Computer wins!")
        return 1
    else:
        print("You win")
        return 0

while True:
    while True:
        user = input("Do you choose rock, paper or scissors?").lower()
        if user in l:
            break
        else:
            print("Something went wrong")
    comp = l[random.randint(0, 2)]
    res = compare(user, comp)
    if res != -1:
        points[res] += 1
    print("User: " + str(points[0]))
    print("Computer: " + str(points[1]))
