package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String labName;
    public Lab() {
        this("Lab");
    }

    public Lab(String labName) {
        this.labName=labName;
    }

    public String getName() {
        return labName;
    }
}
