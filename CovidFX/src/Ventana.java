import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import java.awt.*;

public class Ventana {
    private AnchorPane pane;
    private Vacuna arregloVacunas[] =new Vacuna[5];
    private Persona arregloPersonas[] =new Persona[5];
    private int cont=0;
    private int conts=0;
    Vacuna vac=null;

    public AnchorPane construir(){
        this.pane=new AnchorPane();
        Label t1=new Label("Vacunas"); t1.setFont(new Font("Arial",30)); t1.setTextFill(Color.web("#333"));t1.setLayoutX(10);t1.setLayoutY(10);
        Label lblN=new Label("Nombre Vacuna");lblN.setLayoutX(10);lblN.setLayoutY(50);
        TextField txtNo=new TextField();txtNo.setPrefSize(150,25);txtNo.setLayoutX(10);txtNo.setLayoutY(70);

        Label lbMarca=new Label("Marca Vacuna");lbMarca.setLayoutX(180);lbMarca.setLayoutY(50);
        TextField txtMarca=new TextField();txtMarca.setPrefSize(150,25);txtMarca.setLayoutX(180);txtMarca.setLayoutY(70);

        Label lblDosis=new Label("Dosis");lblDosis.setLayoutX(340);lblDosis.setLayoutY(50);
        TextField txtDosis=new TextField();txtDosis.setPrefSize(150,25);txtDosis.setLayoutX(340);txtDosis.setLayoutY(70);
        Button btnInsertarV=new Button("Insertar");btnInsertarV.setPrefSize(80,25);btnInsertarV.setLayoutX(500);btnInsertarV.setLayoutY(70);
        ListView ListaVacunas=new ListView();ListaVacunas.setPrefSize(250,250);ListaVacunas.setLayoutX(10);ListaVacunas.setLayoutY(120);

        Label lblNomP=new Label("Nombre Persona");lblNomP.setLayoutX(350);lblNomP.setLayoutY(120);
        TextField txtNomPersona=new TextField();txtNomPersona.setPrefSize(220,25);txtNomPersona.setLayoutX(350);txtNomPersona.setLayoutY(150);
        Label lblCurp=new Label("CURP");lblCurp.setLayoutX(350);lblCurp.setLayoutY(190);
        TextField txtCurp=new TextField();txtCurp.setPrefSize(220,25);txtCurp.setLayoutX(350);txtCurp.setLayoutY(210);

        Label lblCombo=new Label("Sexo");lblCombo.setLayoutX(350);lblCombo.setLayoutY(250);
        ComboBox combo=new ComboBox();
        combo.getItems().addAll("Hombre","Mujer");
        combo.setPrefSize(220,25);combo.setLayoutX(350);combo.setLayoutY(280);

        Button btnInsertarP=new Button("Insertar");btnInsertarP.setPrefSize(80,25);btnInsertarP.setLayoutX(350);btnInsertarP.setLayoutY(320);

        ListView ListaPersonas=new ListView();ListaPersonas.setPrefSize(250,250);ListaPersonas.setLayoutX(10);ListaPersonas.setLayoutY(390);

        Button btnMirarInfo=new Button("Mostrar");btnMirarInfo.setPrefSize(80,25);btnMirarInfo.setLayoutX(350);btnMirarInfo.setLayoutY(400);



        this.pane.getChildren().addAll(t1,lblN,txtNo,lbMarca,txtMarca,lblDosis,txtDosis,btnInsertarV,ListaVacunas,lblNomP,txtNomPersona,lblCurp,txtCurp,lblCombo,combo,btnInsertarP,ListaPersonas,btnMirarInfo);

        //Eventos
        btnInsertarV.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String nV=txtNo.getText();
                String NV=txtMarca.getText();
                String nD=txtDosis.getText();

                if(nV.equals(" ")||NV.equals(" ")||nD.equals(" ")){
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setContentText("Favor de llenar todos los campos");
                    alert.show();
                }else {
                   try{
                       int conv=Integer.parseInt(nD);
                       Vacuna vacuna=new Vacuna(nV,NV,conv);
                         arregloVacunas[cont]=vacuna;
                         cont++;
                       Alert alert=new Alert(Alert.AlertType.INFORMATION);
                       alert.setTitle("Listo");
                       alert.setContentText("Vacuna creada correctamente");
                       alert.show();
                       txtNo.setText("");
                       txtMarca.setText("");
                       txtDosis.setText("");
                       ListaVacunas.getItems().addAll(vacuna.getNombre());
                   }catch (NumberFormatException error){
                       launchError("El numero insertado no es valido");
                   }catch (ArrayIndexOutOfBoundsException error){
                       launchError("no se pueden agregar mas registros");
                   }catch (Exception error){
                       launchError("Error inesperado");
                   }


                }
            }
        });
        btnInsertarP.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String sex = combo.getSelectionModel().getSelectedItem().toString();
                int pos = ListaVacunas.getSelectionModel().getSelectedIndex();
                System.out.println(sex + "  " + arregloVacunas[pos].getN_dosis());
                String nV = txtNomPersona.getText();
                String NV = txtCurp.getText();
                String nD = combo.getSelectionModel().getSelectedItem().toString();

                if(nV.equals(" ")||NV.equals(" ")||nD.equals(" ")){
                    Alert alert=new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("ERROR");
                    alert.setContentText("Favor de llenar todos los campos");
                    alert.show();
                }else {
                    try{
                        Persona persona=new Persona(nV,NV,null, nD);
                        arregloPersonas[conts]=persona;
                        conts++;
                        Alert alert=new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Listo");
                        alert.setContentText("Vacuna creada correctamente");
                        alert.show();
                        txtNomPersona.setText("");
                        txtCurp.setText("");
                        ListaPersonas.getItems().addAll(persona.getNombre());
                    }catch (NumberFormatException error){
                        launchError("El numero insertado no es valido");
                    }catch (ArrayIndexOutOfBoundsException error){
                        launchError("no se pueden agregar mas registros");
                    }catch (Exception error){
                        launchError("Error inesperado");
                    }  }
            }
        });
        btnMirarInfo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int pos=ListaVacunas.getSelectionModel().getSelectedIndex();
                Alert alert=new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Informacion");
                alert.setContentText("NOMBRE: "+arregloPersonas[pos].getNombre()+"\n" +
                                        "CURP: "+arregloPersonas[pos].getCurp()+"\n" +
                                        "SEXO: "+arregloPersonas[pos].getSexo()+"\n"+
                                        "VACUNA: "+arregloVacunas[pos].getNombre()+"\n" +
                                        "MARCA: "+arregloVacunas[pos].getMarcaVacuna()+"\n" +
                                      "DOSIS: "+arregloVacunas[pos].getN_dosis()+"\n" +
                                        "Fecha: "+arregloPersonas[pos].getFecha());
                alert.show();
            }
        });

        return pane;
    }
    public void launchError(String mensaje){
        Alert alert=new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(mensaje);
        alert.show();
    }
}
