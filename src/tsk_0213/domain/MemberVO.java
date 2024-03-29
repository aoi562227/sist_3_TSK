package tsk_0213.domain;

public class MemberVO {
    private String id;
    private String password;
    private boolean chmodRWX;

    public MemberVO(String id, String password, boolean chmodRWX) {
        this.id = id;
        this.password = password;
        this.chmodRWX = chmodRWX;
    }	// MemberVO

    public MemberVO(String id, String password) {
        this.id = id;
        this.password = password;
        this.chmodRWX = false;
    }	// MemberVO

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean isChmodRWX() {
        return chmodRWX;
    }
}// class