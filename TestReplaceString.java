package com.apple.ReplaceString;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TestReplaceString {

@Test(dataProvider="getData")
public void testremoveChar(String s, char c, String actual){
Assert.assertEquals(ReplaceString.removeChar(s, c), actual);
}

@Test(dataProvider="getData")
public void testremoveCharMethod(String st, char c, String actual){
Assert.assertEquals(ReplaceString.removeCharMethod(st, ch), actual);
}

@DataProvider()
public Object[][] getData(){
Object data[][] = new Object[][];
data[][]={
  { "jdadva", 'd', "java" },
  { "djdava", 'd', "java" },
  {null, 'd', null},//null String as input
  { "", 'd', "" },//empty string as input
  { "#6$a#", '#', "6$a" },//String with special characters and numericals
  { "123456", '5', "12346" },//String with numericals
  { "ja v a", ' ', "java" }//String with spaces as input
  };
return data;
}
}

