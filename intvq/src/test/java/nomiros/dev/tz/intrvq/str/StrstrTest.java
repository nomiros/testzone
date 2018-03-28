package nomiros.dev.tz.intrvq.str;

import org.junit.Assert;
import org.junit.Test;

public class StrstrTest {

    @Test
    public void runTest() {

        Assert.assertEquals("test 1:  ",-1, strstr("a", "ab"));
        Assert.assertEquals("test 2:  ",-1, strstr("ab", "c"));
        Assert.assertEquals("test 3:  ",0, strstr("ab", "a"));
        Assert.assertEquals("test 4:  ",0, strstr("abcdef", "ab"));
        Assert.assertEquals("test 5:  ",0, strstr("abcdef", "abc"));
        Assert.assertEquals("test 6:  ",0, strstr("abcdef", "abcd"));
        Assert.assertEquals("test 7:  ",0, strstr("abcdef", "abcdef"));
        Assert.assertEquals("test 8:  ",1, strstr("abcdef", "bcdef"));
        Assert.assertEquals("test 9:  ",-1, strstr("abcdef", "fg"));
        Assert.assertEquals("test 10:  ",5, strstr("abcdef", "f"));
    }

    
    /**
     * strstr
     * @param str
     * @param substr
     * @return
     */
    private int strstr(String str, String substr) {
        
        int retVal = -1;
        
        if(substr.length() > str.length()) {
            return retVal;
        }
        for(int i = 0 ; i < str.length() - substr.length() + 1 ; i++) {
            for(int j = 0 ; j < substr.length() ; j ++) { 
                if(str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }else if(j == substr.length() - 1) {
                    retVal = i; 
                    break;
                }   
            }         
            if(retVal != -1) {
                break;
            }           
        }     
        return retVal;
    }

}
