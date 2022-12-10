import java.awt.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Minesweeper {

    private final int width;
    private final int height;
    private final int mineCount;
    private final boolean[][] arr;
    private final boolean[][] mask;
    private int revealed;

    public Minesweeper(int width, int height, int mineCount) {
        this.width = width;
        this.height = height;
        this.mineCount = mineCount;
        this.revealed = 0;
        this.arr = new boolean[width][height];
        this.mask = new boolean[width][height];
        init();
    }

    private void init() {
        Set<Point> mines = new HashSet<>();
        Random rand = new Random();
        while(mines.size() != mineCount)
            mines.add(new Point(rand.nextInt(width), rand.nextInt(height)));

        for(int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                arr[i][j] = mines.contains(new Point(i, j));
                mask[i][j] = false;
            }
        }
    }

    public int getHeight() {
        return this.height;
    }

    public int getMineCount() {
        return this.mineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public ActionType reveal(int i, int j) {
        if(removeMask(i,j)) return ActionType.MINE_REVEALED;
        else if((width * height) - mineCount == revealed) return ActionType.ARRAY_REVEALED;
        return ActionType.CONTINUE;
    }

    private boolean removeMask(int i, int j) {
        mask[i][j] = true;
        revealed++;
        return arr[i][j];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < height; j++) {
                if(mask[i][j])
                    if(arr[i][j]) sb.append("1");
                    else sb.append("0");
                else
                    sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
