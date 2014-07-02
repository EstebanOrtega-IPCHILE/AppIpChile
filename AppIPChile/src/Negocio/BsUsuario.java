package Negocio;

import Entidades.Usuario;
import Datos.DBdaoUsuario;

public class BsUsuario  {

	public boolean ValidarUsuario(Usuario usuario) {
		
		return new DBdaoUsuario().ValidarUsuario(usuario);
		
		
		// TODO Auto-generated method stub
		
		
		
	}

}
