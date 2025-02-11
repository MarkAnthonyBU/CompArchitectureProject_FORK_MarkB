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
//	@FXML
//	private Button myTestButton;
	@FXML
	private VBox infoContainer;
	@FXML
	private Label titleLabel = new Label("");
	@FXML
	private Label infoLabel = new Label("");
	
	@FXML
	void updICClear() {
		infoContainer.getChildren().clear();
		titleLabel.setText("The IAS Computer\n\n");
		infoLabel.setText("Click a button to learn about its functions");
		titleLabel.getStyleClass().add("title-label");
		infoLabel.getStyleClass().add("general-label");
		infoContainer.getChildren().addAll(titleLabel, infoLabel);
	}
	@FXML
	public void initialize() {
		updICClear();
	}

    @FXML
    void handleButtonAction() {
    	titleLabel.setText("Accumulator Register\n\n");
    	infoLabel.setText("Temporarily holds operands and results from ALU operations. The"
				+ " most significant 40 bits are stored here.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction1() {
    	titleLabel.setText("Multiplier Quotient Register\n\n");
    	infoLabel.setText("Works alongside the AC. Holds the multiplier during"
				+ " multiplication, and the quotient during division. Holds the least"
				+ " significant of the 40 bits.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction2() {
    	titleLabel.setText("Arithmatic Logic Circuits\n\n");
    	infoLabel.setText("Circuitry inside the ALU that performs calculations."
				+ " Executes arithmetic functions (add, subtract, multiply, divide) as well as logic"
				+ " (AND, OR, NOT, XOR) operations. These circuits work with registers (AC, MQ, MBR) to "
				+ "process data and store results.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }

        @FXML
        void handleButtonAction3() {
        	titleLabel.setText("Memory Buffer Register\n\n");
        	infoLabel.setText("Temporarily holds instructions for data transferred between ALU and main memory."
    				+ " Holds instructions/data fetched from memory before processing, and stores "
    				+ " results before writing back to memory.");
    		infoContainer.getChildren().clear(); 
    		infoContainer.getChildren().add(titleLabel);
    		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction4() {
    	titleLabel.setText("Input/Output (I/O)\n\n");
    	infoLabel.setText("Handles communication between the IAS computer and external devices.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction5() {
    	titleLabel.setText("Main Memory\n\n");
    	infoLabel.setText("Stores both data and instructions. (Basis of Von Neumann Architecture)."
				+ " Acts as the central storage unit from which the CPU");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction6() {
    	titleLabel.setText("Program Counter\n\n");
    	infoLabel.setText("Holds/Keeps track of the next instruction to be executed. "
				+ "Keeps track of where the program is in memory. "
				+ "After each instruction of a program, it updates to point to the next instruction in sequence.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction7() {
    	titleLabel.setText("Memory Address Register\n\n");
    	infoLabel.setText("Stores the memory address where data or an instruction is located. "
    			+ "Works alongside the PC to fetch instructions from memory. "
    			+ "It is also used to hold addresses when reading/writing data to memory");  		
    	infoContainer.getChildren().clear(); 
    	infoContainer.getChildren().add(titleLabel);
    	infoContainer.getChildren().add(infoLabel);
    }

    @FXML
    void handleButtonAction8() {
    	titleLabel.setText("Instruction Buffer Register\n\n");
    	infoLabel.setText("Stores the second instruction (Bits 20-39) from a 40-bit word"
				+ " retrieved from the MBR. When the IR finishes executing the first instruction, the IBR"
				+ " sends its stored instruction to the IR for execution.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction9() {
    	titleLabel.setText("Control Circuits\n\n");
    	infoLabel.setText("Acts as the 'brain' of the CPU. Coordinates flow between registers, I/O and "
				+ "main memory.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }
    @FXML
    void handleButtonAction10() {
    	titleLabel.setText("Instruction Register\n\n");
    	infoLabel.setText("Retrieves and stores the first instruction (Bits 0-19) from a 40-bit word retrieved from the MBR. "
				+ "The IR holds the current instruction being executed.");
		infoContainer.getChildren().clear(); 
		infoContainer.getChildren().add(titleLabel);
		infoContainer.getChildren().add(infoLabel);
    }

}

