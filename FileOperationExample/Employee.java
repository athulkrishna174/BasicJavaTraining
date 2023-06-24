public class Employee {
    private String name;
    private int empid;
    private String designation;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Employee {designation=" + designation + ", empid=" + empid + ", name=" + name + "}";
    }   
    
}
