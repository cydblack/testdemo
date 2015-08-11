package org.test.test;

import org.test.demo.Demo;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author yongda.chen
 * @createTime 15/8/11 22:06
 */
public class MyTest {

    @Test(dataProvider = "testData")
    public void ttt(String name) {
        Demo d = new Demo();
        Assert.assertEquals(d.getHello(), name);
    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{{"Hello"}, {"Hello"}};
    }

}