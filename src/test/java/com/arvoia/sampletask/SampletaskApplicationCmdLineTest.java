/** This class was generated by GenTest@Mobacar */
package com.arvoia.sampletask;

import static org.mockito.Matchers.any;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

// Note: PowerMockito is used as don't need to run the actual application, just to make sure that it would be initialized properly from command line
@RunWith(PowerMockRunner.class)
@PrepareForTest({SpringApplication.class})
public class SampletaskApplicationCmdLineTest {

  @Before
  public void setupTest() {
    // prepare test
    System.setProperty("spring.profiles.active", "test");
    PowerMockito.mockStatic(SpringApplication.class);
  }

  @Test
  public void testMain() throws Exception {
    // given
    PowerMockito.doReturn(null).when(SpringApplication.class);
    SpringApplication.run(any(Class.class), any(String[].class));
    // when
    SampletaskApplication.main(new String[] {});
    // then
    PowerMockito.verifyStatic(SpringApplication.class);
    SpringApplication.run(SampletaskApplication.class, new String[0]);
  }

}
