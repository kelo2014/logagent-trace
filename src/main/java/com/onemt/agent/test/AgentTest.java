package com.onemt.agent.test;

import com.onemt.agent.annotation.TraceClass;
import com.onemt.agent.annotation.TraceMethod;

@TraceClass
public class AgentTest {

	@TraceMethod
    private void fun1(String a) throws Exception {
        System.out.println("this is fun 1.");
        Thread.sleep(500);
    }

    private void fun2(String a) throws Exception {
        System.out.println("this is fun 2.");
        Thread.sleep(500);
    }

    public static void main(String[] args) throws Exception {
        AgentTest test = new AgentTest();
        test.fun1("434324");
        test.fun2("2323");

    }
}
