package com.modelo.dao;

import com.modelo.entidades.Vendedor;
import com.sun.javafx.scene.control.skin.ListViewSkin;

public interface VendedorDao {
	
	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deletById(Integer id);
	Vendedor findById(Integer id);
	ListViewSkin<Vendedor> findAll();	


}
