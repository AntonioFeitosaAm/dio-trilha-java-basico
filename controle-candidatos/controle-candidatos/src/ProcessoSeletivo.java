import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
       // selecaoCandidatos();
       // imprimirSelecionados();
       String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
       for(String candidato: candidatos){
            entrandoEmContato(candidato);
       }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
		boolean atendeu=false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else
                System.out.println("Contato realizado com sucesso!");

        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");

    }
        //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
        static void imprimirSelecionados(){
            String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
            System.out.println("Imprimindo a lsita de candidatos informando o índice do elemento");
            for(int indice = 0; indice < candidatos.length; indice++){
                System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
                
            }
            System.out.println("Forma abreviada de interação for each");
            for(String candidato: candidatos) {
                System.out.println("O candidato selecionado foi :" + candidato);
            }
        }
        static void selecaoCandidatos(){
            String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
            int candidatoSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while(candidatoSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
                if(salarioBase >= salarioPretendido){
                    System.out.println("O candidato "+ candidato + " foi selecionado para a vaga!");
                    candidatoSelecionados++;
                }
                candidatoAtual++;

            }
        }
        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }
        static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase ==salarioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
        else   {
            System.out.println("Aguardadndo o resultado dos demais candidatos");
        }
    }

}
