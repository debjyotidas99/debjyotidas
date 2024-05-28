package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("customerdaoimpl")
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Customer customer) {
        String query = "insert into customer(id,name,city) values(?,?,?)";
        int insert = this.jdbcTemplate.update(query,customer.getId(),customer.getName(),customer.getCity());
        return insert;
    }
}
