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
        
        // Item flight details
        JMenuItem flightDetails = new JMenuItem("Flight Details");
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        // Item customer details
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        // Item book flight
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        // Item Journey Details
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        // Item cancel ticket
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        // Menu ticket
        JMenu ticket = new JMenu("Ticket");
        menuBar.add(ticket);

        // Item Boarding pass
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        ticket.add(boardingPass);
        
        // Frame control
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocation(800, 350);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")){
            new AddCustomer();
        } else if (text.equals("Flight Details")){
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        }
    }

    public static void main(String[] args)
    {
        new Home();
    }
}
