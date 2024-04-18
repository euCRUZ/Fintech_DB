package br.com.fiap.fintech.JDBC;

import br.com.fiap.fintech.modelos.Investimento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InvestimentoDAO {

    private Connection conexao;

    public void cadastrarInvestimento(Investimento investimento) {
        PreparedStatement stmt = null;

        try {
            conexao = FintechDBManager.obterConexao();

        //    INSERT INTO T_INVESTIMENTO (id_user, dt_data, vl_rentabilidade_nominal, vl_valor, tp_tipo)
            String sql = "INSERT INTO T_INVESTIMENTO (ID_USER, DT_DATA, VL_RENTABILIDADE_NOMINAL, VL_VALOR, TP_TIPO) " +
                    "VALUES" +
                    " (?, ?, ?, ?, ?)";
            stmt = conexao.prepareStatement(sql);

            stmt.setInt(1, investimento.getIdUser());
            stmt.setString(2, investimento.getData());
            stmt.setDouble(3, investimento.getRentabilidadeNominal());
            stmt.setDouble(4, investimento.getValor());
            stmt.setString(5, investimento.getTipo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Investimento> listar() {
        //Cria uma lista de colaboradores
        List<Investimento> lista = new ArrayList<Investimento>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = FintechDBManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM T_INVESTIMENTO");
            rs = stmt.executeQuery();

            //Percorre todos os registros encontrados
            while (rs.next()) {
                int id = rs.getInt("ID_USER");
                String data = rs.getString("DT_DATA");
                double rentabilidade = rs.getDouble("VL_RENTABILIDADE_NOMINAL");
                double valor = rs.getDouble("VL_VALOR");
                String tipo = rs.getString("TP_TIPO");
                //Cria um objeto Colaborador com as informações encontradas
                Investimento investimento = new Investimento();
                investimento.setIdUser(id);
                investimento.setData(data);
                investimento.setRentabilidadeNominal(rentabilidade);
                investimento.setValor(valor);
                investimento.setTipo(tipo);
                //Adiciona o investimento na lista
                lista.add(investimento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public Investimento buscarPorId(int codigoBusca) {
        Investimento investimento = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = FintechDBManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM T_INVESTIMENTO WHERE ID_USER = ?");
            stmt.setInt(1, codigoBusca);
            rs = stmt.executeQuery();

            if (rs.next()){
                int id = rs.getInt("ID_USER");
                String data = rs.getString("DT_DATA");
                double rentabilidade = rs.getDouble("VL_RENTABILIDADE_NOMINAL");
                double valor = rs.getDouble("VL_VALOR");
                String tipo = rs.getString("TP_TIPO");
                investimento = new Investimento();
                investimento.set(id);
                investimento.setEmail(data);
                investimento.setId(rentabilidade);
                investimento.setSenha(valor);
                investimento.setSenha(tipo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                stmt.close();
                rs.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return investimento;
    }

    public void atualizarInvestimento(Investimento investimento) {
        PreparedStatement stmt = null;

        try {
            conexao = FintechDBManager.obterConexao();
            String sql = "UPDATE T_INVESTIMENTO SET DT_DATA = ?, VL_RENTABILIDADE_NOMINAL = ?, VL_VALOR = ?, TP_TIPO " +
                    "= ? WHERE " +
                    "ID_USER = ?";
            stmt = conexao.prepareStatement(sql);

            stmt.setString(1, investimento.getData());
            stmt.setDouble(2, investimento.getRentabilidadeNominal());
            stmt.setDouble(3, investimento.getValor());
            stmt.setString(4, investimento.getTipo());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
