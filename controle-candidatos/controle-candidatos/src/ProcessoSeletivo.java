import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
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
