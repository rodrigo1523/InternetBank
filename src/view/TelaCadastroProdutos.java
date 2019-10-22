package view;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.produto;

public class TelaCadastroProdutos {

    public VBox getTelaProdutos(Stage stage){

        VBox raiz = new VBox();

        Label lblProduto = new Label("Produto:");
        Label lblPreco = new Label("Preço:");
        Label lblMensagem = new Label("");

        TextField txtProduto = new TextField();
        TextField txtPreco = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnApagar = new Button("Apagar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblProduto, txtProduto, lblPreco, txtPreco, btnCadastrar, btnApagar, lblMensagem);

        btnCadastrar.setOnAction(event -> {
            produto produto = new produto(String.valueOf(txtProduto.getText()),
                    Double.valueOf(txtPreco.getText()));
            lblMensagem.setText("Produto cadastrado com sucesso!");
            txtProduto.setText("");
            txtPreco.setText("");

            System.out.println(produto);

        });

        btnApagar.setOnAction(event -> {
            txtProduto.setText("");
            txtPreco.setText("");
        });
        return raiz;


    }
}
