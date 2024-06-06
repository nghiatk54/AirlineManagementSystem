package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddCustomer extends JFrame implements ActionListener{
    
    JTextField tfname, tfnationality, tfid, tfaddress, tfphone;
    JRadioButton rbmale, rbfemale;
    
    public AddCustomer(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // Heading
        JLabel heading = new JLabel("ADD CUSTOMER DETAILS");
        heading.setBounds(250, 20, 500, 35);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 32));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        // Name field
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(60, 80, 150, 25);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblname);
        
        tfname = new JTextField();
        tfname.setBounds(220, 80, 150, 25);
        add(tfname);
        
        // Nationality field
        JLabel lblnationality = new JLabel("Nationality");
        lblnationality.setBounds(60, 130, 150, 25);
        lblnationality.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblnationality);
        
        tfnationality = new JTextField();
        tfnationality.setBounds(220, 130, 150, 25);
        add(tfnationality);
        
        // ID number field
        JLabel lblid = new JLabel("ID Number");
        lblid.setBounds(60, 180, 150, 25);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblid);
        
        tfid = new JTextField();
        tfid.setBounds(220, 180, 150, 25);
        add(tfid);
        
        // Address field
        JLabel lbladdress = new JLabel("Address");
        lbladdress.setBounds(60, 230, 150, 25);
        lbladdress.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lbladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(220, 230, 150, 25);
        add(tfaddress);
        
        // Gender field
        ButtonGroup genderGroup = new ButtonGroup();
        
        JLabel lblgender = new JLabel("Address");
        lblgender.setBounds(60, 280, 150, 25);
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblgender);
        
        rbmale = new JRadioButton("Male");
        rbmale.setBounds(220, 280, 70, 25);
        rbmale.setBackground(Color.WHITE);
        add(rbmale);
        
        rbfemale = new JRadioButton("Female");
        rbfemale.setBounds(300, 280, 70, 25);
        rbfemale.setBackground(Color.WHITE);
        add(rbfemale);
        
        genderGroup.add(rbmale);
        genderGroup.add(rbfemale);
        
        // Phone number field
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(60, 330, 150, 25);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        add(lblphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(220, 330, 150, 25);
        add(tfphone);
        
        // Button Save
        JButton save = new JButton("SAVE");
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        save.setBounds(220, 380, 150, 30);
        save.addActionListener(this);
        add(save);
        
        // Image Icon
        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/emp.png"));
        JLabel lblimage = new JLabel(image);
        lblimage.setBounds(450, 80, 280, 400);
        add(lblimage);
        
        // Frame setup
        setSize(900, 600);
        setLocation(500, 200);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String name = tfname.getText();
        String nationality = tfnationality.getText();
        String phone = tfphone.getText();
        String address = tfaddress.getText();
        String id = tfid.getText();        
        String gender;
        if (rbmale.isSelected()){
            gender = "Male";
        } else {
            gender = "Female";
        }
        try {
            Conn conn = new Conn();

            String query = "INSERT INTO passenger VALUES('"+name+"', '"+nationality+"', '"+phone+"', '"+address+"', '"+id+"', '"+gender+"')";

            conn.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Customer Details Added Successfully");

            setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
    
    public static void main(String[] args) {
        new AddCustomer();
    }
}
