package 생성패턴.builder.effective_java;

import java.util.Objects;

public class ChicagoPizza extends Pizza {
    public enum HotDegree { MILD, HOT, VERYHOT }
    private final ChicagoPizza.HotDegree hotDegree;

    public static class Builder extends Pizza.Builder<ChicagoPizza.Builder> {
        private final ChicagoPizza.HotDegree hotDegree;

        public Builder(ChicagoPizza.HotDegree hotDegree) {
            this.hotDegree = Objects.requireNonNull(hotDegree);
        }

        @Override
        public ChicagoPizza build() {
            return new ChicagoPizza(this);
        }

        @Override
        protected ChicagoPizza.Builder self() {
            return this;
        }
    }

    ChicagoPizza(Builder builder) {
        super(builder);
        hotDegree = builder.hotDegree;
    }

    @Override
    public String toString() {
        return "시카고 피자";
    }
}
