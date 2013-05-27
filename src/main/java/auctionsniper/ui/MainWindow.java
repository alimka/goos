package auctionsniper.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;


public class MainWindow extends JFrame {

    public static final String MAIN_WINDOW_NAME = "Auction Sniper Main";
    public static final String SNIPER_STATUS_NAME = "sniper status";

    public static final String STATUS_JOINING = "Joining";
    public static final String STATUS_BIDDING = "Bidding";
    public static final String STATUS_LOST = "Lost";
    public static final String STATUS_WINNING = "Winning";
    public static final String STATUS_WON = "Won";
    private static final String SNIPERS_TABLE_NAME = "Snipers table";

    private final JLabel sniperStatus = createLabel(STATUS_JOINING);
    private final SnipersTableModel snipers = new SnipersTableModel();

    private static JLabel createLabel(String initalText) {
        JLabel result = new JLabel(initalText);
        result.setName(SNIPER_STATUS_NAME);
        result.setBorder(new LineBorder(Color.BLACK));
        return result;
    }

    public MainWindow() {
        super("Auction Sniper Main");
        setName(MAIN_WINDOW_NAME);
        fillContentPane(makeSnipersTable());
        pack();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(Boolean.TRUE);
    }

    private void fillContentPane(JTable snipersTable) {
        final Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        contentPane.add(new JScrollPane(snipersTable), BorderLayout.CENTER);
    }

    private JTable makeSnipersTable() {
        final JTable snipersTable = new JTable(snipers);
        snipersTable.setName(SNIPERS_TABLE_NAME);
        return snipersTable;
    }

    public void showStatusText(String statusText) {
        snipers.setStatusText(statusText);
    }
}
