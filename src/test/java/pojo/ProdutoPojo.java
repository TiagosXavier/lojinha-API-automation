package pojo;

import java.util.List;

public class ProdutoPojo {
    private String produtoNome;
    private double produtoValor;
    private List<String> produtoCores;
    private String ProdutoUrlMock;
    private List<ComponentePojo> componentes;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public String getProdutoUrlMock() {
        return ProdutoUrlMock;
    }

    public void setProdutoUrlMock(String produtoUrlMock) {
        ProdutoUrlMock = produtoUrlMock;
    }

    public List<ComponentePojo> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<ComponentePojo> componentes) {
        this.componentes = componentes;
    }
}
