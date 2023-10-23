package com.project1cbs.dao;

import com.project1cbs.model.Employee;

public interface GetUserCredentialsDao {
   public String getEmail(Integer id);
   public String getPassword(Integer id);
   public String getDesignation(Integer id);
   public Employee getEmpObj(Integer id);
}
