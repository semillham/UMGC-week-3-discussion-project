package Week3Discussion;

public class ModernFarmhouse extends Houses { 

//Unique attribute
//chose farmhouse sink because it seems to be the basic want of every couple looking for a modern farmhouse. 
    private String FarmHouseSink;

//set up constructor for farmhouse

    public ModernFarmhouse(int Levels, int ExteriorWalls, int Bedrooms, int Bathrooms, int SquareFeet, String FarmHouseSink) {
        super(Levels, ExteriorWalls, Bedrooms, Bathrooms, SquareFeet);
        this.FarmHouseSink = FarmHouseSink;
    }

//set up get method for FarmHouseSink

    public String getFarmHouseSink() {
        return FarmHouseSink;
    }

//set up Set method for FarmHouseSink

    public void setFarmHouseSink(String FarmHouseSink) {
        this.FarmHouseSink = FarmHouseSink;
    }

 //print out statements and add lines for clarity when editing and printing
    
    public void print() {
        System.out.println("Modern Farmhouse: " +
         "\n" + 
         "Levels: " + this.getLevels() + "\n" 
         + "Exterior walls: " + this.getExteriorWalls() + "\n" 
         + "Bedrooms: " + this.getBedrooms() + "\n" 
         + "Bathrooms: " + this.getBathrooms() + "\n"
         + "Square feet: " + this.getSquarefeet() + "\n"
         + "Sink type: " + FarmHouseSink);
    }
}
