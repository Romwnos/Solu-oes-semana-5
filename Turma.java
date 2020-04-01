public class Turma{
   
   private String nome;
   private String curso;
   private int quantidadeDeAluno;
   private int serie;
   
   
   public Turma (String nome, String curso, int qda, int serie){
      
      this.nome = nome;
      this.curso = curso;
      quantidadeDeAluno = qda;
      this.serie = serie;  
   }
   
   public String getNome(){
      return nome;
   }
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public String getCurso(){
      return curso;
   }
   public void setCurso(String curso){
      this.curso = curso;
   }
   
   public int getQuantidadeDeAluno(){
      return quantidadeDeAluno;
   }
   public void setQuantidadeDeAluno(int qda){
      quantidadeDeAluno = qda;
   }
   
   public int getSerie(){
      return serie;
   }
   public void setSerie(int serie){
      this.serie = serie;
   }
}