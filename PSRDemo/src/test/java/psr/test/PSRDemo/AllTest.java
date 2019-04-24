package psr.test.PSRDemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PostRepositoryTest.class, UserRepositoryTest.class })
public class AllTest {

}
