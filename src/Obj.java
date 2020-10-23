abstract class Obj
{
	Obj()

	// This constructor will be invoked every time the constructor of any descendant class is invoked.

	{

	    //Because Obj is an extension for many of the other classes, it's able to execute code within this constructor
        //By calling the instantiated data structure from the Parser class,
        //data can be added to the data structure as Obj is invoked with each object creation
		Parser.AL.add(this.getClass().getSuperclass().getName());
		Parser.AL.add(this.getClass().getName());
		Parser.AL2.add(this.getClass().getName()); //this extra DS allows for proper count of Obj

	}
}