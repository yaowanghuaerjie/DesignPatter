package com.george.design.factorypattern.factorymethod;


/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 21:36
 */
public class RuleConfigSource {
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParserFactory parserFactory = RuleConfigParseFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (null == parserFactory) {
            throw new IllegalArgumentException("不支持该类型的文件解析");
        }
        IRuleConfigParser parser = parserFactory.createParser();
        String configText = "";
        RuleConfig config = parser.parser(configText);
        return config;
    }

    private String getFileExtension(String ruleConfigFilePath) {
        return null;
    }
}