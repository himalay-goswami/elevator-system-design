Elevator System Design
======================

Goal: Initiate 10 elevators in a building of 1000 floors 
----------------------------------
A Basic elevator (5) should be able to:

1. Move up and down between floors, 5 floors per second
2. Accept calls from floors (up/down buttons)
3. Accept floor selections from inside the elevator
4. Handle emergency situations (e.g., stop at the nearest floor)

A premium elevator (3) should have all the features of a basic elevator plus:
-----------------------------------
1. Move 20 floors per second
2. Prioritize calls based on the current direction of travel

A luxury elevator (2) should have all the features of a premium elevator plus:
-----------------------------------
1. Move 50 floors per second
2. Optimize routes to minimize wait and travel times
3. Require a security code to access the elevator
4. Provide real-time status updates (e.g., current floor, direction, next stop)


QUESTIONS TO CONSIDER
====================

1. How will you manage the state of each elevator (e.g., current floor, direction, destination floors)?
2. How will you handle multiple simultaneous requests from different floors and elevators?
3. How will you prioritize requests (e.g., nearest elevator, direction of travel)?
4. How will you implement the different types of elevators with varying speeds and features?
5. How will you ensure safety and handle emergency situations?
6. How will you test the system to ensure it meets the requirements?
7. How will you scale the system if the number of elevators or floors increases? Also, are the number of elevators fixed or can they be added/removed dynamically?

