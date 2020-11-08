package com.george.design.factorypattern.factorymethod;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 22:13
 */
public class XmlRuleConfigParseFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}