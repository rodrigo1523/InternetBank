package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {

    public MenuBar getMenuBar(Stage stg) {
        MenuBar menuBar = new MenuBar();
        Menu cadastrar = new Menu("Cadastrar");
        MenuItem cadastrarCliente = new MenuItem("Cliente");
        MenuItem cadastrarProduto = new MenuItem("Produtos");
        MenuItem cadastrarFuncionarios = new MenuItem("Funcinários");

        Menu operacoes = new Menu("Operações");
        MenuItem depRet = new MenuItem("Depositar/Retirar");

        Menu ajuda = new Menu("Ajuda");
        MenuItem ajudaItem = new MenuItem("Sobre");

        cadastrar.getItems().addAll(cadastrarCliente, cadastrarProduto, cadastrarFuncionarios);
        operacoes.getItems().addAll(depRet);
        ajuda.getItems().addAll(ajudaItem);

        menuBar.getMenus().addAll(cadastrar, operacoes, ajuda);

        //Abrir tela de cadastro de cliente
        cadastrarCliente.setOnAction(event -> {
            stg.setTitle("Cadastrar Cliente");
            TelaCadastroClienteView telaCadastroClienteView = new TelaCadastroClienteView();
            stg.setScene(new Scene(telaCadastroClienteView.getTelaCadastro(stg), 500, 275));
            stg.show();
        });

        //Abrir tela de cadastro de Funcinarios
        cadastrarFuncionarios.setOnAction(event -> {
            stg.setTitle("Cadastrar Funcionários");
            TelaCadastroFuncionario TelaCadastroFuncionario = new TelaCadastroFuncionario();
            stg.setScene(new Scene(TelaCadastroFuncionario.getTelaFuncionarios(stg), 500, 375));
            stg.show();
        });

        cadastrarProduto.setOnAction(event -> {
            stg.setTitle("Cadastrar Produtos");
            TelaCadastroProdutos TelaCadastroProdutos = new TelaCadastroProdutos();
            stg.setScene(new Scene(TelaCadastroProdutos.getTelaProdutos(stg), 500, 275));
            stg.show();
        });

        depRet.setOnAction(event -> {
            stg.setTitle("Depositar/Retirar");
            TelaDepositarRetirar TelaDepositarRetirar = new TelaDepositarRetirar();
            stg.setScene(new Scene(TelaDepositarRetirar.getTelaDepositarRetirar(stg), 500, 275));
            stg.show();
        });

        //Abrir tela de Ajuda
        ajudaItem.setOnAction(event -> {
            stg.setTitle("Ajuda");
            TelaAjuda TelaAjuda = new TelaAjuda();
            stg.setScene(new Scene(TelaAjuda.getTelaAjuda(stg), 500, 275));
            stg.show();
        });

        return menuBar;
    }

}
