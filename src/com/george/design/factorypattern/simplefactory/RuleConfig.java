package com.george.design.factorypattern.simplefactory;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 20:39
 */
public class RuleConfig {
    //version 1
    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = createParser(ruleConfigFileExtension);
        if (null == parser) {
            throw new IllegalArgumentException("不支持该类型的文件解析");
        }
        String configText = "";
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }


    public RuleConfig load1(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);
        String configText = "";
        RuleConfig config = parser.parse(configText);
        return config;
    }

    private String getFileExtension(String ruleConfigFilePath) {
        //解析文件后缀名

        return "json";
    }


    private IRuleConfigParser createParser(String ruleCOnfigFileExtension) {
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(ruleCOnfigFileExtension)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(ruleCOnfigFileExtension)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(ruleCOnfigFileExtension)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(ruleCOnfigFileExtension)) {
            parser = new PropertiesRuleConfigParser();
        } else {
            throw new IllegalArgumentException("不支持该类型的文件解析");
        }
        return parser;
    }
}