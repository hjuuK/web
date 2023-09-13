package org.koreait.models.member;

import lombok.Builder;
import lombok.Data;
import org.koreait.commons.Role;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Data @Builder
public class MemberInfo implements UserDetails {
    private Long userNo;
    private String userId;
    private String userPw;
    private String userNm;
    private String email;
    private String mobile;
    private Role role;
    private Collection<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {    // 회원에 대한 권한 -> 인가 (접근 제한)
        return authorities;
    }

    @Override
    public String getPassword() {   // 비번
        return userPw;
    }

    @Override
    public String getUsername() {   // 아이디
        return userId;
    }

    @Override
    public boolean isAccountNonExpired() {  // false => 계정 만료
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {   // false => 계정 잠김
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {  // false => 비번 만료
        return true;
    }

    @Override
    public boolean isEnabled() {    // false => 회원 탈퇴 여부
        return true;
    }
}
