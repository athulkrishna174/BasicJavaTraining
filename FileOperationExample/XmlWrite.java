import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlWrite {
    
    public static void main(String[] args) throws Exception{
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.setName("Athul");
        emp1.setEmpid(1001);
        emp1.setDesignation("Associate Engineer");

        emp2.setName("Binu");
        emp2.setEmpid(1004);
        emp2.setDesignation("Software Engineer");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(emp1);
        employeeList.add(emp2);

        Office office = new Office();
        office.setEmployees(employeeList);

        XMLEncoder encode = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Office.xml")));

        encode.writeObject(office);
        encode.close();


        XMLDecoder decode = new XMLDecoder(new BufferedInputStream(new FileInputStream("office.xml")));

        Office decodedOffice = (Office)decode.readObject(); 

        List<Employee> list = decodedOffice.getEmployees();

        for(Employee emp : list){
            System.out.println(emp);
        }
        
    }
}
