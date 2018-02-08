import random
import time

def displayIntro():
    print('''You are in a desert land west of Sudan. In front of you are three caves. 
    In one cave there is a massive treasure horde of a long-dead local king from 1,000 years ago. 
    In another cave there is the treasure's hereditary guard, a grumpy, fierce troll who is so deaf and old, 
    that he will only find you if you enter his cave. However, he is strong enough to kill you almost immediately. 
    Finally, in the last cave is nothing. The cave is also an instant portal home and will immediately take you away. 
    You have before you three options: Riches, Death, and Nothing. Choose your cave!''')
print()

def chooseCave():
    cave = ''
    while cave != '1' and cave !='2' and cave !='3':
        print('Which cave will you go into?(1,2, or 3)')
        cave = input()

        return cave

def checkCave(chosenCave):
    print('You approach your chosen cave...')
    time.sleep(3)
    print('It is dark and dusty...')
    time.sleep(3)
    print('You come to a door and swing it open. You light the torches with your candle and...')
    time.sleep(3)

    treasureCave=random.randint(1,3)

    trollCave=random.randint(1,3)

    if chosenCave==str(treasureCave):
        print('''You see an ornate, sprawling and beautiful treasure horde! 
        A third silver, a third gold and a third electrum, a gold-silver alloy.
        Enough to fund that digital ice cream company you wanted to start!''')
    elif  chosenCave==str(trollCave):
        print('''The old troll jumps out and smashes you with his club.
        Your soul gains solace in the fact he has a nice night eating human roast.''')
    else:
        print ('''You walk into your living room. You turn around to find that the desert has disappeared.
        You sit down, thinking "Well that was a waste of money!" and watch Netflix. At least you
        didn't get eaten!''')

playAgain='yes'
while playAgain == 'yes' or playAgain == 'y':
    displayIntro()
    caveNumber = chooseCave()
    checkCave (caveNumber)

    print('Do you want to play again (yes or no)?')
    playAgain = input()
