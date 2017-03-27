package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Main extends Application {
	private int OkCounter = 0;
	private static String[] ply1Dis = new String[7];
	private static String[] ply2Dis = new String[7];
	private static String[][] gameField = new String[15][15];
	private static boolean[][] gameFieldStat = new boolean[15][15];
	private static List<String> previousWords = new ArrayList<String>();
	@FXML
	private Label lblName, lblPly1, lblPly2, lblPly1Mrk, lblPly2Mrk, lblPlyDis, lblPlyDis1, lblPlyDis2, lblPlyDis3,
			lblPlyDis4, lblPlyDis5, lblPlyDis6;
	@FXML
	private Button btnStart, btnCheck, btnOk;
	@FXML
	private TextField fldInput, fldInput1, fldInput2, fldInput3, fldInput4, fldInput5, fldInput6, fldInput7, fldInput8,
			fldInput9, fldInput10, fldInput11, fldInput12, fldInput13, fldInput14, fldInput15, fldInput16, fldInput17,
			fldInput18, fldInput19, fldInput20, fldInput21, fldInput22, fldInput23, fldInput24, fldInput25, fldInput26,
			fldInput27, fldInput28, fldInput29, fldInput30, fldInput31, fldInput32, fldInput33, fldInput34, fldInput35,
			fldInput36, fldInput37, fldInput38, fldInput39, fldInput40, fldInput41, fldInput42, fldInput43, fldInput44,
			fldInput45, fldInput46, fldInput47, fldInput48, fldInput49, fldInput50, fldInput51, fldInput52, fldInput53,
			fldInput54, fldInput55, fldInput56, fldInput57, fldInput58, fldInput59, fldInput60, fldInput61, fldInput62,
			fldInput63, fldInput64, fldInput65, fldInput66, fldInput67, fldInput68, fldInput69, fldInput70, fldInput71,
			fldInput72, fldInput73, fldInput74, fldInput75, fldInput76, fldInput77, fldInput78, fldInput79, fldInput80,
			fldInput81, fldInput82, fldInput83, fldInput84, fldInput85, fldInput86, fldInput87, fldInput88, fldInput89,
			fldInput90, fldInput91, fldInput92, fldInput93, fldInput94, fldInput95, fldInput96, fldInput97, fldInput98,
			fldInput99, fldInput100, fldInput101, fldInput102, fldInput103, fldInput104, fldInput105, fldInput106,
			fldInput107, fldInput108, fldInput109, fldInput110, fldInput111, fldInput112, fldInput113, fldInput114,
			fldInput115, fldInput116, fldInput117, fldInput118, fldInput119, fldInput120, fldInput121, fldInput122,
			fldInput123, fldInput124, fldInput125, fldInput126, fldInput127, fldInput128, fldInput129, fldInput130,
			fldInput131, fldInput132, fldInput133, fldInput134, fldInput135, fldInput136, fldInput137, fldInput138,
			fldInput139, fldInput140, fldInput141, fldInput142, fldInput143, fldInput144, fldInput145, fldInput146,
			fldInput147, fldInput148, fldInput149, fldInput150, fldInput151, fldInput152, fldInput153, fldInput154,
			fldInput155, fldInput156, fldInput157, fldInput158, fldInput159, fldInput160, fldInput161, fldInput162,
			fldInput163, fldInput164, fldInput165, fldInput166, fldInput167, fldInput168, fldInput169, fldInput170,
			fldInput171, fldInput172, fldInput173, fldInput174, fldInput175, fldInput176, fldInput177, fldInput178,
			fldInput179, fldInput180, fldInput181, fldInput182, fldInput183, fldInput184, fldInput185, fldInput186,
			fldInput187, fldInput188, fldInput189, fldInput190, fldInput191, fldInput192, fldInput193, fldInput194,
			fldInput195, fldInput196, fldInput197, fldInput198, fldInput199, fldInput200, fldInput201, fldInput202,
			fldInput203, fldInput204, fldInput205, fldInput206, fldInput207, fldInput208, fldInput209, fldInput210,
			fldInput211, fldInput212, fldInput213, fldInput214, fldInput215, fldInput216, fldInput217, fldInput218,
			fldInput219, fldInput220, fldInput221, fldInput222, fldInput223, fldInput224;

	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/Window.fxml"));

			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("ScrabbleBubble");
			primaryStage.setResizable(false);
			primaryStage.setMaximized(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void NewPlayer(ActionEvent process) throws Exception {

		lblName.setOpacity(0);
		lblPly1.setOpacity(1);
		lblPly2.setOpacity(1);
		btnStart.setOpacity(0);
		btnStart.setDisable(true);
		btnOk.setOpacity(1);
		btnOk.setDisable(false);
		btnCheck.setOpacity(1);
		btnCheck.setDisable(false);
		for (int x = 0; x <= 6; x++) {
			ply1Dis[x] = "";
		}
		for (int x = 0; x <= 6; x++) {
			ply2Dis[x] = "";
		}
		GeneratePlayer1Random obj1 = new GeneratePlayer1Random();
		ply1Dis = obj1.randomGen(ply1Dis);
		lblPlyDis.setText(ply1Dis[0]);
		lblPlyDis1.setText(ply1Dis[1]);
		lblPlyDis2.setText(ply1Dis[2]);
		lblPlyDis3.setText(ply1Dis[3]);
		lblPlyDis4.setText(ply1Dis[4]);
		lblPlyDis5.setText(ply1Dis[5]);
		lblPlyDis6.setText(ply1Dis[6]);
	}

	public void ok(ActionEvent process) throws Exception {

		List<String> words = new ArrayList<String>();
		List<String> wordschecked = new ArrayList<String>();
		// saving text field to an array to make it eassy to handle.
		System.out.println(fldInput.isEditable());
		gameFieldStat[0][0] = fldInput.isEditable();
		gameFieldStat[0][1] = fldInput1.isEditable();
		gameFieldStat[0][2] = fldInput2.isEditable();
		gameFieldStat[0][3] = fldInput3.isEditable();
		gameFieldStat[0][4] = fldInput4.isEditable();
		gameFieldStat[0][5] = fldInput5.isEditable();
		gameFieldStat[0][6] = fldInput6.isEditable();
		gameFieldStat[0][7] = fldInput7.isEditable();
		gameFieldStat[0][8] = fldInput8.isEditable();
		gameFieldStat[0][9] = fldInput9.isEditable();
		gameFieldStat[0][10] = fldInput10.isEditable();
		gameFieldStat[0][11] = fldInput11.isEditable();
		gameFieldStat[0][12] = fldInput12.isEditable();
		gameFieldStat[0][13] = fldInput13.isEditable();
		gameFieldStat[0][14] = fldInput14.isEditable();
		gameFieldStat[1][0] = fldInput15.isEditable();
		gameFieldStat[1][1] = fldInput16.isEditable();
		gameFieldStat[1][2] = fldInput17.isEditable();
		gameFieldStat[1][3] = fldInput18.isEditable();
		gameFieldStat[1][4] = fldInput19.isEditable();
		gameFieldStat[1][5] = fldInput20.isEditable();
		gameFieldStat[1][6] = fldInput21.isEditable();
		gameFieldStat[1][7] = fldInput22.isEditable();
		gameFieldStat[1][8] = fldInput23.isEditable();
		gameFieldStat[1][9] = fldInput24.isEditable();
		gameFieldStat[1][10] = fldInput25.isEditable();
		gameFieldStat[1][11] = fldInput26.isEditable();
		gameFieldStat[1][12] = fldInput27.isEditable();
		gameFieldStat[1][13] = fldInput28.isEditable();
		gameFieldStat[1][14] = fldInput29.isEditable();
		gameFieldStat[2][0] = fldInput30.isEditable();
		gameFieldStat[2][1] = fldInput31.isEditable();
		gameFieldStat[2][2] = fldInput32.isEditable();
		gameFieldStat[2][3] = fldInput33.isEditable();
		gameFieldStat[2][4] = fldInput34.isEditable();
		gameFieldStat[2][5] = fldInput35.isEditable();
		gameFieldStat[2][6] = fldInput36.isEditable();
		gameFieldStat[2][7] = fldInput37.isEditable();
		gameFieldStat[2][8] = fldInput38.isEditable();
		gameFieldStat[2][9] = fldInput39.isEditable();
		gameFieldStat[2][10] = fldInput40.isEditable();
		gameFieldStat[2][11] = fldInput41.isEditable();
		gameFieldStat[2][12] = fldInput42.isEditable();
		gameFieldStat[2][13] = fldInput43.isEditable();
		gameFieldStat[2][14] = fldInput44.isEditable();
		gameFieldStat[3][0] = fldInput45.isEditable();
		gameFieldStat[3][1] = fldInput46.isEditable();
		gameFieldStat[3][2] = fldInput47.isEditable();
		gameFieldStat[3][3] = fldInput48.isEditable();
		gameFieldStat[3][4] = fldInput49.isEditable();
		gameFieldStat[3][5] = fldInput50.isEditable();
		gameFieldStat[3][6] = fldInput51.isEditable();
		gameFieldStat[3][7] = fldInput52.isEditable();
		gameFieldStat[3][8] = fldInput53.isEditable();
		gameFieldStat[3][9] = fldInput54.isEditable();
		gameFieldStat[3][10] = fldInput55.isEditable();
		gameFieldStat[3][11] = fldInput56.isEditable();
		gameFieldStat[3][12] = fldInput57.isEditable();
		gameFieldStat[3][13] = fldInput58.isEditable();
		gameFieldStat[3][14] = fldInput59.isEditable();
		gameFieldStat[4][0] = fldInput60.isEditable();
		gameFieldStat[4][1] = fldInput61.isEditable();
		gameFieldStat[4][2] = fldInput62.isEditable();
		gameFieldStat[4][3] = fldInput63.isEditable();
		gameFieldStat[4][4] = fldInput64.isEditable();
		gameFieldStat[4][5] = fldInput65.isEditable();
		gameFieldStat[4][6] = fldInput66.isEditable();
		gameFieldStat[4][7] = fldInput67.isEditable();
		gameFieldStat[4][8] = fldInput68.isEditable();
		gameFieldStat[4][9] = fldInput69.isEditable();
		gameFieldStat[4][10] = fldInput70.isEditable();
		gameFieldStat[4][11] = fldInput71.isEditable();
		gameFieldStat[4][12] = fldInput72.isEditable();
		gameFieldStat[4][13] = fldInput73.isEditable();
		gameFieldStat[4][14] = fldInput74.isEditable();
		gameFieldStat[5][0] = fldInput75.isEditable();
		gameFieldStat[5][1] = fldInput76.isEditable();
		gameFieldStat[5][2] = fldInput77.isEditable();
		gameFieldStat[5][3] = fldInput78.isEditable();
		gameFieldStat[5][4] = fldInput79.isEditable();
		gameFieldStat[5][5] = fldInput80.isEditable();
		gameFieldStat[5][6] = fldInput81.isEditable();
		gameFieldStat[5][7] = fldInput82.isEditable();
		gameFieldStat[5][8] = fldInput83.isEditable();
		gameFieldStat[5][9] = fldInput84.isEditable();
		gameFieldStat[5][10] = fldInput85.isEditable();
		gameFieldStat[5][11] = fldInput86.isEditable();
		gameFieldStat[5][12] = fldInput87.isEditable();
		gameFieldStat[5][13] = fldInput88.isEditable();
		gameFieldStat[5][14] = fldInput89.isEditable();
		gameFieldStat[6][0] = fldInput90.isEditable();
		gameFieldStat[6][1] = fldInput91.isEditable();
		gameFieldStat[6][2] = fldInput92.isEditable();
		gameFieldStat[6][3] = fldInput93.isEditable();
		gameFieldStat[6][4] = fldInput94.isEditable();
		gameFieldStat[6][5] = fldInput95.isEditable();
		gameFieldStat[6][6] = fldInput96.isEditable();
		gameFieldStat[6][7] = fldInput97.isEditable();
		gameFieldStat[6][8] = fldInput98.isEditable();
		gameFieldStat[6][9] = fldInput99.isEditable();
		gameFieldStat[6][10] = fldInput100.isEditable();
		gameFieldStat[6][11] = fldInput101.isEditable();
		gameFieldStat[6][12] = fldInput102.isEditable();
		gameFieldStat[6][13] = fldInput103.isEditable();
		gameFieldStat[6][14] = fldInput104.isEditable();
		gameFieldStat[7][0] = fldInput105.isEditable();
		gameFieldStat[7][1] = fldInput106.isEditable();
		gameFieldStat[7][2] = fldInput107.isEditable();
		gameFieldStat[7][3] = fldInput108.isEditable();
		gameFieldStat[7][4] = fldInput109.isEditable();
		gameFieldStat[7][5] = fldInput110.isEditable();
		gameFieldStat[7][6] = fldInput111.isEditable();
		gameFieldStat[7][7] = fldInput112.isEditable();
		gameFieldStat[7][8] = fldInput113.isEditable();
		gameFieldStat[7][9] = fldInput114.isEditable();
		gameFieldStat[7][10] = fldInput115.isEditable();
		gameFieldStat[7][11] = fldInput116.isEditable();
		gameFieldStat[7][12] = fldInput117.isEditable();
		gameFieldStat[7][13] = fldInput118.isEditable();
		gameFieldStat[7][14] = fldInput119.isEditable();
		gameFieldStat[8][0] = fldInput120.isEditable();
		gameFieldStat[8][1] = fldInput121.isEditable();
		gameFieldStat[8][2] = fldInput122.isEditable();
		gameFieldStat[8][3] = fldInput123.isEditable();
		gameFieldStat[8][4] = fldInput124.isEditable();
		gameFieldStat[8][5] = fldInput125.isEditable();
		gameFieldStat[8][6] = fldInput126.isEditable();
		gameFieldStat[8][7] = fldInput127.isEditable();
		gameFieldStat[8][8] = fldInput128.isEditable();
		gameFieldStat[8][9] = fldInput129.isEditable();
		gameFieldStat[8][10] = fldInput130.isEditable();
		gameFieldStat[8][11] = fldInput131.isEditable();
		gameFieldStat[8][12] = fldInput132.isEditable();
		gameFieldStat[8][13] = fldInput133.isEditable();
		gameFieldStat[8][14] = fldInput134.isEditable();
		gameFieldStat[9][0] = fldInput135.isEditable();
		gameFieldStat[9][1] = fldInput136.isEditable();
		gameFieldStat[9][2] = fldInput137.isEditable();
		gameFieldStat[9][3] = fldInput138.isEditable();
		gameFieldStat[9][4] = fldInput139.isEditable();
		gameFieldStat[9][5] = fldInput140.isEditable();
		gameFieldStat[9][6] = fldInput141.isEditable();
		gameFieldStat[9][7] = fldInput142.isEditable();
		gameFieldStat[9][8] = fldInput143.isEditable();
		gameFieldStat[9][9] = fldInput144.isEditable();
		gameFieldStat[9][10] = fldInput145.isEditable();
		gameFieldStat[9][11] = fldInput146.isEditable();
		gameFieldStat[9][12] = fldInput147.isEditable();
		gameFieldStat[9][13] = fldInput148.isEditable();
		gameFieldStat[9][14] = fldInput149.isEditable();
		gameFieldStat[10][0] = fldInput150.isEditable();
		gameFieldStat[10][1] = fldInput151.isEditable();
		gameFieldStat[10][2] = fldInput152.isEditable();
		gameFieldStat[10][3] = fldInput153.isEditable();
		gameFieldStat[10][4] = fldInput154.isEditable();
		gameFieldStat[10][5] = fldInput155.isEditable();
		gameFieldStat[10][6] = fldInput156.isEditable();
		gameFieldStat[10][7] = fldInput157.isEditable();
		gameFieldStat[10][8] = fldInput158.isEditable();
		gameFieldStat[10][9] = fldInput159.isEditable();
		gameFieldStat[10][10] = fldInput160.isEditable();
		gameFieldStat[10][11] = fldInput161.isEditable();
		gameFieldStat[10][12] = fldInput162.isEditable();
		gameFieldStat[10][13] = fldInput163.isEditable();
		gameFieldStat[10][14] = fldInput164.isEditable();
		gameFieldStat[11][0] = fldInput165.isEditable();
		gameFieldStat[11][1] = fldInput166.isEditable();
		gameFieldStat[11][2] = fldInput167.isEditable();
		gameFieldStat[11][3] = fldInput168.isEditable();
		gameFieldStat[11][4] = fldInput169.isEditable();
		gameFieldStat[11][5] = fldInput170.isEditable();
		gameFieldStat[11][6] = fldInput171.isEditable();
		gameFieldStat[11][7] = fldInput172.isEditable();
		gameFieldStat[11][8] = fldInput173.isEditable();
		gameFieldStat[11][9] = fldInput174.isEditable();
		gameFieldStat[11][10] = fldInput175.isEditable();
		gameFieldStat[11][11] = fldInput176.isEditable();
		gameFieldStat[11][12] = fldInput177.isEditable();
		gameFieldStat[11][13] = fldInput178.isEditable();
		gameFieldStat[11][14] = fldInput179.isEditable();
		gameFieldStat[12][0] = fldInput180.isEditable();
		gameFieldStat[12][1] = fldInput181.isEditable();
		gameFieldStat[12][2] = fldInput182.isEditable();
		gameFieldStat[12][3] = fldInput183.isEditable();
		gameFieldStat[12][4] = fldInput184.isEditable();
		gameFieldStat[12][5] = fldInput185.isEditable();
		gameFieldStat[12][6] = fldInput186.isEditable();
		gameFieldStat[12][7] = fldInput187.isEditable();
		gameFieldStat[12][8] = fldInput188.isEditable();
		gameFieldStat[12][9] = fldInput189.isEditable();
		gameFieldStat[12][10] = fldInput190.isEditable();
		gameFieldStat[12][11] = fldInput191.isEditable();
		gameFieldStat[12][12] = fldInput192.isEditable();
		gameFieldStat[12][13] = fldInput193.isEditable();
		gameFieldStat[12][14] = fldInput194.isEditable();
		gameFieldStat[13][0] = fldInput195.isEditable();
		gameFieldStat[13][1] = fldInput196.isEditable();
		gameFieldStat[13][2] = fldInput197.isEditable();
		gameFieldStat[13][3] = fldInput198.isEditable();
		gameFieldStat[13][4] = fldInput199.isEditable();
		gameFieldStat[13][5] = fldInput200.isEditable();
		gameFieldStat[13][6] = fldInput201.isEditable();
		gameFieldStat[13][7] = fldInput202.isEditable();
		gameFieldStat[13][8] = fldInput203.isEditable();
		gameFieldStat[13][9] = fldInput204.isEditable();
		gameFieldStat[13][10] = fldInput205.isEditable();
		gameFieldStat[13][11] = fldInput206.isEditable();
		gameFieldStat[13][12] = fldInput207.isEditable();
		gameFieldStat[13][13] = fldInput208.isEditable();
		gameFieldStat[13][14] = fldInput209.isEditable();
		gameFieldStat[14][0] = fldInput210.isEditable();
		gameFieldStat[14][1] = fldInput211.isEditable();
		gameFieldStat[14][2] = fldInput212.isEditable();
		gameFieldStat[14][3] = fldInput213.isEditable();
		gameFieldStat[14][4] = fldInput214.isEditable();
		gameFieldStat[14][5] = fldInput215.isEditable();
		gameFieldStat[14][6] = fldInput216.isEditable();
		gameFieldStat[14][7] = fldInput217.isEditable();
		gameFieldStat[14][8] = fldInput218.isEditable();
		gameFieldStat[14][9] = fldInput219.isEditable();
		gameFieldStat[14][10] = fldInput220.isEditable();
		gameFieldStat[14][11] = fldInput221.isEditable();
		gameFieldStat[14][12] = fldInput222.isEditable();
		gameFieldStat[14][13] = fldInput223.isEditable();
		gameFieldStat[14][14] = fldInput224.isEditable();

		gameField[0][0] = fldInput.getText();
		gameField[0][1] = fldInput1.getText();
		gameField[0][2] = fldInput2.getText();
		gameField[0][3] = fldInput3.getText();
		gameField[0][4] = fldInput4.getText();
		gameField[0][5] = fldInput5.getText();
		gameField[0][6] = fldInput6.getText();
		gameField[0][7] = fldInput7.getText();
		gameField[0][8] = fldInput8.getText();
		gameField[0][9] = fldInput9.getText();
		gameField[0][10] = fldInput10.getText();
		gameField[0][11] = fldInput11.getText();
		gameField[0][12] = fldInput12.getText();
		gameField[0][13] = fldInput13.getText();
		gameField[0][14] = fldInput14.getText();
		gameField[1][0] = fldInput15.getText();
		gameField[1][1] = fldInput16.getText();
		gameField[1][2] = fldInput17.getText();
		gameField[1][3] = fldInput18.getText();
		gameField[1][4] = fldInput19.getText();
		gameField[1][5] = fldInput20.getText();
		gameField[1][6] = fldInput21.getText();
		gameField[1][7] = fldInput22.getText();
		gameField[1][8] = fldInput23.getText();
		gameField[1][9] = fldInput24.getText();
		gameField[1][10] = fldInput25.getText();
		gameField[1][11] = fldInput26.getText();
		gameField[1][12] = fldInput27.getText();
		gameField[1][13] = fldInput28.getText();
		gameField[1][14] = fldInput29.getText();
		gameField[2][0] = fldInput30.getText();
		gameField[2][1] = fldInput31.getText();
		gameField[2][2] = fldInput32.getText();
		gameField[2][3] = fldInput33.getText();
		gameField[2][4] = fldInput34.getText();
		gameField[2][5] = fldInput35.getText();
		gameField[2][6] = fldInput36.getText();
		gameField[2][7] = fldInput37.getText();
		gameField[2][8] = fldInput38.getText();
		gameField[2][9] = fldInput39.getText();
		gameField[2][10] = fldInput40.getText();
		gameField[2][11] = fldInput41.getText();
		gameField[2][12] = fldInput42.getText();
		gameField[2][13] = fldInput43.getText();
		gameField[2][14] = fldInput44.getText();
		gameField[3][0] = fldInput45.getText();
		gameField[3][1] = fldInput46.getText();
		gameField[3][2] = fldInput47.getText();
		gameField[3][3] = fldInput48.getText();
		gameField[3][4] = fldInput49.getText();
		gameField[3][5] = fldInput50.getText();
		gameField[3][6] = fldInput51.getText();
		gameField[3][7] = fldInput52.getText();
		gameField[3][8] = fldInput53.getText();
		gameField[3][9] = fldInput54.getText();
		gameField[3][10] = fldInput55.getText();
		gameField[3][11] = fldInput56.getText();
		gameField[3][12] = fldInput57.getText();
		gameField[3][13] = fldInput58.getText();
		gameField[3][14] = fldInput59.getText();
		gameField[4][0] = fldInput60.getText();
		gameField[4][1] = fldInput61.getText();
		gameField[4][2] = fldInput62.getText();
		gameField[4][3] = fldInput63.getText();
		gameField[4][4] = fldInput64.getText();
		gameField[4][5] = fldInput65.getText();
		gameField[4][6] = fldInput66.getText();
		gameField[4][7] = fldInput67.getText();
		gameField[4][8] = fldInput68.getText();
		gameField[4][9] = fldInput69.getText();
		gameField[4][10] = fldInput70.getText();
		gameField[4][11] = fldInput71.getText();
		gameField[4][12] = fldInput72.getText();
		gameField[4][13] = fldInput73.getText();
		gameField[4][14] = fldInput74.getText();
		gameField[5][0] = fldInput75.getText();
		gameField[5][1] = fldInput76.getText();
		gameField[5][2] = fldInput77.getText();
		gameField[5][3] = fldInput78.getText();
		gameField[5][4] = fldInput79.getText();
		gameField[5][5] = fldInput80.getText();
		gameField[5][6] = fldInput81.getText();
		gameField[5][7] = fldInput82.getText();
		gameField[5][8] = fldInput83.getText();
		gameField[5][9] = fldInput84.getText();
		gameField[5][10] = fldInput85.getText();
		gameField[5][11] = fldInput86.getText();
		gameField[5][12] = fldInput87.getText();
		gameField[5][13] = fldInput88.getText();
		gameField[5][14] = fldInput89.getText();
		gameField[6][0] = fldInput90.getText();
		gameField[6][1] = fldInput91.getText();
		gameField[6][2] = fldInput92.getText();
		gameField[6][3] = fldInput93.getText();
		gameField[6][4] = fldInput94.getText();
		gameField[6][5] = fldInput95.getText();
		gameField[6][6] = fldInput96.getText();
		gameField[6][7] = fldInput97.getText();
		gameField[6][8] = fldInput98.getText();
		gameField[6][9] = fldInput99.getText();
		gameField[6][10] = fldInput100.getText();
		gameField[6][11] = fldInput101.getText();
		gameField[6][12] = fldInput102.getText();
		gameField[6][13] = fldInput103.getText();
		gameField[6][14] = fldInput104.getText();
		gameField[7][0] = fldInput105.getText();
		gameField[7][1] = fldInput106.getText();
		gameField[7][2] = fldInput107.getText();
		gameField[7][3] = fldInput108.getText();
		gameField[7][4] = fldInput109.getText();
		gameField[7][5] = fldInput110.getText();
		gameField[7][6] = fldInput111.getText();
		gameField[7][7] = fldInput112.getText();
		gameField[7][8] = fldInput113.getText();
		gameField[7][9] = fldInput114.getText();
		gameField[7][10] = fldInput115.getText();
		gameField[7][11] = fldInput116.getText();
		gameField[7][12] = fldInput117.getText();
		gameField[7][13] = fldInput118.getText();
		gameField[7][14] = fldInput119.getText();
		gameField[8][0] = fldInput120.getText();
		gameField[8][1] = fldInput121.getText();
		gameField[8][2] = fldInput122.getText();
		gameField[8][3] = fldInput123.getText();
		gameField[8][4] = fldInput124.getText();
		gameField[8][5] = fldInput125.getText();
		gameField[8][6] = fldInput126.getText();
		gameField[8][7] = fldInput127.getText();
		gameField[8][8] = fldInput128.getText();
		gameField[8][9] = fldInput129.getText();
		gameField[8][10] = fldInput130.getText();
		gameField[8][11] = fldInput131.getText();
		gameField[8][12] = fldInput132.getText();
		gameField[8][13] = fldInput133.getText();
		gameField[8][14] = fldInput134.getText();
		gameField[9][0] = fldInput135.getText();
		gameField[9][1] = fldInput136.getText();
		gameField[9][2] = fldInput137.getText();
		gameField[9][3] = fldInput138.getText();
		gameField[9][4] = fldInput139.getText();
		gameField[9][5] = fldInput140.getText();
		gameField[9][6] = fldInput141.getText();
		gameField[9][7] = fldInput142.getText();
		gameField[9][8] = fldInput143.getText();
		gameField[9][9] = fldInput144.getText();
		gameField[9][10] = fldInput145.getText();
		gameField[9][11] = fldInput146.getText();
		gameField[9][12] = fldInput147.getText();
		gameField[9][13] = fldInput148.getText();
		gameField[9][14] = fldInput149.getText();
		gameField[10][0] = fldInput150.getText();
		gameField[10][1] = fldInput151.getText();
		gameField[10][2] = fldInput152.getText();
		gameField[10][3] = fldInput153.getText();
		gameField[10][4] = fldInput154.getText();
		gameField[10][5] = fldInput155.getText();
		gameField[10][6] = fldInput156.getText();
		gameField[10][7] = fldInput157.getText();
		gameField[10][8] = fldInput158.getText();
		gameField[10][9] = fldInput159.getText();
		gameField[10][10] = fldInput160.getText();
		gameField[10][11] = fldInput161.getText();
		gameField[10][12] = fldInput162.getText();
		gameField[10][13] = fldInput163.getText();
		gameField[10][14] = fldInput164.getText();
		gameField[11][0] = fldInput165.getText();
		gameField[11][1] = fldInput166.getText();
		gameField[11][2] = fldInput167.getText();
		gameField[11][3] = fldInput168.getText();
		gameField[11][4] = fldInput169.getText();
		gameField[11][5] = fldInput170.getText();
		gameField[11][6] = fldInput171.getText();
		gameField[11][7] = fldInput172.getText();
		gameField[11][8] = fldInput173.getText();
		gameField[11][9] = fldInput174.getText();
		gameField[11][10] = fldInput175.getText();
		gameField[11][11] = fldInput176.getText();
		gameField[11][12] = fldInput177.getText();
		gameField[11][13] = fldInput178.getText();
		gameField[11][14] = fldInput179.getText();
		gameField[12][0] = fldInput180.getText();
		gameField[12][1] = fldInput181.getText();
		gameField[12][2] = fldInput182.getText();
		gameField[12][3] = fldInput183.getText();
		gameField[12][4] = fldInput184.getText();
		gameField[12][5] = fldInput185.getText();
		gameField[12][6] = fldInput186.getText();
		gameField[12][7] = fldInput187.getText();
		gameField[12][8] = fldInput188.getText();
		gameField[12][9] = fldInput189.getText();
		gameField[12][10] = fldInput190.getText();
		gameField[12][11] = fldInput191.getText();
		gameField[12][12] = fldInput192.getText();
		gameField[12][13] = fldInput193.getText();
		gameField[12][14] = fldInput194.getText();
		gameField[13][0] = fldInput195.getText();
		gameField[13][1] = fldInput196.getText();
		gameField[13][2] = fldInput197.getText();
		gameField[13][3] = fldInput198.getText();
		gameField[13][4] = fldInput199.getText();
		gameField[13][5] = fldInput200.getText();
		gameField[13][6] = fldInput201.getText();
		gameField[13][7] = fldInput202.getText();
		gameField[13][8] = fldInput203.getText();
		gameField[13][9] = fldInput204.getText();
		gameField[13][10] = fldInput205.getText();
		gameField[13][11] = fldInput206.getText();
		gameField[13][12] = fldInput207.getText();
		gameField[13][13] = fldInput208.getText();
		gameField[13][14] = fldInput209.getText();
		gameField[14][0] = fldInput210.getText();
		gameField[14][1] = fldInput211.getText();
		gameField[14][2] = fldInput212.getText();
		gameField[14][3] = fldInput213.getText();
		gameField[14][4] = fldInput214.getText();
		gameField[14][5] = fldInput215.getText();
		gameField[14][6] = fldInput216.getText();
		gameField[14][7] = fldInput217.getText();
		gameField[14][8] = fldInput218.getText();
		gameField[14][9] = fldInput219.getText();
		gameField[14][10] = fldInput220.getText();
		gameField[14][11] = fldInput221.getText();
		gameField[14][12] = fldInput222.getText();
		gameField[14][13] = fldInput223.getText();
		gameField[14][14] = fldInput224.getText();

		Validate obj = new Validate();
		if (!obj.validateStringLength(gameField)) {
			return;
		}

		find obj1 = new find();
		words = obj1.letter(gameField, gameFieldStat);
		// System.out.println("-------------------");
		// for (String a : words) {
		// System.out.println(a);
		// }
		// System.out.println("=------");
		wordschecked = obj1.findNewWord(previousWords, words);
		// System.out.println("-------------------");
		// for (String a : previousWords) {
		// System.out.println(a);
		// }

		// if (wordschecked.size() > 1) {
		// Alert tries = new Alert(AlertType.ERROR);
		// tries.setTitle("Notification");
		// tries.setHeaderText("Invalid input");
		// tries.setContentText("Enter only one Word");
		// tries.showAndWait();
		// return;
		// }

		GeneratePlayer1Random obj2 = new GeneratePlayer1Random();
		if (wordschecked.size() > 0) {
			String newWord = wordschecked.get(0);
			System.out.println("new word  : " + newWord);
			if (OkCounter++ % 2 == 0) {
				if (!obj.validateUserLetters(newWord, ply1Dis)) {
					lock obj3 = new lock();
					gameFieldStat = obj3.lockField(gameField, gameFieldStat, newWord);
					ply2Dis = obj2.randomGen(ply2Dis);
					System.out.println("type - 1");
					lblPlyDis.setText(ply2Dis[0]);
					lblPlyDis1.setText(ply2Dis[1]);
					lblPlyDis2.setText(ply2Dis[2]);
					lblPlyDis3.setText(ply2Dis[3]);
					lblPlyDis4.setText(ply2Dis[4]);
					lblPlyDis5.setText(ply2Dis[5]);
					lblPlyDis6.setText(ply2Dis[6]);
					previousWords = words;
				} else {
					wordschecked.remove(0);
					OkCounter--;
				}
			} else {
				if (!obj.validateUserLetters(newWord, ply2Dis)) {
					ply1Dis = obj2.randomGen(ply1Dis);
					System.out.println("type 2");
					lblPlyDis.setText(ply1Dis[0]);
					lblPlyDis1.setText(ply1Dis[1]);
					lblPlyDis2.setText(ply1Dis[2]);
					lblPlyDis3.setText(ply1Dis[3]);
					lblPlyDis4.setText(ply1Dis[4]);
					lblPlyDis5.setText(ply1Dis[5]);
					lblPlyDis6.setText(ply1Dis[6]);

					previousWords = words;
				} else {

					OkCounter--;
				}
			}
		}
		fldInput.setEditable(gameFieldStat[0][0]);
		fldInput1.setEditable(gameFieldStat[0][1]);
		fldInput2.setEditable(gameFieldStat[0][2]);
		fldInput3.setEditable(gameFieldStat[0][3]);
		fldInput4.setEditable(gameFieldStat[0][4]);
		fldInput5.setEditable(gameFieldStat[0][5]);
		fldInput6.setEditable(gameFieldStat[0][6]);
		fldInput7.setEditable(gameFieldStat[0][7]);
		fldInput8.setEditable(gameFieldStat[0][8]);
		fldInput9.setEditable(gameFieldStat[0][9]);
		fldInput10.setEditable(gameFieldStat[0][10]);
		fldInput11.setEditable(gameFieldStat[0][11]);
		fldInput12.setEditable(gameFieldStat[0][12]);
		fldInput13.setEditable(gameFieldStat[0][13]);
		fldInput14.setEditable(gameFieldStat[0][14]);
		fldInput15.setEditable(gameFieldStat[1][0]);
		fldInput16.setEditable(gameFieldStat[1][1]);
		fldInput17.setEditable(gameFieldStat[1][2]);
		fldInput18.setEditable(gameFieldStat[1][3]);
		fldInput19.setEditable(gameFieldStat[1][4]);
		fldInput20.setEditable(gameFieldStat[1][5]);
		fldInput21.setEditable(gameFieldStat[1][6]);
		fldInput22.setEditable(gameFieldStat[1][7]);
		fldInput23.setEditable(gameFieldStat[1][8]);
		fldInput24.setEditable(gameFieldStat[1][9]);
		fldInput25.setEditable(gameFieldStat[1][10]);
		fldInput26.setEditable(gameFieldStat[1][11]);
		fldInput27.setEditable(gameFieldStat[1][12]);
		fldInput28.setEditable(gameFieldStat[1][13]);
		fldInput29.setEditable(gameFieldStat[1][14]);
		fldInput30.setEditable(gameFieldStat[2][0]);
		fldInput31.setEditable(gameFieldStat[2][1]);
		fldInput32.setEditable(gameFieldStat[2][2]);
		fldInput33.setEditable(gameFieldStat[2][3]);
		fldInput34.setEditable(gameFieldStat[2][4]);
		fldInput35.setEditable(gameFieldStat[2][5]);
		fldInput36.setEditable(gameFieldStat[2][6]);
		fldInput37.setEditable(gameFieldStat[2][7]);
		fldInput38.setEditable(gameFieldStat[2][8]);
		fldInput39.setEditable(gameFieldStat[2][9]);
		fldInput40.setEditable(gameFieldStat[2][10]);
		fldInput41.setEditable(gameFieldStat[2][11]);
		fldInput42.setEditable(gameFieldStat[2][12]);
		fldInput43.setEditable(gameFieldStat[2][13]);
		fldInput44.setEditable(gameFieldStat[2][14]);
		fldInput45.setEditable(gameFieldStat[3][0]);
		fldInput46.setEditable(gameFieldStat[3][1]);
		fldInput47.setEditable(gameFieldStat[3][2]);
		fldInput48.setEditable(gameFieldStat[3][3]);
		fldInput49.setEditable(gameFieldStat[3][4]);
		fldInput50.setEditable(gameFieldStat[3][5]);
		fldInput51.setEditable(gameFieldStat[3][6]);
		fldInput52.setEditable(gameFieldStat[3][7]);
		fldInput53.setEditable(gameFieldStat[3][8]);
		fldInput54.setEditable(gameFieldStat[3][9]);
		fldInput55.setEditable(gameFieldStat[3][10]);
		fldInput56.setEditable(gameFieldStat[3][11]);
		fldInput57.setEditable(gameFieldStat[3][12]);
		fldInput58.setEditable(gameFieldStat[3][13]);
		fldInput59.setEditable(gameFieldStat[3][14]);
		fldInput60.setEditable(gameFieldStat[4][0]);
		fldInput61.setEditable(gameFieldStat[4][1]);
		fldInput62.setEditable(gameFieldStat[4][2]);
		fldInput63.setEditable(gameFieldStat[4][3]);
		fldInput64.setEditable(gameFieldStat[4][4]);
		fldInput65.setEditable(gameFieldStat[4][5]);
		fldInput66.setEditable(gameFieldStat[4][6]);
		fldInput67.setEditable(gameFieldStat[4][7]);
		fldInput68.setEditable(gameFieldStat[4][8]);
		fldInput69.setEditable(gameFieldStat[4][9]);
		fldInput70.setEditable(gameFieldStat[4][10]);
		fldInput71.setEditable(gameFieldStat[4][11]);
		fldInput72.setEditable(gameFieldStat[4][12]);
		fldInput73.setEditable(gameFieldStat[4][13]);
		fldInput74.setEditable(gameFieldStat[4][14]);
		fldInput75.setEditable(gameFieldStat[5][0]);
		fldInput76.setEditable(gameFieldStat[5][1]);
		fldInput77.setEditable(gameFieldStat[5][2]);
		fldInput78.setEditable(gameFieldStat[5][3]);
		fldInput79.setEditable(gameFieldStat[5][4]);
		fldInput80.setEditable(gameFieldStat[5][5]);
		fldInput81.setEditable(gameFieldStat[5][6]);
		fldInput82.setEditable(gameFieldStat[5][7]);
		fldInput83.setEditable(gameFieldStat[5][8]);
		fldInput84.setEditable(gameFieldStat[5][9]);
		fldInput85.setEditable(gameFieldStat[5][10]);
		fldInput86.setEditable(gameFieldStat[5][11]);
		fldInput87.setEditable(gameFieldStat[5][12]);
		fldInput88.setEditable(gameFieldStat[5][13]);
		fldInput89.setEditable(gameFieldStat[5][14]);
		fldInput90.setEditable(gameFieldStat[6][0]);
		fldInput91.setEditable(gameFieldStat[6][1]);
		fldInput92.setEditable(gameFieldStat[6][2]);
		fldInput93.setEditable(gameFieldStat[6][3]);
		fldInput94.setEditable(gameFieldStat[6][4]);
		fldInput95.setEditable(gameFieldStat[6][5]);
		fldInput96.setEditable(gameFieldStat[6][6]);
		fldInput97.setEditable(gameFieldStat[6][7]);
		fldInput98.setEditable(gameFieldStat[6][8]);
		fldInput99.setEditable(gameFieldStat[6][9]);
		fldInput100.setEditable(gameFieldStat[6][10]);
		fldInput101.setEditable(gameFieldStat[6][11]);
		fldInput102.setEditable(gameFieldStat[6][12]);
		fldInput103.setEditable(gameFieldStat[6][13]);
		fldInput104.setEditable(gameFieldStat[6][14]);
		fldInput105.setEditable(gameFieldStat[7][0]);
		fldInput106.setEditable(gameFieldStat[7][1]);
		fldInput107.setEditable(gameFieldStat[7][2]);
		fldInput108.setEditable(gameFieldStat[7][3]);
		fldInput109.setEditable(gameFieldStat[7][4]);
		fldInput110.setEditable(gameFieldStat[7][5]);
		fldInput111.setEditable(gameFieldStat[7][6]);
		fldInput112.setEditable(gameFieldStat[7][7]);
		fldInput113.setEditable(gameFieldStat[7][8]);
		fldInput114.setEditable(gameFieldStat[7][9]);
		fldInput115.setEditable(gameFieldStat[7][10]);
		fldInput116.setEditable(gameFieldStat[7][11]);
		fldInput117.setEditable(gameFieldStat[7][12]);
		fldInput118.setEditable(gameFieldStat[7][13]);
		fldInput119.setEditable(gameFieldStat[7][14]);
		fldInput120.setEditable(gameFieldStat[8][0]);
		fldInput121.setEditable(gameFieldStat[8][1]);
		fldInput122.setEditable(gameFieldStat[8][2]);
		fldInput123.setEditable(gameFieldStat[8][3]);
		fldInput124.setEditable(gameFieldStat[8][4]);
		fldInput125.setEditable(gameFieldStat[8][5]);
		fldInput126.setEditable(gameFieldStat[8][6]);
		fldInput127.setEditable(gameFieldStat[8][7]);
		fldInput128.setEditable(gameFieldStat[8][8]);
		fldInput129.setEditable(gameFieldStat[8][9]);
		fldInput130.setEditable(gameFieldStat[8][10]);
		fldInput131.setEditable(gameFieldStat[8][11]);
		fldInput132.setEditable(gameFieldStat[8][12]);
		fldInput133.setEditable(gameFieldStat[8][13]);
		fldInput134.setEditable(gameFieldStat[8][14]);
		fldInput135.setEditable(gameFieldStat[9][0]);
		fldInput136.setEditable(gameFieldStat[9][1]);
		fldInput137.setEditable(gameFieldStat[9][2]);
		fldInput138.setEditable(gameFieldStat[9][3]);
		fldInput139.setEditable(gameFieldStat[9][4]);
		fldInput140.setEditable(gameFieldStat[9][5]);
		fldInput141.setEditable(gameFieldStat[9][6]);
		fldInput142.setEditable(gameFieldStat[9][7]);
		fldInput143.setEditable(gameFieldStat[9][8]);
		fldInput144.setEditable(gameFieldStat[9][9]);
		fldInput145.setEditable(gameFieldStat[9][10]);
		fldInput146.setEditable(gameFieldStat[9][11]);
		fldInput147.setEditable(gameFieldStat[9][12]);
		fldInput148.setEditable(gameFieldStat[9][13]);
		fldInput149.setEditable(gameFieldStat[9][14]);
		fldInput150.setEditable(gameFieldStat[10][0]);
		fldInput151.setEditable(gameFieldStat[10][1]);
		fldInput152.setEditable(gameFieldStat[10][2]);
		fldInput153.setEditable(gameFieldStat[10][3]);
		fldInput154.setEditable(gameFieldStat[10][4]);
		fldInput155.setEditable(gameFieldStat[10][5]);
		fldInput156.setEditable(gameFieldStat[10][6]);
		fldInput157.setEditable(gameFieldStat[10][7]);
		fldInput158.setEditable(gameFieldStat[10][8]);
		fldInput159.setEditable(gameFieldStat[10][9]);
		fldInput160.setEditable(gameFieldStat[10][10]);
		fldInput161.setEditable(gameFieldStat[10][11]);
		fldInput162.setEditable(gameFieldStat[10][12]);
		fldInput163.setEditable(gameFieldStat[10][13]);
		fldInput164.setEditable(gameFieldStat[10][14]);
		fldInput165.setEditable(gameFieldStat[11][0]);
		fldInput166.setEditable(gameFieldStat[11][1]);
		fldInput167.setEditable(gameFieldStat[11][2]);
		fldInput168.setEditable(gameFieldStat[11][3]);
		fldInput169.setEditable(gameFieldStat[11][4]);
		fldInput170.setEditable(gameFieldStat[11][5]);
		fldInput171.setEditable(gameFieldStat[11][6]);
		fldInput172.setEditable(gameFieldStat[11][7]);
		fldInput173.setEditable(gameFieldStat[11][8]);
		fldInput174.setEditable(gameFieldStat[11][9]);
		fldInput175.setEditable(gameFieldStat[11][10]);
		fldInput176.setEditable(gameFieldStat[11][11]);
		fldInput177.setEditable(gameFieldStat[11][12]);
		fldInput178.setEditable(gameFieldStat[11][13]);
		fldInput179.setEditable(gameFieldStat[11][14]);
		fldInput180.setEditable(gameFieldStat[12][0]);
		fldInput181.setEditable(gameFieldStat[12][1]);
		fldInput182.setEditable(gameFieldStat[12][2]);
		fldInput183.setEditable(gameFieldStat[12][3]);
		fldInput184.setEditable(gameFieldStat[12][4]);
		fldInput185.setEditable(gameFieldStat[12][5]);
		fldInput186.setEditable(gameFieldStat[12][6]);
		fldInput187.setEditable(gameFieldStat[12][7]);
		fldInput188.setEditable(gameFieldStat[12][8]);
		fldInput189.setEditable(gameFieldStat[12][9]);
		fldInput190.setEditable(gameFieldStat[12][10]);
		fldInput191.setEditable(gameFieldStat[12][11]);
		fldInput192.setEditable(gameFieldStat[12][12]);
		fldInput193.setEditable(gameFieldStat[12][13]);
		fldInput194.setEditable(gameFieldStat[12][14]);
		fldInput195.setEditable(gameFieldStat[13][0]);
		fldInput196.setEditable(gameFieldStat[13][1]);
		fldInput197.setEditable(gameFieldStat[13][2]);
		fldInput198.setEditable(gameFieldStat[13][3]);
		fldInput199.setEditable(gameFieldStat[13][4]);
		fldInput200.setEditable(gameFieldStat[13][5]);
		fldInput201.setEditable(gameFieldStat[13][6]);
		fldInput202.setEditable(gameFieldStat[13][7]);
		fldInput203.setEditable(gameFieldStat[13][8]);
		fldInput204.setEditable(gameFieldStat[13][9]);
		fldInput205.setEditable(gameFieldStat[13][10]);
		fldInput206.setEditable(gameFieldStat[13][11]);
		fldInput207.setEditable(gameFieldStat[13][12]);
		fldInput208.setEditable(gameFieldStat[13][13]);
		fldInput209.setEditable(gameFieldStat[13][14]);
		fldInput210.setEditable(gameFieldStat[14][0]);
		fldInput211.setEditable(gameFieldStat[14][1]);
		fldInput212.setEditable(gameFieldStat[14][2]);
		fldInput213.setEditable(gameFieldStat[14][3]);
		fldInput214.setEditable(gameFieldStat[14][4]);
		fldInput215.setEditable(gameFieldStat[14][5]);
		fldInput216.setEditable(gameFieldStat[14][6]);
		fldInput217.setEditable(gameFieldStat[14][7]);
		fldInput218.setEditable(gameFieldStat[14][8]);
		fldInput219.setEditable(gameFieldStat[14][9]);
		fldInput220.setEditable(gameFieldStat[14][10]);
		fldInput221.setEditable(gameFieldStat[14][11]);
		fldInput222.setEditable(gameFieldStat[14][12]);
		fldInput223.setEditable(gameFieldStat[14][13]);
		fldInput224.setEditable(gameFieldStat[14][14]);

	}

}
