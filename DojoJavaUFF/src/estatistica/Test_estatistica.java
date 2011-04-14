package estatistica;


public class Test_estatistica {


    public static void main(String[] args){
	teste();
	teste_2();
	teste_3();
	teste_4();
    }
    
    private static void teste(){
	int[] teste=new int[1];
	teste[0]=1;
	if(Estatistica.sequencia(teste)== 1){
	    System.out.println("Teste 1 passou.");

	}
	else{
	    System.out.println("Teste 1 falhou!");
	}
    }
    private static void teste_2(){
	int[] teste=new int[2];
	teste[0]=1;
	teste[1]=7;
	if(Estatistica.sequencia(teste)== 2){
	    System.out.println("Teste 2 passou.");

	}
	else{
	    System.out.println("Teste 2 falhou!");
	}
    }

    private static void teste_3() {
	int[] teste=new int[1];
	teste[0]=1;
	if(Estatistica.media(teste)== 1){
	    System.out.println("Teste 3 passou.");

	}
	else{
	    System.out.println("Teste 3 falhou!");
	}
    }

    private static void teste_4() {
	int[] teste=new int[2];
	teste[0]=1;
	teste[1]=7;
	if(Estatistica.media(teste)== 4){
	    System.out.println("Teste 4 passou.");

	}
	else{
	    System.out.println("Teste 4 falhou!");
	}
    }
}


