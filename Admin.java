package prob1;
import java.util.*;
public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> hm = new HashMap<>();
        for(Student s: students){
            Key k = new Key(s.getFirstName(), s.getLastName());
            hm.put(k, s);
        }
        return hm;
    }
    public static double computeAverageGPA(HashMap<Key,Student> maps){
        double average = 0.0;
        int count = 0;
        List<Student> values = new ArrayList<>(maps.values());
        for(Student val: values){
            ++count;
            average+=val.getGpa();
        }
        average/=count;
        return average;
    }
}
