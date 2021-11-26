public class Test {
    
import java.lang.Math.*;
import static java.lang.System.out;

class Point {
    public void main
    public double x;
    public double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    var vertices = new Point[3];

    for(
    int i = 0;i<3;i++){
    var theta = random() * 2 * PI;
    vertices[i] = new Point(40*cos(theta), 40*sin(theta));
}

double getDistance(Point[] vertices, int u, int v){
    out.println("Here");    
    var x1 = vertices[u].x;
    var y1 = vertices[u].y;
    var x2 = vertices[v].x;
    var y2 = vertices[v].y;

    return sqrt(pow(x1-x2, 2), pow(y1-y2, 2));
}

getDistance(vertices, 1, 2);

for(var vertex: vertices){
    out.println(vertex.x);
    out.println(vertex.y);
}


for (int[] state: new int[][]{{0, 1, 2}, {1, 2, 0}, {2, 0, 1}}){
    out.println("Fuckyou");
    var A = state[0];
    
    var B = state[1];
    var C = state[2];
    out.println("B:"+B);
    var a = getDistance(B, C);
    var b = getDistance(A, C);
    var c = getDistance(A, B);
    
    var theta = acos((a*a + b*b - c*c)/(2*a*b));
    out.println(theta);
}


}
