package builder;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Evgeny Borisov
 */
@Getter
@ToString
@EqualsAndHashCode
public class Client {
    private final String name;
    private final int age;
    private final int salary;

    public static Builder builder(){
        return new Builder();
    }

    private Client(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Client withSalary(int salary) {
        return new Client(name, age, salary);
    }

    public Client increaseSalary(int delta) {
        return new Client(name, age, salary+delta);
    }


    public static class Builder{
        private String name;
        private int age;
        private Integer salary;
        private boolean wasUsed;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Client build(){
            if (wasUsed) {
                throw new AlreadyInUseException("builder can not be used twice");
            }
            validate();
            wasUsed = true;
            return new Client(name, age, salary);
        }

        private void validate() {
            if (salary == null) {
                throw new IllegalStateException("salary is mandatory");
            }
        }
    }















}





