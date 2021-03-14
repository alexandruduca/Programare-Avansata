public class School implements Comparable<School> {
    private String name;
    private int capacity;

    public School(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(School o) {
        return this.getName().compareTo(o.getName());
    }
}
