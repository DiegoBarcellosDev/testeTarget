package testetarget;

public class Exercicios {


    public boolean exercicio2(int numero) {
        int n1 = 0, n2 = 1;

        while (n1 <= numero) {
            if (n1 == numero) {
                return true;
            }

            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }

        return false;
    }
    
    public void exercicio5(String minhaString) {
        String stringInvertida = "";
        for (int i = minhaString.length() -1 ; i>=0 ; i--) {
            stringInvertida += minhaString.charAt(i);
        }
            System.out.println("A sua palavra invertida é: " + stringInvertida);
    }
}
