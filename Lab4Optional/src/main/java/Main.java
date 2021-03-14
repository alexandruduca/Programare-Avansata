import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Faker faker = new Faker();

//        var students = IntStream.rangeClosed(0,3)
//                .mapToObj(i -> new Student("S" + i))
//                .toArray(Student[]::new);
//
//        var schools = IntStream.rangeClosed(0,2)
//                .mapToObj(i -> new School("H" + i))
//                .toArray(School[]::new);

        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student(faker.name().fullName()))
                .toArray(Student[]::new);

        var schools = IntStream.rangeClosed(0, 2)
                .mapToObj(i -> new School(faker.university().name()))
                .toArray(School[]::new);

        for (Student s : students)
            s.setScore();

        schools[0].setCapacity(1);
        schools[1].setCapacity(2);
        schools[2].setCapacity(2);

        Problem problem = new Problem();

        for (Student s : students)
            problem.addStudentList(s);

        for (School s : schools)
            problem.addSchoolTreeSet(s);

        problem.addStudentListMap(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        problem.addStudentListMap(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        problem.addStudentListMap(students[2], Arrays.asList(schools[0], schools[1]));
        problem.addStudentListMap(students[3], Arrays.asList(schools[0], schools[2]));

        problem.addSchoolListTreeMap(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        problem.addSchoolListTreeMap(schools[1], Arrays.asList(students[0], students[2], students[1]));
        problem.addSchoolListTreeMap(schools[2], Arrays.asList(students[0], students[1], students[3]));

        int index = 0;
        for (Student s : students) {
            System.out.print("S" + index + " ");
            System.out.println(s.getName());
            index++;
        }
        index = 0;
        System.out.println();

        for (School s : schools) {
            System.out.print("H" + index + " ");
            System.out.println(s.getName());
            index++;
        }

        System.out.println();

        System.out.println("Students who find acceptable the schools " + schools[0].getName() + " and " + schools[1].getName() + " :");
        List<School> target = Arrays.asList(schools[0], schools[1]);
        problem.studentList.stream()
                .filter(std -> problem.studentListMap.get(std).containsAll(target))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("The list of schools who have the student " + students[3].getName() + " as their top preference: ");
        problem.schoolTreeSet.stream()
                .filter(std -> problem.schoolListTreeMap.get(std).indexOf(students[3]) == 0)
                .forEach(System.out::println);

        System.out.println();
        System.out.println();

        problem.sortStudentList();

        Solution solution = new Solution(problem);
        solution.generateSolution();

    }
}
