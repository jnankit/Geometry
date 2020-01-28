public class Point {
    private int x,y;

    public Point(int ax, int ay){
        x=ax ; y=ay;
    }
    public Point(){
        x=0; y=0;
    }

    public void set_co(int ax,int ay){
        x=ax;  y=ay;
    }
    public int get_x(){
        return x;
    }
    public int get_y(){
        return y;
    }

    public double getDist(Point P){
        int dx = x - P.x;
        int dy = y - P.y;
        double dist = Math.sqrt(dx*dx+dy*dy);
        return dist;
        //System.out.println(dist);
    }

    public double getDist1(Point P){
        int dx = x-P.x;
        int dy = y-P.y;
        double dist = Math.abs(dx-dy);
        return dist;
    }
}

