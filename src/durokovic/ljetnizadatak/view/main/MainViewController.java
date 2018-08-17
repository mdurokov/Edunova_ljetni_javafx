package durokovic.ljetnizadatak.view.main;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.awt.*;
import java.net.URI;

import static javafx.fxml.FXMLLoader.load;

public class MainViewController {
    private String url = "https://github.com/mdurokov/Edunova_ljetni_javafx";



    public void eraBtnClicked(){
        try {
            Parent scene = load(getClass().getResource("/durokovic/ljetnizadatak/view/era/EraView.fxml"));
            Stage stageEra = new Stage();
            stageEra.setScene(new Scene(scene));
            stageEra.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void continentBtnClicked(){
        try {
            Parent scene = load(getClass().getResource("/durokovic/ljetnizadatak/view/continent/ContinentView.fxml"));
            Stage stageEra = new Stage();
            stageEra.setScene(new Scene(scene));
            stageEra.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void eventBtnClicked(){
        try {
            Parent scene = load(getClass().getResource("/durokovic/ljetnizadatak/view/event/EventView.fxml"));
            Stage stageEra = new Stage();
            stageEra.setScene(new Scene(scene));
            stageEra.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void formatBtnClicked(){
        try {
            Parent scene = load(getClass().getResource("/durokovic/ljetnizadatak/view/format/FormatView.fxml"));
            Stage stageEra = new Stage();
            stageEra.setScene(new Scene(scene));
            stageEra.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void roundTypeBtnClicked(){
        try {
            Parent scene = load(getClass().getResource("/durokovic/ljetnizadatak/view/roundtype/roundTypeView.fxml"));
            Stage stageEra = new Stage();
            stageEra.setScene(new Scene(scene));
            stageEra.show();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void codeLinkLblClicked(){
        try {
            Desktop desktop = Desktop.getDesktop();
            URI open = new URI(url);
            desktop.browse(open);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
