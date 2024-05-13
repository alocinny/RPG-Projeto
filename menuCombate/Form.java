package menuCombate;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Form extends JFrame{

    JButton cmd_sair; //definicao da existencia dos botoes
    JButton cmd_ajuda;
    

    public Form(String titulo, Dimension dimensao) {
        super(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(dimensao);
        setLayout(null);

        //criar os botoes


        cmd_sair = new JButton("Sair");
        cmd_sair.setBounds(50,50,120,30); // localizacao do botao

        //adicionar os botoes ao formulario

        add(cmd_sair);


    }
}
