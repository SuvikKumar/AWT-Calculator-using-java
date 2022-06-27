import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener
{
double check;
Frame f=new Frame();
Label l1=new Label("first Operand:" );
Label l2=new Label("second Operand");
TextField t1=new TextField();
TextField t2=new TextField();
Button b1=new Button("+");
Button b2=new Button("-");
Button b3=new Button("*");
Button b4=new Button("/");
Button b5=new Button("=");
Button b6=new Button("cancel");
TextField t3=new TextField();
TextField t4=new TextField();
TextField t5=new TextField();
TextField t6=new TextField();
TextField t7=new TextField();
Calculator()
{

l1.setBounds(50,100,100,20);
l2.setBounds(50,140,100,20);
t1.setBounds(200,100,100,20);
t2.setBounds(200,140,100,20);
b1.setBounds(50,200,50,50);
b2.setBounds(120,200,50,50);
b3.setBounds(190,200,50,50);
b4.setBounds(260,200,50,50);
b5.setBounds(160,270,50,50);
b6.setBounds(160,340,50,50);
t3.setBounds(50,410,50,50);
t4.setBounds(120,410,50,50);
t5.setBounds(190,410,50,50);
t6.setBounds(260,410,50,50);
t7.setBounds(330,410,50,50);
//Adding components to the frame
f.add(l1);
f.add(l2);
f.add(t1);
f.add(t2);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(t3);
f.add(t4);
f.add(t5);
f.add(t6);
f.add(t7);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
f.setLayout(null);
f.setVisible(true);
f.setSize(400,350);
t2.setEnabled(false);
}

public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
if(e.getSource()==b1)
{
t3.setText(t1.getText());
t4.setText("+");
t5.setText(t2.getText());
check=1;
}
if(e.getSource()==b2)
{
t3.setText(t1.getText());
t4.setText("-");
t5.setText(t2.getText());
check=2;
}
if(e.getSource()==b3)
{
t3.setText(t1.getText());
t4.setText("*");
t5.setText(t2.getText());
check=3;
}
if(e.getSource()==b4)
{
t3.setText(t1.getText());
t4.setText("/");
t5.setText(t2.getText());
check=4;
}

if(e.getSource()==b5) {
if(check==1) {
t6.setText("=");
t7.setText(String.valueOf(n1+n2));}
if(check==2) {
t6.setText("=");
t7.setText(String.valueOf(n1-n2));}
if(check==3) {
t6.setText("=");
t7.setText(String.valueOf(n1*n2));}
if(check==4) {
t6.setText("=");
t7.setText(String.valueOf(n1/n2));
}}
if(e.getSource()==b6)
{
System.exit(0);
}
}
}

public class awtcalculator {
public static void main(String args[]) {
new Calculator();	
}
}
