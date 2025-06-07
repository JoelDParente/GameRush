package Model;

public class Administrador extends Usuario{
    private String senhaExtra;

    public String getSenhaExtra() {
        return senhaExtra;
    }

    public void setSenhaExtra(String senhaExtra) {
        this.senhaExtra = senhaExtra;
    }
    
    public boolean validarSenhaMestre(String senhaInformada) {
        return "admin".equals(senhaInformada);
    }
    
}
