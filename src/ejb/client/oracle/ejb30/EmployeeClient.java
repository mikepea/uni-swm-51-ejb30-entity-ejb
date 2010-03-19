package oracle.ejb30;

import javax.naming.Context;
import javax.naming.InitialContext;

public class EmployeeClient {
    public static void main(String[] args) {

        try {
            Context context = new InitialContext();
            EmployeeFacade ef = (EmployeeFacade) context
                    .lookup("java:comp/env/ejb/EmployeeFacade");

            int empNo = 0;
            String name = null;
            Double sal = null;

            try {
                empNo = Integer.parseInt(args[0]);
                name = args[1];
                sal = Double.parseDouble(args[2]);
            } catch (Exception e) {
                System.err.println("Correct arguments not received, exiting");
                System.exit(0);
            }

            ef.addEmployee(empNo, name, sal);
            System.out.println("Employee with empNo:" + empNo + " created");
            System.out.println("Find the employee using Entity Manager API");
            Employee emp2 = ef.findEmployeeByEmpNo(empNo);
            // Dump the Bean out
            System.out.println(emp2);
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }

}