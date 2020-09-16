package com.modelo.dao;

import com.modelo.entidades.Departamento;
import com.sun.javafx.scene.control.skin.ListViewSkin;

public interface DepartamentoDao {
	
	void insert(Departamento obj);
	void update(Departamento obj);
	void deletById(Integer id);
	Departamento findById(Integer id);
	ListViewSkin<Departamento> findAll();	

}

