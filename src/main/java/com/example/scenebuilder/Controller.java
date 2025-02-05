package com.example.scenebuilder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private Button myTestButton;
	@FXML
	private VBox infoContainer;
	
	@FXML
	void updICClear() {
		infoContainer.getChildren().clear();
	}
	@FXML
	void updICTestButton() {
		Label newInfo = new Label("THIS IS INFORMATION FOR THE TEST BUTTON");
		Label newTitle = new Label("TEST BUTTON\n\n");
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
	}

    @FXML
    void handleButtonAction() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ACWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Second WINDOW");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
    	Label newTitle = new Label("Accumulator Register\n\n");
		Label newInfo = new Label("Temporarily holds operands and results from ALU operations. The"
				+ " most significant 40 bits are stored here.");
		
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
    }
    @FXML
    void handleButtonAction1() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MQWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Third WINDOW for MQ");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
    	Label newTitle = new Label("Multiplier Quotient Register\n\n");
		Label newInfo = new Label("Works alongside the AC. Holds the multiplier during"
				+ " multiplication, and the quotient during division. Holds the least"
				+ " significant of the 40 bits.");
		
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
    }
    @FXML
    void handleButtonAction2() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ALCircuitWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Fourth WINDOW for AL Circuits");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }

        @FXML
        void handleButtonAction3() {
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MBRWindow.fxml"));
//                Parent root1 = fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.setTitle("Fifth WINDOW for MBR");
//                stage.setScene(new Scene(root1, 300, 275));
//                stage.show();
//            } catch (Exception e) {
//                e.printStackTrace();  // Print stack trace for debugging
//            }
        	Label newTitle = new Label("Memory Buffer Register\n\n");
    		Label newInfo = new Label("Temporarily holds instructions for data transferred between ALU and main memory."
    				+ " Holds instructions/data fetched from memory before processing, and stores "
    				+ " results before writing back to memory.");
    		
    		infoContainer.getChildren().clear(); 

    		newTitle.getStyleClass().add("title-label");
    		newInfo.getStyleClass().add("general-label");
    		infoContainer.getChildren().add(newTitle);
    		infoContainer.getChildren().add(newInfo);
    }
    @FXML
    void handleButtonAction4() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SixthWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Sixth WINDOW for Input");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction5() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ResetWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Seventh WINDOW for Input");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction6() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PCWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle("Eighth WINDOW for PC");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
    	Label newTitle = new Label("Program Counter\n\n");
		Label newInfo = new Label("Holds/Keeps track of the next instruction to be executed. "
				+ "Keeps track of where the program is in memory. "
				+ "After each instruction of a program, it updates to point to the next instruction in sequence.");
		
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
    }
        @FXML
        void handleButtonAction7() {
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MARWindow.fxml"));
//                Parent root1 = fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.setTitle(" WINDOW for MAR");
//                stage.setScene(new Scene(root1, 300, 275));
//                stage.show();
//            } catch (Exception e) {
//                e.printStackTrace();  // Print stack trace for debugging
//            }
        	Label newTitle = new Label("Memory Address Register\n\n");
    		Label newInfo = new Label("Stores the memory address where data or an instruction is located. "
    				+ "Works alongside the PC to fetch instructions from memory. "
    				+ "It is also used to hold addresses when reading/writing data to memory");
    		
    		infoContainer.getChildren().clear(); 

    		newTitle.getStyleClass().add("title-label");
    		newInfo.getStyleClass().add("general-label");
    		infoContainer.getChildren().add(newTitle);
    		infoContainer.getChildren().add(newInfo);
    }

    @FXML
    void handleButtonAction8() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IBRWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle(" WINDOW for IBR");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
    	Label newTitle = new Label("Instruction Buffer Register\n\n");
		Label newInfo = new Label("Stores the second instruction (Bits 20-39) from a 40-bit word"
				+ " retrieved from the MBR. When the IR finishes executing the first instruction, the IBR"
				+ " sends its stored instruction to the IR for execution.");
		
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
    }
    @FXML
    void handleButtonAction9() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ControlCircuitWindow.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle(" WINDOW for Control Circuit window");
            stage.setScene(new Scene(root1, 300, 275));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();  // Print stack trace for debugging
        }
    }
    @FXML
    void handleButtonAction10() {
//        try {
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("IRWindow.fxml"));
//            Parent root1 = fxmlLoader.load();
//            Stage stage = new Stage();
//            stage.setTitle(" WINDOW for IR");
//            stage.setScene(new Scene(root1, 300, 275));
//            stage.show();
//        } catch (Exception e) {
//            e.printStackTrace();  // Print stack trace for debugging
//        }
    	Label newTitle = new Label("Instruction Register\n\n");
		Label newInfo = new Label("Retrieves and stores the first instruction (Bits 0-19) from a 40-bit word retrieved from the MBR. "
				+ "The IR holds the current instruction being executed.");
		
		infoContainer.getChildren().clear(); 

		newTitle.getStyleClass().add("title-label");
		newInfo.getStyleClass().add("general-label");
		infoContainer.getChildren().add(newTitle);
		infoContainer.getChildren().add(newInfo);
    }

}

