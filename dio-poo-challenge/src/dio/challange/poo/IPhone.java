package dio.challange.poo;
public class IPhone implements Navegador,ReprodutorMusical,AparelhoTelefonico {

    @Override
    public void iniciarCorreioDeVoz() {
        // TODO Auto-generated method stub
        System.out.println("iniciar a gravação!");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("a ligar...");
        
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
       System.out.println("chamada atendida!");
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        
        System.out.println("a tocar");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("");
    }

    @Override
    public void escolherMusica() {
        // TODO Auto-generated method stub
      System.out.println("");
    }

    @Override
    public void mostrarPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("");
    }

    @Override
    public void addNewTab() {
        // TODO Auto-generated method stub
        System.out.println("");
    }

    @Override
    public void actualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("");
    }

}
