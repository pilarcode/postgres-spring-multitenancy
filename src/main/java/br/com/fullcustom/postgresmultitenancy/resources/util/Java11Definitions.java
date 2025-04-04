package br.com.fullcustom.postgresmultitenancy.resources.util;

public class Java11Definitions {
    
    public static String switchExpressions(String dayOfWeek) {
        List<String> names = new ArrayList<>();
        
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is coming!");
                break;
            default:
                System.out.println("Another day");
        }
    }

    public static String textBlocks() {
		String html = "<html>\n" +
            "  <head>\n" +
            "    <title>Example</title>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <h1>Hello World!</h1>\n" +
            "  </body>\n" +
            "</html>";
        return html;
	}

    public static void patternMatchingForInstanceof(Object object) {
		if (object instanceof String) {
            String str = (String) object;
            System.out.println(str.length());
        }

        if (object instanceof Integer i) {
            System.out.println(i);
        }
	}
}