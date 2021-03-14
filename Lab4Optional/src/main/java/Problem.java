import java.util.*;

public class Problem {
    List<Student> studentList = new ArrayList<>();
    TreeSet<School> schoolTreeSet = new TreeSet<>();
    Map<Student, List<School>> studentListMap = new HashMap<>();
    TreeMap<School, List<Student>> schoolListTreeMap = new TreeMap<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudentList(Student student) {
        studentList.add(student);
    }

    public TreeSet<School> getSchoolTreeSet() {
        return schoolTreeSet;
    }

    public void addSchoolTreeSet(School school) {
        schoolTreeSet.add(school);
    }

    public Map<Student, List<School>> getStudentListMap() {
        return studentListMap;
    }

    public void addStudentListMap(Student student, List listSchool) {
        studentListMap.put(student, listSchool);
    }

    public TreeMap<School, List<Student>> getSchoolListTreeMap() {
        return schoolListTreeMap;
    }

    public void addSchoolListTreeMap(School school, List listStudent) {
        schoolListTreeMap.put(school, listStudent);
    }

    public void sortStudentList() {
        Collections.sort(studentList, Comparator.comparing(Student::getScore).reversed());
    }


    @Override
    public String toString() {
        return "Problem{" +
                "studentList=" + studentList +
                ", schoolTreeSet=" + schoolTreeSet +
                ", studentListMap=" + studentListMap +
                ", schoolListTreeMap=" + schoolListTreeMap +
                '}';
    }

}
