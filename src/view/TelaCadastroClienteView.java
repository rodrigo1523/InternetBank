package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.cliente;
import model.conta;

public class TelaCadastroClienteView {

    public VBox getTelaCadastro(Stage stage) {
        VBox raiz = new VBox();

        Label lblNome = new Label("Nome:");
        Label lblCPF = new Label("CPF:");
        Label lblNumeroConta = new Label("Numero da Conta:");
        Label lblMensagem = new Label("Cliente Cadastrado com Sucesso!");
        lblMensagem.setVisible(false);

        TextField txtNome = new TextField();
        TextField txtCPF = new TextField();
        TextField txtNumeroConta = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblNome, txtNome, lblCPF, txtCPF, lblNumeroConta,
                txtNumeroConta, btnCadastrar, btnLimpar, lblMensagem);

        btnCadastrar.setOnAction(event -> {
            conta conta = new conta(Integer.valueOf(txtNumeroConta.getText()),
                    0.0);
            cliente cliente = new cliente(txtNome.getText(), txtCPF.getText(),
                    conta);
            txtNome.setText("");
            txtCPF.setText("");
            txtNumeroConta.setText("");
            lblMensagem.setVisible(true);

            System.out.println(cliente);
        });

        btnLimpar.setOnAction(event -> {
            txtNome.setText("");
            txtCPF.setText("");
            txtNumeroConta.setText("");
        });
        return raiz;
    }


}
