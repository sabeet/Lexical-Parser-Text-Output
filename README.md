# Lexical-Parser-Text-Output
Output all the object names to a text file while using a lexical parser

Description: (This description is also given in the comments of the code)

-I used more than one data structure to handle the sorting of the Obj objects.

-The Arraylist<String>(named AL) data structure was used to capture all the elements generated from the invokation of Obj

-All the elements are inputted but are not sorted or even counted

-AL values are then passed onto a Map<String, Integer>(named counterMap)

-Using a for loop, we traverse through AL, get each distinct element and then map a count of that respective element to it in counterMap

-we create a new Arraylist<String>(named orderedProperly)

-using counterMap, orderedProperly will have AL's element sorted via frequency in descending order

-A frequency sort Algorithm is then applied to orderedProperly using the Collections and Maps library found natively in Java 8

-By now, orderedProperly should have AL's elements sorted via frequency in descending order

-Another ArrayList<String>(clonedOrder) is then created which is it's namesake. It's a clone of orderedProperly but this was created to
to remove the duplicate elements of orderedProperly so that orderedProperly can exist aswell.

-Finally, using a for each loop, we go through clonedOrder(This contains only the distinct elements of orderedProperly but it's also ordered via frequency)
and using the Collections library, we use frequency to find the number of a given element in orderedProperly that is respective the clonedOrders index number.
By doing it like this, we are able to print the object name and the object count by the number of occurence of that element in descending order

Environment:
This Project was created using IntelliJ and VSCode on Windows 10

Directions:
-Create or save an input file in a txt format within the source folder
-To run this project, please go into the source folder on a terminal/CLI
NOTE: this project uses Parser as the main class
-please type:
	$ javac Parser.java
	$ java Parser [name of your input file].txt [name of your output parse tree].txt [name of your output file].txt
-Once all is executed, two output text files should be created, one that shows the parse tree and the other one
	that shows the objects and other classes with their respective counts
