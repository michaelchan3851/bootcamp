import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Company {
  List<Staff> staffs;
  List<List<Staff>> staffLists;
  private static int counter;

  public Company() {
    staffs = new ArrayList<>();
  }

  public Company(List<Staff> staff) {
    this.staffs = staffs;
  }

  public List<Staff> getStaffs() {
    return this.staffs;
  }

  public void add(Staff staff) {
    this.staffs.add(staff);
    counter++;
  }

  /**
   * Get Staff name by staff id
   * 
   * @param staffId
   * @return
   */
  public Optional<String> getStaffName(int staffId) {
    return this.staffs.stream()
        .filter(e -> e.getId() == staffId) // List<Staff>
        .map(s -> s.getName()) // convert List<Staff> -> List<String>
        .findAny(); // Optional<String> , suppose function is to be return type to handle null
        //.orElse(null); // String
  }

  public static void main(String[] args) {
    Company company = new Company();
    company.getStaffs().add(new Staff(1, 20000, "John")); // OK
    company.add(new Staff(2, 10000, "Peter"));

    company.getStaffName(1); // "John"
  }
}
