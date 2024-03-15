package com.dershines.BaGu;

import com.dershines.BaGu.QA.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

public class Controller implements Initializable {

    @FXML
    private TabPane funcPane;

    private int No;

    public BaGuKnowledge baGuKnowledge;

    public JavaFundament javaFundament;

    public CommonFrameworks commonFrameworks;

    public List<BaGuKnowledge> list;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //初始化各个章节的问题
        javaFundament = new JavaFundament();
        commonFrameworks = new CommonFrameworks();

        //baGuKnowledge = javaFundament;
        list = new ArrayList<>();
        list.add(javaFundament);
        list.add(commonFrameworks);
        baGuKnowledge = commonFrameworks;
    }

    public void createQuestionTab(ActionEvent event) throws Exception {
        //获取随机数
        No = (int)(Math.random() * baGuKnowledge.getQuestionNum());
        Tab tab = util.createQuestion(baGuKnowledge, No);
        funcPane.getTabs().add(tab);
    }

    public void createAnswerTab(ActionEvent event) throws Exception {
        util.createAnswerOnBrowser(baGuKnowledge, No);
        //funcPane.getTabs().add(tab);
    }

    public void createChooseTab(ActionEvent event) throws Exception {
        Tab tab = util.createChapterChoose(list, this);
        funcPane.getTabs().add(tab);
    }

    public void createAboutDeveloperTab(ActionEvent event) throws IOException {
        AnchorPane aboutDeveloperTav = (AnchorPane) FXMLLoader.load(getClass().getResource("AboutDeveloper.fxml"));
        Tab tab = util.createNewTab("关于作者");
        tab.setContent(aboutDeveloperTav);
        funcPane.getTabs().add(tab);
    }

    public void chooseChapter(String name) {
        for (BaGuKnowledge ba : list) {
            if (ba.getName().equals(name)) {
                baGuKnowledge = ba;
            }
        }
    }

}
