## Homework.

Practice what you have learned about using 

* classes, 
* abstract classes
* interfaces

to model and test a ThemePark.

## ThemePark

Model a ThemePark (with various Attraction and Stalls) and it's Visitors.

### MVP:


1. Visitor has age, height, money
2. Using a 'Attraction' abstract class (which has a 'name'), create some classes for Rollercoaster, Dodgems, Park, Playground.
3. Using a 'Stall' abstract class (which has a 'name', 'ownerName' and 'parkingSpot'), create some classes for IceCreamStall, CandyFlossStall, TobaccoStall.

5. Interfaces would be:
	
	IChargeable needs: double priceFor(Visitor)
	IRestrictable needs: Boolean isAllowedTo(Visitor)
	IEnjoyable needs: int getFunRating(), String getName()


	- Playground is IRestrictable and has a maximum age of 15
	- TobaccoStall is IRestrictable and has a minimum age of 18
	- Rollercoster is IRestrictable and requires you to be over 145cm tall and over 12 years of age
	
	- Rollercoaster, Dodgems are IChargeable but charge half price to children under 12 years old.
	- All Stalls are IChargeable but they have the same price irrespectable of who is buying.
	- Park and Playground have no price to enter, but other Attractions do.
	
	- add a new class variable `int funRating` to both Attraction and Stall.
	- now make everything in a park (all Attractions and Stalls) implement IEnjoyable
	- IEnjoyable's method getFunRating is sort of a getter for `int funRating`.

		
4. ThemePark stores everything that is enjoyable in a collection.
5. ThemePark has a method that can return a string with all enjoyable things together with their fun ratings, like:

`Rollercoster: 4, Dodgems: 8, Park: 2, IceCream: 6, TobaccoStall: 1 `

### Extension:

1. IEnjoyable's method getFunRating is sort of a getter for `int funRating`. But for marketing purposes make fun rating of all stalls higher by 2.
1. Make Attractions keep a list of visitors on them. Attraction should have a enter(Visitor) method which takes a Visitor.
2. On Dodgems first 2 Visitors ride for free.
3. The faster a Rollercoster is, the more it charges.
4. Add boolean to Visitor hadDinner. You can't have IceCream if you haven't had dinner, but you can't ride a rollercoaster if you did have dinner (because you'd get sick).  