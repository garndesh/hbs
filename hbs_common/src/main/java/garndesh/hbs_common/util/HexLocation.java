package garndesh.hbs_common.util;

/**
 * Created by cte20616 on 20-10-2015.
 */
public class HexLocation {

    private static final int[][] diff = {{2, -1}, {1, 1}};
    private static final double cos30 = Math.cos(Math.PI/6);
    public int q, r, i;

    public HexLocation(int q, int r){
        this.q = q;
        this.r = r;
        this.i = -(r+q);
    }


    public Vector3f toCartesian(){
        return new Vector3f((float)q*1.5f, 0, (float)( ((float)-q*cos30)-((float)r*cos30*2.0f) ));
    }

    public int getDistanceTo(HexLocation start){
        return (Math.abs(start.q - q) + Math.abs(start.r - r) + Math.abs(start.i - i))/2;
    }

    public int getDistanceToOrigin(){
        return (Math.abs(q) + Math.abs(r) + Math.abs(i))/2;
    }

}
