import java.util.Calendar;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.Scanner;

public class CalendarMain extends Application{
		
	static Rectangle[] rect = new Rectangle[42];
	String [] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};

	@Override
	public void start(Stage stage) throws Exception {
		
		Calendar calendar = Calendar.getInstance();

		BorderPane bp2 = new BorderPane();
		Text text1 = new Text();
		Text text2 = new Text("Su     Mo     Tu     We     Th     Fr     Sa");
		text1.setText("" + month[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.YEAR));
		text1.setStyle("-fx-font-size: 40; -fx-font-weight: bold;");
		text2.setStyle("-fx-font-size: 30;");

		BorderPane.setAlignment(text1, Pos.CENTER);
		BorderPane.setAlignment(text2, Pos.CENTER);
		bp2.setTop(text1);
		bp2.setBottom(text2);
		
		GridPane gp = new GridPane();
		BorderPane bp = new BorderPane();
		bp.setStyle("-fx-background-color: lightblue;");

		getRekt();
		CurrentDate();
		
		int rectnum = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 7; j++)
		gp.add(rect[rectnum++], j, i);
		
		}
		
		
		bp.setBottom(gp);
		bp.setTop(bp2);

		Scene scene = new Scene(bp, 595, 610);
		stage.setScene(scene);
		stage.setTitle("Calendar");
		stage.show();
		
		
	}
	
	Rectangle [] getRekt() {		
		
				for(int i = 0; i < 42; i++)	{
					
		 Rectangle r = new Rectangle();
		 r.setWidth(80); 
		 r.setHeight(80);
		 r.setFill(Color.LIGHTCYAN);
		 r.setStroke(Color.BLACK);
		 r.setStrokeWidth(5);

		 rect[i] = r;
		 

		}
				return rect;
		
	}
	
	void CurrentDate(){
		
		 Calendar calendar = Calendar.getInstance();  
		   
		 System.out.println("Year: " + calendar.get(Calendar.YEAR));  
		 
		 System.out.println("Day: " + calendar.get(Calendar.DATE));  
		 
		 System.out.println("Month: " + calendar.get(Calendar.MONTH));  
		 
		 System.out.println("Day: " + calendar.get(Calendar.DAY_OF_WEEK));  


		
	}
	
	void getDays() {
		
	}
		
	public static void main(String [] args) {
		launch(args);
	}


}
