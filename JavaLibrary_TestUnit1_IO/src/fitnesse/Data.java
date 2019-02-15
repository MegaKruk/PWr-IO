package fitnesse;

import fit.Fixture;
import io_test.Facade;

public class Data extends Fixture {
    static Facade facade;
    public Data()
    {
        facade = new Facade();
    }
}
