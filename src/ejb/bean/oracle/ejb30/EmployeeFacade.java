package oracle.ejb30;

import javax.ejb.Remote;

@Remote
public interface EmployeeFacade {
    void addEmployee(int empNo, String name, double salary);

    Employee findEmployeeByEmpNo(int empNo);

}
