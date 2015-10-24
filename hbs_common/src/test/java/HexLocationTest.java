import garndesh.hbs_common.util.HexLocation;
import garndesh.hbs_common.util.Vector3f;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by cte20616 on 20-10-2015.
 */
public class HexLocationTest {

    @Test
    public void HexLocationToCartesianTest() throws Exception{
        HexLocation hexLocation = new HexLocation(0, 0);

        assertEquals(new Vector3f(0, 0, 0), hexLocation.toCartesian());

    }



}
