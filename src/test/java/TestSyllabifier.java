import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

import org.smc.silpamodules.syllabifier.Syllabifier;

/**
 * Created by sujith on 30/5/14.
 */
public class TestSyllabifier extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testConstructor() {
        Syllabifier obj = new Syllabifier();
        assertNotNull(obj);
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testSyllabify() {
        Syllabifier obj = new Syllabifier();
        assertNotNull(obj);
        assertEquals("A syl-lable is a u/nit of or-ga/ni/za/tion for a se/qu_en-ce of speech sounds.", obj.syllabify("A syllable is a unit of organization for a sequence of speech sounds."));
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testGetModuleName() {
        Syllabifier obj = new Syllabifier();
        assertNotNull(obj);
        assertEquals(Syllabifier.SYLLABIFIER_MODULE_NAME, obj.getModuleName());
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testGetModuleInformation() {
        Syllabifier obj = new Syllabifier();
        assertNotNull(obj);
        assertEquals(Syllabifier.SYLLABIFIER_MODULE_INFORMATION, obj.getModuleInformation());
    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
