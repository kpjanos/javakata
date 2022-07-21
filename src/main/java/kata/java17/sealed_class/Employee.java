package kata.java17.sealed_class;

import lombok.Getter;

@Getter
public abstract sealed class Employee permits FactoryWorker, SecurityGuard {

    private final String name;
    private final Role role;

    Employee(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    public abstract Role useIdCard();
}
