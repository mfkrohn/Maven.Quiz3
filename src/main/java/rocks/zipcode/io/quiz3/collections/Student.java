package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    Map<Lab,LabStatus> labMap;
    public Student() {
        this(new HashMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        this.labMap = map;
    }

    public Lab getLab(String labName) {
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        labMap.put(new Lab(labName),labStatus);
    }


    public void forkLab(Lab lab) {
        setLabStatus(lab.getName(),LabStatus.PENDING);
    }

    public LabStatus getLabStatus(String labName) {
        for(Map.Entry thisEntry:labMap.entrySet()){
            Lab thisLab = (Lab) thisEntry.getKey();
            if(thisLab.getName().equals(labName)){
                return (LabStatus)thisEntry.getValue();
            }
        }
        return null;
    }
}
