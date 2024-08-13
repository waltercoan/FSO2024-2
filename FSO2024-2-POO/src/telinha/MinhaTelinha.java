package telinha;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controlador.ControladorTelinha;

public class MinhaTelinha extends JFrame{
    public MinhaTelinha() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);

        var meuTexto = new JLabel("Aula de Swing Prático");
        var meuTexto2 = new JLabel("UNIVILLE");

        meuTexto2.setFont(new Font("Arial",Font.BOLD,30));
        meuTexto2.setForeground(Color.GREEN);

        var meuBotao = new JButton("Me clica!");
        // meuBotao.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         JOptionPane.showMessageDialog(null, "Nao acredito");
        //     }
        // });
        var controlador = new ControladorTelinha();
        meuBotao.addActionListener(controlador);


        getContentPane().add("North",meuTexto);
        getContentPane().add("Center",meuTexto2);
        getContentPane().add("South",meuBotao);

        setVisible(true);
    }
    public static void main(String args[]){
        new MinhaTelinha();
    }
}
