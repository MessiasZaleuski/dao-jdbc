package aplicacao;

import java.util.Date;

import com.modelo.dao.FabricaDao;
import com.modelo.dao.VendedorDao;
import com.modelo.entidades.Departamento;
import com.modelo.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		
		Departamento obj = new Departamento(1, "Livro");

		Vendedor vend = new Vendedor(21, "Messias", "messias@gmail", new Date(), 3000.0, obj);
		
		VendedorDao vendDao = FabricaDao.criaVendedorDao();
		
		System.out.println(vend);
	}

}
