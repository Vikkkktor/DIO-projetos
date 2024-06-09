package PooJava.Classes.Domain;

import java.util.Scanner;

public class Iphone {
    Scanner input = new Scanner(System.in);

    void execute() {
        ReprodutorMusical ipod = new ReprodutorMusical();
    }

    public class ReprodutorMusical {

        private int volume = 40;
        private boolean tocando;

        public void avancarMusica() {
            if (tocando) {
                System.out.println("Trocando de música...");
            }
        }

        public void voltarMusica() {
            if (tocando) {
                System.out.println("Voltando música...");
            }
        }

        public void tocarMusica() {
            if (!tocando) {
                System.out.println("Tocando musica...");
                this.tocando = true;
            }

        }


        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = 40;
        }

        public boolean isTocando() {
            return tocando;
        }

        public void setTocando(boolean tocando) {
            this.tocando = tocando;
        }

        public void pausarMusica() {
            if (tocando) {
                System.out.println("Pausando música...");
                this.tocando = false;
            }
        }

        public void aumentarVolume() {
            if (tocando) {
                this.volume += 5;
                System.out.println("Aumentando o volume...");
                System.out.println("O volume está em " + this.volume + "%");
            }
        }

        public void diminuirVolume() {
            if (tocando) {
                this.volume -= 5;
                System.out.println("Diminuindo o volume...");
                System.out.println("O volume está em " + this.volume + "%");
            }
        }

    }

    public class AparelhoTelefonico {
        void execute() {
            AparelhoTelefonico telefone = new AparelhoTelefonico();
        }
        private String numeroDeTelefone;
        private boolean ligacao;
        private String atender;
        private String ouvirCorreioDeVoz;

        public void recebendoLigacao() {
            if (!ligacao) {
                System.out.println("TRIN TRIN TRIN");
                System.out.println("Deseja atender a ligação? S ou N");
                atender = input.next();
                if (atender.equalsIgnoreCase("S")) {
                    System.out.println("Atendendo ligação...");
                } else {
                    System.out.println("Ligação desligada!");
                }
            }
        }
        public void ligar(){
            if(!ligacao){
                ligacao = true;
                System.out.println("Digite o numero de telefone:");
                numeroDeTelefone = input.nextLine();
                if (numeroDeTelefone.length() == 8 && numeroDeTelefone.matches("\\d+")) {
                    System.out.println("Realizando ligação...");
                    System.out.println("Desligar? S ou N");
                    atender = input.next();
                    if(atender.equalsIgnoreCase("S")){
                        ligacao = false;
                        System.out.println("Deligando ligação...");
                    }
                }else{
                    System.out.println("O número informado é inválido!");
                }
            }
        }

        public void correioDeVoz(){
            System.out.println("Você tem 10 mensagens não ouvidas, deseja ouvi-las?");
            ouvirCorreioDeVoz = input.next();
            if (ouvirCorreioDeVoz.equalsIgnoreCase("S")) {
                System.out.println("Suas mensagens são...");
            } else {
                System.out.println("Saindo do Correio de voz!");
            }
        }
    }
        public class Navegador{
            void execute() {
                Navegador web = new Navegador();
            }

            private int quantidadeDeAbasAbertas = 0;

            public void abrirNovaAba(){
                System.out.println("Abrindo nova aba...");
                quantidadeDeAbasAbertas++;
                System.out.println("Você tem "+quantidadeDeAbasAbertas+" abas abertas");
            }
            public void exibirPaginas(){
                System.out.println("Exibindo páginas...");
            }
            public void atualizarPagina(){
                System.out.println("Atualizando pagina...");
            }
        }
}
