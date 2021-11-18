import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int contador = 0, contadorVetor = 0, identificador = -1, maiorNome = 0, maiorContador = 0;
        String nome = "", escolhido = "";
        String resposta = "";
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<String> nomes2 = new ArrayList<String>();

        while(!nome.equals("FIM")){
            nome = input.nextLine();
            if(nome.equals("FIM")){
                break;
            }
            int tamanho = nome.length();
            for(int i = 0; i < tamanho; i++){
                if(nome.charAt(i) == ' '){
                    identificador = i;
                    break;
                }
            }
            resposta = nome.substring(identificador + 1, tamanho);

            if(resposta.equals("SIM")){
                if(nome.length() > maiorNome){
                    maiorNome = nome.length();
                    escolhido = nome.substring(0, identificador);
                }
                if(!nomes.contains(nome.substring(0, identificador))) nomes.add(nome.substring(0, identificador));

            }else{
                if(!nomes2.contains(nome.substring(0, identificador))) nomes2.add(nome.substring(0, identificador));
            }

        }input.close();

        Collections.sort(nomes);
        Collections.sort(nomes2);
        for(String x : nomes){
            System.out.println(x);
        }
        for(String y : nomes2) System.out.println(y);

        System.out.println("\nAmigo do Pablo:");
        System.out.println(escolhido);
    }
}


