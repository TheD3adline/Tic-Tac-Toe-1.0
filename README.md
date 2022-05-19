# Tic-Tac-Toe-1.0
Finished the basic Java course from programmieren-starten.de

Second real practice project to consolidate what I've learned there. 
A very basic console application of the game tic-tac-toe. Humble beginnings...

Update May 19th 2022, finished my little tic-tac-toe app, did a less elaborate program
flow loop in Main.java than in my last app Calculator-1.0 because it's not necessary for learning here. 
I learned from this project ways to implement entire methods that return a boolean as conditions 
into loops and junctions. Also learned about Scanner.next().charAt() function and how that too can 
be implemented as part of a method call within a while loop condition, coupled with a boolean return from the called 
method it's a rather simple way to make sure an input is of the correct type that then will be processed accordingly, 
and print a custom error message into console when the input is invalid without writing an entire try/catch
exception for that little function. Not entirely happy with Field.checkWin(), as it is very messy
with lots of typing involved and thus very prone to error. I will have to do better for a potential
connect four app, but it's OK for this small field of play. During research for how to do the Scanner here
I also learned about a trick to "absorb" an InputMismatchException into a Scanner.next() within the catch body,
something I had to troubleshoot for my previous app. I won't be making a commitment in this README.md for my next
practice project, I'll just decide on it spontaneously tomorrow.