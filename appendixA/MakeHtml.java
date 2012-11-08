import java.io.*;

public class MakeHtml {
    public static void main(String[] args){
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	try {
	    String line;
	    System.out.println("<html><head><title>My Page</title></head><body>");
	    while ((line = reader.readLine()) != null) {
		if (line.startsWith("■")) {
		    System.out.println("<h1>" + line.substring(1) + "</h1>");
		} else if (line.startsWith("●")) {
		    System.out.println("<h2>" + line.substring(1) + "</h2>");
		} else if (line.equals("----")) {
		    System.out.println("<hr>");
		} else if (line.equals("address")) {
		    System.out.println("<a href=\"mailto:hyuki@example.com\">hyuki@example.com</a>");
		} else {
		    System.out.println(line);
		}
	    }
	} catch (IOException e) {
	    System.out.println(e);
	}
    }
}
