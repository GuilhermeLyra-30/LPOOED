public class Jogador implements Comparable<Jogador> {

    private String nome;
    private double potuacao;
    private int nivel;
        public Jogador(String nome, double potuacao, int nivel){
            super();
            this.nome = nome;
            this.potuacao = potuacao;
            this.nivel = nivel;
        }
        public String getNome() {
            return nome;
        }
        public double getPotuacao() {
            return potuacao;
        }
        public int getNivel() {
            return nivel;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setPotuacao(double potuacao) {
            this.potuacao = potuacao;
        }
        public void setNivel(int nivel) {
            this.nivel = nivel;
        }

        @Override
        public int compareTo(Jogador j) {
            if (this.potuacao < j.potuacao) {
                return -1;
            }
            if (this.potuacao > j.potuacao) {
                return 1;
            }
            if (this.nivel < j.nivel) {
                return -1;
            }
            if (this.nivel > j.nivel) {
                return 1;
            }
            return this.nome.compareToIgnoreCase(j.nome);
        }
    }
