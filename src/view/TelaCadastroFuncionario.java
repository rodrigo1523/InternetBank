package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.funcionarios;

public class TelaCadastroFuncionario {
    public VBox getTelaFuncionarios(Stage stage){
        VBox raiz = new VBox();

        Label lblNome = new Label("Nome:");
        Label lblArea = new Label("Área:");
        Label lblCodigo = new Label("Código:");
        Label lblLider = new Label("Lider:");
        Label lblMensagem = new Label("");

        TextField txtNome = new TextField();
        TextField txtArea = new TextField();
        TextField txtCodigo = new TextField();
        TextField txtLider = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnApagar = new Button("Apagar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblNome, txtNome, lblArea, txtArea, lblCodigo, txtCodigo, lblLider, txtLider,btnCadastrar, btnApagar, lblMensagem);

        btnCadastrar.setOnAction(event -> {
            funcionarios funcionarios = new funcionarios(String.valueOf(txtNome.getText()), txtArea.getText(), txtCodigo.getText(), txtLider.getText());

            lblMensagem.setText("Funcionário cadastrado com sucesso!");
            txtNome.setText("");
            txtArea.setText("");
            txtCodigo.setText("");
            txtLider.setText("");

            System.out.println(funcionarios);

        });

        btnApagar.setOnAction(event -> {
            txtNome.setText("");
            txtArea.setText("");
            txtCodigo.setText("");
            txtLider.setText("");

        });
        return raiz;

    }

}
