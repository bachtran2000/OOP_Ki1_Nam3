import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyForm extends Frame implements ActionListener {
    public MyForm(String title){
        super(title);
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
class ThiSinh{
    private String name;
    public ThiSinh(String name){
        this.name = name;
    }
}
class ThiSinhA extends ThiSinh{
    double toan, ly, hoa;
    public ThiSinhA(String name,double toan, double ly, double

            hoa){

        super(name);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    public void display(){
        System.out.println("Ho ten: " + this.name);
        System.out.println("Tong diem: " + (this.toan +

                this.ly + this.hoa));

    }
}
