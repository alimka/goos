package tdd.auctionsniper.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

import static tdd.auctionsniper.ui.Main.STATUS_JOINING;

public class MainWindow extends JFrame {

    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
    public static final String SNIPER_STATUS_NAME = "sniper status";
    public static final String STATUS_BIDDING = "Bidding";
    private final JLabel sniperStatus = createLabel(STATUS_JOINING);

    private static JLabel createLabel(String initalText) {
        JLabel result = new JLabel(initalText);
        result.setName(SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }

    public MainWindow() {
        super("Auction Sniper Main");
        setName(MAIN_WINDOW_NAME);
        add(sniperStatus);
        setSize(new Dimension(250, 50));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(Boolean.TRUE);
    }

    public void showStatus(String status) {
        sniperStatus.setText(status);
    }
}
