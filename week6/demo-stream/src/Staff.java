import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Staff {
  String name;
  Department department;
  int performance;

  public Staff(String name, Department department, int performance) {
    this.name = name;
    this.department = department;
    this.performance = performance;
  }

  @Override
  public String toString() {
    return "[Dept" + this.department +
        "name= "
        + this.name + "]";
  }

  public static void main(String[] args) {
    List<Staff> staffs = Arrays.asList(new Staff("Mary", new Department("HR"), 50),
        (new Staff("Peter", new Department("IT"), 60)),
        (new Staff("Eric", new Department("IT"), 70)));

    Map<Department, List<Staff>> depts = staffs.stream()
        .collect(Collectors.groupingBy(staff -> staff.department)); // group with same elements

    depts.forEach(
        (dept, staffList) -> System.out.println(dept + " " + staffList));

    for (Staff staff : depts.get(new Department("IT"))) { // equals() & hashCode
      System.out.println(staff.name);
    }

    //
    Map<Boolean, List<Staff>> gradeMap = staffs.stream()
        .collect(Collectors.partitioningBy(staff -> staff.performance >= 60));

    gradeMap.entrySet().stream() // list, set -> stream()
        .forEach(e -> System.out.println(e));
  }

}
