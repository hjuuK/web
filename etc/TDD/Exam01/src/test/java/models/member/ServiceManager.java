package models.member;

public class ServiceManager {
    // 싱글턴 패턴
    private static ServiceManager instance;

    public static ServiceManager getInstance() {
        if (instance == null) {
            instance = new ServiceManager();
        }

        return instance;
    }

    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public JoinService joinService() {
        return new JoinService(memberDao(), joinValidator());
    }
}