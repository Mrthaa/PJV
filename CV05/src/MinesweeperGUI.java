import javax.swing.*;
import java.awt.*;

public class MinesweeperGUI {

    private JPanel panel;
    private Minesweeper ms;

    private final JFrame frame = new JFrame();
    private final int nx;
    private final int ny;
    private final int mineCount;
    private final int size = 40;

    public MinesweeperGUI() {
        this(new Minesweeper(10, 10, 10));
    }
    public MinesweeperGUI(Minesweeper ms) {
        this.mineCount = ms.getMineCount();
        this.ms = ms;
        this.nx = ms.getWidth();
        this.ny = ms.getHeight();
        init();
    }

    private void init() {
        panel = new JPanel(new GridLayout(nx, ny));
        createButtons();
        frame.setSize(new Dimension(40*nx + size, 40*ny + size));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setTitle("Minesweeper");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(panel);
    }
    private void createButtons() {
        for(int i = 0; i < nx*ny; i++)
                panel.add(createButton());
    }
    private JButton createButton() {
        JButton tmp = new JButton();
        tmp.setBackground(new Color(37, 50, 64));
        tmp.setBorder(BorderFactory.createLineBorder(new Color(33, 224, 139), 1));
        tmp.setSize(new Dimension(40, 40));
        tmp.setFocusPainted(false);
        tmp.setText("?");
        tmp.setForeground(new Color(255, 255, 255));
        tmp.addActionListener(e -> {
            JButton button = (JButton)e.getSource();
            int x = button.getX() / size;
            int y = button.getY() / size;
            button.setEnabled(false);
            button.setBackground(new Color(255, 255, 255));
            button.setText("");
            switch(ms.reveal(x,y)) {
                case CONTINUE -> { return; }
                case ARRAY_REVEALED -> { GameOver(ActionType.ARRAY_REVEALED); }
                case MINE_REVEALED -> { GameOver(ActionType.MINE_REVEALED); }
            }
        });
        return tmp;
    }

    private void GameOver(ActionType type) {
        String msg = (type == ActionType.ARRAY_REVEALED) ? "Vyhrál jsi!" : "Klikl jsi na minu!";
        Object[] ops = {"Nová hra", "Konec"};

        int res = JOptionPane.showOptionDialog(frame, msg, "Konec hry", JOptionPane.YES_NO_CANCEL_OPTION,
                                                JOptionPane.PLAIN_MESSAGE, null, ops, null);
        if(res == 1) System.exit(0);
        else resetGUI();
    }

    private void resetGUI() {
        ms = new Minesweeper(nx, ny, mineCount);
        panel.removeAll();
        SwingUtilities.updateComponentTreeUI(frame);
        createButtons();
    }
}
