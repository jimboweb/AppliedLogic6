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
words = 'cow pigeon house kitchen hill army heaven antdisestablishmentarianism liberalism socialism economy ' \
        'run moving armenia congress special happy relax car lose win truck castle knight switch legionary caesar ' \
        'raven golden silver red blue white craft opulent declare revise elongated musket the artist formerly known as prince' \
        'python map rocket potato ireland plateau bureau department foundation watchtower rome bureaucracy hypocrisy now' \
        'decimation memory senate consul tribune britain organization twelve four lockstep redcoat reform edict smell see' \
        'peninsula slave servant colony island galleon federation confederacy union more moo oink piglet igloo ship iceland' \
        'greenland or if is no not yes lawn elder geriatric man woman he she they are what how when were gourd squash' \
        'pike dock port bank doctor herbology theocracy botany zoology giraffe sebrz hippo rhino oracle delphi bye' .split()

def getRandomWord(wordList)
        wordIndex=random.randint(0, len(wordList) -1)
        return wordList[wordIndex]

def displayBoard(missedLetters, correctLetters, secretWord)
    print(HANGMAN_PICS[len(missedLetters)])
    print()

print('Missed letters:', end=' ')
for letter in missedLetters:
    print(letter, end=' ')
    print()
