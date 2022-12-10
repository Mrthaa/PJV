package Game;

import Utils.Direction;
import Utils.ToolHistoriePohybu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HraPosunPoSachovnici {

    private final byte nx;
    private final byte ny;
    private byte x = 0;
    private byte y = 0;
    private final ArrayList<Point> history = new ArrayList<>();
    //private Point[] history = new Point[1];

    public HraPosunPoSachovnici() {
        this((byte)8, (byte)8);
    }

    public HraPosunPoSachovnici(byte nx, byte ny) {
        this.nx = nx;
        this.ny = ny;
        history.add(new Point(this.x, this.y));
        //history[history.length - 1] = new Point(this.x, this.y);
    }

    public boolean can_left() {
        return this.x > 0;
    }

    public boolean can_right() {
        return this.x < nx;
    }

    public boolean can_up() {
        return this.y < ny;
    }

    public boolean can_down() {
        return this.y > 0;
    }

    public boolean can_move(Direction direction) {
        return switch (direction) {
            case DOWN -> can_down();
            case UP -> can_up();
            case LEFT -> can_left();
            case RIGHT -> can_right();
            case NULL -> false;
        };
    }

    public void move(Direction direction) {
        if(can_move(direction)) {
            switch(direction) {
                case DOWN -> this.y -= 1;
                case UP -> this.y += 1;
                case LEFT -> this.x -= 1;
                case RIGHT -> this.x += 1;
            }
            history.add(new Point(this.x, this.y));
            //history = Arrays.copyOf(history, history.length + 1);
            //history[history.length - 1] = new Point(this.x, this.y);
        } else {
            System.out.println("Can't move.");
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getHistoryAsString() {
        return ToolHistoriePohybu.sestavVyslednouCestu(history);
    }

    public double getTravelledDistance() {
        return ToolHistoriePohybu.spoctiVzdalenost(history);
    }
}
