
package firstobject;
import java.util.Scanner;


public final class Conta {
    Scanner scanner = new Scanner(System.in);
    

     public int numconta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    public int getNumconta() {
        return numconta;
    }

    public void setNumconta(int numconta) {
        this.numconta = numconta;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
        
    }

    public float getSaldo() {
        return saldo;
        
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    public Conta(){
        //Método Construtor
        status = false;
        saldo = 0f;
        System.out.println("OPÇÕES:");
        System.out.println("cc - Criar conta corrente:");
        System.out.println("cp - Criar conta poupança:");
      
    }
    
    
    public void abrirConta(String t){
        //Quem criar uma cc começa com 50 reais, cb começa com 150
         
         this.setTipo(t);
         this.setStatus(true);
         if ("cp".equals(t)){
             this.setSaldo(150);
              System.out.println("Conta Aberta com Sucesso");
                System.out.println("Qual seu nome?");
                String conta = scanner.next();
                setDono(conta);
         }else if ("cc".equals(t)){
             this.setSaldo(50);
              System.out.println("Conta Aberta com Sucesso");
               System.out.println("Qual seu nome?");
                String conta = scanner.next();
                setDono(conta);
         }
         else{
             System.out.println("Opção inválida, Você pode iniciar com conta corrente(cc) ou conta poupança(cp)!");
         }
         
        
         
    } 
    
    public void fecharConta(){
        //Verificar se há saldo ou pendencia antes de liberar o fechamento
        if (this.getSaldo() != 0){
            System.out.println("Você não pode fechar a conta com saldo ativo");
            System.out.println("Saldo atual: R$"+this.getSaldo());
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float dep){
        if (this.getStatus()){
        this.setSaldo(this.getSaldo() + dep);
        System.out.println("Depósito realizado na conta de " + this.getDono());
        
        }else if (status == false){
            System.out.println("Você precisa abrir uma conta primeiro");
        }
    }
    
   public void sacar( float sac){
       //Verificar se há saldo suficiente para saque
       if (this.getStatus() && this.getSaldo() >= sac){
           this.setSaldo(this.getSaldo() -sac);
           System.out.println("Saque realizado na conta de " + this.getDono());
       }else{
           System.out.println("ERRO, Você não possui saldo suficiente!");
       }
   }
   
   public void pagarMensal(){
       //Mensalidade do banco 12 reais para cc, 20 reais para c.p
       int v = 0;
       if(this.getTipo() == "cc"){
           v = 12;
       }else if (this.getTipo() == "cp"){
           v = 20;
       }
       
       if (this.getStatus()){
           this.setSaldo(this.getSaldo() - v);
           System.out.println("Mensalidade paga com sucesso por "+ this.getDono());
       }else{
           System.out.println("Você precisa abrir uma conta primeiro!");
       }
   }
   
   public void estadoAtual(){
       System.out.println("------------------------------");
       System.out.println("Conta " + this.numconta);
       System.out.println("Tipo " + this.tipo);
       System.out.println("Dono " + this.dono);
       System.out.println("Saldo R$" + this.saldo);
       System.out.println("Status " + this.status);
       System.out.println(" ");
       
   }
    
}
        
        
        
    
