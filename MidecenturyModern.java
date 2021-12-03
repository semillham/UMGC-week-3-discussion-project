package Week3Discussion;

public class MidcenturyModern extends Houses {

//set up attribute 

    private String OpenConcept; 

//set up constructor for MidCenturyModern

    public MidcenturyModern(int Levels, int ExteriorWalls, int Bedrooms, int Bathrooms, int SquareFeet, String OpenConcept) {
        super(Levels, ExteriorWalls, Bedrooms, Bathrooms, SquareFeet);
        this.OpenConcept = OpenConcept;
    }

//set get statement for MidCenturyModern

    public String getOpenConcept() {
        return OpenConcept;
    }

//set set statement for MidCenturyModern

    public void setOpenConcept(String OpenConcept) {
        this.OpenConcept = OpenConcept;
    }

//print out statements and add lines for clarity when editing and printing

    public void print() {
        System.out.println("Mid-Century Modern: " +
        "\n" + 
        "Levels: " + this.getLevels() + "\n" 
        + "Exterior walls: " + this.getExteriorWalls() + "\n" 
        + "Bedrooms: " + this.getBedrooms() + "\n" 
        + "Bathrooms: " + this.getBathrooms() + "\n"
        + "Square feet: " + this.getSquarefeet() + "\n"
        + "Floor plan: " + OpenConcept);
    }

}
