package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App implements CommandLineRunner
{
    @Autowired
    CustomerDaoImpl customerDao;

    @Override
    public void run(String... args) throws Exception {
    Customer cust = new Customer(401,"Ram","Vasantpur");
    int insert = customerDao.insert(cust);
        System.out.println(insert+" record inserted...");
    }

    public static void main( String[] args )
    {

        System.out.println( "main method" );
        SpringApplication.run(App.class,args);
    }


}
