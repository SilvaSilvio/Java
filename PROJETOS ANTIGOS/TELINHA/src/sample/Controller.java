package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable
{
    @FXML private Label etqta;
    @FXML private TextField campo;
    @FXML private ComboBox<OpcoesCombobox> cb;
    private List<OpcoesCombobox> lcb= new ArrayList<>();
    private ObservableList<OpcoesCombobox> olcb;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        this.carregarOpcoesCombobox();
    }

    /*@FXML
    private void apertarBotao(ActionEvent event)
    {
        System.out.println("gargamel de araçatuba");
        etqta.setText("baianinho de maua " + campo.getText());
    }*/

    public void carregarOpcoesCombobox()
    {
        OpcoesCombobox bebidas= new OpcoesCombobox(1, "Bebidas");
        OpcoesCombobox comidas= new OpcoesCombobox(2, "Comidas");

        lcb.add(bebidas);
        lcb.add(comidas);
        //lcb.addAll(ArrayList, bebidas, comidas);

        olcb= FXCollections.observableArrayList(lcb);

        cb.setItems(olcb);
    }
}
