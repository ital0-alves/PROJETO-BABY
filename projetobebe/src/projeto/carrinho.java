package projeto;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class carrinho {

    private JFrame frame;
    private JTable table;
    private DefaultTableModel modelo;

    private JTextPane txtpnTotal;      
    private JTextPane txtpnValorFinal;  

    private double total = 0.0;  

    /**
     * PARA TESTE ISOLADO (OPCIONAL)
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    carrinho window = new carrinho();
                    window.visivel();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public carrinho() {
        initialize();
    }

    public void visivel() {
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * ADICIONA ITEM AO CARRINHO VIA TELA PRINCIPAL
     *
     * Exemplo chamado lá:
     * car.addcarrinho("Fralda Ecologica", 150);
     */
    public void addcarrinho(String produto, double precoUnit) {

        double qtd = 1.0;
        boolean encontrado = false;

        for (int i = 0; i < modelo.getRowCount(); i++) {

            String prodTabela = (String) modelo.getValueAt(i, 1);

            if (prodTabela.equals(produto)) {
                double qtdAtual = (double) modelo.getValueAt(i, 0);
                qtdAtual += 1.0;

                double novoValor = qtdAtual * precoUnit;

                modelo.setValueAt(qtdAtual, i, 0);
                modelo.setValueAt(precoUnit, i, 2);
                modelo.setValueAt(novoValor, i, 3);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            double valor = qtd * precoUnit;
            Object[] linha = { qtd, produto, precoUnit, valor };
            modelo.addRow(linha);
        }

        total += precoUnit;
        atualizarTotais(0);
    }

    private void atualizarTotais(double descontoPercentual) {

        txtpnTotal.setText(String.format("%.2f", total));

        double valorFinal = total;

        if (descontoPercentual > 0) {
            valorFinal = total - (total * (descontoPercentual / 100.0));
        }

        txtpnValorFinal.setText(String.format("%.2f", valorFinal));
    }

    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 819, 564);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        // ------------------- TABELA -------------------
        String[] colunas = { "Qtd", "Produto", "PreçoUnit", "Valor" };

        modelo = new DefaultTableModel(colunas, 0) {

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == 0 || columnIndex == 2 || columnIndex == 3) {
                    return Double.class;
                }
                return String.class;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(modelo);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(table);
        scrollPane.setColumnHeaderView(table.getTableHeader()); 
        scrollPane.setBounds(10, 11, 783, 320);
        frame.getContentPane().add(scrollPane);

        // ------------------- TOTAL -------------------

        JTextPane txtpnLblTotal = new JTextPane();
        txtpnLblTotal.setText("Valor Total");
        txtpnLblTotal.setEditable(false);
        txtpnLblTotal.setBounds(434, 342, 181, 20);
        frame.getContentPane().add(txtpnLblTotal);

        txtpnTotal = new JTextPane();
        txtpnTotal.setText("0,00");
        txtpnTotal.setEditable(false);
        txtpnTotal.setBounds(622, 342, 171, 20);
        frame.getContentPane().add(txtpnTotal);

        // ------------------- DESCONTOS -------------------

        JTextPane txtpnLblDesconto = new JTextPane();
        txtpnLblDesconto.setText("Desconto");
        txtpnLblDesconto.setEditable(false);
        txtpnLblDesconto.setBounds(434, 374, 101, 20);
        frame.getContentPane().add(txtpnLblDesconto);

        // BOTÃO 0%
        JButton btn0 = new JButton("0%");
        btn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarTotais(0);
            }
        });
        btn0.setBounds(536, 373, 86, 23);
        frame.getContentPane().add(btn0);

        // BOTÃO 5%
        JButton btn5 = new JButton("5%");
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarTotais(5);
            }
        });
        btn5.setBounds(622, 373, 86, 23);
        frame.getContentPane().add(btn5);

        // BOTÃO 10%
        JButton btn10 = new JButton("10%");
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                atualizarTotais(10);
            }
        });
        btn10.setBounds(707, 373, 86, 23);
        frame.getContentPane().add(btn10);

        // ------------------- VALOR FINAL -------------------

        JTextPane txtpnLblValorFinal = new JTextPane();
        txtpnLblValorFinal.setText("Valor final");
        txtpnLblValorFinal.setEditable(false);
        txtpnLblValorFinal.setBounds(434, 405, 181, 20);
        frame.getContentPane().add(txtpnLblValorFinal);

        txtpnValorFinal = new JTextPane();
        txtpnValorFinal.setText("0,00");
        txtpnValorFinal.setEditable(false);
        txtpnValorFinal.setBounds(622, 405, 171, 20);
        frame.getContentPane().add(txtpnValorFinal);
    }
}
