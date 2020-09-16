package com.modelo.dao;

import com.modelo.dao.implementacao.VendedorDaoJDBC;

public class FabricaDao {
	
	public static VendedorDao criaVendedorDao() {
		return new VendedorDaoJDBC();	}

}
