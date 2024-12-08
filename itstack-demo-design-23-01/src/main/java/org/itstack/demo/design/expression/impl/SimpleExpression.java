package org.itstack.demo.design.expression.impl;

import org.itstack.demo.design.Context;
import org.itstack.demo.design.expression.Expression;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description Expression
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public class SimpleExpression extends Expression {
    @Override
    public void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}
