package com.dershines.BaGu.QA;

import java.util.ArrayList;
import java.util.List;

public class CommonFrameworks implements BaGuKnowledge{

    private int QuestionNum = 77;

    private String name = "常用框架";

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

    public CommonFrameworks() {

        String Q1 = "什么是 Spring 框架?";
        String A1 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E4%BB%80%E4%B9%88%E6%98%AF-spring-%E6%A1%86%E6%9E%B6";
        Q.add(Q1);
        A.add(A1);

        String Q2 = "Spring 包含的模块有哪些？";
        String A2 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-%E5%8C%85%E5%90%AB%E7%9A%84%E6%A8%A1%E5%9D%97%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q2);
        A.add(A2);

        String Q3 = "Spring,Spring MVC,Spring Boot 之间什么关系?";
        String A3 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-spring-mvc-spring-boot-%E4%B9%8B%E9%97%B4%E4%BB%80%E4%B9%88%E5%85%B3%E7%B3%BB";
        Q.add(Q3);
        A.add(A3);

        String Q4 = "谈谈自己对于 Spring IoC 的了解";
        String A4 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E8%B0%88%E8%B0%88%E8%87%AA%E5%B7%B1%E5%AF%B9%E4%BA%8E-spring-ioc-%E7%9A%84%E4%BA%86%E8%A7%A3";
        Q.add(Q4);
        A.add(A4);

        String Q5 = "什么是 Spring Bean？";
        String A5 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E4%BB%80%E4%B9%88%E6%98%AF-spring-bean";
        Q.add(Q5);
        A.add(A5);

        String Q6 = "将一个类声明为 Bean 的注解有哪些?";
        String A6 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%B0%86%E4%B8%80%E4%B8%AA%E7%B1%BB%E5%A3%B0%E6%98%8E%E4%B8%BA-bean-%E7%9A%84%E6%B3%A8%E8%A7%A3%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q6);
        A.add(A6);

        String Q7 = "@Component 和 @Bean 的区别是什么？";
        String A7 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#component-%E5%92%8C-bean-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q7);
        A.add(A7);

        String Q8 = "注入 Bean 的注解有哪些？";
        String A8 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E6%B3%A8%E5%85%A5-bean-%E7%9A%84%E6%B3%A8%E8%A7%A3%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q8);
        A.add(A8);

        String Q9 = "@Autowired 和 @Resource 的区别是什么？";
        String A9 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#autowired-%E5%92%8C-resource-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q9);
        A.add(A9);

        String Q10 = "Bean 的作用域有哪些?";
        String A10 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#bean-%E7%9A%84%E4%BD%9C%E7%94%A8%E5%9F%9F%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q10);
        A.add(A10);

        String Q11 = "Bean 是线程安全的吗？";
        String A11 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#bean-%E6%98%AF%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8%E7%9A%84%E5%90%97";
        Q.add(Q11);
        A.add(A11);

        String Q12 = "Bean 的生命周期了解么?";
        String A12 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#bean-%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q12);
        A.add(A12);

        String Q13 = "谈谈自己对于 AOP 的了解";
        String A13 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E8%B0%88%E8%B0%88%E8%87%AA%E5%B7%B1%E5%AF%B9%E4%BA%8E-aop-%E7%9A%84%E4%BA%86%E8%A7%A3";
        Q.add(Q13);
        A.add(A13);

        String Q14 = "Spring AOP 和 AspectJ AOP 有什么区别？";
        String A14 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-aop-%E5%92%8C-aspectj-aop-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q14);
        A.add(A14);

        String Q15 = "AspectJ 定义的通知类型有哪些？";
        String A15 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#aspectj-%E5%AE%9A%E4%B9%89%E7%9A%84%E9%80%9A%E7%9F%A5%E7%B1%BB%E5%9E%8B%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q15);
        A.add(A15);

        String Q16 = "多个切面的执行顺序如何控制？";
        String A16 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%A4%9A%E4%B8%AA%E5%88%87%E9%9D%A2%E7%9A%84%E6%89%A7%E8%A1%8C%E9%A1%BA%E5%BA%8F%E5%A6%82%E4%BD%95%E6%8E%A7%E5%88%B6";
        Q.add(Q16);
        A.add(A16);

        String Q17 = "说说自己对于 Spring MVC 了解?";
        String A17 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E8%AF%B4%E8%AF%B4%E8%87%AA%E5%B7%B1%E5%AF%B9%E4%BA%8E-spring-mvc-%E4%BA%86%E8%A7%A3";
        Q.add(Q17);
        A.add(A17);

        String Q18 = "Spring MVC 的核心组件有哪些？";
        String A18 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-mvc-%E7%9A%84%E6%A0%B8%E5%BF%83%E7%BB%84%E4%BB%B6%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q18);
        A.add(A18);

        String Q19 = "SpringMVC 工作原理了解吗?";
        String A19 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#springmvc-%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E4%BA%86%E8%A7%A3%E5%90%97";
        Q.add(Q19);
        A.add(A19);

        String Q20 = "统一异常处理怎么做？";
        String A20 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E7%BB%9F%E4%B8%80%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E6%80%8E%E4%B9%88%E5%81%9A";
        Q.add(Q20);
        A.add(A20);

        String Q21 = "Spring 框架中用到了哪些设计模式？";
        String A21 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-%E6%A1%86%E6%9E%B6%E4%B8%AD%E7%94%A8%E5%88%B0%E4%BA%86%E5%93%AA%E4%BA%9B%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F";
        Q.add(Q21);
        A.add(A21);

        String Q22 = "Spring 管理事务的方式有几种？";
        String A22 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-%E7%AE%A1%E7%90%86%E4%BA%8B%E5%8A%A1%E7%9A%84%E6%96%B9%E5%BC%8F%E6%9C%89%E5%87%A0%E7%A7%8D";
        Q.add(Q22);
        A.add(A22);

        String Q23 = "Spring 事务中哪几种事务传播行为?";
        String A23 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-%E4%BA%8B%E5%8A%A1%E4%B8%AD%E5%93%AA%E5%87%A0%E7%A7%8D%E4%BA%8B%E5%8A%A1%E4%BC%A0%E6%92%AD%E8%A1%8C%E4%B8%BA";
        Q.add(Q23);
        A.add(A23);

        String Q24 = "Spring 事务中的隔离级别有哪几种?";
        String A24 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#spring-%E4%BA%8B%E5%8A%A1%E4%B8%AD%E7%9A%84%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D";
        Q.add(Q24);
        A.add(A24);

        String Q25 = "@Transactional(rollbackFor = Exception.class)注解了解吗？";
        String A25 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#transactional-rollbackfor-exception-class-%E6%B3%A8%E8%A7%A3%E4%BA%86%E8%A7%A3%E5%90%97";
        Q.add(Q25);
        A.add(A25);

        String Q26 = "如何使用 JPA 在数据库中非持久化一个字段？";
        String A26 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-jpa-%E5%9C%A8%E6%95%B0%E6%8D%AE%E5%BA%93%E4%B8%AD%E9%9D%9E%E6%8C%81%E4%B9%85%E5%8C%96%E4%B8%80%E4%B8%AA%E5%AD%97%E6%AE%B5";
        Q.add(Q26);
        A.add(A26);

        String Q27 = "JPA 的审计功能是做什么的？有什么用？";
        String A27 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#jpa-%E7%9A%84%E5%AE%A1%E8%AE%A1%E5%8A%9F%E8%83%BD%E6%98%AF%E5%81%9A%E4%BB%80%E4%B9%88%E7%9A%84-%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8";
        Q.add(Q27);
        A.add(A27);

        String Q28 = "实体之间的关联关系注解有哪些？";
        String A28 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%AE%9E%E4%BD%93%E4%B9%8B%E9%97%B4%E7%9A%84%E5%85%B3%E8%81%94%E5%85%B3%E7%B3%BB%E6%B3%A8%E8%A7%A3%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q28);
        A.add(A28);

        String Q29 = "有哪些控制请求访问权限的方法？";
        String A29 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E6%9C%89%E5%93%AA%E4%BA%9B%E6%8E%A7%E5%88%B6%E8%AF%B7%E6%B1%82%E8%AE%BF%E9%97%AE%E6%9D%83%E9%99%90%E7%9A%84%E6%96%B9%E6%B3%95";
        Q.add(Q29);
        A.add(A29);

        String Q30 = "hasRole 和 hasAuthority 有区别吗？";
        String A30 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#hasrole-%E5%92%8C-hasauthority-%E6%9C%89%E5%8C%BA%E5%88%AB%E5%90%97";
        Q.add(Q30);
        A.add(A30);

        String Q31 = "如何对密码进行加密？";
        String A31 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%A6%82%E4%BD%95%E5%AF%B9%E5%AF%86%E7%A0%81%E8%BF%9B%E8%A1%8C%E5%8A%A0%E5%AF%86";
        Q.add(Q31);
        A.add(A31);

        String Q32 = "如何优雅更换系统使用的加密算法？";
        String A32 = "https://javaguide.cn/system-design/framework/spring/spring-knowledge-and-questions-summary.html#%E5%A6%82%E4%BD%95%E4%BC%98%E9%9B%85%E6%9B%B4%E6%8D%A2%E7%B3%BB%E7%BB%9F%E4%BD%BF%E7%94%A8%E7%9A%84%E5%8A%A0%E5%AF%86%E7%AE%97%E6%B3%95";
        Q.add(Q32);
        A.add(A32);

        String Q33 = "什么是 IoC?";
        String A33 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#%E4%BB%80%E4%B9%88%E6%98%AF-ioc";
        Q.add(Q33);
        A.add(A33);

        String Q34 = "IoC 解决了什么问题?";
        String A34 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#ioc-%E8%A7%A3%E5%86%B3%E4%BA%86%E4%BB%80%E4%B9%88%E9%97%AE%E9%A2%98";
        Q.add(Q34);
        A.add(A34);

        String Q35 = "IoC 和 DI 有区别吗？";
        String A35 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#ioc-%E5%92%8C-di-%E6%9C%89%E5%8C%BA%E5%88%AB%E5%90%97";
        Q.add(Q35);
        A.add(A35);

        String Q36 = "什么是 AOP？";
        String A36 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#%E4%BB%80%E4%B9%88%E6%98%AF-aop";
        Q.add(Q36);
        A.add(A36);

        String Q37 = "AOP 为什么叫面向切面编程？";
        String A37 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#aop-%E4%B8%BA%E4%BB%80%E4%B9%88%E5%8F%AB%E9%9D%A2%E5%90%91%E5%88%87%E9%9D%A2%E7%BC%96%E7%A8%8B";
        Q.add(Q37);
        A.add(A37);

        String Q38 = "AOP 解决了什么问题？";
        String A38 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#aop-%E8%A7%A3%E5%86%B3%E4%BA%86%E4%BB%80%E4%B9%88%E9%97%AE%E9%A2%98";
        Q.add(Q38);
        A.add(A38);

        String Q39 = "AOP 的应用场景有哪些？";
        String A39 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#aop-%E7%9A%84%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q39);
        A.add(A39);

        String Q40 = "AOP 实现方式有哪些？";
        String A40 = "https://javaguide.cn/system-design/framework/spring/ioc-and-aop.html#aop-%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F%E6%9C%89%E5%93%AA%E4%BA%9B";
        Q.add(Q40);
        A.add(A40);

        String Q41 = "什么是事务？";
        String A41 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1";
        Q.add(Q41);
        A.add(A41);

        String Q42 = "事务的特性（ACID）了解么?";
        String A42 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#%E4%BA%8B%E5%8A%A1%E7%9A%84%E7%89%B9%E6%80%A7-acid-%E4%BA%86%E8%A7%A3%E4%B9%88";
        Q.add(Q42);
        A.add(A42);

        String Q43 = "Spring 支持两种方式的事务管理";
        String A43 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#spring-%E6%94%AF%E6%8C%81%E4%B8%A4%E7%A7%8D%E6%96%B9%E5%BC%8F%E7%9A%84%E4%BA%8B%E5%8A%A1%E7%AE%A1%E7%90%86";
        Q.add(Q43);
        A.add(A43);

        String Q44 = "Spring 事务管理接口介绍";
        String A44 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#spring-%E4%BA%8B%E5%8A%A1%E7%AE%A1%E7%90%86%E6%8E%A5%E5%8F%A3%E4%BB%8B%E7%BB%8D";
        Q.add(Q44);
        A.add(A44);

        String Q45 = "事务属性详解";
        String A45 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#%E4%BA%8B%E5%8A%A1%E5%B1%9E%E6%80%A7%E8%AF%A6%E8%A7%A3";
        Q.add(Q45);
        A.add(A45);

        String Q46 = "@Transactional 注解使用详解";
        String A46 = "https://javaguide.cn/system-design/framework/spring/spring-transaction.html#transactional-%E6%B3%A8%E8%A7%A3%E4%BD%BF%E7%94%A8%E8%AF%A6%E8%A7%A3";
        Q.add(Q46);
        A.add(A46);

        String Q47 = "控制反转(IoC)和依赖注入(DI)";
        String A47 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E6%8E%A7%E5%88%B6%E5%8F%8D%E8%BD%AC-ioc-%E5%92%8C%E4%BE%9D%E8%B5%96%E6%B3%A8%E5%85%A5-di";
        Q.add(Q47);
        A.add(A47);

        String Q48 = "工厂设计模式";
        String A48 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E5%B7%A5%E5%8E%82%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F";
        Q.add(Q48);
        A.add(A48);

        String Q49 = "单例设计模式";
        String A49 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E5%8D%95%E4%BE%8B%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F";
        Q.add(Q49);
        A.add(A49);

        String Q50 = "代理设计模式";
        String A50 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E4%BB%A3%E7%90%86%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F";
        Q.add(Q50);
        A.add(A50);

        String Q51 = "Spring AOP 和 AspectJ AOP 有什么区别?";
        String A51 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#spring-aop-%E5%92%8C-aspectj-aop-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB";
        Q.add(Q51);
        A.add(A51);

        String Q52 = "模板方法";
        String A52 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95";
        Q.add(Q52);
        A.add(A52);

        String Q53 = "观察者模式";
        String A53 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F";
        Q.add(Q53);
        A.add(A53);

        String Q54 = "Spring 事件驱动模型中的三种角色";
        String A54 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#spring-%E4%BA%8B%E4%BB%B6%E9%A9%B1%E5%8A%A8%E6%A8%A1%E5%9E%8B%E4%B8%AD%E7%9A%84%E4%B8%89%E7%A7%8D%E8%A7%92%E8%89%B2";
        Q.add(Q54);
        A.add(A54);

        String Q55 = "Spring 的事件流程总结";
        String A55 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#spring-%E7%9A%84%E4%BA%8B%E4%BB%B6%E6%B5%81%E7%A8%8B%E6%80%BB%E7%BB%93";
        Q.add(Q55);
        A.add(A55);

        String Q56 = "Spring AOP 中的适配器模式";
        String A56 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#spring-aop-%E4%B8%AD%E7%9A%84%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F";
        Q.add(Q56);
        A.add(A56);

        String Q57 = "Spring MVC 中的适配器模式";
        String A57 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#spring-mvc-%E4%B8%AD%E7%9A%84%E9%80%82%E9%85%8D%E5%99%A8%E6%A8%A1%E5%BC%8F";
        Q.add(Q57);
        A.add(A57);

        String Q58 = "装饰者模式";
        String A58 = "https://javaguide.cn/system-design/framework/spring/spring-design-patterns-summary.html#%E8%A3%85%E9%A5%B0%E8%80%85%E6%A8%A1%E5%BC%8F";
        Q.add(Q58);
        A.add(A58);

        String Q59 = "什么是 SpringBoot 自动装配？";
        String A59 = "https://javaguide.cn/system-design/framework/spring/spring-boot-auto-assembly-principles.html#%E4%BB%80%E4%B9%88%E6%98%AF-springboot-%E8%87%AA%E5%8A%A8%E8%A3%85%E9%85%8D";
        Q.add(Q59);
        A.add(A59);

        String Q60 = "SpringBoot 是如何实现自动装配的";
        String A60 = "https://javaguide.cn/system-design/framework/spring/spring-boot-auto-assembly-principles.html#springboot-%E6%98%AF%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E8%87%AA%E5%8A%A8%E8%A3%85%E9%85%8D%E7%9A%84";
        Q.add(Q60);
        A.add(A60);

        String Q61 = "如何实现一个 Starter";
        String A61 = "https://javaguide.cn/system-design/framework/spring/spring-boot-auto-assembly-principles.html#%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E4%B8%80%E4%B8%AA-starter";
        Q.add(Q61);
        A.add(A61);

        String Q62 = "#{} 和 ${} 的区别是什么？";
        String A62 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#%E5%92%8C-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q62);
        A.add(A62);

        String Q63 = "xml 映射文件中，除了常见的 select、insert、update、delete 标签之外，还有哪些标签？";
        String A63 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#xml-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD-%E9%99%A4%E4%BA%86%E5%B8%B8%E8%A7%81%E7%9A%84-select%E3%80%81insert%E3%80%81update%E3%80%81delete-%E6%A0%87%E7%AD%BE%E4%B9%8B%E5%A4%96-%E8%BF%98%E6%9C%89%E5%93%AA%E4%BA%9B%E6%A0%87%E7%AD%BE";
        Q.add(Q63);
        A.add(A63);

        String Q64 = "Dao 接口的工作原理是什么？Dao 接口里的方法，参数不同时，方法能重载吗？";
        String A64 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#dao-%E6%8E%A5%E5%8F%A3%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88-dao-%E6%8E%A5%E5%8F%A3%E9%87%8C%E7%9A%84%E6%96%B9%E6%B3%95-%E5%8F%82%E6%95%B0%E4%B8%8D%E5%90%8C%E6%97%B6-%E6%96%B9%E6%B3%95%E8%83%BD%E9%87%8D%E8%BD%BD%E5%90%97";
        Q.add(Q64);
        A.add(A64);

        String Q65 = "MyBatis 是如何进行分页的？分页插件的原理是什么？";
        String A65 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%98%AF%E5%A6%82%E4%BD%95%E8%BF%9B%E8%A1%8C%E5%88%86%E9%A1%B5%E7%9A%84-%E5%88%86%E9%A1%B5%E6%8F%92%E4%BB%B6%E7%9A%84%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q65);
        A.add(A65);

        String Q66 = "简述 MyBatis 的插件运行原理，以及如何编写一个插件";
        String A66 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#%E7%AE%80%E8%BF%B0-mybatis-%E7%9A%84%E6%8F%92%E4%BB%B6%E8%BF%90%E8%A1%8C%E5%8E%9F%E7%90%86-%E4%BB%A5%E5%8F%8A%E5%A6%82%E4%BD%95%E7%BC%96%E5%86%99%E4%B8%80%E4%B8%AA%E6%8F%92%E4%BB%B6";
        Q.add(Q66);
        A.add(A66);

        String Q67 = "MyBatis 执行批量插入，能返回数据库主键列表吗？";
        String A67 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%89%A7%E8%A1%8C%E6%89%B9%E9%87%8F%E6%8F%92%E5%85%A5-%E8%83%BD%E8%BF%94%E5%9B%9E%E6%95%B0%E6%8D%AE%E5%BA%93%E4%B8%BB%E9%94%AE%E5%88%97%E8%A1%A8%E5%90%97";
        Q.add(Q67);
        A.add(A67);

        String Q68 = "MyBatis 动态 sql 是做什么的？都有哪些动态 sql？能简述一下动态 sql 的执行原理不？";
        String A68 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E5%8A%A8%E6%80%81-sql-%E6%98%AF%E5%81%9A%E4%BB%80%E4%B9%88%E7%9A%84-%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8A%A8%E6%80%81-sql-%E8%83%BD%E7%AE%80%E8%BF%B0%E4%B8%80%E4%B8%8B%E5%8A%A8%E6%80%81-sql-%E7%9A%84%E6%89%A7%E8%A1%8C%E5%8E%9F%E7%90%86%E4%B8%8D";
        Q.add(Q68);
        A.add(A68);

        String Q69 = "MyBatis 是如何将 sql 执行结果封装为目标对象并返回的？都有哪些映射形式？";
        String A69 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%98%AF%E5%A6%82%E4%BD%95%E5%B0%86-sql-%E6%89%A7%E8%A1%8C%E7%BB%93%E6%9E%9C%E5%B0%81%E8%A3%85%E4%B8%BA%E7%9B%AE%E6%A0%87%E5%AF%B9%E8%B1%A1%E5%B9%B6%E8%BF%94%E5%9B%9E%E7%9A%84-%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E6%98%A0%E5%B0%84%E5%BD%A2%E5%BC%8F";
        Q.add(Q69);
        A.add(A69);

        String Q70 = "MyBatis 能执行一对一、一对多的关联查询吗？都有哪些实现方式，以及它们之间的区别";
        String A70 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E8%83%BD%E6%89%A7%E8%A1%8C%E4%B8%80%E5%AF%B9%E4%B8%80%E3%80%81%E4%B8%80%E5%AF%B9%E5%A4%9A%E7%9A%84%E5%85%B3%E8%81%94%E6%9F%A5%E8%AF%A2%E5%90%97-%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F-%E4%BB%A5%E5%8F%8A%E5%AE%83%E4%BB%AC%E4%B9%8B%E9%97%B4%E7%9A%84%E5%8C%BA%E5%88%AB";
        Q.add(Q70);
        A.add(A70);

        String Q71 = "MyBatis 是否支持延迟加载？如果支持，它的实现原理是什么？";
        String A71 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%98%AF%E5%90%A6%E6%94%AF%E6%8C%81%E5%BB%B6%E8%BF%9F%E5%8A%A0%E8%BD%BD-%E5%A6%82%E6%9E%9C%E6%94%AF%E6%8C%81-%E5%AE%83%E7%9A%84%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q71);
        A.add(A71);

        String Q72 = "MyBatis 的 xml 映射文件中，不同的 xml 映射文件，id 是否可以重复？";
        String A72 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E7%9A%84-xml-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD-%E4%B8%8D%E5%90%8C%E7%9A%84-xml-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6-id-%E6%98%AF%E5%90%A6%E5%8F%AF%E4%BB%A5%E9%87%8D%E5%A4%8D";
        Q.add(Q72);
        A.add(A72);

        String Q73 = "MyBatis 中如何执行批处理？";
        String A73 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E4%B8%AD%E5%A6%82%E4%BD%95%E6%89%A7%E8%A1%8C%E6%89%B9%E5%A4%84%E7%90%86";
        Q.add(Q73);
        A.add(A73);

        String Q74 = "MyBatis 都有哪些 Executor 执行器？它们之间的区别是什么？";
        String A74 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B-executor-%E6%89%A7%E8%A1%8C%E5%99%A8-%E5%AE%83%E4%BB%AC%E4%B9%8B%E9%97%B4%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88";
        Q.add(Q74);
        A.add(A74);

        String Q75 = "MyBatis 中如何指定使用哪一种 Executor 执行器？";
        String A75 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E4%B8%AD%E5%A6%82%E4%BD%95%E6%8C%87%E5%AE%9A%E4%BD%BF%E7%94%A8%E5%93%AA%E4%B8%80%E7%A7%8D-executor-%E6%89%A7%E8%A1%8C%E5%99%A8";
        Q.add(Q75);
        A.add(A75);

        String Q76 = "MyBatis 是否可以映射 Enum 枚举类？";
        String A76 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%98%AF%E5%90%A6%E5%8F%AF%E4%BB%A5%E6%98%A0%E5%B0%84-enum-%E6%9E%9A%E4%B8%BE%E7%B1%BB";
        Q.add(Q76);
        A.add(A76);

        String Q77 = "MyBatis 映射文件中，如果 A 标签通过 include 引用了 B 标签的内容，请问，B 标签能否定义在 A 标签的后面，还是说必须定义在 A 标签的前面？";
        String A77 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#mybatis-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD-%E5%A6%82%E6%9E%9C-a-%E6%A0%87%E7%AD%BE%E9%80%9A%E8%BF%87-include-%E5%BC%95%E7%94%A8%E4%BA%86-b-%E6%A0%87%E7%AD%BE%E7%9A%84%E5%86%85%E5%AE%B9-%E8%AF%B7%E9%97%AE-b-%E6%A0%87%E7%AD%BE%E8%83%BD%E5%90%A6%E5%AE%9A%E4%B9%89%E5%9C%A8-a-%E6%A0%87%E7%AD%BE%E7%9A%84%E5%90%8E%E9%9D%A2-%E8%BF%98%E6%98%AF%E8%AF%B4%E5%BF%85%E9%A1%BB%E5%AE%9A%E4%B9%89%E5%9C%A8-a-%E6%A0%87%E7%AD%BE%E7%9A%84%E5%89%8D%E9%9D%A2";
        Q.add(Q77);
        A.add(A77);

        String Q78 = "简述 MyBatis 的 xml 映射文件和 MyBatis 内部数据结构之间的映射关系？";
        String A78 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#%E7%AE%80%E8%BF%B0-mybatis-%E7%9A%84-xml-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E5%92%8C-mybatis-%E5%86%85%E9%83%A8%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B9%8B%E9%97%B4%E7%9A%84%E6%98%A0%E5%B0%84%E5%85%B3%E7%B3%BB";
        Q.add(Q78);
        A.add(A78);

        String Q79 = "为什么说 MyBatis 是半自动 ORM 映射工具？它与全自动的区别在哪里？";
        String A79 = "https://javaguide.cn/system-design/framework/mybatis/mybatis-interview.html#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%AF%B4-mybatis-%E6%98%AF%E5%8D%8A%E8%87%AA%E5%8A%A8-orm-%E6%98%A0%E5%B0%84%E5%B7%A5%E5%85%B7-%E5%AE%83%E4%B8%8E%E5%85%A8%E8%87%AA%E5%8A%A8%E7%9A%84%E5%8C%BA%E5%88%AB%E5%9C%A8%E5%93%AA%E9%87%8C";
        Q.add(Q79);
        A.add(A79);

        String Q80 = "";
        String A80 = "";
        Q.add(Q80);
        A.add(A80);

    }

}
