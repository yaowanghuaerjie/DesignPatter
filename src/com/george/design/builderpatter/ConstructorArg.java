package com.george.design.builderpatter;

public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    private ConstructorArg(Build build) {
        this.isRef = build.isRef;
        this.type = build.type;
        this.arg = build.arg;
    }

    public static class Build {
        private boolean isRef;
        private Class type;
        private Object arg;

        public ConstructorArg builder() {

            if (!isRef) {
                if (null == type) {
                    throw new IllegalArgumentException("type不允许为空");
                }
                if (null == arg) {
                    throw new IllegalArgumentException("arg不允许为空");
                }
            } else {
                if (!(arg instanceof String)) {
                    throw new IllegalArgumentException("type类型错误，当ref为true时，只能是String类型");
                }
            }
            return new ConstructorArg(this);
        }

        public Build setRef(boolean ref) {
            isRef = ref;
            return this;
        }

        public Build setType(Class type) {
            this.type = type;
            return this;
        }

        public Build setArg(Object arg) {
            this.arg = arg;
            return this;
        }
    }
}
