package projeto;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JOptionPane;

public class tela {

    private JFrame frmProbaby;
    private JTextField txtTitul;
    JPanel panel_4; // roupas
    JPanel panel_5; // acessórios
    JPanel panel_6; // fraldas
    carrinho car = new carrinho();

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    tela window = new tela();
                    window.frmProbaby.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public tela() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frmProbaby = new JFrame();
        frmProbaby.setIconImage(Toolkit.getDefaultToolkit().getImage(tela.class.getResource("/fotobebe/logo.png")));
        frmProbaby.setTitle("ProBaby");
        frmProbaby.setBounds(100, 100, 819, 564);
        frmProbaby.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmProbaby.getContentPane().setLayout(null);

        // ----------------- PAINEL FRALDAS (panel_6) -----------------
        panel_6 = new JPanel();
        panel_6.setBounds(210, 107, 587, 411);
        frmProbaby.getContentPane().add(panel_6);
        panel_6.setLayout(null);

        JButton btnAddEcologica = new JButton("+");
        btnAddEcologica.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Fralda Ecologica", 150);
            }
        });
        btnAddEcologica.setBounds(147, 374, 42, 27);
        panel_6.add(btnAddEcologica);

        JButton btnEcologicaImg = new JButton("");
        btnEcologicaImg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnEcologicaImg.setBounds(10, 11, 179, 213);
        panel_6.add(btnEcologicaImg);
        btnEcologicaImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\ecologica.jpg"));

        JButton btnPanoImg = new JButton("");
        btnPanoImg.setBounds(201, 11, 179, 213);
        panel_6.add(btnPanoImg);
        btnPanoImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\pano.jpg"));

        JButton btnDescartavelImg = new JButton("");
        btnDescartavelImg.setBounds(390, 11, 179, 213);
        panel_6.add(btnDescartavelImg);
        btnDescartavelImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\descartavel.jpg"));

        JTextPane txtpnEcologicaDescricao = new JTextPane();
        txtpnEcologicaDescricao.setBounds(10, 263, 179, 70);
        panel_6.add(txtpnEcologicaDescricao);
        txtpnEcologicaDescricao
                .setText("Pijama Infantil – Tema Urso Azul\r\n \r\nMaterial: Algodão suave\r\nIndicação: 0–12 meses");

        JTextArea txtrFraldaEcologica = new JTextArea();
        txtrFraldaEcologica.setBounds(10, 230, 179, 27);
        panel_6.add(txtrFraldaEcologica);
        txtrFraldaEcologica.setText("Fralda Ecologica");
        txtrFraldaEcologica.setFont(new Font("Arial", Font.PLAIN, 13));

        JTextArea txtrFraldaPano = new JTextArea();
        txtrFraldaPano.setBounds(201, 230, 179, 27);
        panel_6.add(txtrFraldaPano);
        txtrFraldaPano.setText("Fralde de Pano");
        txtrFraldaPano.setFont(new Font("Arial", Font.PLAIN, 13));

        JTextArea txtrEcologicaCar = new JTextArea();
        txtrEcologicaCar.setBounds(10, 378, 123, 18);
        panel_6.add(txtrEcologicaCar);
        txtrEcologicaCar.setText("ADIC. AO CARRINHO");
        txtrEcologicaCar.setFont(new Font("Arial", Font.PLAIN, 12));

        JTextArea txtrEcologicoVal = new JTextArea();
        txtrEcologicoVal.setBounds(10, 344, 123, 27);
        panel_6.add(txtrEcologicoVal);
        txtrEcologicoVal.setText("      R$ 150,00");
        txtrEcologicoVal.setFont(new Font("Arial Black", Font.PLAIN, 13));

        JTextArea txtrFraldaDescartavel = new JTextArea();
        txtrFraldaDescartavel.setBounds(390, 230, 179, 27);
        panel_6.add(txtrFraldaDescartavel);
        txtrFraldaDescartavel.setText(" Fralda Descartavel");
        txtrFraldaDescartavel.setFont(new Font("Arial", Font.PLAIN, 13));

        JTextArea txtrDescartavelVal = new JTextArea();
        txtrDescartavelVal.setBounds(390, 344, 123, 27);
        panel_6.add(txtrDescartavelVal);
        txtrDescartavelVal.setText("      R$ 60,00");
        txtrDescartavelVal.setFont(new Font("Arial Black", Font.PLAIN, 13));

        JButton btnEcologicaInforma = new JButton("I");
        btnEcologicaInforma.setBounds(147, 344, 42, 27);
        panel_6.add(btnEcologicaInforma);

        JTextArea txtrPanoCar = new JTextArea();
        txtrPanoCar.setBounds(201, 378, 123, 18);
        panel_6.add(txtrPanoCar);
        txtrPanoCar.setText("ADIC. AO CARRINHO");
        txtrPanoCar.setFont(new Font("Arial", Font.PLAIN, 12));

        JTextPane txtpnDescartavelDescricao = new JTextPane();
        txtpnDescartavelDescricao.setBounds(390, 263, 179, 70);
        panel_6.add(txtpnDescartavelDescricao);
        txtpnDescartavelDescricao.setText(
                "Macacão Infantil – Tema Natureza Caramelo\r\nMaterial: Algodão premium\r\nIndicação: 0–12 meses");

        JTextArea txtrPanoVal = new JTextArea();
        txtrPanoVal.setBounds(201, 344, 123, 27);
        panel_6.add(txtrPanoVal);
        txtrPanoVal.setText("      R$ 39,99");
        txtrPanoVal.setFont(new Font("Arial Black", Font.PLAIN, 13));

        JButton btnPanoInforma = new JButton("I");
        btnPanoInforma.setBounds(338, 344, 42, 27);
        panel_6.add(btnPanoInforma);

        JButton btnAddPano = new JButton("+");
        btnAddPano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Fralda De Pano", 39.99);
            }
        });
        btnAddPano.setBounds(338, 374, 42, 27);
        panel_6.add(btnAddPano);

        JTextArea txtrDescartavelCar = new JTextArea();
        txtrDescartavelCar.setBounds(390, 378, 123, 18);
        panel_6.add(txtrDescartavelCar);
        txtrDescartavelCar.setText("ADIC. AO CARRINHO");
        txtrDescartavelCar.setFont(new Font("Arial", Font.PLAIN, 12));

        JButton btnAddDescartavel = new JButton("+");
        btnAddDescartavel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Fralda Descartavel", 60);
            }
        });
        btnAddDescartavel.setBounds(527, 374, 42, 27);
        panel_6.add(btnAddDescartavel);

        JButton btnDescartavelInforma = new JButton("I");
        btnDescartavelInforma.setBounds(527, 344, 42, 27);
        panel_6.add(btnDescartavelInforma);

        JTextPane txtpnPanoDescricao = new JTextPane();
        txtpnPanoDescricao.setBounds(201, 263, 179, 70);
        panel_6.add(txtpnPanoDescricao);
        txtpnPanoDescricao.setText(
                "Kit Meias Infantis – Estampa Verde                                             Material: Algodão + fibras elásticas\r\nIndicação: 0–12 meses");

        // ----------------- PAINEL ROUPAS (panel_4) -----------------
        panel_4 = new JPanel();
        panel_4.setBounds(210, 107, 587, 411);
        frmProbaby.getContentPane().add(panel_4);
        panel_4.setLayout(null);
        panel_4.setVisible(false);

        JTextArea txtrMeiasELuvas = new JTextArea();
        txtrMeiasELuvas.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrMeiasELuvas.setText(" MEIAS E LUVAS");
        txtrMeiasELuvas.setBounds(390, 230, 179, 27);
        panel_4.add(txtrMeiasELuvas);

        JButton btnPijamaImg = new JButton("");
        btnPijamaImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\pijama.jpg"));
        btnPijamaImg.setBounds(10, 11, 179, 213);
        panel_4.add(btnPijamaImg);

        JButton btnMacacaoImg = new JButton("");
        btnMacacaoImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\macacao.jpg"));
        btnMacacaoImg.setBounds(201, 11, 179, 213);
        panel_4.add(btnMacacaoImg);

        JButton btnMeiasLuvasImg = new JButton("");
        btnMeiasLuvasImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\meia e luva .jpg"));
        btnMeiasLuvasImg.setBounds(390, 11, 179, 213);
        panel_4.add(btnMeiasLuvasImg);

        JTextArea txtrMacacaoInfantil = new JTextArea();
        txtrMacacaoInfantil.setText("MACACÃO INFANTIL ");
        txtrMacacaoInfantil.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrMacacaoInfantil.setBounds(201, 230, 179, 27);
        panel_4.add(txtrMacacaoInfantil);

        JTextArea txtrPijamaInfantil = new JTextArea();
        txtrPijamaInfantil.setText(" PIJAMA INFANTIL");
        txtrPijamaInfantil.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrPijamaInfantil.setBounds(10, 230, 179, 27);
        panel_4.add(txtrPijamaInfantil);

        JTextArea txtrPijamaVal = new JTextArea();
        txtrPijamaVal.setText("      R$ 215,00");
        txtrPijamaVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrPijamaVal.setBounds(10, 344, 123, 27);
        panel_4.add(txtrPijamaVal);

        JTextArea txtrPijamaCar = new JTextArea();
        txtrPijamaCar.setText("ADIC. AO CARRINHO");
        txtrPijamaCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrPijamaCar.setBounds(10, 378, 123, 18);
        panel_4.add(txtrPijamaCar);

        JTextPane txtpnPijamaInfantil = new JTextPane();
        txtpnPijamaInfantil.setText(
                "Pijama Infantil – Tema Urso Azul\r\n \r\nMaterial: Algodão suave\r\nIndicação: 0–12 meses");
        txtpnPijamaInfantil.setBounds(10, 263, 175, 70);
        panel_4.add(txtpnPijamaInfantil);

        JButton btnPijamaInforma = new JButton("I");
        btnPijamaInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "1. Pijama Infantil – Tema Urso Azul\r\n" + "\r\n" + "Categoria: Meias e Luvas\r\n"
                                + "Descrição: Macacão infantil estampado com ursos, tecido macio e confortável.\r\n"
                                + "Material: Algodão suave\r\n" + "Indicação: 0–12 meses",
                        "Informações", -1);
            }
        });
        btnPijamaInforma.setBounds(147, 344, 42, 27);
        panel_4.add(btnPijamaInforma);

        JButton btnMacacaoInforma = new JButton("I");
        btnMacacaoInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "2. Macacão Infantil – Tema Natureza Caramelo\r\n" + "\r\n" + "Categoria: Meias e Luvas\r\n"
                                + "Descrição: Macacão infantil com estampa natural em tom caramelo. Toque leve e respirável.\r\n"
                                + "Material: Algodão premium\r\n" + "Indicação: 0–12 meses",
                        null, -1);
            }
        });
        btnMacacaoInforma.setBounds(338, 344, 42, 27);
        panel_4.add(btnMacacaoInforma);

        JTextArea txtrMacacaoVal = new JTextArea();
        txtrMacacaoVal.setText("      R$ 315,00");
        txtrMacacaoVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrMacacaoVal.setBounds(201, 344, 123, 27);
        panel_4.add(txtrMacacaoVal);

        JButton btnMeiasLuvasInforma = new JButton("I");
        btnMeiasLuvasInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Kit Meias Infantis – Estampa Verde\r\n" + "\r\n" + "Categoria: Meias e Luvas\r\n"
                                + "Descrição: Kit com 3 pares de meias infantis estampadas, confortáveis e macias.\r\n"
                                + "Material: Algodão + fibras elásticas\r\n" + "Indicação: 0–12 meses",
                        null, -1);
            }
        });
        btnMeiasLuvasInforma.setBounds(527, 344, 42, 27);
        panel_4.add(btnMeiasLuvasInforma);

        JTextArea txtrMeiaLuvasVal = new JTextArea();
        txtrMeiaLuvasVal.setText("      R$ 100,00");
        txtrMeiaLuvasVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrMeiaLuvasVal.setBounds(390, 344, 123, 27);
        panel_4.add(txtrMeiaLuvasVal);

        JButton btnAddPijama = new JButton("+");
        btnAddPijama.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Pijama", 215);
            }
        });
        btnAddPijama.setBounds(147, 374, 42, 27);
        panel_4.add(btnAddPijama);

        JTextArea txtrMacacaoCar = new JTextArea();
        txtrMacacaoCar.setText("ADIC. AO CARRINHO");
        txtrMacacaoCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrMacacaoCar.setBounds(201, 378, 123, 18);
        panel_4.add(txtrMacacaoCar);

        JButton btnAddMacacao = new JButton("+");
        btnAddMacacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Macacão", 315);
            }
        });
        btnAddMacacao.setBounds(338, 374, 42, 27);
        panel_4.add(btnAddMacacao);

        JTextArea txtrMeiasLuvasCar = new JTextArea();
        txtrMeiasLuvasCar.setText("ADIC. AO CARRINHO");
        txtrMeiasLuvasCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrMeiasLuvasCar.setBounds(390, 378, 123, 18);
        panel_4.add(txtrMeiasLuvasCar);

        JButton btnAddmeiasLuvas = new JButton("+");
        btnAddmeiasLuvas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Meias e Luvas", 100);
            }
        });
        btnAddmeiasLuvas.setBounds(527, 374, 42, 27);
        panel_4.add(btnAddmeiasLuvas);

        JTextPane txtpnMacacoInfantil = new JTextPane();
        txtpnMacacoInfantil.setText(
                "Macacão Infantil – Tema Natureza Caramelo\r\nMaterial: Algodão premium\r\nIndicação: 0–12 meses");
        txtpnMacacoInfantil.setBounds(201, 263, 175, 70);
        panel_4.add(txtpnMacacoInfantil);

        JTextPane txtpnMeiaseLuvas = new JTextPane();
        txtpnMeiaseLuvas.setText(
                "Kit Meias Infantis – Estampa Verde                                             Material: Algodão + fibras elásticas\r\nIndicação: 0–12 meses");
        txtpnMeiaseLuvas.setBounds(390, 263, 175, 70);
        panel_4.add(txtpnMeiaseLuvas);

        // ----------------- PAINEL ACESSÓRIOS (panel_5) -----------------
        panel_5 = new JPanel();
        panel_5.setBounds(210, 107, 587, 411);
        panel_5.setVisible(false);
        panel_5.setLayout(null);
        frmProbaby.getContentPane().add(panel_5);

        JTextArea txtrBabaEletronica = new JTextArea();
        txtrBabaEletronica.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrBabaEletronica.setText("Baba Eletronica");
        txtrBabaEletronica.setBounds(10, 230, 179, 27);
        panel_5.add(txtrBabaEletronica);

        JButton btnBabaImg = new JButton("");
        btnBabaImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\babaeletronica.jpg"));
        btnBabaImg.setBounds(10, 11, 179, 213);
        panel_5.add(btnBabaImg);

        JButton btnMamadeiraImg = new JButton("");
        btnMamadeiraImg.setAutoscrolls(true);
        btnMamadeiraImg.setBorderPainted(false);
        btnMamadeiraImg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnMamadeiraImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\mamadeira.jpg"));
        btnMamadeiraImg.setBounds(201, 11, 179, 213);
        panel_5.add(btnMamadeiraImg);

        JTextArea txtrMamadeira = new JTextArea();
        txtrMamadeira.setText("Mamadeira");
        txtrMamadeira.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrMamadeira.setBounds(201, 230, 179, 27);
        panel_5.add(txtrMamadeira);

        JButton btnChupetaImg = new JButton("");
        btnChupetaImg.setIcon(new ImageIcon("C:\\Users\\Aluno\\Downloads\\iloveimg-resized\\chupeta.jpg"));
        btnChupetaImg.setBounds(390, 11, 179, 213);
        panel_5.add(btnChupetaImg);

        JTextArea txtrChupeta = new JTextArea();
        txtrChupeta.setText("Chupeta");
        txtrChupeta.setFont(new Font("Arial", Font.PLAIN, 13));
        txtrChupeta.setBounds(390, 230, 179, 27);
        panel_5.add(txtrChupeta);

        JTextArea txtrBabaVal = new JTextArea();
        txtrBabaVal.setText("      R$ 415,00");
        txtrBabaVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrBabaVal.setBounds(10, 344, 123, 27);
        panel_5.add(txtrBabaVal);

        JTextPane txtpnBabaDescricao = new JTextPane();
        txtpnBabaDescricao
                .setText("Pijama Infantil – Tema Urso Azul\r\n \r\nMaterial: Algodão suave\r\nIndicação: 0–12 meses");
        txtpnBabaDescricao.setBounds(10, 263, 179, 70);
        panel_5.add(txtpnBabaDescricao);

        JButton btnBabaInforma = new JButton("I");
        btnBabaInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Babá Eletrônica – Conexão Segura\r\n" + "\r\n"
                                + "Categoria: Acessórios e Monitoramento\r\n"
                                + "Descrição: Babá eletrônica com áudio e vídeo, ideal para acompanhar o sono do bebê à distância com segurança e praticidade.\r\n"
                                + "Material: Plástico resistente, componentes eletrônicos e visor digital\r\n"
                                + "Indicação: Uso doméstico, recomendado desde o nascimento",
                        null, -1);
            }
        });
        btnBabaInforma.setBounds(147, 344, 42, 27);
        panel_5.add(btnBabaInforma);

        JTextArea txtrBabaCar = new JTextArea();
        txtrBabaCar.setText("ADIC. AO CARRINHO");
        txtrBabaCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrBabaCar.setBounds(10, 378, 123, 18);
        panel_5.add(txtrBabaCar);

        JButton btnAddBaba = new JButton("+");
        btnAddBaba.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Babá Eletrônica", 250);
            }
        });
        btnAddBaba.setBounds(147, 374, 42, 27);
        panel_5.add(btnAddBaba);

        JTextPane txtpnMamadeiraDescricao = new JTextPane();
        txtpnMamadeiraDescricao
                .setText("Pijama Infantil – Tema Urso Azul\r\n \r\nMaterial: Algodão suave\r\nIndicação: 0–12 meses");
        txtpnMamadeiraDescricao.setBounds(201, 263, 179, 70);
        panel_5.add(txtpnMamadeiraDescricao);

        JTextPane txtpnChupetaDescricao = new JTextPane();
        txtpnChupetaDescricao
                .setText("Pijama Infantil – Tema Urso Azul\r\n \r\nMaterial: Algodão suave\r\nIndicação: 0–12 meses");
        txtpnChupetaDescricao.setBounds(390, 263, 179, 70);
        panel_5.add(txtpnChupetaDescricao);

        JTextArea txtrMamadeiraVal = new JTextArea();
        txtrMamadeiraVal.setText("      R$ 95,00");
        txtrMamadeiraVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrMamadeiraVal.setBounds(201, 344, 123, 27);
        panel_5.add(txtrMamadeiraVal);

        JTextArea txtrChupetaVal = new JTextArea();
        txtrChupetaVal.setText("      R$ 45,00");
        txtrChupetaVal.setFont(new Font("Arial Black", Font.PLAIN, 13));
        txtrChupetaVal.setBounds(390, 344, 123, 27);
        panel_5.add(txtrChupetaVal);

        JButton btnMamadeiraInforma = new JButton("I");
        btnMamadeiraInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Mamadeira – Fluxo Confortável\r\n" + "\r\n"
                                + "Categoria: Acessórios de Alimentação\r\n"
                                + "Descrição: Mamadeira anatômica com bico macio, ideal para o dia a dia do bebê.\r\n"
                                + "Material: Plástico livre de BPA e silicone macio\r\n"
                                + "Indicação: Uso a partir do nascimento",
                        null, -1);
            }
        });
        btnMamadeiraInforma.setBounds(338, 344, 42, 27);
        panel_5.add(btnMamadeiraInforma);

        JButton btnChupetaInforma = new JButton("I");
        btnChupetaInforma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Chupeta – Conforto Extra\r\n" + "\r\n"
                                + "Categoria: Acessórios de Conforto\r\n"
                                + "Descrição: Chupeta ortodôntica que auxilia na calma e conforto do bebê.\r\n"
                                + "Material: Silicone macio e escudo anatômico\r\n"
                                + "Indicação: Uso a partir do nascimento",
                        null, -1);
            }
        });
        btnChupetaInforma.setBounds(527, 344, 42, 27);
        panel_5.add(btnChupetaInforma);

        JButton btnAddMamadeira = new JButton("+");
        btnAddMamadeira.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Mamadeira", 95);
            }
        });
        btnAddMamadeira.setBounds(338, 374, 42, 27);
        panel_5.add(btnAddMamadeira);

        JButton btnAddChupeta = new JButton("+");
        btnAddChupeta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.addcarrinho("Chupeta", 45);
            }
        });
        btnAddChupeta.setBounds(527, 374, 42, 27);
        panel_5.add(btnAddChupeta);

        JTextArea txtrMamadeiraCar = new JTextArea();
        txtrMamadeiraCar.setText("ADIC. AO CARRINHO");
        txtrMamadeiraCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrMamadeiraCar.setBounds(201, 378, 123, 18);
        panel_5.add(txtrMamadeiraCar);

        JTextArea txtrChupetaCar = new JTextArea();
        txtrChupetaCar.setText("ADIC. AO CARRINHO");
        txtrChupetaCar.setFont(new Font("Arial", Font.PLAIN, 12));
        txtrChupetaCar.setBounds(390, 378, 123, 18);
        panel_5.add(txtrChupetaCar);

        // ----------------- TÍTULO E BOTÕES PRINCIPAIS -----------------
        txtTitul = new JTextField();
        txtTitul.setFont(new Font("Arial Black", Font.PLAIN, 20));
        txtTitul.setText("TITULO");
        txtTitul.setEditable(false);
        txtTitul.setBounds(338, 11, 95, 40);
        frmProbaby.getContentPane().add(txtTitul);
        txtTitul.setColumns(10);

        JButton btnProdutos = new JButton("Produtos");
        btnProdutos.setBounds(10, 62, 189, 40);
        frmProbaby.getContentPane().add(btnProdutos);

        JButton btnCarVendas = new JButton("Carrinhos de vendas");
        btnCarVendas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                car.visivel();
                frmProbaby.dispose();
            }
        });
        btnCarVendas.setBounds(210, 62, 189, 40);
        frmProbaby.getContentPane().add(btnCarVendas);

        // >>>>>> Cadastro removido – só fica Atendimento ocupando o espaço <<<<<<
        JButton btnAtendimento = new JButton("Atendimento");
        btnAtendimento.setBounds(409, 62, 189, 40);
        frmProbaby.getContentPane().add(btnAtendimento);

        // ----------------- BOTÕES LATERAIS (categorias) -----------------
        JButton btnRoupas = new JButton("Roupas");
        btnRoupas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_4.setVisible(true);
                panel_5.setVisible(false);
                panel_6.setVisible(false);
            }
        });
        btnRoupas.setBounds(10, 147, 189, 46);
        frmProbaby.getContentPane().add(btnRoupas);

        JButton btnAcessorios = new JButton("Acessorios");
        btnAcessorios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_5.setVisible(true);
                panel_6.setVisible(false);
                panel_4.setVisible(false);
            }
        });
        btnAcessorios.setBounds(10, 222, 189, 46);
        frmProbaby.getContentPane().add(btnAcessorios);

        JButton btnFraldas = new JButton("Fraldas");
        btnFraldas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel_6.setVisible(true);
                panel_5.setVisible(false);
                panel_4.setVisible(false);
            }
        });
        btnFraldas.setBounds(11, 302, 189, 46);
        frmProbaby.getContentPane().add(btnFraldas);
    }
}
