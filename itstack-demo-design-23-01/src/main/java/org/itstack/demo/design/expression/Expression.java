package org.itstack.demo.design.expression;

import org.itstack.demo.design.Context;

/**
 * @author binghe(微信 : hacker_binghe)
 * @version 1.0.0
 * @description AbstractExpression
 * @github https://github.com/binghe001
 * @copyright 公众号: 冰河技术
 */
public abstract class Expression {
    public abstract void interpret(Context ctx);
}
