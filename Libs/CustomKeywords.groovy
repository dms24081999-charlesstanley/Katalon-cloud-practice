
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject



def static "package1.sample1.enterdata"(
    	String info	) {
    (new package1.sample1()).enterdata(
        	info)
}


def static "customKeywords.myCustomKeywords.login"(
    	String url	) {
    (new customKeywords.myCustomKeywords()).login(
        	url)
}

 /**
	 * Refresh browser
	 */ 
def static "customKeywords.myCustomKeywords.refreshBrowser"() {
    (new customKeywords.myCustomKeywords()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "customKeywords.myCustomKeywords.clickElement"(
    	TestObject to	) {
    (new customKeywords.myCustomKeywords()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "customKeywords.myCustomKeywords.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new customKeywords.myCustomKeywords()).getHtmlTableRows(
        	table
         , 	outerTagName)
}
