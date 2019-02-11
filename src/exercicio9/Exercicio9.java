package exercicio9;
import javax.swing.JOptionPane;
public class Exercicio9 {


    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        
        aluno.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?")));
        aluno.setAnoNascimento(Integer.parseInt(JOptionPane.showInputDialog("Em que ano nasceu?")));
        aluno.setNome(JOptionPane.showInputDialog("Qual seu nome?"));
        aluno.setPesoAtual(Integer.parseInt(JOptionPane.showInputDialog("Qual seu peso atual?(KG)")));
        aluno.setSexo(JOptionPane.showInputDialog("Qual seu sexo?"));
        
        aluno.calcularIdade();
        aluno.calcularPesoIdeal();
        aluno.status();
    }
    
}
