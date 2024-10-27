a. Explain why Pokemon should be an abstract class
Abstract classes cannot be instantiated, so there cannot be a Pokemon object. This makes sense because Pokemon itself is too general since there needs to be a specific type of Pokemon as an object. 

b. Explain why inheriting from Pokemon is useful
The Pokemon class contains general attributes that specific Pokemon classes can inherit from. This is useful because although different types of Pokemon are different, they all share common attributes that may become repetitive if the same code is rewritten for multiple classes. An example of how this is useful is how the attack method is overidden in the Jigglypuff and Pikachu classes.  
``` java
@Override
    void attack(Pokemon obj) {
        obj.takeDamage(15);
    }
```
c. Explain an example of method polymorphism in your code
The attack method in the Pokemon class is defined with no additional code. The method override for the attack method in the Pikachu class uses the takeDamage method to specify a specific amount of damage dealt thats unique to the Pikachu class.
```java
 @Override
    void attack(Pokemon obj) {
        obj.takeDamage(25);
    }
```
d. Explain an example of subtype polymorphism in your code
j and p are referenced to the Pokemon class but are instances of the Jigglypuff and Pikachu classes. This shows how Jigglypuff and Pikachu are subclasses of Pokemon.
```java
Pokemon j = new Jigglypuff(100, "Jigglypuff");
Pokemon p = new Pikachu(100, "Pikachu");
```
e. Explain why you made one of your methods public
I made getName() public because its a getter method so its purpose is for outside classes to access the value of the private variable name. 
```java
 public String getName() {
        return name;
    }
```
f. Explain why you made one of your instance variables private
I made the health variable private because the health should not be able to be modified from outside classes. It should only be used and changed in controlled ways, such as through methods in the class. 
```java
    private int health;
```