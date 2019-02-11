package exercicio9;

import javax.swing.JOptionPane;

public class Aluno implements Interface{
    
    //Atributos
    private String nome;
    private String sexo;
    private double altura;
    private double pesoIdeal;
    private double pesoAtual;
    private int anoNascimento;
    private int idade;

    
    
    
    //Construtores
    public Aluno(String nome, String sexo, double altura, double pesoIdeal, double pesoAtual, int anoNascimento, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.pesoIdeal = pesoIdeal;
        this.pesoAtual = pesoAtual;
        this.anoNascimento = anoNascimento;
        this.idade = idade;
    }
    public Aluno() {
    }
    
    
    
    
    
    
    //Metodos Especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(double pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public double getPesoAtual() {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    
    
    
    
    
    
    //Metodos Abstratos
    @Override
    public void calcularIdade() {
        this.setIdade(2019-this.getAnoNascimento());
    }

    @Override
    public void calcularPesoIdeal() {
        if(this.getSexo().equals("M") || this.getSexo().equals("m") || this.getSexo().equals("Masculino") || this.getSexo().equals("masculino")){
            this.setPesoIdeal((72.7 * this.getAltura())- 58);
        }
        else{
            this.setPesoIdeal((62.1 * this.getAltura())-44.7);
        }
    }

    @Override
    public void status() { 
        JOptionPane.showMessageDialog(null, "Nome: " + this.getNome() + "\n" +
                                    "Sexo: " + this.getSexo() + "\n" +
                                    "Altura: " + this.getAltura()+ "\n" +                         
                                    "Peso Atual: " + this.getPesoAtual()+ "\n"+                         
                                    "Peso Ideal: " + this.getPesoIdeal()+ "\n"+                         
                                    "Ano de Nascimento: " + this.getAnoNascimento()+ "\n"+
                                    "Idade: " + this.getIdade()
                
                );
    }
    
}
