package com.dershines.BaGu;

import com.dershines.BaGu.QA.BaGuKnowledge;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldTreeCell;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.util.StringConverter;

import java.io.IOException;
import java.util.List;

public class util {


    //创建新的选项卡
    public static Tab createNewTab(String TabName){
        Tab tab = new Tab(TabName);
        HBox hBox = new HBox();
        hBox.setAlignment(Pos.CENTER);
        //背景类(颜色,圆角,内边距)
        Background background1 = new Background(new BackgroundFill(Paint.valueOf("#3c3c3c"),new CornerRadii(15.0),new Insets(8)));
        hBox.setBackground(background1);
        hBox.setPadding(new Insets(20));
//        hBox.getChildren().addAll(new Button("button1"),new Button("button2"));

        tab.setContent(hBox);
        return tab;
    }

    public static Tab createQuestion(BaGuKnowledge baGuKnowledge, int No) throws Exception{
        Tab tab = createNewTab(baGuKnowledge.getName());

        //容器
        HBox hbox;
        hbox = (HBox) tab.getContent();
        //VBox vbox;
        //vbox = (VBox) tab.getContent();

        //获取随机数
        //int QNo = (int) Math.random() * baGuKnowledge.getQuestionNum();

        //获取问题
        String Question = baGuKnowledge.getQ(No);

        //文本
        Label label = new Label();
        label.setText(Question);
        label.setTextFill(Color.WHITE);
        label.setFont(new Font(24));
        label.setWrapText(true);

        //按钮
        //Button button = new Button();
        //button.setPrefWidth(217);
        //button.setPrefHeight(62);
        //button.setStyle("-fx-background-color: #3c3c3c; -fx-border-color: #ffffff; -fx-border-radius: 10px; -fx-background-radius: 10px;");
        //button.setText("显示答案");
        //button.setTextFill(Color.WHITE);

        //滚动面板
        //ScrollPane sc = new ScrollPane();
        //sc.setContent(label);

        //容器替换
        //hbox.getChildren().add(label);
        //tab.setContent(hbox);
        hbox.getChildren().add(label);
        tab.setContent(hbox);

        return tab;
    }

    public static void createAnswerOnBrowser(BaGuKnowledge baGuKnowledge, int No) throws Exception{
        //Tab tab = createNewTab(baGuKnowledge.getName());

        //容器
        //HBox hbox;
        //hbox = (HBox) tab.getContent();

        //获取答案
        String Answer = baGuKnowledge.getA(No);
        //System.out.println(Answer);
        //browseProcess(Answer);
        browseRuntime(Answer);

        //文本
        //Label label = new Label();
        //label.setText(Question);
        //label.setWrapText(true);

        //页面
        //WebView web = new WebView();
        //WebEngine engine = web.getEngine();
        //web.setPrefSize(800, 600);
        //engine.load(Answer);

        //滚动面板
        //ScrollPane sc = new ScrollPane();
        //sc.setContent(label);

        //容器替换
        //hbox.getChildren().add(web);
        //tab.setContent(hbox);

        //return tab;
    }

    public static Tab createAnswer(BaGuKnowledge baGuKnowledge, int No) throws Exception{
        Tab tab = createNewTab(baGuKnowledge.getName());

        //容器
        HBox hbox;
        hbox = (HBox) tab.getContent();

        //获取答案
        String Answer = baGuKnowledge.getA(No);
        //System.out.println(Answer);
        //browseProcess(Answer);
        //browseRuntime(Answer);

        //文本
        //Label label = new Label();
        //label.setText(Question);
        //label.setWrapText(true);

        //页面
        WebView web = new WebView();
        WebEngine engine = web.getEngine();
        //web.setPrefSize(800, 600);
        engine.load(Answer);

        //滚动面板
        //ScrollPane sc = new ScrollPane();
        //sc.setContent(label);

        //容器替换
        hbox.getChildren().add(web);
        tab.setContent(hbox);

        return tab;
    }

    private static void browseProcess(String url) {
        String[] cmd = { "cmd", "/c", "start", url };
        ProcessBuilder processBuilder = new ProcessBuilder(cmd);
        try {
            processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void browseRuntime(String url) {
        try {
            Runtime.getRuntime().exec("cmd   /c   start   " + url);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static Tab createChapterChoose(List<BaGuKnowledge> baGuKnowledges, Controller controller) throws Exception{
        Tab tab = createNewTab("章节选择");

        //容器
        HBox hbox;
        hbox = (HBox) tab.getContent();

        //树
        TreeView<String> treeView = new TreeView<String>();
        treeView.setPrefHeight(400);
        treeView.setPrefWidth(600);
        TreeItem<String> root = new TreeItem<>("章节选择");
        for (BaGuKnowledge ba : baGuKnowledges) {
            TreeItem<String> ti = new TreeItem<>(ba.getName());
            root.getChildren().add(ti);
        }
        treeView.setRoot(root);

        treeView.setCellFactory(TextFieldTreeCell.forTreeView(new StringConverter<String>() {
            @Override
            public String toString(String object) {
                return object;
            }

            @Override
            public String fromString(String string) {
                return null;
            }

        }));

        treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<String>>() {
            @Override
            public void changed(ObservableValue<? extends TreeItem<String>> observable, TreeItem<String> oldValue, TreeItem<String> newValue) {
                //如果路径栏非空，则载入路径
                if (!newValue.getValue().equals("")) {
                    controller.chooseChapter(newValue.getValue());
                }
            }
        });

        //容器替换
        hbox.getChildren().add(treeView);
        tab.setContent(hbox);

        return tab;
    }


}
