
public class StringDatabase {
	/* system that you set up which searches the original string for 
	 * an identifier of the particular information that the substring 
	 * contains info on.
	 */
	static void searchString(String myStr,String identifier) {
		// Identifier #1: output #1
		if(identifier.equals(",")) {
			myStr = myStr.substring(0,myStr.indexOf(identifier));
		} else {
			// Identifier #2: output #2
			if(identifier.equals(".")) {
				myStr = myStr.substring(myStr.indexOf(',')+1,myStr.indexOf(identifier));
			} else {
				// Identifier #3: output #3
				if(identifier.equals("@")) {
					myStr = myStr.substring(myStr.indexOf('.')+1,myStr.indexOf(identifier));
				}
			}
		}
		System.out.println("Retrieved event info: " + myStr);
	}
	
	public static void main(String[] args) {
			
		String event = new String();
		/* , for event name
		 * . for host name
		 * @ for event date
		 */
		event = "Birthday,Alexander.11/13/22@";
		
		searchString(event,",");
		searchString(event,".");
		searchString(event,"@");
	}
}
