package com.project1cbs.service;

import com.project1cbs.dao.AddCabDao;
import com.project1cbs.dao.AddCabDaoImpl;
import com.project1cbs.model.Cab;

public class AddCabImpl implements AddCab {

    AddCabDao dao = new AddCabDaoImpl();
    
    public void addCab(Cab cab) {
		dao.addCabDao(cab);
	
	}

}
