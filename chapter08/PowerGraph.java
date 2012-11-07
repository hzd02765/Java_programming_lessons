public class PowerGraph {
    public static void main(String[] args) {
	for (int i = -8; i <= 8; i++){
	    if (i < 0){
		printGraph(getPower(i, 2), '-');
	    } else{
		printGraph(getPower(i, 2) , '+');
	    }
	}
    }
    public static int getPower(int x, int n){
	int y  = 1;
	for (int i = 0; i < n; i++){
	    y = y * x;
	}
	return y;
    }
    public static void printGraph(int x){
	printGraph(x, '*');
    }
    public static void printGraph(int x, char c){
	for (int i = 0; i < x; i++){
	    System.out.print(c);
	}
	System.out.println("");
    }
}
