package com.george.design.factorypattern.factorymethod;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-08 21:41
 */
public interface IRuleConfigParser {
    RuleConfig parser(String configText);
}