package estatistica;

public class Estatistica {

    public static int sequencia(int[] x) {
	return x.length;
    }

    public static int media(int[] x) {
	if (x.length == 1) {
	    return x[0];
	} else {
	    return (x[0] + x[1]) / 2;
	}
    }
}
