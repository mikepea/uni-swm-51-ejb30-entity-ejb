package oracle.ejb30;

import javax.persistence.PersistenceContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
public class EmployeeFacadeBean implements EmployeeFacade {
    @PersistenceContext
    private EntityManager em;

    private Employee emp;

    public Employee findEmployeeByEmpNo(int empNo) {
        return ((Employee) em.find(Employee.class, empNo));
    }

    public void addEmployee(int empNo, String eName, double sal) {
        emp = new Employee();
        emp.setEmpNo(empNo);
        emp.setEname(eName);
        emp.setSal(sal);
        em.persist(emp);
    }

}
