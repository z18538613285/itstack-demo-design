package org.itstack.demo.design;

import org.itstack.demo.design.expression.Expression;

import java.util.ArrayList;
import java.util.List;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description Context
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class Context {

    private String content;
    private List<Expression> list = new ArrayList<>();
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
    public void add(Expression eps) {
        list.add(eps);
    }
    public List<Expression> getList() {
        return list;
    }
}
