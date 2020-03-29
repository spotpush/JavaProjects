package oracle.model;

import java.io.Serializable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = "Departments.findAll", query = "select o from Departments o") })
public class Departments implements Serializable {
    private static final long serialVersionUID = 7884034687102735635L;
    @Id
    @Column(name = "DEPARTMENT_ID", nullable = false)
    private Integer departmentId;
    @Column(name = "DEPARTMENT_NAME", nullable = false, length = 30)
    private String departmentName;
    @Column(name = "LOCATION_ID")
    private Integer locationId;
    @ManyToOne
    @JoinColumn(name = "MANAGER_ID")
    private Employees employees1;
    @OneToMany(mappedBy = "departments", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private List<Employees> employeesList1;

    public Departments() {
    }

    public Departments(Integer departmentId, String departmentName, Integer locationId, Employees employees1) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.locationId = locationId;
        this.employees1 = employees1;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }


    public Employees getEmployees1() {
        return employees1;
    }

    public void setEmployees1(Employees employees1) {
        this.employees1 = employees1;
    }

    public List<Employees> getEmployeesList1() {
        return employeesList1;
    }

    public void setEmployeesList1(List<Employees> employeesList1) {
        this.employeesList1 = employeesList1;
    }

    public Employees addEmployees(Employees employees) {
        getEmployeesList1().add(employees);
        employees.setDepartments(this);
        return employees;
    }

    public Employees removeEmployees(Employees employees) {
        getEmployeesList1().remove(employees);
        employees.setDepartments(null);
        return employees;
    }
}
