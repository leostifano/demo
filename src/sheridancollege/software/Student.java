package sheridancollege.software;

/**
*
*2019-01-25
*/

public class Student {

    private String name, program;
    private int ID;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
    
    
}
