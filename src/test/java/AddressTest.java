import org.blocktree.AddressVerify;
import org.junit.Before;
import org.junit.Test;

public class AddressTest  {

    @Before
    public void setUp() {

    }

    @Test
    public void testLsk() {
        try {
            System.out.println(AddressVerify.Verify("lsk","2532189736284987937L", ""));
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}