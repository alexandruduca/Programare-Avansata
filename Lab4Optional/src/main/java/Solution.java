import java.util.List;
import java.util.Map;

public class Solution {
    List<Student> studentList;
    Map<Student, List<School>> studentListMap;

    public Solution(Problem problem) {
        this.studentList = problem.getStudentList();
        this.studentListMap = problem.getStudentListMap();
    }

    public void generateSolution() {
        boolean found = false;
        for (Student student : studentList) {
            found = false;
            for (int i = 0; i < studentListMap.get(student).size() && !found; i++) {
                School school = studentListMap.get(student).get(i);
                if (school.getCapacity() > 0) {
                    System.out.println("Student " + student.getName() + " has been assigned to school " + school.getName());
                    school.setCapacity(school.getCapacity() - 1);
                    found = true;
                }
            }
            if (!found)
                System.out.println("Student " + student.getName() + " could not be assigned to any school");
        }
    }


}
