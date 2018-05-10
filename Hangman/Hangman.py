import random
HANGMAN_PICS = ['''
   +---+
       |
       |
       |
      ===''','''
   +---+
   O   |
       |
       |
   ===''','''
   +---+
   O   |
   |   |
       |
      ===''','''
   +---+
   O   |
  /|   |
       |
      ===''','''
   +---+
   O   |
  /|\  |
       |
      ===''','''
   +---+
   O   |
  /|\  |
  /    |
      ===''','''
   +---+
   O   |
  /|\  |
  / \  |
      ===''']
words = 'cow pigeon house kitchen hill army heaven antidisestablishmentarianism liberalism socialism economy ' \
        'run moving armenia congress special happy relax car lose win truck castle knight switch legionary caesar ' \
        'raven golden silver red blue white craft opulent declare revise elongated musket the artist formerly known as prince' \
        'python map rocket potato ireland plateau bureau department foundation watchtower rome bureaucracy hypocrisy now' \
        'decimation memory senate consul tribune britain organization twelve four lockstep redcoat reform edict smell see' \
        'peninsula slave servant colony island galleon federation confederacy union more moo oink piglet igloo ship iceland' \
        'greenland or if is no not yes lawn elder geriatric man woman he she they are what how when were gourd squash' \
        'pike dock port bank doctor herbology theocracy botany zoology giraffe zebra hippo rhino oracle delphi bye' .split()

def getRandomWord(wordList):
        wordIndex=random.randint(0, len(wordList) -1)
        return wordList[wordIndex]

def displayBoard(missedLetters, correctLetters, secretWord):
    print(HANGMAN_PICS[len(missedLetters)])
    print()

    print('Missed letters:', end=' ')
    for letter in missedLetters:
        print(letter, end=' ')
    print()

    blanks = '_' * len(secretWord)

    for i in range(len(secretWord)):
        if secretWord [i] in correctLetters:
            blanks = blanks[:i] + secretWord[i] + blanks[i+1:]

    for letter in blanks:
        print(letter, end=' ')
    print()

def getGuess(alreadyGuessed):
    while True:
        print('Guess a letter.')
        guess = input()
        guess = guess.lower()
        if len(guess) !=1:
            print('Please enter a single letter.')
        elif guess in alreadyGuessed:
            print('You have already guessed that letter. Choose again.')
        elif guess not in 'abcdefghijklmnopqrstuvwxyz':
            print('Please enter a letter found in the standard English alphabet.')
        else:
            return guess


def playAgain():
    Print('Do you want to play again? (Y or N)')
    return input().lower().startswith('Y')


print('H A N G M A N')
missedLetters = ''
correctLetters = ''
secretWord = getRandomWord(words)
gameIsDone = False

while True:
    displayBoard(missedLetters, correctLetters, secretWord)

    guess = getGuess(missedLetters+correctLetters)
    if guess in secretWord:
        correctLetters = correctLetters+guess

        foundAllLetters = True
        for i in range(len(secretWord)):
            if secretWord[i] not in correctLetters:
                foundAllLetters = False
                
