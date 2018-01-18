#You are going to guess the number!
import random

guessesTaken = 0

print('Hola! Como te llamas?')
myName = input('Me llamo es ')

number = random.randint(32, 741)
print('Well,'+myName+' I am thinking of a number between 32 and 741! You have 15 guesses.')

while guessesTaken <15:
    print('Take a guess, its okay if its wrong.')
    guess = input()
    guess = int(guess)

    guessesTaken = guessesTaken+1

    if guess < number:
        print('Your guess is lower than the number. Try again.')

    if guess > number:
        print('As Jimmy McMillan would say, your guess IS TOO DAMN HIGH! Try again.')

    if guess == number:
        break

if guess == number:
    guessesTaken = str(guessesTaken)
    print (' You came, you saw, you conquered, ' +myName+ '! You guessed my number in '+guessesTaken+' guesses! Congratualations and thanks for playing!')

if guess != number:
    number = str(number)
    print('Sorry. The die is cast. The number of which I was thinking was '+number+', sorry.')
