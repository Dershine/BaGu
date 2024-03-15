package com.dershines.BaGu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene scene = new Scene(root);

        //设置窗口标题
        primaryStage.setTitle("八股问答");

        //设置窗口图标
        Image icon = new Image(Main.class.getResource("icon.jpg").toExternalForm());
        primaryStage.getIcons().add(icon);

        //设置窗口大小不可调整
        primaryStage.setResizable(false);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
