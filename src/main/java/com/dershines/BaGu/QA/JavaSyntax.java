package com.dershines.BaGu.QA;

import java.util.ArrayList;
import java.util.List;

public class JavaSyntax implements BaGuKnowledge{

    private int QuestionNum = 5;

    private String name = "Java基本语法";

    private List<String> Q = new ArrayList<>();
    private List<String> A = new ArrayList<>();

    @Override
    public int getQuestionNum() {
        return QuestionNum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getQ(int n) {
        return Q.get(n);
    }

    @Override
    public String getA(int n) {
        return A.get(n);
    }

    public JavaSyntax() {
        String Q1 = "注释有哪几种形式？";
        String A1 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E6%B3%A8%E9%87%8A%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E5%BD%A2%E5%BC%8F";
        Q.add(Q1);
        A.add(A1);

        String Q2 = "标识符和关键字的区别是什么？";
        String A2 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E6%A0%87%E8%AF%86%E7%AC%A6%E5%92%8C%E5%85%B3%E9%94%AE%E5%AD%97%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q2);
        A.add(A2);

        String Q3 = "Java 语言关键字有哪些？";
        String A3 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#java-%E8%AF%AD%E8%A8%80%E5%85%B3%E9%94%AE%E5%AD%97%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q3);
        A.add(A3);

        String Q4 = "自增自减运算符";
        String A4 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E8%87%AA%E5%A2%9E%E8%87%AA%E5%87%8F%E8%BF%90%E7%AE%97%E7%AC%A6";
        Q.add(Q4);
        A.add(A4);

        String Q5 = "移位运算符";
        String A5 = "https://javaguide.cn/java/basis/java-basic-questions-01.html#%E7%A7%BB%E4%BD%8D%E8%BF%90%E7%AE%97%E7%AC%A6";
        Q.add(Q5);
        A.add(A5);
    }
}
