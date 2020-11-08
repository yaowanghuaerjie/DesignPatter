package com.george.design.factorypattern.simplefactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 21:22
 */
public class RuleConfigParserFactory {
    private static final Map<String, IRuleConfigParser> cacheParsers = new HashMap<>();

    static {
        cacheParsers.put("json", new JsonRuleConfigParser());
        cacheParsers.put("xml", new XmlRuleConfigParser());
        cacheParsers.put("yaml", new YamlRuleConfigParser());
        cacheParsers.put("properties", new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (null == configFormat || configFormat.isEmpty()) {
            return null;
        }
        IRuleConfigParser parser = cacheParsers.get(configFormat);
        return parser;
    }
}