package fr.whale.version02.ui;

import fr.whale.version02.models.Compte;
import fr.whale.version02.models.User;
import fr.whale.version02.ui.Themes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.TabbedPaneUI;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class HomePage {
	public HomePage() {
		
		
		/*
		 *  1. MAIN WINDOW
		 *    
		 *  
		 *  User see window of HomePage.
		 *  
		 */
		
		/*
		 * STARTING OF CREATION WINDOWS
		 */
		JFrame windowHomePage = new JFrame("Whale"); 
		windowHomePage.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JFrame windowCompte = new JFrame("My compte"); 


		
		// logo 								(use whale.png for light theme)
		ImageIcon generalLogo = new ImageIcon(getClass().getClassLoader().getResource("whale_1f40b.png"));
		windowHomePage.setIconImage(generalLogo.getImage());
		
		
		/*
		 *  2. MAIN MENU
		 *  
		 *  
		 *  
		 * File				Edit			Windows					Help
		 * 
		 * New Tab			Undo			Default Window			Keyboard Shortcuts
		 * Close Tab		Redo			Custom Window			Send Us FeedBack
		 * Exit				Cut										Follow Us on Twitter
		 * 					Copy									About
		 * 					Paste
		 * 					Select all
		 * 					
		 * 
		 */
		
		// Little good color 
		// ---------- for bar
		UIManager.put("MenuItem.selectionBackground", UIManager.getColor("MenuItem.background"));
		UIManager.put("MenuItem.selectionForeground", UIManager.getColor("MenuItem.foreground"));


		UIManager.put("Menu.selectionBackground", new Color(41,42,45,255));
		UIManager.put("Menu.selectionForeground", Color.WHITE);

		// ---------- for JMenu
		UIManager.put("Menu.border", Color.BLACK);
		
		
		
		
		

		/*
		 *  Menu BAR						(with "File", "Edit", "Window", "Help")
		 */
		JMenuBar menuBar = new JMenuBar();	 
		menuBar.setBackground(new Color(41,42,45,255));   
		
		//Empty border
		Border empty = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		menuBar.setBorder(empty);

		
		/*
		 * Tab "File"  
		 */		 
		JMenu file = new JMenu("File"){ 
            private Border border = new LineBorder(new Color(96,98,104,255));
            @Override
            public JPopupMenu getPopupMenu() {
                JPopupMenu menu = super.getPopupMenu();
                menu.setBorder(border);
                return menu;
            } 
                
		};
		//file.add(Box.createRigidArea(new Dimension(0,-2))); 
		file.setBackground(new Color(41,42,45,255));	
		file.setForeground(new Color(255,255,255,255)); 
		file.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		// --- item New Tab 
		JMenuItem newTab = new JMenuItem("New Tab");
	
		newTab.setBorder(BorderFactory.createLineBorder(
                Color.decode("#FF0000"), 2, false));
		newTab.setBorder(empty);
		newTab.setBackground(new Color(41,42,45,255));	
		newTab.setForeground(new Color(255,255,255,255)); 
		newTab.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		// --- item Close Tab 
		JMenuItem closeTab = new JMenuItem("Close Tab");
		closeTab.setBorder(empty);
		closeTab.setBackground(new Color(41,42,45,255));	
		closeTab.setForeground(new Color(255,255,255,255));
		closeTab.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		// --- item Exit 
		JMenuItem exit = new JMenuItem("Exit");
		exit.setBorder(empty);
		exit.setBackground(new Color(41,42,45,255));	
		exit.setForeground(new Color(255,255,255,255));
		exit.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		exit.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		
		// Add all items in tab "File"
		file.add(newTab);
		file.add(closeTab);
        
		JSeparator exitSeparator = new JSeparator(); 
        exitSeparator.setPreferredSize(new Dimension(2, 1));
        exitSeparator.setForeground(new Color(96,98,104,255));
        
        file.add(exitSeparator);  
		file.add(exit);
		
		// Add tab "File" to menu bar
		menuBar.add(file);
		
		
		
		
		// Tab "Edit"
		JMenu edit = new JMenu("Edit"){ 
            private Border border = new LineBorder(new Color(96,98,104,255));
            @Override
            public JPopupMenu getPopupMenu() {
                JPopupMenu menu = super.getPopupMenu();
                menu.setBorder(border);
                return menu;
            }
                
		}; 
		edit.setBorder(empty);
		edit.setForeground(new Color(255,255,255,255));	
		edit.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem undo = new JMenuItem("Undo"); 
		undo.setBorder(empty); 
		undo.setBackground(new Color(41,42,45,255));	
		undo.setForeground(new Color(255,255,255,255));
		undo.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem redo = new JMenuItem("Redo");
		redo.setBorder(empty);
		redo.setBackground(new Color(41,42,45,255));	
		redo.setForeground(new Color(255,255,255,255));
		redo.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem cut = new JMenuItem("Cut");
		cut.setBorder(empty);
		cut.setBackground(new Color(41,42,45,255));	
		cut.setForeground(new Color(255,255,255,255));
		cut.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem copy = new JMenuItem("Copy");
		copy.setBorder(empty);
		copy.setBackground(new Color(41,42,45,255));	
		copy.setForeground(new Color(255,255,255,255));
		copy.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem paste = new JMenuItem("Paste");
		paste.setBorder(empty);
		paste.setBackground(new Color(41,42,45,255));	
		paste.setForeground(new Color(255,255,255,255));
		paste.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem selectAll = new JMenuItem("Select all");
		selectAll.setBorder(empty);
		selectAll.setBackground(new Color(41,42,45,255));	
		selectAll.setForeground(new Color(255,255,255,255));
		selectAll.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));


		// Add all items in tab "Edit"
		edit.add(undo);
		edit.add(redo);
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(selectAll);
			
		// Add tab "Edit" to menu bar
		menuBar.add(edit);
		
		
		
		
		
		// Tab "Window"
		JMenu window = new JMenu("Window"){ 
            private Border border = new LineBorder(new Color(96,98,104,255));
            @Override
            public JPopupMenu getPopupMenu() {
                JPopupMenu menu = super.getPopupMenu();
                menu.setBorder(border);
                return menu;
            }
                
		};
		window.setForeground(new Color(255,255,255,255));	
		window.setFont(new Font("Helvetica Neue", Font.PLAIN, 12)); 
		
		JMenuItem defaultWindow = new JMenuItem("Default Window");
		defaultWindow.setBorder(empty);
		defaultWindow.setBackground(new Color(41,42,45,255));	
		defaultWindow.setForeground(new Color(255,255,255,255));
		defaultWindow.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem customtWindow = new JMenuItem("Custom Window");	
		customtWindow.setBorder(empty);
		customtWindow.setBackground(new Color(41,42,45,255));	
		customtWindow.setForeground(new Color(255,255,255,255));	
		customtWindow.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));

		window.add(defaultWindow);
		window.add(customtWindow);
		
		// Add tab "Window" to menu bar
		menuBar.add(window);
		
		
		
		
		
		// Tab "Help"
		JMenu help = new JMenu("Help"){ 
            private Border border = new LineBorder(new Color(96,98,104,255));
            @Override
            public JPopupMenu getPopupMenu() {
                JPopupMenu menu = super.getPopupMenu();
                menu.setBorder(border);
                return menu;
            }
                
		}; 
		help.setForeground(new Color(255,255,255,255));	
		help.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem keyboardShortcuts = new JMenuItem("Keyboard Shortcuts");
		keyboardShortcuts.setBorder(empty);
		keyboardShortcuts.setBackground(new Color(41,42,45,255));	
		keyboardShortcuts.setForeground(new Color(255,255,255,255));
		keyboardShortcuts.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem sendFeedback = new JMenuItem("Send Us FeedBack");
		sendFeedback.setBorder(empty);
		sendFeedback.setBackground(new Color(41,42,45,255));	
		sendFeedback.setForeground(new Color(255,255,255,255));
		sendFeedback.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem followTwitter = new JMenuItem("Follow Us on Twitter");
		followTwitter.setBorder(empty);
		followTwitter.setBackground(new Color(41,42,45,255));	
		followTwitter.setForeground(new Color(255,255,255,255));
		followTwitter.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));
		
		JMenuItem about = new JMenuItem("About");
		about.setBorder(empty);
		about.setBackground(new Color(41,42,45,255));	
		about.setForeground(new Color(255,255,255,255));
		about.setFont(new Font("Helvetica Neue", Font.PLAIN, 12));

		help.add(keyboardShortcuts);
		help.add(sendFeedback);
		help.add(followTwitter);
		help.add(about);
		
		// Add tab "Help" to menu bar
		menuBar.add(help);
		
		
		
		/*
		 * 3. MAIN PANELS
		 */
		 
		// home panel
		JPanel homePanel = new JPanel(); 
		homePanel.setBackground(new Color(41,42,45,255));
		windowHomePage.add(homePanel); 
				
		
	    JPanel workspacePanel = new JPanel();  
	    workspacePanel.setBackground(new Color(30,22,71,255));
	    
	    User user = new User();
	    Compte compte1 = new Compte();
	    user.getComptes().add(compte1);
	    Compte compte2 = new Compte();
	    user.getComptes().add(compte2);

	    // Prenom
	    JLabel labelComptes= new JLabel(user.infoComptes());
	    labelComptes.setForeground(new Color(218,236,250,255));
	    labelComptes.setBounds(10, 14, 84, 14);
	    workspacePanel.add(labelComptes);
	    
	    JLabel labelGetComptes = new JLabel(user.infoGetComptes());
	    labelGetComptes.setForeground(new Color(218,236,250,255));
	    labelGetComptes.setBounds(10, 44, 84, 14);
	    workspacePanel.add(labelGetComptes);

	    JLabel labelGetClass = new JLabel(user.infoGetClass());
	    labelGetClass.setForeground(new Color(218,236,250,255));
	    labelGetClass.setBounds(10, 84, 84, 14);
	    workspacePanel.add(labelGetClass);

	    JLabel labelHashCode = new JLabel(user.infoHashCode());
	    labelHashCode.setForeground(new Color(218,236,250,255));
	    labelHashCode.setBounds(10, 124, 84, 14);
	    workspacePanel.add(labelHashCode);
	    
	    JLabel labeltoString = new JLabel(user.toString());
	    labeltoString.setForeground(new Color(218,236,250,255));
	    labeltoString.setBounds(10, 164, 84, 14);
	    workspacePanel.add(labeltoString);
	    
	    
	    
	    
	    
	    JPanel customPanel = new JPanel();  
	    customPanel.setBackground(new Color(161,158,235,255));
	    
	    /* 
	     * Inscription panel
	     */
	    UserPage inscriptionUser = new UserPage();
	    JPanel inscriptionPanel = inscriptionUser.userPanel(); 

	    JPanel iPanel = new JPanel();   
	    iPanel.setBackground(new Color(30,22,71,255));
	    iPanel.add(inscriptionPanel); 
	       
	    
	    /*
	     *  Custom Panel
	     */
	    
	    CustomPanel createCustomPanel = new CustomPanel();
	    JPanel newCustomPanel = createCustomPanel.newCustomPanel();
	    
	    
		/*
		 * 4. MAIN TABS
		 */
		 
	    JTabbedPane tabs = new JTabbedPane(JTabbedPane.TOP) ;
	    tabs.setBackground(new Color(41,42,45,255));
	    tabs.setForeground(new Color(255,255,255,255));
        Border border = new LineBorder(new Color(96,98,104,255)); 
        //tabs.setBorder(border); 
	    tabs.setBorder(empty);
	    tabs.setUI(new BasicTabbedPaneUI() {
	      @Override
	      protected int calculateTabWidth(
	          int tabPlacement, int tabIndex, FontMetrics metrics) {
	        return 200; // the width of the tab
	      }
	    });

	    tabs.add("New", customPanel);	    
	    tabs.add("Inscription", iPanel);	    
	    tabs.add("Workspace", workspacePanel); 
	    windowHomePage.add(tabs);

	    windowHomePage.pack();
		
		/*
		 * ENDING OF CREATION WINDOWS
		 */
		windowHomePage.setJMenuBar(menuBar); 
		windowHomePage.setSize(1000, 800);
		windowHomePage.setLocationRelativeTo(null);
		windowHomePage.setVisible(true); 
		
		JFrame inscriptionFrame = inscriptionUser.userFrame() ;
		inscriptionFrame.setVisible(true); 
	}
}
