import javafx.scene.control.TextField;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.paint.Color;

public class Calc extends Application
{
	
	Label label1, label2, label3, label4;
	Button button1, button2, button3, button4;
	TextField input1, input2;
	ComputationFactory compFac;
	Computation comp;
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception
	{
		stage.setTitle("Number Cruncher :)");
		label1 = new Label("First Value: ");
		label2 = new Label("Second Value: ");
		label3 = new Label("Result: ");
		label4 = new Label("");
		input1 = new TextField();
		input2 = new TextField();
		VBox root = new VBox();
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 400, 300, Color.DARKBLUE);
		stage.setScene(scene);
		
		button1 = new Button("Add!");
		button2 = new Button("Subtract!");
		button3 = new Button("Multiply!");
		button4 = new Button("Divide");
		button1.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				String first = input1.getText();
				String second = input2.getText();
				if(first.length()==0 || second.length()==0)
				{
					label4.setText("Please enter an integer in both fields.");
					label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
				}
				else
				{
					try
					{
						int x = Integer.parseInt(first);
						int y = Integer.parseInt(second);
						compFac = new ComputationFactory();
						comp = compFac.getComputation("ADD");
						int z = comp.compute(x, y);
						String result = Integer.toString(z);
						label4.setText(result);
					}
					catch (NumberFormatException e)
					{
						label4.setText("Please enter integers ONLY.");
						label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
					}
					
					
				}
			}
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				String first = input1.getText();
				String second = input2.getText();
				if(first.length()==0 || second.length()==0)
				{
					label4.setText("Please enter an integer in both fields.");
					label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
				}
				else
				{
					try
					{
						int x = Integer.parseInt(first);
						int y = Integer.parseInt(second);
						compFac = new ComputationFactory();
						comp = compFac.getComputation("SUBTRACT");
						int z = comp.compute(x, y);
						String result = Integer.toString(z);
						label4.setText(result);
					}
					catch (NumberFormatException e)
					{
						label4.setText("Please enter integers ONLY.");
						label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
					}
					
					
				}
			}
		});
		
		button3.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				String first = input1.getText();
				String second = input2.getText();
				if(first.length()==0 || second.length()==0)
				{
					label4.setText("Please enter an integer in both fields.");
					label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
				}
				else
				{
					try
					{
						int x = Integer.parseInt(first);
						int y = Integer.parseInt(second);
						compFac = new ComputationFactory();
						comp = compFac.getComputation("MULTIPLY");
						int z = comp.compute(x, y);
						String result = Integer.toString(z);
						label4.setText(result);
					}
					catch (NumberFormatException e)
					{
						label4.setText("Please enter integers ONLY.");
						label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
					}
					
					
				}
			}
		});
		
		button4.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				String first = input1.getText();
				String second = input2.getText();
				if(first.length()==0 || second.length()==0)
				{
					label4.setText("Please enter an integer in both fields.");
					label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
				}
				else
				{
					try
					{
						int x = Integer.parseInt(first);
						int y = Integer.parseInt(second);
						compFac = new ComputationFactory();
						comp = compFac.getComputation("DIVIDE");
						if(y==0)
						{
							label4.setText("Cannot divide by zero.");
							label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
						}
						else
						{
							int z = comp.compute(x, y);
							int r = x%y;
							String result = Integer.toString(z);
							String remainder = Integer.toString(r);
							label4.setText(result + " remainder " + remainder);
						}
						
						
					}
					catch (NumberFormatException e)
					{
						label4.setText("Please enter integers ONLY.");
						label4.setFont(Font.font("Verdana", FontPosture.ITALIC, 10));
					}
					
					
				}
			}
		});
		root.getChildren().addAll(label1, input1, label2, input2, button1, button2, button3, button4, label3, label4);
		stage.show();
	}

}