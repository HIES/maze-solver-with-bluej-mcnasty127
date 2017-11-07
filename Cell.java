import java.awt.Color;

public class Cell {

    private double x;
    private double y;
    private Color color;
    private double radius;
    private boolean isWall;
    private boolean isVisited;
    private static Color VISITED = Color.RED;
    private static Color PATH = Color.GREEN;
    private static Color WALL = Color.BLACK;
    private static Color OPEN = Color.WHITE;

    public Cell(double x, double y, double r, boolean isWall){
        this.x = x + r;
        this.y = y + r;
        this.radius = r;
        this.isWall = isWall;
        this.isVisited = false;
        color = isWall ? WALL : OPEN;
    }

    public void setColor(Color color){ this.color = color;}

    public double getRadius() { return radius;}

    public boolean isWall() { return isWall;}

    public boolean isVisited() { return isVisited;}

    public void visitCell(){
        this.isVisited = true;
        this.setColor(VISITED);
    }

    public void becomePath() { this.setColor((PATH));}

    public double getX() { return x;}

    public double getY() { return y;}

    public Color getColor() { return this.color;}
}
