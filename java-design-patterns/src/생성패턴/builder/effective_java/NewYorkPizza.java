package 생성패턴.builder.effective_java;

import java.util.Objects;

public class NewYorkPizza extends Pizza {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NewYorkPizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NewYorkPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "뉴욕 피자";
    }
}
