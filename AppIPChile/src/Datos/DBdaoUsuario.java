package Datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Entidades.Usuario;
import Interface.IdaoUsuario;

public class DBdaoUsuario implements IdaoUsuario {

	@Override
	public boolean ValidarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pst = null;

		String sql = "select * from Usuario where User='" + usuario.getUser()
				+ "' and Pass='" + usuario.getPass() + "'";

		try {
			conn = Conexion.conectorBd();
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery(sql);
			if (res.next()) {
				return true;

			} else {
				return false;

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}

	}

}
