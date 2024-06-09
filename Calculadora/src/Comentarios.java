public class Comentarios {
    public static void main(String[] args) {
        
        //Comentário de uma linha apenas

    }
    /*Comentário em blocos, utilizado principalmente para documentação
        * Este método foi elaborado as pressas
        * por isso eu abrevei o nome das variáveis
        * mas olha, ele tem a finalidade de somar ou  multiplicar
        * dois números*/
 
        // exemplo a não seguir, comentário não deve ser utilizado para substituir as boas práticas de programação, onde o codigo deve ser legível sem ter comentário, pois, as boas prática é uma convenção amplamente
        //utilizada pela comunidade, os comentário servem como um complemento
        
        public int somaMultiplica (int n, int x, String m){
            int r = 0; // r é igual ao resultado
            if (m == "M"){ // M= multiplicação
                r= n * x;
            }else{
                // se não soma mesmo
                r = n + x;
            }
            return r;
        }

}
