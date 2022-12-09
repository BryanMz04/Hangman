# Hangman
CSC 211 project

1. What have you built? Describe your project in a short paragraph
  I built a single player hangman game. There are 3 difficulties and each has an array with 5 words. Then one word is randomly chosen everytime you play. If you guess a letter correct then you keep your lives and dont lose a body part. If you lose all 5 lives you lose.

2. How does it work? What all features does it have? Describe each feature/functionality. If you are able to, include screenshots of the output (not of the code)
  It has 3 different arrays with 5 different words in each. Using a math.Random formula it randomly chooses a number 0-4 that corresponds to an array in a word. Then you are in a while loop for as long as gameOver is false and you have more than 0 lifes. Guess correctly and your keep your life. Guess incorrectly and you lose your life. It has a method called draw() that draws the hangman everytime depending on how many lives you have. If you have 1 theres just a head, if you have 5 you get the whole body. It has a lot of if statements and for loops.
