package org.koreait.models.member;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class MemberInfo implements UserDetails {
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {    // 회원에 대한 권한 -> 인가 (접근 제한)
        return null;
    }

    @Override
    public String getPassword() {   // 비번
        return null;
    }

    @Override
    public String getUsername() {   // 아이디
        return null;
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