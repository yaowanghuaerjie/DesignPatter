package com.george.design.factorypattern.factorymethod;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 22:18
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}