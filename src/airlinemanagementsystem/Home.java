package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Home extends JFrame implements ActionListener {
   
    public Home()
    {
        setLayout(null);
        
        // Image front frame
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1950, 1000);
        add(image);
        
        // Heading frame
        JLabel heading = new JLabel("Air VIETNAM WELCOMES YOU");
        heading.setBounds(750, 50, 1000, 40);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 36));
        image.add(heading);
        
        // Menubar frame
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Menu details
        JMenu details = new JMenu("Details");
        menuBar.add(details);
        
        JMenuItem flightDetails = new JMenu("Flight Details");
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenu("Add Customer Details");
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenu("Book Flight");
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenu("Journey Details");
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenu("Cancel Ticket");
        details.add(ticketCancellation);
        
        // Menu ticket
        JMenu ticket = new JMenu("Ticket");
        menuBar.add(ticket);

        JMenuItem boardingPass = new JMenu("Boarding Pass");
        ticket.add(boardingPass);
        
        // Frame control
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(800, 350);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
    }

    public static void main(String[] args)
    {
        new Home();
    }
}
