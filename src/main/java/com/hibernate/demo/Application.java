package com.hibernate.demo;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import org.hibernate.query.Query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        LoggerInterceptor loggerInterceptor=new LoggerInterceptor();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Query query= session.createNamedQuery("user.byId")
                .setParameter("id",3);
        System.out.println(query.uniqueResult());

        //
//        Query query= session
//                .createNativeQuery("Delete from Employee where id=1")
//                .addEntity(Employee.class);
//
//        System.out.println(query.executeUpdate());

//        Criteria criteria = session.createCriteria(Employee.class).
//                setProjection(Projections.projectionList()
//                        .add(Projections.max("age"))
//                        .add(Projections.property("name")));
//
//
//
//
//        Object[] objectArray = ((Object[]) criteria.uniqueResult());
//        System.out.println("max::::"+objectArray[0]);
//        System.out.println("name::::"+objectArray[1]);


        //        Disjunction disjunction = Restrictions.disjunction();
//        disjunction.add(criteria1);
//        disjunction.add(criteria2);
//        criteria.add(disjunction);

//        List<Employee> employeeList = criteria.list();
//        employeeList.forEach(System.out::println);


//        System.out.println("query.list()>>>>"+query.list());
//       List<String> employeeList = query.list();
//        employeeList.forEach(System.out::println);

//            Dummy dummy = new Dummy();
//            dummy.setAge(23);
//            dummy.setId(23);
//            dummy.setName("Emp 23");
//            session.save(dummy);
//        String hql = "INSERT INTO Employee (id,name,age) SELECT id,name,age FROM Dummy where id = 23";
//        Query query = session.createQuery(hql);
//        query.executeUpdate();
//        query.list().forEach(System.out::println);

//        QueryParam queryParam=new QueryParam();
//        queryParam.setAge(30);
//
//        String hql="Update Employee set age = :age where id= :id";
//        Map map=new HashMap();
//        map.put("age",100);
//        map.put("id",4);
//        Query query = session.createQuery(hql).setProperties(map);
//        System.out.println("query.executeUpdate()>>>>"+query.executeUpdate());

        //        List<Object[]> list = (List<Object[]>)query.list();
//        System.out.println("list.size()>>>>>>"+list.size());
//        list.forEach((Object [] element)->{
//            System.out.println(element[0]);
//            System.out.println(element[1]);
//        });




//        Employee employee1 = new Employee();
//        employee1.setId(1);
//        employee1.setName("Emp 1");
//        employee1.setAge(53);
//        session.save(employee1);
//
//        Employee employee2 = new Employee();
//        employee2.setId(2);
//        employee2.setName("Emp 2");
//        employee2.setAge(24);
//        session.save(employee2);
//
//        Employee employee3 = new Employee();
//        employee3.setId(3);
//        employee3.setName("Emp 3");
//        employee3.setAge(18);
//        session.save(employee3);
//
//        Employee employee4 = new Employee();
//        employee4.setId(4);
//        employee4.setName("Emp 4");
//        employee4.setAge(33);
//        session.save(employee4);
//
//        Employee employee5 = new Employee();
//        employee5.setId(5);
//        employee5.setName("Emp 5");
//        employee5.setAge(37);
//        session.save(employee5);
//
//        Employee employee6 = new Employee();
//        employee6.setId(6);
//        employee6.setName("Emp 6");
//        employee6.setAge(56);
//        session.save(employee6);

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
        System.out.println("Hello World 1234 !!!!");
    }
}
