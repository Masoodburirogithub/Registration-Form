import org.json.simple.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class RegistrationForm {

    static Container c;
    static JLabel name,RollNo,Batch,Section,Gender,Qualification,Adress,Country;
    static JTextField name_tf,RollNo_tf,Batch_tf,section_tf,Country_tf;
    static JComboBox country_cb;
    static JRadioButton male,female;
    static JTextArea ta;
    static JCheckBox matric,intermidate,graduate,p_graduate;
    static JButton save,print,clear;
    static JFrame out_put_frame;
    public static  void saveAction(ActionEvent a){
        if(save.isSelected()) {
            JSONObject obj=new JSONObject();
            obj.put("Name",name_tf.getText());
            try {
                FileWriter Fw = new FileWriter("Output.json");
                Fw.write(obj.toJSONString());
               // Fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            
        }

    }
    public static void main(String[] args) {


        JFrame jFrame=new JFrame(" REGISTRATION FORM");
        jFrame.setSize(900,900);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        c=jFrame.getContentPane();
        c.setLayout(null);
        jFrame.setBackground(Color.YELLOW);
        jFrame.setVisible(true);
        //jFrame.setResizable(false);


        name=new JLabel("Name");
        name.setBounds(20,20,250,20);

        RollNo=new JLabel("RollNo");
        RollNo.setBounds(20,80,250,20);

        Batch=new JLabel("Batch");
        Batch.setBounds(20,140,250,20);

        Section=new JLabel("Section");
        Section.setBounds(20,200,250,20);

        Gender=new JLabel("Gender");
        Gender.setBounds(20,260,250,20);

        Qualification=new JLabel("Qualification");
        Qualification.setBounds(20,310,250,40);


        Adress=new JLabel("Adress");
        Adress.setBounds(20,380,250,20);

          Country=new JLabel("Country");
          Country.setBounds(20,480,250,20);


        // TextField
        name_tf=new JTextField();
        name_tf.setBounds(100,20,160,20);

        RollNo_tf=new JTextField();
        RollNo_tf.setBounds(100,80,160,20);

        Batch_tf=new JTextField();
        Batch_tf.setBounds(100,140,160,20);

        section_tf=new JTextField();
        section_tf.setBounds(100,200,160,20);


        Country_tf =new JTextField();
        Country_tf.setBounds(100,480,160,20);


        // JComboBox for list of Country
        String[] Country_arr={"Pakistan","China","India","Afganistan","Iran","UAE"};

        country_cb=new JComboBox(Country_arr);
        country_cb.setBounds(100,480,160,20);

        //Radio button for male and female
        male=new JRadioButton("Male");
        male.setBounds(100,260,160,30);

        female=new JRadioButton("Female");
        female.setBounds(170,260,220,30);

        // ButtonGroup for select one either male or female
        ButtonGroup g=new ButtonGroup();
        g.add(male);
        g.add(female);

        //TextArea for Address
        ta=new JTextArea();
        ta.setBounds(100,380,250,80);

        //CheckBox for Qualification
        matric=new JCheckBox("Matric");
        matric.setBounds(120,320,250,20);

        intermidate=new JCheckBox("Intermidate");
        intermidate.setBounds(200,320,300,20);

        graduate=new JCheckBox("Graduate");
        graduate.setBounds(120,340,300,20);

        p_graduate=new JCheckBox("post Graduate");
        p_graduate.setBounds(200,340,300,20);

        // Jbutton for save,print and clear
        save=new JButton("Save");
        save.setBounds(50,540,80,30);

        print=new JButton("Print");
        print.setBounds(150,540,80,30);

        clear=new JButton("Clear");
        clear.setBounds(250,540,80,30);

        //New Frame for output
        out_put_frame=new JFrame();
        out_put_frame.setSize(400,400);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent a) {
                saveAction(a);

            }
        });







        c.add(name);
        c.add(RollNo);
        c.add(Batch);
        c.add(Section);
        c.add(Gender);
        c.add(Qualification);
        c.add(Adress);
        c.add(Country);


        // adding textField
        c.add(name_tf);
        c.add(RollNo_tf);
        c.add(Batch_tf);
        c.add(section_tf);
        c.add(Country);

       // ComboBox for list of countries
        c.add(country_cb);
        //RadioButton for gender
        c.add(male);
        c.add(female);
        //TextArea
        c.add(ta);
        //CheckBox for Qualification
        c.add(matric);
        c.add(intermidate);
        c.add(graduate);
        c.add(p_graduate);

        // JButton
        c.add(save);
        c.add(print);
        c.add(clear);
        //c.add(out_put_frame);


    }
}