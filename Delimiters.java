import java.util.ArrayList; 
public class Delimiters {
    private String openDel; 
    private String closeDel;
    public Delimiters (String open, String close ) {
        openDel = open; 
        closeDel= close;
    }
    public ArrayList <String> getDelimitersList (String[] tokens) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<tokens.length ; i++) {
            if (tokens[i].equals(openDel) || tokens[i].equals(closeDel)) {
                list.add(tokens[i]);
            }
        }
        return list;
    }
    public boolean isBalanced (ArrayList <String> delimiters) {
        int numc= 0 ; 
        int numo=0;
        for (int i = 0 ; i<delimiters.size(); i++ ) {
            if (delimiters.get(i).equals (openDel)) {
                numo++;
            }
            if (delimiters.get(i).equals (closeDel)) {
                numc++;
            }
            if (numc>numo) {
                return false;
            }
        }
        if (numo==numc) {
            return true;
        }
        return false;
    }
 }