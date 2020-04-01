import javax.swing.*;
public class TesteTurma{
   public static void main (String [] agrs){
      
      String nome = JOptionPane.showInputDialog("Digite o nome");
      String curso = JOptionPane.showInputDialog("Digite o curso");
      int qda = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
      
      Turma turma = new Turma(nome, curso, qda, serie);
      
      JOptionPane.showMessageDialog(null, "Nome: " + turma.getNome());
      JOptionPane.showMessageDialog(null, "Curso: " + turma.getCurso());
      JOptionPane.showMessageDialog(null, "Quantidade de Alunos são: " + turma.getQuantidadeDeAluno());
      JOptionPane.showMessageDialog(null, "Serie: " + turma.getSerie());
      
      int novosAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos são agora?"));
      turma.setQuantidadeDeAluno(novosAlunos);
      
      JOptionPane.showMessageDialog(null, "Nome: " + turma.getNome());
      JOptionPane.showMessageDialog(null, "Curso: " + turma.getCurso());
      JOptionPane.showMessageDialog(null, "Quantidade de Alunos são: " + turma.getQuantidadeDeAluno());
      JOptionPane.showMessageDialog(null, "Serie: " + turma.getSerie());
   }
}