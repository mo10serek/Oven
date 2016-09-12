/*
 * Created by: Michael Balcerzak
 * Created on: 17-Sep-2016
 * Created for: ICS4U
 * Daily Assignment – 1-04
 * This program ask the user to pick which item and how many and tells how long it will take to heat
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Oven extends JFrame {

	private JPanel contentPane;
	double item;
	double order;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oven frame = new Oven();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Oven() {
		setTitle("Oven");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Item Type");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("          ");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 6;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		JLabel lblNumberOfItems = new JLabel("Number of Items");
		lblNumberOfItems.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblNumberOfItems = new GridBagConstraints();
		gbc_lblNumberOfItems.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberOfItems.gridx = 11;
		gbc_lblNumberOfItems.gridy = 1;
		contentPane.add(lblNumberOfItems, gbc_lblNumberOfItems);
		
		JLabel lblBlank = new JLabel("            ");
		GridBagConstraints gbc_lblBlank = new GridBagConstraints();
		gbc_lblBlank.insets = new Insets(0, 0, 5, 5);
		gbc_lblBlank.gridx = 4;
		gbc_lblBlank.gridy = 2;
		contentPane.add(lblBlank, gbc_lblBlank);
		
		JButton btnSubs = new JButton("Subs");
		btnSubs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = 60;
			}
		});
		GridBagConstraints gbc_btnSubs = new GridBagConstraints();
		gbc_btnSubs.insets = new Insets(0, 0, 5, 5);
		gbc_btnSubs.gridx = 4;
		gbc_btnSubs.gridy = 3;
		contentPane.add(btnSubs, gbc_btnSubs);
		
		JButton btnOne = new JButton("One");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order = item;
			}
		});
		GridBagConstraints gbc_btnOne = new GridBagConstraints();
		gbc_btnOne.insets = new Insets(0, 0, 5, 5);
		gbc_btnOne.gridx = 11;
		gbc_btnOne.gridy = 3;
		contentPane.add(btnOne, gbc_btnOne);
		
		JButton btnPizza = new JButton("pizza");
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = 45;
			}
		});
		GridBagConstraints gbc_btnPizza = new GridBagConstraints();
		gbc_btnPizza.insets = new Insets(0, 0, 5, 5);
		gbc_btnPizza.gridx = 4;
		gbc_btnPizza.gridy = 4;
		contentPane.add(btnPizza, gbc_btnPizza);
		
		JButton btnTwo = new JButton("Two");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order = item * 1.5;
			}
		});
		GridBagConstraints gbc_btnTwo = new GridBagConstraints();
		gbc_btnTwo.insets = new Insets(0, 0, 5, 5);
		gbc_btnTwo.gridx = 11;
		gbc_btnTwo.gridy = 4;
		contentPane.add(btnTwo, gbc_btnTwo);
		
		JButton btnSoup = new JButton("soup");
		btnSoup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				item = 105;
			}
		});
		GridBagConstraints gbc_btnSoup = new GridBagConstraints();
		gbc_btnSoup.insets = new Insets(0, 0, 5, 5);
		gbc_btnSoup.gridx = 4;
		gbc_btnSoup.gridy = 5;
		contentPane.add(btnSoup, gbc_btnSoup);
		
		JButton btnThree = new JButton("Three");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order = item * 2;
			}
		});
		GridBagConstraints gbc_btnThree = new GridBagConstraints();
		gbc_btnThree.insets = new Insets(0, 0, 5, 5);
		gbc_btnThree.gridx = 11;
		gbc_btnThree.gridy = 5;
		contentPane.add(btnThree, gbc_btnThree);
		
		JLabel label_1 = new JLabel("   ");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 4;
		gbc_label_1.gridy = 6;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel lblItWillRun = new JLabel("It will run for:");
		lblItWillRun.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblItWillRun = new GridBagConstraints();
		gbc_lblItWillRun.insets = new Insets(0, 0, 0, 5);
		gbc_lblItWillRun.gridx = 4;
		gbc_lblItWillRun.gridy = 9;
		contentPane.add(lblItWillRun, gbc_lblItWillRun);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				order = order/60;
				
				lblItWillRun.setText("It will run for: " + Double.toString(order) + " mins.");
			}
		});
		
		GridBagConstraints gbc_btnStart = new GridBagConstraints();
		gbc_btnStart.insets = new Insets(0, 0, 5, 5);
		gbc_btnStart.gridx = 4;
		gbc_btnStart.gridy = 7;
		contentPane.add(btnStart, gbc_btnStart);
		
		
		JLabel label_2 = new JLabel("    ");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 4;
		gbc_label_2.gridy = 8;
		contentPane.add(label_2, gbc_label_2);
		
		
		
		
	}

}
