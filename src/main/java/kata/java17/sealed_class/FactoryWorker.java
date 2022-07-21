package kata.java17.sealed_class;

import lombok.Getter;

@Getter
public final class FactoryWorker extends Employee {

    private final int workerId;

    public FactoryWorker(String name, Role role, int workerId) {
        super(name, role);
        this.workerId = workerId;
    }

    @Override
    public Role useIdCard() {
        System.out.println(getWorkerId());
        return getRole();
    }
}
