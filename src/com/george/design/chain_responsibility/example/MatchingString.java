package com.george.design.chain_responsibility.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingString {
    private static SensitiveWordNode sensitiveWordNode;

    public static void main(String[] args) {
        List<String> sensitiveWordServiceList = new ArrayList<>();
        sensitiveWordServiceList.add("敏感词");
        sensitiveWordServiceList.add("工作");
        sensitiveWordNode = convertToSensitiveNode(sensitiveWordServiceList);
        boolean isSensitiveWord = containSensitiveWords("哈哈");
    }
    private static SensitiveWordNode convertToSensitiveNode(List<String> wordList) {
        SensitiveWordNode root = new SensitiveWordNode();
        wordList.forEach(word -> {
            SensitiveWordNode tempNode = root;
            for (int i = 0; i < word.length(); i++) {
                Character c = word.charAt(i);
                SensitiveWordNode node = tempNode.getNextNode(c);
                if (node == null) {
                    node = new SensitiveWordNode();
                    tempNode.addNextNode(c, node);
                }
                tempNode = node;

                if (i == word.length() - 1) {
                    tempNode.setEndFlag(true);
                }
            }
        });
        return root;
    }

    public static boolean containSensitiveWords(String word) {
        SensitiveWordNode tempNode = sensitiveWordNode;
        int begin = 0;
        int position = 0;
        int sensitiveWordLength = 0;
        int sensitiveWordLocation = 0;
        boolean flag = false;
        while (position < word.length()) {
            Character c = word.charAt(position);
            tempNode = tempNode.getNextNode(c);
            if (tempNode == null) {
                begin++;
                position = begin;
                tempNode = sensitiveWordNode;
                sensitiveWordLength = 0;
                continue;
            } else if (tempNode.isLastCharacter() || tempNode.isEndFlag()) {
                flag = true;
                sensitiveWordLocation = position;
                position++;
                begin = position;
                tempNode = sensitiveWordNode;
            } else {
                sensitiveWordLength++;
                position++;
            }
        }
        if (flag) {
            String sensitiveWord = word.substring(sensitiveWordLocation - sensitiveWordLength, sensitiveWordLocation + 1);
        }
        return flag;
    }

    public String filter(String word) {
        String sensitiveWords = "******";
        StringBuilder result = new StringBuilder(word.length());
        SensitiveWordNode tempNode = sensitiveWordNode;
        int begin = 0;
        int position = 0;
        while (position < word.length()) {
            Character c = word.charAt(position);
            tempNode = tempNode.getNextNode(c);
            if (tempNode == null) {
                result.append(word.charAt(begin));
                begin++;
                position = begin;
                tempNode = sensitiveWordNode;
                continue;
            } else if (tempNode.isLastCharacter()) {
                result.append(sensitiveWords);
                position++;
                begin = position;
                tempNode = sensitiveWordNode;
            } else {
                position++;
            }
        }
        result.append(word.substring(begin));
        return result.toString();
    }
    public static class SensitiveWordNode {

        private Map<Character, SensitiveWordNode> nextNodes = new HashMap<>();
        private boolean endFlag;

        public boolean isEndFlag() {
            return endFlag;
        }

        public void setEndFlag(boolean endFlag) {
            this.endFlag = endFlag;
        }

        public void addNextNode(Character key, SensitiveWordNode node) {
            nextNodes.put(key, node);
        }

        public SensitiveWordNode getNextNode(Character key) {
            return nextNodes.get(key);
        }

        public boolean isLastCharacter() {
            return nextNodes.isEmpty();
        }
    }
}
