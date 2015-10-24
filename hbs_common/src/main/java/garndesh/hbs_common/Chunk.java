package garndesh.hbs_common;

import garndesh.hbs_common.util.HexLocation;

/**
 * Created by cte20616 on 21-10-2015.
 */
public class Chunk {

    private int size;
    private int[] tiles;

    public Chunk(int size){
        this.size = size;
        this.tiles = new int[1+size*(size+1)/2];
    }

    public Tile getTile(HexLocation location){
        return null;
    }
}







