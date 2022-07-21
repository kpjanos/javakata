package kata.java17.sealed_class;

import lombok.Getter;

@Getter
public final class SecurityGuard extends Employee {

    private final int securityId;

    public SecurityGuard(String name, Role role, int securityId) {
        super(name, role);
        this.securityId = securityId;
    }

    @Override
    public Role useIdCard() {
        System.out.println(getSecurityId());
        return getRole();
    }
}
