
//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
//the concerned color whenever the specific tab is selected in the Pan.
package swing;

import javax.swing.*;
import java.awt.*;

public class p2 extends JFrame {

    public p2() {

        // Frame settings
        setTitle("Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add to frame
        add(tabbedPane);

        // Make visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new p2();
    }
}





