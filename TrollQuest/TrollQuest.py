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

