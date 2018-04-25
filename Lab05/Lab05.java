import java.util.Scanner;

public class Lab05 {

    public static int maxsymbols = 100;
	public static String[] symbols = new String[maxsymbols];
	public static int[] values = new int[maxsymbols];
	public static int symbolcount = 0;

    // methods
    
    // Given a String s, assumed to be a symbol and not a constant,
    // and assumed not to already be in the symbol table, add it to
    // symbol table.  Check to make sure that there is available
    // space in the symbol table.
    public static void addsymbol(String s) {
        if(symbolcount != maxsymbols) {
            symbols[symbolcount] = s;
            symbolcount++;
        }

    }
    
    // Given a String s, assumed to be a symbol and not a constant,
    // look up the symbol in the symbol table.  Return its index if
    // it is found, or -1 if it is not.
	public static int lookup(String s) {
        for(int i = 0; i < symbolcount; i++) {
            if(s.equals(symbols[i])) {
                return i;
            }
        }
        return -1;
    }

    // Given a String s, assumed to be a symbol which is already
    // in the symbol table, and not a constant, lookup the symbol
    // and return its value.
    public static int getsymbolvalue(String s) {
        int i = lookup(s);
        return values[i];
    }
    

    // Given a String s2, assumed to be either a symbol which is
    // already in the symbol table, or a constant, determine its
    // value and return it.
    public static int eval(String s2) {
        int value = 0;
        int i = lookup(s2);
        if (i < 0) {
            value = Integer.parseInt(s2);
        } else {
            value = getsymbolvalue(s2);
        }

        return value;
    }

    // Given Strings s2 and s3, assumed to be either symbols which
    // are already in the symbol table, or constants, and a String
    // op which represents one of the four arithmetic symbols,
    // evaluate s2 and s3, then apply the indicated arithmetic
    // operation to get a final resulting value and return it.
    public static int eval(String s2, String op, String s3) {
        int v2 = eval(s2);
        int v3 = eval(s3);

        if (op.equals("+")) {
            return v2 + v3;
        } else if (op.equals("-")) {
            return v2 - v3;
        } else if (op.equals("*")) {
            return v2 * v3;
        }
        return v2 / v3;
    }


    // Given a String s, assumed to be a symbol which may or may
    // not already be in the symbol table, lookup the symbol in the
    // symbol table.  If the symbol is already in the table, set
    // its value to v.  If the symbol is not in the symbol table,
    // add it to the symbol table, then set its value to v.
	public static void setsymbolvalue(String s, int v) {
        int i = lookup(s);
        if (i >= 0) {
            values[i] = v;
        } else {
            symbols[symbolcount] = s;
            values[symbolcount] = v;
            symbolcount++;
        }
    }

    // Given a String s, assumed to be an input to the calculator
    // typed by the user on the command line, use the split()
    // method to tokenize or split the String, and return the array
    // of tokens.
    public static String[] tokenize(String s) {
        return s.split(" ");
    }

    // Print out the content of the entire symbol table to the
    // display, including the name and current value of all symbols
    // currently in the table.
	public static void show() {
        for(int i = 0; i < symbolcount; i++) {
            System.out.printf("[%d] %s = %d\n", i, symbols[i], values[i]);
        }
    }

    public static void help() {
        System.out.println("Help");
    }
	
    // test cases
    public static void testcases() {
		show();
		System.out.println("x =   3"); setsymbolvalue("x",  3); show();
		System.out.println("y =   7"); setsymbolvalue("y",  7); show();
		System.out.println("z =  10"); setsymbolvalue("z", 10); show();
		System.out.println("p = 155"); setsymbolvalue("p",155); show();
		System.out.println("q =  18"); setsymbolvalue("q", 18); show();
		System.out.println("r =  22"); setsymbolvalue("r", 22); show();
		System.out.println("y =  11"); setsymbolvalue("y", 11); show();
		System.out.println("z =  83"); setsymbolvalue("z", 83); show();
		System.out.println("p =  -5"); setsymbolvalue("p", -5); show();
    }

    public static boolean checkinput(String[] t) {
        return true;
    }
    
    public static void commandline() throws Exception {
        Scanner in = new Scanner(System.in);
        String prompt1 = "Calculator 1.0";
        String prompt2 = ">> ";
    
        System.out.println(prompt1);
        System.out.print(prompt2);
        String line = in.nextLine();
    
        while (! line.equals("quit")) {
            String[] tokens = tokenize(line);
            boolean okay = checkinput(tokens);
            if (okay) {
                if (tokens.length==1) {
                    if (tokens[0].equals("help")) help();
                    else if (tokens[0].equals("show")) show();
                }
                else if (tokens.length == 3) {
                    int v = eval(tokens[2]);
                    setsymbolvalue(tokens[0],v);
                    //System.out.println(…);
                }
                else {
                    int v = eval(tokens[2],tokens[3],tokens[4]);
                    setsymbolvalue(tokens[0],v);
                    //System.out.println(…);
                }
            }
            System.out.print(prompt2);
            line = in.nextLine();
        }
    }


	public static void main(String[] args) throws Exception {
        //testcases();
        try {
            commandline();
        } catch (Exception e) {
            System.out.println("Oh no!");
        }
	}
}