import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Calc implements ActionListener
{
    JFrame f;
    JTextField t;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,bsub,badd,beq,bclr;

    static double a=0,b=0,result=0;
    static int operator=0;

    Calc()
    {
        f=new JFrame("calc");
        f.setResizable(true);
        
        t=new JTextField();
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        t.setFont(font1);

        f.getContentPane().add(t, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        f.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(4,4));
        
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bsub=new JButton("-");
        badd=new JButton("+");
        beq=new JButton("=");
        bclr=new JButton("C");

//        f.add(t);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(badd);

        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(bsub);

        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(bmul);

        panel.add(b0);
        panel.add(bclr);
        panel.add(beq);
        panel.add(bdiv);

        f.setVisible(true);
        f.setSize(350,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        badd.addActionListener(this);
        bdiv.addActionListener(this);
        bmul.addActionListener(this);
        bsub.addActionListener(this);
        beq.addActionListener(this);
        bclr.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
            t.setText(t.getText().concat("1"));

        if(e.getSource()==b2)
            t.setText(t.getText().concat("2"));

        if(e.getSource()==b3)
            t.setText(t.getText().concat("3"));

        if(e.getSource()==b4)
            t.setText(t.getText().concat("4"));

        if(e.getSource()==b5)
            t.setText(t.getText().concat("5"));

        if(e.getSource()==b6)
            t.setText(t.getText().concat("6"));

        if(e.getSource()==b7)
            t.setText(t.getText().concat("7"));

        if(e.getSource()==b8)
            t.setText(t.getText().concat("8"));

        if(e.getSource()==b9)
            t.setText(t.getText().concat("9"));

        if(e.getSource()==b0)
            t.setText(t.getText().concat("0"));

        if(e.getSource()==badd)
        {
            a=Double.parseDouble(t.getText());
            operator=1;
            t.setText("");
        }

        if(e.getSource()==bsub)
        {
            a=Double.parseDouble(t.getText());
            operator=2;
            t.setText("");
        }

        if(e.getSource()==bmul)
        {
            a=Double.parseDouble(t.getText());
            operator=3;
            t.setText("");
        }

        if(e.getSource()==bdiv)
        {
            a=Double.parseDouble(t.getText());
            operator=4;
            t.setText("");
        }

        if(e.getSource()==beq)
        {
            b=Double.parseDouble(t.getText());

            switch(operator)
            {
                case 1: result=a+b;
                    break;

                case 2: result=a-b;
                    break;

                case 3: result=a*b;
                    break;

                case 4: result=a/b;
                    break;

                default: result=0;
            }

            t.setText(""+result);
        }

        if(e.getSource()==bclr)
            t.setText("");
    }

    public static void main(String[] args)
    {
        new Calc();
    }
}