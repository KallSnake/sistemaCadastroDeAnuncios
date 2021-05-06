package controller;

import java.sql.*;
import java.util.Calendar;
import javax.swing.JOptionPane;
import model.ModelCadastrarAnuncio;

public class ControllerCadastrarAnuncio {
    
    ConexaoDB conectaAnuncio = new ConexaoDB();
    ModelCadastrarAnuncio mCadastrarAnuncio = new ModelCadastrarAnuncio();
    Calendar dataInicio = Calendar.getInstance();
    Calendar dataFim = Calendar.getInstance();
    
    
    public void salvar(ModelCadastrarAnuncio mCadastrarAnuncio) {

        conectaAnuncio.conexao();

        try {

            String sqlSalvar = ("INSERT INTO "
                    + "ANUNCIO"
                    + "(\"NOME_ANUNCIO\","
                    + "\"NOME_CLIENTE\","
                    + "\"DATA_INICIO\","
                    + "\"DATA_TERMINO\","
                    + "\"INVESTIMENTO_DIA\") "
                    + "VALUES(?,?,?,?,?)");

            PreparedStatement pstm = conectaAnuncio.cnx.prepareStatement(sqlSalvar);

            pstm.setString(1, mCadastrarAnuncio.getNome_anuncio());
            pstm.setString(2, mCadastrarAnuncio.getNome_cliente());

            
            pstm.setDate(3, new Date(
                    mCadastrarAnuncio.getData_inicio().getTimeInMillis()));
            
            
            pstm.setDate(4, new Date(
                    mCadastrarAnuncio.getData_termino().getTimeInMillis()));
            
            pstm.setFloat(5, mCadastrarAnuncio.getInvestimento_dia());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Anúncio salvo com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro ao inserir dados \n Error: " + ex);

        }

        conectaAnuncio.desconecta();

    }
    
    
    public void editar(ModelCadastrarAnuncio mCadastrarAnuncio) {

        conectaAnuncio.conexao();
        
        // JOptionPane.showMessageDialog(null, mCadastrarAnuncio.getCod_anuncio());

        try {

            String sqlEditar = ("UPDATE "
                    + "ANUNCIO "
                    + "SET "
                    + "NOME_ANUNCIO=?,"
                    + "NOME_CLIENTE=?,"
                    + "DATA_INICIO=?,"
                    + "DATA_TERMINO=?,"
                    + "INVESTIMENTO_DIA=? "
                    + "WHERE "
                    + "COD_ANUNCIO=?");

            PreparedStatement pstm = conectaAnuncio.cnx.prepareStatement(sqlEditar);

            pstm.setString(1, mCadastrarAnuncio.getNome_anuncio());
            pstm.setString(2, mCadastrarAnuncio.getNome_cliente());
            pstm.setDate(3, new Date(mCadastrarAnuncio.getData_inicio().getTimeInMillis()));
            pstm.setDate(4, new Date(mCadastrarAnuncio.getData_termino().getTimeInMillis()));
            pstm.setFloat(5, mCadastrarAnuncio.getInvestimento_dia());
            pstm.setInt(6, mCadastrarAnuncio.getCod_anuncio());
            
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Dados do anúncio alterados com sucesso!");

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Erro na alteração dos dados \n Error: " + ex);
            conectaAnuncio.desconecta();
        }

        conectaAnuncio.desconecta();
    }
    
    
    public void excluir(ModelCadastrarAnuncio mCadastrarAnuncio) {
        
        conectaAnuncio.conexao();

        try {
            
            String sqlExcluir = ("DELETE FROM "
                    + "ANUNCIO "
                    + "WHERE "
                    + "COD_ANUNCIO=?");
            
            PreparedStatement pstm = conectaAnuncio.cnx.prepareStatement(sqlExcluir);
            
            pstm.setInt(1, mCadastrarAnuncio.getCod_anuncio());
            
            pstm.execute();
            
            JOptionPane.showMessageDialog(null, "Anúncio excluido com sucesso!");
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados \n Error: " + ex);
        }

        conectaAnuncio.desconecta();
    }

    
    public ModelCadastrarAnuncio buscarCliente(ModelCadastrarAnuncio mCadastrarAnuncio) {
        
        conectaAnuncio.conexao();
        
        String sql = ("SELECT * FROM "
                + "ANUNCIO "
                + "WHERE "
                + "NOME_CLIENTE"
                + " LIKE '%" + mCadastrarAnuncio.getPesquisa() + "%'");
        
        conectaAnuncio.executaSQL(sql);

        try {
            
            conectaAnuncio.rs.first();
            
            mCadastrarAnuncio.setCod_anuncio(conectaAnuncio.rs.getInt("COD_ANUNCIO"));
            mCadastrarAnuncio.setNome_anuncio(conectaAnuncio.rs.getString("NOME_ANUNCIO"));
            mCadastrarAnuncio.setNome_cliente(conectaAnuncio.rs.getString("NOME_CLIENTE"));
            dataInicio.setTime(conectaAnuncio.rs.getDate("DATA_INICIO"));
            mCadastrarAnuncio.setData_inicio(dataInicio);
            dataFim.setTime(conectaAnuncio.rs.getDate("DATA_TERMINO"));
            mCadastrarAnuncio.setData_termino(dataFim);
            mCadastrarAnuncio.setInvestimento_dia(conectaAnuncio.rs.getFloat("INVESTIMENTO_DIA"));

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Anúncio não cadastrado!");
            // JOptionPane.showMessageDialog(null, "Erro ao pesquisar! \n ERROR: " + ex);

        }

        conectaAnuncio.desconecta();
        
        return mCadastrarAnuncio;
    }
    
}