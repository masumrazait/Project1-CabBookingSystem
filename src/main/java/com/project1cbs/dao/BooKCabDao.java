package com.project1cbs.dao;

import com.project1cbs.exception.CabUnavailableException;
import com.project1cbs.model.Cab;
import com.project1cbs.model.Employee;

public interface BooKCabDao {
public void bookAcabDao(Employee emp, Cab cab) throws CabUnavailableException;
}
