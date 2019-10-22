package view;

import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaAjuda {

    public VBox getTelaAjuda(Stage stage){
        VBox raiz = new VBox();
        Label lblAjuda = new Label("Desenvolvido por Senac");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblAjuda);

        return raiz;

    }
}
