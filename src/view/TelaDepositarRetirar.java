package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.cliente;
import model.conta;

public class TelaDepositarRetirar {

    public VBox getTelaDepositarRetirar(Stage stage){
        conta conta = new conta(421451, 10.0);
        cliente cliente = new cliente("Rodrigo", "30045102864", conta);

        VBox raiz = new VBox(5);

        Label numeroConta = new Label("Conta: " + cliente.getConta().getNumero());
        Label nomeCliente = new Label("Nome: " + cliente.getNome());
        Label lblMensagemDp = new Label("");
        Label lblMensagemRt = new Label("");

        TextField valorTransacao = new TextField();
        Button btnDepositar = new Button("Depositar");
        Button btnRetirar = new Button("Retirar");
        Label saldoConta = new Label("Saldo: " + cliente.getConta().getSaldo());



        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, numeroConta, nomeCliente, valorTransacao,
                btnDepositar, btnRetirar, saldoConta, lblMensagemDp, lblMensagemRt);

        btnDepositar.setOnAction(event -> {
            conta.depositar(Double.valueOf(valorTransacao.getText()));
            saldoConta.setText("Saldo: " + cliente.getConta().getSaldo());
            lblMensagemDp.setText("Deposito Realizado com Sucesso!");



        });

        btnRetirar.setOnAction(event -> {
            conta.retirar(Double.valueOf(valorTransacao.getText()));
            saldoConta.setText("Saldo: " + cliente.getConta().getSaldo());
            lblMensagemRt.setText("Retirada Efetuada com Sucesso!");
        });

        return raiz;
    }
}
