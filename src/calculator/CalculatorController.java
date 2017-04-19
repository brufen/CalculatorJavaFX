package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable{

    float data = 0.f;
    int operation = -1;
    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button mul;

    @FXML
    private Button one;

    @FXML
    private TextField display;

    @FXML
    private Button tree;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;
    @FXML
    void handleButtonAction(ActionEvent event) {
    if (event.getSource()==one){
        display.setText(display.getText()+ "1");
    } else if (event.getSource()==two){
            display.setText(display.getText()+ "2");
    } else if (event.getSource()==tree){
        display.setText(display.getText()+ "3");
    } else if (event.getSource()==four){
        display.setText(display.getText()+ "4");
    }else if (event.getSource()==five){
        display.setText(display.getText()+ "5");
    }else if (event.getSource()==six){
        display.setText(display.getText()+ "6");
    }else if (event.getSource()==seven){
        display.setText(display.getText()+ "7");
    }else if (event.getSource()==eight){
        display.setText(display.getText()+ "8");
    }else if (event.getSource()==nine){
        display.setText(display.getText()+ "9");
    }else if (event.getSource()==zero){
        display.setText(display.getText()+ "0");
    } else if (event.getSource()==clear){
        display.setText("");
    } else if (event.getSource()==plus){
        data=Float.parseFloat(display.getText());
        operation = 1; //addition
        display.setText("");
    }else if (event.getSource()==minus){
        data=Float.parseFloat(display.getText());
        operation = 2; //subtraction
        display.setText("");
    }else if (event.getSource()==mul){
        data=Float.parseFloat(display.getText());
        operation = 3; //multiplication
        display.setText("");
    }else if (event.getSource()==div){
        data=Float.parseFloat(display.getText());
        operation = 4; //division
        display.setText("");
    }
    else if (event.getSource()==equals){
        Float secondOperand =Float.parseFloat(display.getText());
        switch (operation){
            case 1:
                Float ans = data + secondOperand;
                display.setText(String.valueOf(ans));break;
            case 2:
                ans = data - secondOperand;
                display.setText(String.valueOf(ans));break;
            case 3:
                ans = data * secondOperand;
                display.setText(String.valueOf(ans));break;
            case 4:
                ans = 0f;
                try {
                    ans = data / secondOperand;
                //    display.setText(String.valueOf(ans));
                }catch (Exception e) {
                   display.setText("Error");
                }
                display.setText(String.valueOf(ans));break;

        }
    }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
