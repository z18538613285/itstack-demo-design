package org.itstack.demo.design.test;

import org.itstack.demo.design.Context;
import org.itstack.demo.design.expression.Expression;
import org.itstack.demo.design.expression.impl.AdvanceExpression;
import org.itstack.demo.design.expression.impl.SimpleExpression;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test(){
            Context ctx = new Context();
            ctx.add(new SimpleExpression());
            ctx.add(new AdvanceExpression());
            ctx.add(new SimpleExpression());
            for (Expression eps : ctx.getList()) {
                eps.interpret(ctx);
            }
        }

}
