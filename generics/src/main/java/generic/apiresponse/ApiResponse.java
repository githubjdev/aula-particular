package generic.apiresponse;

public class ApiResponse<T> {

    private boolean sucesso;
    private T dados;

    public ApiResponse(boolean sucesso, T dados) {
        this.sucesso = sucesso;
        this.dados = dados;
    }

    public boolean isSucesso() { return sucesso; }
    public T getDados() { return dados; }

    @Override
    public String toString() {
        return "ApiResponse{sucesso=" + sucesso + ", dados=" + dados + "}";
    }
}