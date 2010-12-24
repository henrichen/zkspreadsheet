import java.util.Random;

import org.zkoss.ztl.JQuery;


public class SS_002_Test extends SSAbstractTestCase {

    @Override
    protected void executeTest() {
    	click("jq('$fileMenu button.z-menu-btn')");
    	waitResponse();
    	click("jq('$newFile a.z-menu-item-cnt')");
    	waitResponse();
    	Random randomGenerator = new Random();
        JQuery newc = getSpecifiedCell(randomGenerator.nextInt(25), randomGenerator.nextInt(25));
        String newcValue = getCellContent(newc);
        verifyTrue("".equals(newcValue) || newc == null); 
    }
}