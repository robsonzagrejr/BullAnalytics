package bullanalytics;

//Scene
import javafx.scene.control.Label;
import javafx.scene.text.Text;
//import javafx.scene.text.TextAlignment;
//import javafx.scene.control.TextField;
//import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

//Events
//import javax.event.ActionEvent;
//import javax.event.EventHandler;

//Others
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.net.URL;

public class AssetsGrid extends GridPane{

	public AssetsGrid() {
		Text t1 = new Text("Assets Grid");
		this.add(t1,0,0);
	}
}