package company.classes;
// Generated 26.10.2011 15:04:34 by Hibernate Tools 3.2.1.GA

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name="department",
    catalog="test",
    uniqueConstraints = @UniqueConstraint(columnNames="name") 
)
public class Department implements Serializable {

    private Long id;
    private Company company;
    private Department department;
    private String name;
    private Set<Employee> employees = new HashSet<Employee>(0);
    private Set<Department> departments = new HashSet<Department>(0);

    public Department() {}
	
    public Department(Company company, String name) {
        this.company = company;
        this.name = name;
    }
    public Department(Company company, Department department, String name, Set<Employee> employees, Set<Department> departments) {
       this.company = company;
       this.department = department;
       this.name = name;
       this.employees = employees;
       this.departments = departments;
    }
   
    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cid", nullable=false)
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="did")
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }
    
    @Column(name="name", unique=true, nullable=false, length=100)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="department")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
    
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="department")
    public Set<Department> getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }




}


