import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String [] tokens = {"(", "x+y", ")", "* 5"};
        Delimiters d = new Delimiters("(", ")");
        System.out.println(d.getDelimitersList(tokens));

        String [] a = {"<q>", "yy", "</q>", "zz","</q>" };
        Delimiters f = new Delimiters("<q>", "</q>");
        System.out.println(f.getDelimitersList(a)); 

        String open = "<sup>";
        String close = "</sup>";
        d= new Delimiters(open, close);
        ArrayList <String > arr = new ArrayList <String> ();
        String [] g = {"<sup>", "<sup>", "</sup>", "<sup>","</sup>", "</sup>"};
        for (String s : g) {
            arr.add(s);
        }
        System.out.println(d.isBalanced(arr)); 

        ArrayList <String > arr1 = new ArrayList <String> ();
        String [] x = {"<sup>", "</sup>", "</sup>", "<sup>"};
        for (String s : x) {
            arr1.add(s);
        }
        System.out.println(d.isBalanced(arr1)); 

        ArrayList <String > arr2 = new ArrayList <String> ();
        String [] u = {"</sup>"};
        for (String s : u) {
            arr2.add(s);
        }
        System.out.println(d.isBalanced(arr2)); 

        ArrayList <String > arr3 = new ArrayList <String> ();
        String [] r = {"<sup>","<sup>","</sup>"};
        for (String s : r) {
            arr3.add(s);
        }
        System.out.println(d.isBalanced(arr3)); 




    }
}