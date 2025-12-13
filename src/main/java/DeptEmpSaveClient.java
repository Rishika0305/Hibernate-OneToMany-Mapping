import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeptEmpSaveClient {

    public static void main(String[] args) {
     Configuration cfg = new Configuration();
        cfg.configure("/hibernate.cfg.xml");
        // Create department FIRST
        Dept d1 = new Dept(0, "batch1", "ban1", null);

        // Create employees and set dept reference
        Emp e1 = new Emp(0, "cdc", 30000.00, "e", d1);
        Emp e2 = new Emp(0, "bgb", 70000.00, "t", d1);
        Emp e3 = new Emp(0, "ads", 50000.00, "e", d1);
        Emp e4 = new Emp(0, "cgd", 4000.00, "d", d1);

        // Add employees to list
        List<Emp> empList = new ArrayList<Emp>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        // Set list into Dept
        d1.setEmpList(empList);

        // Hibernate save
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
                Transaction tx = session.beginTransaction();
        try {
            session.save(d1);
            tx.commit();
            System.out.println("TX Success");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("TX Failed");
            e.printStackTrace();
        }
    }
}