package garndesh.hbs_common.util;

/**
 * Created by cte20616 on 20-10-2015.
 */
public class Vector3f {

    private float x, y, z;


    public Vector3f(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /*public Vector3f(int[] vector){
        if(vector.length == 3){
            this(vector[0], vector[1], vector[2]);
        }
    }*/


    @Override
    public boolean equals(Object o){

        if(o instanceof  Vector3f && ((Vector3f)o).x == x && ((Vector3f)o).y == y && ((Vector3f)o).z == z)
            return true;
        return false;
    }
}
