package com.george.design.factorypattern.factorymethod;


/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 21:55
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory{

    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}