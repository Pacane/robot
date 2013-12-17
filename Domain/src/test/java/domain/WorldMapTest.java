package domain;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Joel on 16/12/13.
 */
public class WorldMapTest {

    private Feature f1;
    private Feature f2;
    private Feature f3;
    private WorldMap worldMap;

    @Before
    public void setUp() throws Exception {
        f1 = new Feature("1");
        f1.SSIDs = Arrays.asList("1");

        f2 = new Feature("1");
        f2.SSIDs = Arrays.asList("1", "2");

        f3 = new Feature("1");
        f3.SSIDs = Arrays.asList("1", "2", "3");

        this.worldMap = new WorldMap();
    }

    @Test
    public void retourneNullQuandAucuneFeatureEstTrouvee() throws Exception {
        Feature best = worldMap.findBestMatch(Arrays.asList("1"));

        assertNull(best);
    }

    @Test
    public void retourneLaFeatureQuandLesSSIDsCorrespondent() throws Exception {
        worldMap.addFeature(f1);

        Feature best = worldMap.findBestMatch(Arrays.asList("1"));

        assertEquals(best, f1);
    }
}
