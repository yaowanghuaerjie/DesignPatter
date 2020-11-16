package com.george.design.builderpatter;

/**
 * @program: DesignPatter
 * @description:
 * @author: George
 * @create: 2020-11-16 20:32
 */
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    public ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }

    public static class Builder {
        private static final int DEFAULT_MAX_TOTAL = 8;
        private static final int DEFALT_MAX_IDLE = 8;
        private static final int DEFALT_MIN_IDLE = 0;

        private String name;
        private int maxTotal = DEFAULT_MAX_TOTAL;
        private int maxIdle = DEFALT_MAX_IDLE;
        private int minIdle = DEFALT_MIN_IDLE;


        public ResourcePoolConfig build() {
            if (null == name || "".equals(name)) {
                throw new IllegalArgumentException("name 不允许为空");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("....");
            }
            if (minIdle > maxIdle || minIdle > maxTotal) {
                throw new IllegalArgumentException("....");
            }
            return new ResourcePoolConfig(this);
        }

        public Builder setMaxTotal(int maxTotal) {
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            this.minIdle = minIdle;
            return this;
        }
    }
}