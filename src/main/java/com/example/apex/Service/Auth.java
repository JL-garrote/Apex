package com.example.apex.Service;

import com.example.apex.Model.Usuario;

import java.beans.Encoder;
import java.sql.*;

public class Auth {

    private String URI = "jdbc:mysql://OneClub_eageryouth:54ea9f561354ab5ddbf7efc205fd9a4d357bf3f5@sy3gmd.h.filess.io:61001/OneClub_eageryouth";
    private String USER = "OneClub_eageryouth";
    private String PASS = "54ea9f561354ab5ddbf7efc205fd9a4d357bf3f5";

    Usuario user = new Usuario();
    Connection conn;
    Statement state;
    ResultSet rs;
    PreparedStatement ps;

    public Auth() throws SQLException {
        conn = DriverManager.getConnection(URI,USER,PASS);
        state = conn.createStatement();
    }

    public Usuario login(String email, String contrasena) throws SQLException {
        boolean valido = false;
        try {
            String sql = "SELECT id, nombre, apellido, email, password_hash, telefono, rol, sede_id, activo, created_at, updated_at " +
                    "FROM usuario WHERE email = ? AND password_hash = ?";

            ps = conn.prepareStatement(sql);

            ps.setString(1, email);
            ps.setString(2, contrasena);
            
            rs = ps.executeQuery();

            if(!rs.next()) {
                System.out.println("[no existe]");
                return null;
            }

            user.setId(rs.getLong("id"));
            user.setNombre(rs.getString("nombre"));
            user.setApellido(rs.getString("apellido"));
            user.setEmail(rs.getString("email"));
            user.setPasswordHash(rs.getString("password_hash"));
            user.setTelefono(rs.getString("telefono"));
            user.setRol(rs.getString("rol"));
            user.setSedeID(rs.getLong("sede_id"));
            user.setActivo(rs.getLong("activo"));
            user.setCreated_at(rs.getTimestamp("created_at").toLocalDateTime());
            user.setUpdated_at(rs.getTimestamp("updated_at").toLocalDateTime());

        } catch (Exception e) {
            System.err.println("[Error al buscar el usuario] " + e.getMessage() + "\n" + e.getStackTrace());
        }

        try {
            if (user.getEmail().equals(email) && user.getPasswordHash().equals(contrasena)) {
                System.out.println("[Usuario encontrado]");
                valido = true;
            } else {
                System.out.println("[Credenciales incorrectas]");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return user;
    }


    public void registro(Usuario usuario, String sede) throws SQLException {
        try {
            String sql = "INSERT INTO usuario (nombre, apellido, email, password_hash, telefono, rol, sede_id, activo, created_at, updated_at) " + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NOW(), NOW())";
            int resultado = 0;

            usuario.setSedeID(encontrarSedeID(sede));
            ps.setString(1,usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3,usuario.getEmail());
            ps.setString(4, usuario.getPasswordHash());
            ps.setString(5, usuario.getRol());
            ps.setLong(6,usuario.getSedeID());
            ps.setLong(7,usuario.getActivo());

            resultado = ps.executeUpdate(sql);

            if (resultado == 1) {
                System.out.println("[Usuario creado correctamente]");
            } else {
                System.out.println("[No se a podido crear el usuario correctamente]");
            }
        } catch (Exception e) {
            System.out.println("Error de sql en la clase Auth " + e.getMessage());
        }
    }

    public long encontrarSedeID(String sede) throws SQLException {

        String sql = "SELECT u.sede_ic\n" +
                "FROM usuario u\n" +
                "INNER JOIN sede s ON u.sede_ic = s.id\n" +
                "WHERE s.nombre = ?;";

        long resultado = 0;

        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, sede);

            if(!rs.next()) {
                System.out.println("[No se encontro ninguna sede]");
            } else {
                System.out.println("[Sede encontrada " + sede + "]");
                resultado = rs.getInt("sede_id");
            }

        } catch (Exception e) {
            System.err.println("Error en encontrar la sede " + e.getMessage());
        }

        return resultado;
    }
}