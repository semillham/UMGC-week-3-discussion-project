// week 3 discussion for inheritance
//for Sean Millham
//CMIS 242
package Week3Discussion; 

public class Houses {

//set up attributes

    private int Levels;
    private int ExteriorWalls;
    private int Bedrooms;
    private int Bathrooms;
    private int SquareFeet;

//set up these main things so that each house had a common ground to stand on
    
//Set up Constructor

    public Houses(int Levels, int ExteriorWalls, int Bedrooms, int Bathrooms, int SquareFeet) {

        this.Levels = Levels;
        this.ExteriorWalls = ExteriorWalls;
        this.Bedrooms = Bedrooms;
        this.Bathrooms = Bathrooms;
        this.SquareFeet = SquareFeet;
    }

//set up get methods

    public int getLevels() {
        return Levels;
    }

    public int getExteriorWalls() {
        return ExteriorWalls;
    }

    public int getBedrooms() {
        return Bedrooms;
    }

    public int getBathrooms() {
        return Bathrooms;
    }

    public int getSquarefeet() {
        return SquareFeet;
    }
}



