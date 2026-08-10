public class Funcionario implements Comparable<Funcionario> {

    private String nome;
    private double salario;
    private int idade;
        public Funcionario(String nome, double salario, int idade){
            super();
            this.nome = nome;
            this.salario = salario;
            this.idade = idade;
        }
        public String getNome() {
            return nome;
        }
        public double getSalario() {
            return salario;
        }
        public int getIdade() {
            return idade;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setSalario(double salario) {
            this.salario = salario;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }

        @Override
        public int compareTo(Funcionario f){
            if(this.salario < f.salario){
                return -1;
            }
            if(this.salario > f.salario){
                return 1;
            }
            if(this.idade < f.idade){
                return -1;
            }
            if(this.idade > f.idade){
                return 1;
            }
            return this.nome.compareToIgnoreCase(f.nome);
        }
    
}
