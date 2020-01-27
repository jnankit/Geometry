public class Square {
    private int x,y;

    public Square(int ax, int ay){
        x=ax ; y=ay;
    }

    public void getDist(Square P){
        int dx = x - P.x;
        int dy = y - P.y;
        double dist = Math.sqrt(dx*dx+dy*dy);
        System.out.println(dist);
    }

    public double getDist1(Square P){
        int dx = x-P.x;
        int dy = y-P.y;
        double dist = Math.abs(dx-dy);
        return dist;
    }
}

